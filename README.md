# agendaContactos
Agenda de contactos realizada en java con algunas clases de Swing. Aún no ha sido finalizada.

Esta aplicacion hecha por medio de algunas clases de Swing de Java. Esta diseñada para poder crear una lista de contactos por medio de un .txt, asi se mantienen los datos, los datos se piden por medio de la lectura del .txt y con algunos caracteres especiales para separar la información por separado.

La aplicacion esta compuesta con un jFrame, jDialog y una clase. El jFrame es la clase principal la cual se encarga que todo el programa funcione, que se compone con algunos jButton principales, que son: "actualizar" "x" "+ añadir contacto"

-El boton "actualizar" se encarga de primero borrar el contenido en el jPanel principal, llama a la funcion leerContactos y se encarga de primero ver si existe alguno en el archivo, luego de eso llamo un metodo para que el jFrame se "actualizar"

-El boton "+añadir contacto" se encarga de llamar a la clase añadirContacto, que hace que se cree un jDialog y que la ventana principal no se haga visible. Al instanciar el jDialog se genera como un formulario donde se deben de rellenar para crear y escribir el contacto en la base de datos y lo pueda leer el boton "actualizar"

-El boton "x" es para cerrar la aplicación.
