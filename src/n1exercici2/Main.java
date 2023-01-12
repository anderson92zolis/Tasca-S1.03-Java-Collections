package n1exercici2;
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Crea i emplena un List<Integer> 
	ArrayList<Integer> listaNumbers = new ArrayList<Integer>(); // Create an ArrayList object
	listaNumbers.add(3);
	listaNumbers.add(1);
	listaNumbers.add(6);
	listaNumbers.add(10);
    System.out.println(listaNumbers);
    
    //Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 
	
    ArrayList<Integer> numbersInverseOrden = new ArrayList<Integer>(listaNumbers); // Create an ArrayList object
    Collections.sort(numbersInverseOrden);
    System.out.println(numbersInverseOrden);
    
    //Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.
    numbersInverseOrden.clear();
    //System.out.println(numbersInverseOrden);
    Iterator<Integer> objetoCliente= listaNumbers.iterator();
	
	}

}
