package n1exercici1;
import java.util.ArrayList;
import java.util.*;
public class Main {
	
	static ArrayList<Month> ArrayMonth= new ArrayList<Month>();

	public static void main(String[] args) {
		
		/*
		 * Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del 
		 * mes de l'any). Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un 
		 * ArrayList, a excepció de l'objecte amb atribut "Agost". Després, efectua la inserció en el lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte. 
		 */
		
		Month month1= new Month("Enero"); 
		Month month2= new Month("Febrero");
		Month month3= new Month("Marzo"); 
		Month month4= new Month("Abril"); 
		Month month5= new Month("Mayo"); 
		Month month6= new Month("Junio"); 
		Month month7= new Month("Julio");
		Month month8= new Month("Agosto");
		Month month9= new Month("Septiembre"); 
		Month month10= new Month("Octubre"); 
		Month month11= new Month("Noviembre"); 
		Month month12= new Month("Diciembre"); 
		
		ArrayMonth.add(month1);
		ArrayMonth.add(month2);
		ArrayMonth.add(month3);
		ArrayMonth.add(month4);
		ArrayMonth.add(month5);
		ArrayMonth.add(month6);
		ArrayMonth.add(month7);
		
		ArrayMonth.add(month9);
		ArrayMonth.add(month10);
		ArrayMonth.add(month11);
		ArrayMonth.add(month12);
		
		ArrayMonth.add(7, month8 );
	
		
		for (Month monthArrayL : ArrayMonth) {
			  System.out.println("los meses en la ArrayList son: " + monthArrayL.getName());
		}
		
		//Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.		
		// Para evitar que se repitan se trabaja con hashCode() & equals(Object obj)
		Set <Month> ArrayMonthHashSet = new HashSet<Month>(ArrayMonth); 
		
		Month monthRepeat= new Month("Enero"); // para comprobar si se repite
		ArrayMonthHashSet.add(monthRepeat);		
		
		for (Month month : ArrayMonthHashSet) {
			  System.out.println("los meses en HashSet, Se comprueba que no se repite(Enero): "+ month.getName());
		}
		
		//Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.
		
		Iterator<Month> iteratordelHashSet= ArrayMonthHashSet.iterator();
		
		while(iteratordelHashSet.hasNext()) {
			System.out.println("los meses en el iterator son: "+ iteratordelHashSet.next().getName());;
			}
	}

}
