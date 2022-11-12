import java.util.ArrayList;

//
//
//  @ Project : Laboratorio4
//  @ File Name : telefono.java
//  @ Date : 11/8/2022
//  @ Author : Nicolle Gordillo y Ana Villela
//
//La interfaz modo telefono se encarga de darle metodos void a la clase principal




public interface modo_telefono {
	public void contactos(ArrayList<contacto> lista);
	public void llamar(ArrayList<contacto> lista);
	public void audio(Boolean flag);
	public void conexion(boolean conection);
	public void finalizar();
}
