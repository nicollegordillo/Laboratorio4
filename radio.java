import java.util.ArrayList;

//
//
//
//  @ Project : Laboratorio4
//  @ File Name : radio.java
//  @ Date : 11/8/2022
//  @ Author : 
//
//




public class radio implements modo_estado,modo_volumen,productividad,modo_radio {
	private ArrayList<cancion> canciones;
	private ArrayList<contacto> contactos;
	public void Setcanciones(ArrayList<cancion> canciones) {
		this.canciones=canciones;
	}
	
	public ArrayList<cancion> Getcanciones() {
		return canciones;
	}
	
	public void Setcontactos(ArrayList<contacto> contactos) {
		this.contactos=contactos;
	}
	
	public ArrayList<contacto> Getcontactos() {
		return contactos;
	}
	@Override
	public void viajes(String destino) {
	}
	@Override
	public void cambiar(boolean cambiar) {
	}
	@Override
	public void cambiar_e(boolean cambiar) {
	}
	@Override
	public void guardar(ArrayList<cancion> canciones) {
	}
	@Override
	public void cargar() {
	}
	@Override
	public void estado(boolean cambiar) {
	}
	@Override
	public void volumen(boolean cambiar) {
	}
}
