//
//
//  @ Project : Laboratorio4
//  @ File Name : Principal.java
//  @ Date : 11/8/2022
//  @ Author : 
//
//
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;
import java.util.ArrayList;



public class Principal {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int op1 = 0;
		int a = 0;

		//creacion radio y listas de canciones
		radio yosi_sideral = new radio();
		ArrayList <cancion> canciones = new ArrayList<cancion>();
		ArrayList <contacto> contactos = new ArrayList<contacto>();
		ArrayList <Double> emisoras = new ArrayList<Double>();

		//PlayList 1
		ArrayList <cancion> hitsMundial = new ArrayList<cancion>();
		cancion elEfecto = new cancion("El efecto","Bad Bunny","Regueton","3:33 min"); 
		cancion unHoly = new cancion("Unholy", "Sam Smith","3:36 min");
		cancion laBachata = new cancion("La Bachata", "Manuel Turizo", "3:43");
		cancion asItVas = new cancion("As It Vas", "Harry Styles", "3:47 min");
		cancion mePortoBonito = new cancion("Me Porto Bonito", "Bad Bunny", "3:58 min");
		hitsMundial.add(elEfecto);
		hitsMundial.add(unHoly);
		hitsMundial.add(laBachata);
		hitsMundial.add(asItVas);
		hitsMundial.add(mePortoBonito);

		//Inicio del menu de seleccion del usuario
		System.out.println("Radio Hits Mundiales \n1.Encender \n2.Cambiar volumen \n3.Modo Radio \n4.Modo Reproduccion \n5.Modo Telefono \n6.Modo Productividad \n7.Apagar");
		op1 = teclado.nextInt();
		try{
			while(op1 != 7){
				if(op1 == 1){
					hitsMundial.estado(true);
				}
				if(hitsMundial.get_estado()=="Apagado"){
					System.out.println("Radio está apagado");
					System.out.println("Radio Hits Mundiales \n1.Encender \n2.Cambiar volumen \n3.Modo Radio \n4.Modo Reproduccion \n5.Modo Telefono \n6.Modo Productividad \n7.Apagar");
					op1 = teclado.nextInt();
				}
				else{
					a = 0;
					int b = 0;
					System.out.println("***************** Radio Hits Mundiales *****************")
					op1 = teclado.nextInt();
					if(op1 == 2){
						while(a !=3){
							
						}
					}

				}

			}

		}		

	}
}
