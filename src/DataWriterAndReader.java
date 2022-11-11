import java.io.*;
public class DataWriterAndReader {
    
    public  void crear_fichero (String  Nombre)
    {

        try {

            File fichero = new File(Nombre+".txt");
            if (fichero.createNewFile()) {
              System.out.println("Fichero  creado: " + fichero.getName());
            }

          } catch (IOException e) {
            System.out.println("Un error ha ocurriod durante la creacion del fichero.");
            e.printStackTrace();
          }
        }
    
      
    
}