// librería para usar scanner para la entrada del nombre por parte del usuario
import java.util.Scanner;

//librerías necesarias para manejo de ficheros
import java.io.*;

public class HolaMundo4 {

	public static void main(String[] args) throws IOException{
		String nombre= new String();
		Scanner entradaUsuario = new Scanner(System.in);
		// Output the prompt
        System.out.println("Introduce un nombre...");
        // Wait for the user to enter something.
        nombre = entradaUsuario.nextLine();
        entradaUsuario.close();
        // creo el fichero y el bufferedwriter
        System.out.println("Creando fichero ficheroHolaMundo4.txt");
    	String nomFichero = "ficheroHolaMundo4.txt";
    	//File fichero = new File(nomFichero);
    	BufferedWriter bw = new BufferedWriter(new FileWriter(nomFichero));
        
    	for (int i=0; i<20; i++) {
            System.out.println("Hola "+nombre);
            bw.write("Hola "+nombre+ "\r\n");
            }
    	//cierro el fichero
    	bw.close();
        System.out.println("He escrito y cerrado el fichero ficheroHolaMundo4.txt: ");
    	
	}
}