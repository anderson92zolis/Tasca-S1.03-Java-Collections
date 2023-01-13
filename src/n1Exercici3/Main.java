package n1Exercici3;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;  // Import the IOException class to handle errors


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
		// import the file.txt
		try {
		      File myObj = new File("C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.03- Java Collections\\src\\n1Exercici3\\countries.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String [] dataArray= data.split(" ");
		        CountriesAndCapitals.put(dataArray[0],dataArray[1]);
		        //System.out.println("COUNTRIES: "+ dataArray[0]+" CAPITALS: "+dataArray[1]);
		      }
		      //System.out.println(CountriesAndCapitals);
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		// main program
		System.out.println(totalscore10());
		// create a File.txt
		CreateFile();
	}
	
	public static int totalscore10() {
		int scoreOutofTen =0;
		ArrayList<String> countries = returnArraysListKeysofCountriesfromHashMap();
		for (int i =1; i<=10; i++) {
			
			String randonCountry= returnOneRandomCountryFromHashMap(countries);
			System.out.println("-------------------------------------------------");

			System.out.println("what is the capital of \" "+ randonCountry+" \"");
			
			System.out.print("Answer N.-"+i+" ---> "+"Enter the Capital City: ");
			Scanner myObj= new Scanner(System.in);
			String askCapital = myObj.nextLine();
			
			scoreOutofTen+=returnsScore1(randonCountry,askCapital);	
			}
		return scoreOutofTen;
	}	
	
	public static ArrayList<String> returnArraysListKeysofCountriesfromHashMap() {
		//HashSet<String> Countries= new HashSet<String>(CountriesAndCapitals.keySet());
		Set<String> CountrieskeySet = CountriesAndCapitals.keySet();
		ArrayList<String> CountriesInArray = new ArrayList<String>(CountrieskeySet);
		return CountriesInArray;
	}	
	
	public static String returnOneRandomCountryFromHashMap(ArrayList<String>CountriesInArray) {
		return 	CountriesInArray.get((int)(Math.random()* CountriesInArray.size()));
		}
	
	public static int returnsScore1(String randonCountry,String answerCapitalCity){
		int score = 0 ;
		String randonCapital=CountriesAndCapitals.get(randonCountry);
		System.out.println("Correct answer!:  " +randonCapital);
		if (randonCapital.equalsIgnoreCase(answerCapitalCity)) {
			score=1;
			}
		return score;
	}
	
	public static void CreateFile () {
		
		    try {
		      File myObj = new File("C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.03- Java Collections\\src\\n1Exercici3\\classificacio.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  
		}
}
	
