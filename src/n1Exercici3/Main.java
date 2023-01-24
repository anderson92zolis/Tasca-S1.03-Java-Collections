package n1Exercici3;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class


public class Main {
	
	static HashMap <String,String> CountriesAndCapitals= new HashMap<String,String>();	
	
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
		
		
	// import the data from a file and save in a HashMap
		
		try {						//FILE PATH
		      File myObj = new File("C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.03- Java Collections\\src\\n1Exercici3\\countries.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String [] dataArray= data.split(" ");
		        CountriesAndCapitals.put(dataArray[0],dataArray[1]);
		      }		     
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		
		// Main program
		// Create a File.txt
		
		CreateFile(
					totalscore10(), 
					askParametroReturnString("\n "+ " What's your name:")
					);
	
	}
	
	public static int totalscore10() {
		// adding if the answer is correct until reach the score of 10/10 
		int scoreOutofTen =0;
		ArrayList<String> countries = returnArraysListKeysofCountriesfromHashMap();
		for (int i =1; i<=10; i++) {
			
			String randonCountry= returnOneRandomCountryFromHashMap(countries);
			System.out.println("-------------------------------------------------");

			System.out.println("what is the capital of \" "+ randonCountry+" \"");
			
			System.out.print("Answer N.-"+i+" ---> "+" Enter the Capital City: ");
			Scanner myObj= new Scanner(System.in);
			String askCapital = myObj.nextLine();
			
			scoreOutofTen+=returnsScore1(randonCountry,askCapital);	
			}
		return scoreOutofTen;
	}	
	
	public static ArrayList<String> returnArraysListKeysofCountriesfromHashMap() {
		//Return the Keys (countries) from a HashMap in Arraylist Type
		Set<String> CountrieskeySet = CountriesAndCapitals.keySet();
		ArrayList<String> CountriesInArray = new ArrayList<String>(CountrieskeySet);
		return CountriesInArray;
	}	
	
	public static String returnOneRandomCountryFromHashMap(ArrayList<String>CountriesInArray) {
		//Retornamos un Pais de forma aleatoria. 
		return 	CountriesInArray.get((int)(Math.random()* CountriesInArray.size()));
		}
	
	public static int returnsScore1(String randonCountry,String answerCapitalCity){
		// return 1 if the answer is correct
		int score = 0 ;
		String randonCapital=CountriesAndCapitals.get(randonCountry);
		System.out.println("The correct answer is :  " +randonCapital);
		if (randonCapital.equalsIgnoreCase(answerCapitalCity)) {
			score=1;
			}
		return score;
	}
	
	public static void CreateFile (int puntuacion, String name) {
		//Create the File.txt
		String ruta= "C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.03- Java Collections\\src\\n1Exercici3\\classificacio.txt";    
				
		try {
		      FileWriter myWriter = new FileWriter(ruta);
		      myWriter.write("your name: "+ name+ "your score is: " + " "+puntuacion);
		      myWriter.write("\n");
		      myWriter.write("siguiente página");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  
		}
	
	public static String askParametroReturnString(String notas) {
		// 	Print the message and return a String	
		System.out.print(notas);		
		Scanner user =new Scanner(System.in); // Import the Scanner class
		String parametroSalida= user.nextLine();
		return parametroSalida;
	}
}
	
