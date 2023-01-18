package n1exercici2;
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Crea i emplena un List<Integer> 
	ArrayList<Integer> firstArrayL = new ArrayList<Integer>(); // Create an ArrayList object
	firstArrayL.add(3);
	firstArrayL.add(1);
	firstArrayL.add(6);
	firstArrayL.add(10);
    System.out.println(firstArrayL);
    
//Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 
	
    //ArrayList<Integer> SecondArrayL = new ArrayList<Integer>(firstArrayL); // Create an ArrayList object
    //Collections.sort(SecondArrayL);
    ArrayList<Integer> SecondArrayL = new ArrayList<Integer>();
    for (Integer i=firstArrayL.size()-1; i>= 0; i-- ) {
    	SecondArrayL.add(firstArrayL.get(i));
    	}
    System.out.println(SecondArrayL);
  
//Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.
    
    SecondArrayL.clear();
    
    Iterator<Integer> objetoCliente= firstArrayL.iterator();
	
    while (objetoCliente.hasNext()) {
    	Integer number = objetoCliente.next();
    	System.out.println(number);
    	SecondArrayL.add(number);
		}
    System.out.println(SecondArrayL);
	}
}
