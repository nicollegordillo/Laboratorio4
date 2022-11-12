import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
//
//
//
//  @ Project : Laboratorio4
//  @ File Name : radio.java
//  @ Date : 11/8/2022
//  @ Author : 
//
//




public class radio implements modo_estado,modo_volumen,modo_productividad,modo_radio,modo_telefono,modo_reproduccion {
	private int posicion;
	private String frecuencia;
	private double emisora;
	private int volumen;
	private String estado;
	private String modo;
	Scanner Teclado = new Scanner(System.in);
	public void setposicion(int posicion) {
		this.posicion=posicion;
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
	public void setestado(String estado) {
		this.estado=estado;
	}
	
	public String getestado() {
		return estado;
	}
	public radio(){
		posicion=0;
		frecuencia="AM";
		emisora=2.5;
		volumen=0;
		estado="Apagado";
		modo="Speaker";
	}
	//modo radio
	@Override
	public void cambiar(Boolean flag) {
		if(flag){
			frecuencia="FM";
		}
		else{
			frecuencia="AM";
		}
		System.out.println("La frecuencia se ha cambiado a: "+frecuencia);
	}
	@Override
	public void cambiar_e(Boolean flag) {
		if(flag){
			emisora+=0.5;
		}
		else{
			emisora-=0.5;
		}
		System.out.println("La emisora es: "+emisora);
		
	}
	@Override
	public void guardar(ArrayList<Double> lista, Double emisora) {
		if(lista.size()<=50){
			lista.add(emisora);
		}
		else{
			System.out.println("Ya no puede guardar emisoras");
		}
		
	}
	@Override
	public void cargar(ArrayList<Double> lista) {
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
	public String viajes(String destino) {
		Random rand = new Random();
		int km= rand.nextInt(200)+1;
		int hora= rand.nextInt(10)+1;
		int min= rand.nextInt(60)+1;
		return "Iniciemos el viaje \nPara ir a "+destino+" siga las indicaciones del GPS \nEl destino está a "+km+" km"+ " y llegará allí en "+hora+" horas con "+min+" minutos";
	}
	//modo volumen
	@Override
	public void volumen(Boolean flag) {
		if(flag){
			volumen+=1;
		}
		else{
			if(volumen>0){
				volumen-=1;
			}
			else{
				System.out.println("No se puede bajar más el volumen");
			}
		}
		System.out.println("Volumen: "+volumen);
		
	}
	//modo estado
	@Override
	public void estado(Boolean state) {
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
	public void cambiar_c(Boolean flag, ArrayList<cancion> lista) {
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
	public void audio(Boolean flag) {
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
		
	}
	@Override
	public void finalizar() {
		System.out.println("Llamada: Finalizada");
		
	}
	
}
