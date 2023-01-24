package n2Exercici2;

import java.util.HashSet;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {		
	
		HashSet<Restaurant> hashSetRestaurant = new HashSet<Restaurant>();
		
		Restaurant restaurant1= new Restaurant("TiaEmili",6);//iguales nom,punt
		Restaurant restaurant2= new Restaurant("Albatroz",6);
		Restaurant restaurant3= new Restaurant("TiaEmili",6);//iguales nom,punt
		Restaurant restaurant4= new Restaurant("Salamanca",9);
		Restaurant restaurant5= new Restaurant("TiaEmili",8);//iguales nom
		Restaurant restaurant6= new Restaurant("TiaEmili",1);//iguales nom
		
		hashSetRestaurant.add(restaurant1);
		hashSetRestaurant.add(restaurant2);
		hashSetRestaurant.add(restaurant6);
		hashSetRestaurant.add(restaurant3);
		hashSetRestaurant.add(restaurant4);
		hashSetRestaurant.add(restaurant5);
		
																			// podemos implementar comparator clase interna anonimas cuando creamos Treeset pildorasIn Vídeo 188
		TreeSet<Restaurant> ordeThreeSetRestaurant= new TreeSet<Restaurant>(); /*new Comparator<Restaurant>(){
			public int compare(Restaurant o1, Restaurant o2) {
				int numeroReturn= 1;
				if (o1.getNom().compareTo(o2.getNom())==0) {
					
					if (o1.getPuntuacio()<o2.getPuntuacio()) {
						numeroReturn=1;
						} 
					else if (o1.getPuntuacio()== o2.getPuntuacio()) {
						numeroReturn=0;}
					else {
						numeroReturn= -1 ;
						}	
				} 
				else if (o1.getNom().compareTo(o2.getNom())<0) {
					
					numeroReturn=-1;
					
				} else {
						numeroReturn=1;
						}
				return numeroReturn;
					} 
			})*/ ;	
			
		ordeThreeSetRestaurant.addAll(hashSetRestaurant);
			
		for( Restaurant listadoRestaurantsPorpuntuación: ordeThreeSetRestaurant) {
			System.out.println("el restaurant: " + listadoRestaurantsPorpuntuación.getNom() + " té una puntuació de: "+listadoRestaurantsPorpuntuación.getPuntuacio());
			}
		
	}

}
