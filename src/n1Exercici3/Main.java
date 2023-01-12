package n1Exercici3;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
	 Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté 
	 països i capitals. El programa ha de llegir el fitxer i guardar les 
	 dades en un HashMap<String, String>. El programa demana el nom de l’usuari/ària, 
	 i després ha de mostrar un país de forma aleatòria, guardat en el HashMap. 
	 Es tracta de què l’usuari/ària ha d’escriure el nom de la capital del país en qüestió. 
	 Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades. 
	 Un cop demanades les capitals de 10 països de forma aleatòria, llavors s’ha de guardar 
	 en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació.
		 */
	
		try {
		      File myObj = new File("C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.03- Java Collections\\src\\n1Exercici3\\countries.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine(); //devuelve una linea como String
		        System.out.println(data.indexOf("an_"));	 //DEVUELVE 5
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
