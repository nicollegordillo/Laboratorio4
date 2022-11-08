//
//
//  @ Project : Laboratorio4
//  @ File Name : contacto.java
//  @ Date : 11/8/2022
//  @ Author : 
//
//




public class contacto implements telefono {
	private String nombre;
	private String telefono;
	@Override
	public void contactos() {
	}
	@Override
	public void llamar() {
	}
	@Override
	public void audio(boolean cambiar) {
	}
	@Override
	public void conexion(boolean cambiar) {
	}
	@Override
	public void finalizar() {
	}
	
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
	}
	
	public contacto(String nombre, String telefono) {
	}
}
