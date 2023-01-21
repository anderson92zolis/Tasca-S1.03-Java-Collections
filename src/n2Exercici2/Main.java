package n2Exercici2;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		HashSet<Restaurant> hashSetRestaurant = new HashSet<Restaurant>();
		
		Restaurant restaurant1= new Restaurant("TiaEmili",6);//iguales nom,punt
		Restaurant restaurant2= new Restaurant("Albatroz",6);
		Restaurant restaurant3= new Restaurant("TiaEmili",6);//iguales nom,punt
		Restaurant restaurant4= new Restaurant("Salamanca",9);
		Restaurant restaurant5= new Restaurant("TiaEmili",8);//iguales nom
		hashSetRestaurant.add(restaurant1);
		hashSetRestaurant.add(restaurant2);
		hashSetRestaurant.add(restaurant3);
		hashSetRestaurant.add(restaurant4);
		hashSetRestaurant.add(restaurant5);
		
		TreeSet<Restaurant> orderHashSetRestaurant= new TreeSet<Restaurant>(new Comparator<Restaurant>(){
			public int compare(Restaurant o1, Restaurant o2) {
				int numeroReturn= 100;
				if (o1.getNom().compareTo(o2.getNom())==0) {
					if (o1.getPuntuacio()<o2.getPuntuacio()) {
						numeroReturn=1;
						} 
					else if (o1.getPuntuacio()== o2.getPuntuacio()) {
						numeroReturn=0;}
					else {numeroReturn= -1 ;
						}	
				} 
				else if (o1.getNom().compareTo(o2.getNom())==0) {
					} else {
						numeroReturn=1;
						}
				return numeroReturn;
					} 
			}) ;
		
		orderHashSetRestaurant.addAll(hashSetRestaurant);		
		
		for( Restaurant listadoRestaurantsPorpuntuación: orderHashSetRestaurant) {
			System.out.println("el restaurant: " + listadoRestaurantsPorpuntuación.getNom() + " té una puntuació de: "+listadoRestaurantsPorpuntuación.getPuntuacio());
			}
		
	}

}
