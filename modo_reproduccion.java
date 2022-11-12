import java.util.ArrayList;

//
//
//  @ Project : Laboratorio4
//  @ File Name : reproduccion.java
//  @ Date : 11/8/2022
//  @ Author : Nicolle Gordillo y Ana Villela
//
//La interfaz modo reproduccion se encarga de darle metodos void a la clase principal




public interface modo_reproduccion {
	public void cambiar_c(Boolean flag, ArrayList<cancion> lista);
	public void escuchar(ArrayList<cancion> lista);
	public void seleccionar(ArrayList<cancion> lista);
}
