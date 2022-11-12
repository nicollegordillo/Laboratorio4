import java.util.ArrayList;

//
//
//  @ Project : Laboratorio4
//  @ File Name : modo_radio.java
//  @ Date : 11/8/2022
//  @ Author : Nicolle Gordillo y Ana Villela
//
//La interfaz modo radio se encarga de darle metodos void a la clase principal



public interface modo_radio {
	public void cambiar(Boolean flag);
	public void cambiar_e(Boolean flag);
	public void guardar(ArrayList<Double> lista, Double emisora);
	public void cargar(ArrayList<Double> lista);
}
