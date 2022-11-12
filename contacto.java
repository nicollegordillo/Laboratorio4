import java.util.ArrayList;

//
//
//  @ Project : Laboratorio4
//  @ File Name : contacto.java
//  @ Date : 11/8/2022
//  @ Author : Nicolle Gordillo y Ana Villela
//
//La clase contacto es la encargada de darle forma a los objetos de tipo contacto mediante los atributos
//Tambien se encarga de darle metodos sets y gets a la clase principal, utilizados en modo telefono

public class contacto {
	//Atributos de los objetos de tipo contacto
	private String nombre;
	private String telefono;

	//Sets y gets de contacto
	public void Setnombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String Getnombre() {
		return nombre;
	}
	
	public void Settelefono(String telefono) {
		this.telefono=telefono;
	}
	
	public String Gettelefono() {
		return telefono;
	}
	
	public contacto() {
		nombre="";
		telefono="";
	}
	
	public contacto(String nombre, String telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
	}
	@Override
	//ToString que imprime las propiedades de los elementos contacto del ArrayList canciones en modo_telefono
	public String toString(){
		String resultado="";
		resultado= "Nombre: "+nombre+"\nTeléfono: "+telefono;
		return resultado;
	}
}
