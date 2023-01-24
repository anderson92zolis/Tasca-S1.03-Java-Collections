package n1exercici2;
import java.util.ArrayList; // import the ArrayList class
import java.util.Iterator;
import java.util.ListIterator;


public class Main {

	public static void main(String[] args) {
		
//Crea i emplena un List<Integer> 
		
	ArrayList<Integer> firstArrayL = new ArrayList<Integer>(); // Create an ArrayList object
	firstArrayL.add(3);
	firstArrayL.add(1);
	firstArrayL.add(6);
	firstArrayL.add(10);
	
    for (int i: firstArrayL) {
    	System.out.println("orden normal: " +i);
    	}
    
//Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 

    ArrayList<Integer> SecondArrayL = new ArrayList<Integer>();
    
    for (int i=firstArrayL.size()-1; i>= 0; i-- ) {
    	SecondArrayL.add(firstArrayL.get(i));
    	}
    
    for (int i: SecondArrayL) {
    	System.out.println("orden inverso: " +i);
    	}
  
//Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.
    
    SecondArrayL.clear(); // limpiamos la ArrayList2
    
    Iterator<Integer> objetoCliente= firstArrayL.iterator();
	
    while (objetoCliente.hasNext()) {
    	Integer number = objetoCliente.next();
    	System.out.println("añadido a la segunda lista usando Iterator: " +number);
    	SecondArrayL.add(number);
		}
    
    // para añadir mediante un ListIterator en forma inverso
    /*ListIterator objetoCliente = firstArrayL.listIterator(firstArrayL.size());
	
    while (objetoCliente.hasPrevious()) {
    	int number = ( int ) objetoCliente.previous();
    	System.out.println(" orden inverso iterator : "+ number);
    	SecondArrayL.add(number);
		}*/
    
   
	}
}
