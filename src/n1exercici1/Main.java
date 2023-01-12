package n1exercici1;
import java.util.ArrayList;
import java.util.*;
public class Main {
	
	static ArrayList<Month> ArrayMonth= new ArrayList<Month>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		ArrayMonth.add(month8);
		ArrayMonth.add(month9);
		ArrayMonth.add(month10);
		ArrayMonth.add(month11);
		ArrayMonth.add(month12);
		
		//System.out.println(ArrayMonth);
		
		Month monthrRepeat= new Month("Enero");
		ArrayMonth.add(monthrRepeat);
		
		//System.out.println(" RepeatedMonth"+ ArrayMonth);
		//Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.		
		Set <Month> ArrayMonthHashSet = new HashSet<Month>(ArrayMonth);
		
		
		//System.out.println(ArrayMonthHashSet);
		//Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.
		for (Month month : ArrayMonthHashSet) {
			  System.out.println(month.getName());
		}
	}

}
