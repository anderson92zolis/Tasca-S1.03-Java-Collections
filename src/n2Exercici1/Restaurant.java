package n2Exercici1;

import java.util.Objects;

public class Restaurant {
	
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
	
	
	
	
	
		
	
	

}
