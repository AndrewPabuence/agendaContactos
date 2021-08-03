package Principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }
    java.awt.GridBagConstraints gridBagConstraints;
    int x,y;
    Contacto[] contactos;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        añadirContactoBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        actualizarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(289, 336));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 63, 294, 276));

        jPanel2.setBackground(new java.awt.Color(255, 153, 204));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        añadirContactoBoton.setBackground(new java.awt.Color(255, 255, 255));
        añadirContactoBoton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        añadirContactoBoton.setForeground(new java.awt.Color(255, 255, 255));
        añadirContactoBoton.setText("+");
        añadirContactoBoton.setBorderPainted(false);
        añadirContactoBoton.setContentAreaFilled(false);
        añadirContactoBoton.setPreferredSize(new java.awt.Dimension(67, 40));
        añadirContactoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirContactoBotonActionPerformed(evt);
            }
        });
        jPanel2.add(añadirContactoBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 6, 80, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu de Contactos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/cerrar_32px.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 40, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Añadir");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        actualizarBoton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        actualizarBoton.setForeground(new java.awt.Color(255, 255, 255));
        actualizarBoton.setText("Actualizar");
        actualizarBoton.setBorderPainted(false);
        actualizarBoton.setContentAreaFilled(false);
        actualizarBoton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        actualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBotonActionPerformed(evt);
            }
        });
        jPanel2.add(actualizarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int i = 0; 
    
    private void añadirContactoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirContactoBotonActionPerformed
        añadirContacto ventanaS = new añadirContacto(this,true);
        ventanaS.setVisible(true);
    }//GEN-LAST:event_añadirContactoBotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void actualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBotonActionPerformed
        actualizarContactos();
    }//GEN-LAST:event_actualizarBotonActionPerformed
    
    private JButton[] foto = new JButton[100];
    private JButton[] nombre = new JButton[100];
    private Separator[] separador = new Separator[100];
       
    private void actualizarContactos(){
        jPanel1.removeAll();
        leerContactos();
        SwingUtilities.updateComponentTreeUI(this); //Esto es para refrescar el jframe
    }
    
    private void crearContacto(int xF,int yF, int xN, int yN, JButton[] fotoBoton, JButton[] nombreBoton, int i, String nombreContacto){
        char primeraLetra;
        fotoBoton[i] = new JButton();
        fotoBoton[i].setText(":)");
        fotoBoton[i].setFont(new java.awt.Font("Century Gothic", 0, 14));
        fotoBoton[i].setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = xF*2;
        gridBagConstraints.gridy = yF*2;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(fotoBoton[i],gridBagConstraints);
        
        nombreBoton[i] = new JButton();
        nombreBoton[i].setText(nombreContacto);
        nombreBoton[i].setFont(new java.awt.Font("Century Gothic", 0, 14));
        nombreBoton[i].setPreferredSize(new java.awt.Dimension(185, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = xN*2;
        gridBagConstraints.gridy = yN*2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel1.add(nombreBoton[i],gridBagConstraints);
        
        separador[i] = new Separator();
        separador[i].setPreferredSize(new java.awt.Dimension(180, 5));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = yF*2+1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(separador[i], gridBagConstraints);
        
        this.i++;
    }
    
    private int iterador = 0;
    
    private void leerContactos(){
        String cadena, ArrayContacto[] = new String[300];
        
        try {
            FileReader lector = new FileReader("agendaContactos.txt");
            BufferedReader lectura = new BufferedReader(lector);
            
            cadena = lectura.readLine();
            while(cadena!=null){
                ArrayContacto = cadena.split("%");
                cadena = lectura.readLine();
                System.out.println(ArrayContacto[0]);
                System.out.println(ArrayContacto[1]);
                System.out.println(ArrayContacto[2]);
                
                crearContacto(0, i, 1, i, foto, nombre, i, ArrayContacto[0]);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBoton;
    private javax.swing.JButton añadirContactoBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
