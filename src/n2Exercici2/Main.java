package n2Exercici2;

import java.util.HashSet;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {	
		
		/*
		 * Utilitzant la classe del programa anterior, crea la implementació necessària perquè els objectes de la classe Restaurant estiguin ordenats per nom i per puntuació en ordre ascendent. 

		Exemple: 

		nom: restaurant1, puntuació: 8

		nom: restaurant1, puntuació: 7

		 */
	
		
		TreeSet<Restaurant> ordeThreeSetRestaurant= new TreeSet<Restaurant>();
		
		Restaurant restaurant1= new Restaurant("TiaEmili",6);//iguales nom,punt
		Restaurant restaurant2= new Restaurant("Albatroz",6);
		Restaurant restaurant3= new Restaurant("TiaEmili",6);//iguales nom,punt
		Restaurant restaurant4= new Restaurant("Salamanca",9);
		Restaurant restaurant5= new Restaurant("TiaEmili",8);//iguales nom
		Restaurant restaurant6= new Restaurant("TiaEmili",1);//iguales nom
		
		ordeThreeSetRestaurant.add(restaurant1);
		ordeThreeSetRestaurant.add(restaurant2);
		ordeThreeSetRestaurant.add(restaurant6);
		ordeThreeSetRestaurant.add(restaurant3);
		ordeThreeSetRestaurant.add(restaurant4);
		ordeThreeSetRestaurant.add(restaurant5);

			
		for( Restaurant listadoRestaurantsPorpuntuación: ordeThreeSetRestaurant) {
			System.out.println("el restaurant: " + listadoRestaurantsPorpuntuación.getNom() + " té una puntuació de: "+listadoRestaurantsPorpuntuación.getPuntuacio());
			}
		
	}

}
