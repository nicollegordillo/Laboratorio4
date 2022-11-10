//
//
//  @ Project : Laboratorio4
//  @ File Name : telefono.java
//  @ Date : 11/8/2022
//  @ Author : 
//
//




public interface modo_telefono {
	public void contactos(ArrayList<contacto> lista);
	public void llamar(ArrayList<contacto> lista);
	public void audio(boolean flag);
	public void conexion(boolean conection);
	public void finalizar();
}
