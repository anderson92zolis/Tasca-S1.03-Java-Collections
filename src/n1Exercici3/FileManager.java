package n1Exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FileManager {
	
	// import the data from a file and save in a HashMap
	
	public static HashMap<String, String> readTxt() {
		
		HashMap <String, String>  mapCountries = new HashMap <String, String>(); 
		FileReader fr = null; 
		BufferedReader br = null; 
		String line = "";
		
		try {
			fr = new FileReader("C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.03- Java Collections\\src\\n1Exercici3\\countries.txt");
			br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				//System.out.println(line); 
				String[] textSTR = line.split(" "); 
				mapCountries.put(textSTR[0], textSTR[1]); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Fitxer no trobat.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error d'entrada/sortida."); 
		} finally {
			try {
				if((null != br) && (null != fr)) { 
					br.close();
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		}
		return mapCountries;
	}
	
	public static void CreateTxt (int points, String name) {
		FileWriter fw = null; 
		BufferedWriter bw = null; 
		
		try {
			fw = new FileWriter ("C:\\Users\\azoli\\eclipse-workspace\\Tasca S1.03- Java Collections\\src\\n1Exercici3\\classificacio.txt", true); 
			/*if (!file.exists()) {     
				file.createNewFile(); 
			}  */
			bw = new BufferedWriter (fw); 
			bw.write("Nom: " + name + "\nPunts: " + points); 
			System.out.println("Arxiu guardat correctament.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if((null != bw) && (null != fw)) {
					bw.close();
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		}

	}
}