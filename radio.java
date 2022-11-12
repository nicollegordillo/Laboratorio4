import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
//
//
//
//  @ Project : Laboratorio4
//  @ File Name : radio.java
//  @ Date : 11/8/2022
//  @ Author : Nicolle Gordillo y Ana Villela
//
//La clase radio se encarga de darle forma a los objetos de tipo radio mediante atributos
//Tambien brinda metodos sets y gets usados en la clase principal
//Brinda metodos void utilizados en la opcion Modo Radio del menu principal del simulador de telefono


public class radio implements modo_estado,modo_volumen,modo_productividad,modo_radio,modo_telefono,modo_reproduccion {

	//Atributos de los objetos de tipo radio
	private int posicion;
	private String frecuencia;
	private double emisora;
	private int volumen;
	private String estado;
	private String modo;
	private Boolean conectar;
	Scanner Teclado = new Scanner(System.in);

	//Sets y get de objetos de la lista
	public void setposicion(int posicion) {
		this.posicion=posicion;
	}
	public Boolean get_conectar()
    {
        return conectar;
    }
	public int getposicion() {
		return posicion;
	}
	public void setfrecuencia(String frecuencia) {
		this.frecuencia=frecuencia;
	}
	
	public String getfrecuencia() {
		return frecuencia;
	}
	public void setemisora(double emisora) {
		this.emisora=emisora;
	}
	
	public double getemisora() {
		return emisora;
	}
	public void setvolumen(int volumen) {
		this.volumen=volumen;
	}
	
	public int getvolumen() {
		return volumen;
	}
	public void setmodo(String modo) {
		this.modo=modo;
	}
	
	public String getmodo() {
		return modo;
	}
	public void set_estado(String estado) {
		this.estado=estado;
	}
	
	public String get_estado() {
		return estado;
	}

	//Constructos con atributos definidos
	public radio(){
		posicion=0;
		frecuencia="AM";
		emisora=2.5;
		volumen=0;
		estado="Apagado";
		modo="Speaker";
		conectar=false;
	}
	
	//INICIAN METODOS VOID USADOS EN LA CLASE PRINCIPAL
	@Override
	public void cambiar(Boolean flag) {//Metodo para cambiar de frecuencia
		if(flag){
			frecuencia="FM";
		}
		else{
			frecuencia="AM";
		}
		System.out.println("La frecuencia se ha cambiado a: "+frecuencia);
	}
	@Override
	public void cambiar_e(Boolean flag) {//Metodo para cambiar de emisora
		if(flag){
			emisora+=0.5;
		}
		else{
			emisora-=0.5;
		}
		System.out.println("La emisora es: "+emisora);
		
	}
	@Override
	public void guardar(ArrayList<Double> lista, Double emisora) {//Metodo para guardar emisoras en el ArrayList Lista de la interfaz modo_radio
		if(lista.size()<=50){
			lista.add(emisora);
		}
		else{
			System.out.println("Ya no puede guardar emisoras");
		}
		
	}
	@Override
	public void cargar(ArrayList<Double> lista) {//Metodo para sintonizar una emisora especifica ingresada por el usuario
		int j=1;
		for(double i:lista){
			System.out.println(j+" "+i);
			j++;
		}
		System.out.println("Ingrese el número de la emisora que quiere cargar");
		int e= Teclado.nextInt();
		emisora= lista.get(e-1);
		System.out.println("Se ha cargado la emisora: "+emisora);
		
	}
	//modo productividad
	@Override
	public String viajes(String destino) {//Metodo para simular el inicio de un viaje habiendo ingresado un destino por el usuario
		Random rand = new Random();
		int km= rand.nextInt(200)+1;
		int hora= rand.nextInt(10)+1;
		int min= rand.nextInt(60)+1;
		return "Iniciemos el viaje \nPara ir a "+destino+" siga las indicaciones del GPS \nEl destino está a "+km+" km"+ " y llegará allí en "+hora+" horas con "+min+" minutos";
	}
	//modo volumen
	@Override
	public void volumen(Boolean flag) {//Metodo para subir y bajar el volumen
		if(flag){
			volumen+=1;
		}
		else{
			if(volumen>0){
				volumen-=1;
			}
			else{
				System.out.println("No se puede bajar más el volumen");//Programacion defensiva en caso de alcanzar los limites 
			}
		}
		System.out.println("Volumen: "+volumen);//Se imprime el volumen actual
		
	}
	//modo estado
	@Override
	public void estado(Boolean state) {//Metodo para encender y apagar el telefono
		if(state){
			estado="Encendido";

		}
		else{
			estado="Apagado";
		}
		System.out.println("Estado: "+estado);
		
	}
	//modo reproducción
	@Override
	public void cambiar_c(Boolean flag, ArrayList<cancion> lista) {//Metodo para visualizar los objetos de tipo cancion en el ArrayList
		if(flag){
			if(posicion==lista.size()-1){
				posicion=0;
			}
			else{
				posicion+=1;
			}
			
		}
		else{
			if(posicion==0){
				posicion=lista.size()-1;
			}
			else{
				posicion-=1;
			}
		}
		
		
	}
	@Override
	//METODOS RELACIONADOS A LA CLASE CANCIONES
	public void escuchar(ArrayList<cancion> lista) {
		System.out.println(lista.get(posicion).toString());
		
	}
	@Override
	public void seleccionar(ArrayList<cancion> lista) {
		for(cancion i: lista){
			System.out.println(i.toString());
		}
		
	}
	//modo telefono
	@Override
	//METODOS RELACIONADOS A LA VISUALIZACION DE CONTACTOS
	public void contactos(ArrayList<contacto> lista) {
		for(contacto i: lista){
			System.out.println(i.toString());
		}
		
	}
	@Override
	public void llamar(ArrayList<contacto> lista) {
		int j=1;
		for(contacto i: lista){
			System.out.println(j+". "+i.toString());
			j++;
		}
		System.out.println("Ingrese el contacto que quiere llamar: ");
		int c= Teclado.nextInt()-1;
		System.out.println(lista.get(c).toString());
		
	}
	@Override
	public void audio(Boolean flag) {//Metodo para cambiar de audio
		if(flag){
			modo="auriculares";
		}
		else{
			modo="Speaker";
		}
		System.out.println("Audio: "+modo);
	}
	@Override
	public void conexion(boolean conection) {
		if(conection){
			System.out.println("Conectado");
		}
		else{
			System.out.println("Desconectado");
		}
		conectar=conection;
		
	}
	@Override
	public void finalizar() {
		System.out.println("Llamada: Finalizada");
		
	}
	
}
