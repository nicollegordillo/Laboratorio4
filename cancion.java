import java.util.ArrayList;

//
//  @ Project : Laboratorio4
//  @ File Name : cancion.java
//  @ Date : 11/8/2022
//  @ Author : 
//
//




public class cancion {
	private String nombre;
	private String tiempo;
	private String autor;
	private String genero;
	
	
	public void Setnombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String Getnombre() {
		return nombre;
	}
	
	public void Setduracion(String tiempo) {
		this.tiempo=tiempo;
	}
	
	public String Gettiempo() {
		return tiempo;
	}
	
	public void Setautor(String autor) {
		this.autor=autor;
	}
	
	public String Getautor() {
		return autor;
	}
	
	public void Setgenero(String genero) {
		this.genero=genero;
	}
	
	public String Getgenero() {
		return genero;
	}
	
	public cancion() {
		nombre="";
		tiempo="";
		autor="";
		genero="";
	}
	
	public cancion(String nombre, String tiempo, String autor, String genero) {
		this.nombre=nombre;
		this.tiempo=tiempo;
		this.autor=autor;
		this.genero=genero;
	}
	@Override
	public String toString(){
		String resultado="";
		resultado= "Canción: "+nombre+"\nDuración: "+tiempo+"\nGénero: "+genero+"\nAutor: "+autor;
		return resultado;
	}

	
}
