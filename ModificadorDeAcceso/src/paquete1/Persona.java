package paquete1;

public class Persona {
	
	//modificador de acceso default, se puede acceder a los atributos y objetos dentro del mismo paquete
	String nombre ="";
	
	//modificador de acceso privado, se puede acceder solo dentro de la misma clase
	
	private int edad = 0;
	
	protected String domicilio = "";
	
	//
	public float estatura = 0;
	
	String saludar() {
		
		return "Hola mi nombre es " + this.nombre + "mi edad es " + this.edad + "mi domicilio es " + 
		this.domicilio + "mi estatura es " + this.estatura;
	}
}
