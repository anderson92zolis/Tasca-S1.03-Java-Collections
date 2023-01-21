package n2Exercici2;

//import java.util.Comparator;
import java.util.Objects;

public class Restaurant  /*implementsComparator<Restaurant> */ {   
	
	private String nom;
	private int puntuacio;
	
	public Restaurant(String nom, int puntuacio){
		this.nom=nom;
		this.puntuacio=puntuacio;
		}
	//setter&getters
	
	public String getNom() {
		return nom;
	}

	public int getPuntuacio() {
		return puntuacio;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom, puntuacio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(nom, other.nom) && puntuacio == other.puntuacio;
		}

	@Override
	public String toString() {
		return "Clase Restaurant [nom=" + nom + ", puntuacio=" + puntuacio + "]";
	}
	/*@Override                         // esto implementando Comparator pero trabajaré desde el main con una clase interna
	public int compare(Restaurant o1, Restaurant o2) {
		// TODO Auto-generated method stub
		int numeroReturn= 100;
		if (o1.getNom().compareTo(o2.getNom())==0) {
			if (o1.getPuntuacio()<o2.getPuntuacio()) {
				numeroReturn=-1;
				} 
			else if (o1.getPuntuacio()== o2.getPuntuacio()) {
				numeroReturn=0;}
			else {numeroReturn= 1 ;
				}	
		} 
		else if (o1.getNom().compareTo(o2.getNom())==0) {
			} else {
				numeroReturn=1;
				}
		return numeroReturn;
	}*/
	
}
