
//
//  @ Project : Laboratorio4
//  @ File Name : cancion.java
//  @ Date : 11/8/2022
//  @ Author : 
//
//




public class cancion implements reproduccion{
	private String nombre;
	private String duracion;
	private String autor;
	private String genero;
	@Override
	public void cambiar_c(boolean cambiar){
	}
	@Override
	public void escuchar() {
	}
	@Override
	public void seleccionar() {
	}
	
	public void Setnombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String Getnombre() {
		return nombre;
	}
	
	public void Setduracion(String duracion) {
		this.duracion=duracion;
	}
	
	public String Getduracion() {
		return duracion;
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
	}
	
	public cancion(String nombre, String duracion, String autor, String genero) {
		this.nombre=nombre;
		this.duracion=duracion;
		this.autor=autor;
		this.genero=genero;
	}
}
