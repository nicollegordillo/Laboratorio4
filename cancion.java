import java.util.ArrayList;

//
//  @ Project : Laboratorio4
//  @ File Name : cancion.java
//  @ Date : 11/8/2022
//  @ Author : Ana Villela y Nicolle Gordillo
//
//La clase cancion es la encargada de darle forma a los objetos de tipo cancion mediante los atributos
//Tambien se encarga de darle metodos sets y gets a la clase principal, utilizados en modo reproduccion


public class cancion {
	//Atributos de los objetos tipo cancion, estos se guardan en el ArrayList de modo_reproduccion
	private String nombre;
	private String tiempo;
	private String autor;
	private String genero;
	
	//Sets y gets de cancion
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
	
	//Constructor con atributos vacios y sin orden en los atributos
	public cancion() {
		nombre="";
		tiempo="";
		autor="";
		genero="";
	}
	
	//Constructos con orden especifico en los atributos
	public cancion(String nombre, String tiempo, String autor, String genero) {
		this.nombre=nombre;
		this.tiempo=tiempo;
		this.autor=autor;
		this.genero=genero;
	}
	@Override
	//ToString que imprime las propiedades de los elementos cancion del ArrayList canciones en modo_reproduccion
	public String toString(){
		String resultado="";
		resultado= "Canción: "+nombre+"\nDuración: "+tiempo+"\nGénero: "+genero+"\nAutor: "+autor;
		return resultado;
	}

	
}
