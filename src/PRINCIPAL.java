import java.io.IOException;
import java.text.BreakIterator;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthUI;
import javax.xml.crypto.Data;


public class PRINCIPAL {
    public static void main(String[] args) throws IOException , InterruptedException
    
    {
        
        String nombre_fichero;
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        DataWriterAndReader Crear_Ingresar = new DataWriterAndReader();
        
        System.out.println("---------------------------------------");
        System.out.println("*      MENU PRINCIPAL DE FICHEROS     *");
        System.out.println("");
        System.out.println("1. Crear fichero");
        System.out.println("2. Guardar fichero");
        System.out.println("3. Mostrar datos");
        System.out.println("4. Buscar registro por codigo");
        System.out.println("5. Buscar registro por nombre");
        System.out.println("6. Editar registro");
        System.out.println("7.Salir");
        System.out.println("----------------------------------------");
        System.out.print("--> ");
        opcion = scanner.nextInt();
        

        switch(opcion)
        {
            
            case 1:
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            System.out.println("Ingrese el nombre del fichero");
            nombre_fichero = scanner.nextLine();
            Crear_Ingresar.crear_fichero(nombre_fichero);
                

                
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;
            case 5:
            break;
            case 6:
            break;
            case 7:
            break;
        }


    }
}
