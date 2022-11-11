import java.util.ArrayList;

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
		cancion elEfecto = new cancion("El efecto","3:33 min","Bad Bunny","Regueton"); 
		cancion unHoly = new cancion("Unholy","3:36 min", "Sam Smith","Pop");
		cancion laBachata = new cancion("La Bachata","3:43", "Manuel Turizo", "Bachata");
		cancion asItVas = new cancion("As It Vas","3:47 min", "Harry Styles", "Pop");
		cancion mePortoBonito = new cancion("Me Porto Bonito", "3:58 min","Bad Bunny", "Regueton");
		cancion Mercy = new cancion("Mercy", "3:29 min", "Shawn Mendes", "Pop");
		hitsMundial.add(elEfecto);
		hitsMundial.add(unHoly);
		hitsMundial.add(laBachata);
		hitsMundial.add(asItVas);
		hitsMundial.add(mePortoBonito);
		hitsMundial.add(Mercy);

		//Inicio del menu de seleccion del usuario
		System.out.println("Radio Hits Mundiales \n1.Encender \n2.Cambiar volumen \n3.Modo Radio \n4.Modo Reproduccion \n5.Modo Telefono \n6.Modo Productividad \n7.Apagar");
		op1 = teclado.nextInt();
		try{
			while(op1 != 7){
				if(op1 == 1){
					yosi_sideral.estado(true);
				}
				if(yosi_sideral.getestado()=="Apagado"){
					System.out.println("Radio está apagado");
					System.out.println("Radio Hits Mundiales \n1.Encender \n2.Cambiar volumen \n3.Modo Radio \n4.Modo Reproduccion \n5.Modo Telefono \n6.Modo Productividad \n7.Apagar");
					op1 = teclado.nextInt();
				}
				else{
					a = 0;
					int b = 0;
					System.out.println("***************** Radio Hits Mundiales *****************");
					op1 = teclado.nextInt();
					if(op1 == 2){
						while(a !=3){
							
						}
					}

				}

			}

		}
		catch(Exception e)
		{
			System.out.println("Ingrese algo válido");
		}
	
	}
}
