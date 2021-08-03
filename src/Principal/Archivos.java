package Principal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {
    private File archivo;
    
    public void creaArchivo(){
        archivo = new File("agendaContactos.txt");
        
        try{
            if(archivo.createNewFile()){
                //Archivo creado
                
            }
        } catch (IOException ex){
            System.err.println("Error, "+ex);
        }
        
    }
    
    public void escribirTexto(Contacto contacto){
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(contacto.getNombre()+"%"+contacto.getNumeroT()+"%"+contacto.getCorreo()+"\r\n");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
        
        
    }
}
