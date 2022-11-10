import java.util.ArrayList;

//
//
//  @ Project : Laboratorio4
//  @ File Name : contacto.java
//  @ Date : 11/8/2022
//  @ Author : 
//
//




public class contacto {
	private String nombre;
	private String telefono;
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
	public String toString(){
		String resultado="";
		resultado= "Nombre: "+nombre+"\nTeléfono: "+telefono;
		return resultado;
	}
}
