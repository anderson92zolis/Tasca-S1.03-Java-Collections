package n2Exercici1;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * Exercici 1
		 * Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int).
		 * Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant 
		 * amb el mateix nom i la mateixa puntuació en un HashSet creat en el main() de 
		 * l’aplicació
		 * Important
		 * Pot haver-hi restaurants amb el mateix nom amb diferent puntuació,
		 * però no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.
		 */
		
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
		
		for( Restaurant listadoRestaurand: hashSetRestaurant) {
			System.out.println("el restaurant: "+ listadoRestaurand.getNom() + " té una puntuació de: "+listadoRestaurand.getPuntuacio());
			}	
		}

}
