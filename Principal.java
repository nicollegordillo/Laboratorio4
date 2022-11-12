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
		Boolean continuar = true;
		Boolean continuar3=true;
		Boolean continuar2 = true;
		int op1=0;
		int op2=0;
		int op3=0;
		int op4=0;

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
		while(continuar){
			System.out.println("Radio Hits Mundiales \n1.Encender \n2.Apagar");
			op1 = teclado.nextInt();
			teclado.nextLine();
			if(op1==1){
				while(continuar2){
					yosi_sideral.estado(true);
					System.out.println("Radio Hits Mundiales \n1.Cambiar volumen \n2.Modo Radio \n3.Modo Reproduccion \n4.Modo Telefono \n5.Modo Productividad \n6.Apagar");
					op2 = teclado.nextInt();
					teclado.nextLine();
					if(op2==2){
						System.out.println("1. Subir volumen \n2. Bajar volumen");
						op3=teclado.nextInt();
						teclado.nextLine();
						if(op3==1){
							yosi_sideral.volumen(true);
						}
						else if(op3==2){
							yosi_sideral.volumen(false);
						}
						else{
							System.out.println("Ingrese algo válido");
						}

					}
					else if(op2==3){
						while(continuar3){
							System.out.println("Ahora se encuentra en el modo radio");
							System.out.println("\n1. Cambiar frecuencia \n2. Cambiar emisora \n3. Guardar emisora \n4. Cargar emisora \n5. Salir");
							op4=teclado.nextInt();
							teclado.nextLine();
							if(op4==1){

							}
							else if(op4==2){

							}
							else if(op4==3){

							}
							else if(op4==4){

							}
							else if(op4==5){
								continuar3=false;
							}
						}
						
					}
					else if(op2==4){
	
					}
					else if(op2==5){
	
					}
					else if(op2==6){
						yosi_sideral.estado(false);
						continuar2=false;
					}
					else{
						System.out.println("Ingrese algo válido");
					}

				}
				
			}
			else if(op1==2){
				continuar=false;
			}
			else{
				System.out.println("Ingrese algo válido");
			}

		}
	
	}
}
