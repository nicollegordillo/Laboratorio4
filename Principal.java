import java.util.ArrayList;

//
//
//  @ Project : Laboratorio4
//  @ File Name : Principal.java
//  @ Date : 11/8/2022
//  @ Author : Nicolle Gordillo, Ana Villela y Wilson Calderon
//
//La clase principal es la encargada de simular el telefono con sus funciones de modo radio,telefono, productividad y reproduccion.
//El simulador tambien tiene funciones como simular subir o bajar volumen y apagar o encender el simulador mismo.
//Cada opcion del menu utiliza metodos de las interfaces modo_radio, modo_volumen, modo_telefono, modo_productividad, modo_estado y modo_ reproduccion.
//Tambien utiliza las clases Cancion, Radio y Contacto que ayudan a dar forma a los objetos y contienen los ArrayList.

//librerias necesarias para recibir datos del usuario y hacer los arreglos con contactos, emisoras y playlists
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//booleanos continuar permiten mantenerse dentro de un ciclo dentro de una eleccion del menu principal
		Boolean continuar = true;
		Boolean continuar3=true;
		Boolean continuar2 = true;
		Boolean continuar4=true;
		Boolean continuar5=true;
		Boolean continuar6=true;
		Boolean continuar7=true;
		//variables op permiten avanzar dentro de una eleccion de modo en el menu
		int op1=0;
		int op2=0;
		int op3=0;
		int op4=0;
		int op5=0;
		int op6=0;
		int op7=0;
		int op8=0;
		int op9=0;
		int op10=0;
		int frecuencia=0;
		int emisora=0;
		int audio=0;
		Double emisora1=0.0;
		String respuesta="";

		//creacion radio y listas de canciones y contactos
		radio yosi_sideral = new radio();
		ArrayList <contacto> contactos = new ArrayList<contacto>();
		ArrayList <Double> emisoras = new ArrayList<Double>();

		//Objetos de tipo contacto predeterminados que se guardan en el ArrayList de contactos que se guardan en la interfaz modo_telefono
		contacto c1= new contacto("James", "5416-6812");
		contacto c2= new contacto("Andre", "5654-1235");
		contacto c3= new contacto("Maddi", "2815-9564");
		contacto c4= new contacto("Nick", "5517-6476");
		contactos.add(c1);
		contactos.add(c2);
		contactos.add(c3);
		contactos.add(c4);

		//Playlist 1 que guarda canciones existentes
		ArrayList <cancion> hitsMundial = new ArrayList<cancion>();

		//Objetos de tipo cancion predeterminados que se guardan en el Arraylist hitsMundial que se guarda en la interfaz modo_reproduccion
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
			continuar2=true;
			System.out.println("Radio Hits Mundiales \n1.Encender \n2.Apagar");
			op1 = teclado.nextInt();//variable de eleccion del usuario del menu principal
			teclado.nextLine();//recibe eleccion 
			if(op1==1){
				while(continuar2){
					continuar3=true;//Se mantiene el resto de booleanos en true para poder continuar en el menu
					continuar4=true;
					continuar5=true;
					continuar6=true;
					continuar7=true;
					yosi_sideral.estado(true);
					System.out.println("Radio Hits Mundiales \n1.Cambiar volumen \n2.Modo Radio \n3.Modo Reproduccion \n4.Modo Telefono \n5.Modo Productividad \n6.Apagar");
					op2 = teclado.nextInt();//Se recibe la eleccion del usuario para entrar en uno de los ciclos de modo
					teclado.nextLine();
					if(op2==1){//inicia ciclo de modificacion de volumen
						System.out.println("1. Subir volumen \n2. Bajar volumen");
						op3=teclado.nextInt();
						teclado.nextLine();
						if(op3==1){
							yosi_sideral.volumen(true);//booleano para subir volumen
						}
						else if(op3==2){
							yosi_sideral.volumen(false);//booleano para bajar volumen
						}
						else{
							System.out.println("Ingrese algo válido");//Programacion defensiva en caso de no recibir algo válido
						}//termina ciclo modificacion de volumen

					}//inicia ciclo de modo radio
					else if(op2==2){
						while(continuar3){
							System.out.println("Ahora se encuentra en el modo radio");
							System.out.println("\n1. Cambiar frecuencia \n2. Cambiar emisora \n3. Guardar emisora \n4. Cargar emisora \n5. Salir");
							op4=teclado.nextInt();
							teclado.nextLine();
							if(op4==1){//Inicia condicional de cambio de frecuencia
								System.out.println("1. FM \n2. AM");
								frecuencia=teclado.nextInt();
								teclado.nextLine();
								if(frecuencia==1){
									yosi_sideral.cambiar(true);
								}
								else if(frecuencia==2){
									yosi_sideral.cambiar(false);
								}

							}
							else if(op4==2){//Inicia condicional de cambio de emisora
								System.out.println("1. Subir \n2. Bajar");
								emisora=teclado.nextInt();
								teclado.nextLine();
								if(emisora==1){
									yosi_sideral.cambiar_e(true);
								}
								else if(emisora==2){
									yosi_sideral.cambiar_e(false);
								}

							}
							else if(op4==3){//Inicia condicional para guardar emisoras en la lista de emisoras favoritas
								System.out.println("Ingrese la emisora que desea guardar");
								emisora1=teclado.nextDouble();
								teclado.nextLine();
								yosi_sideral.guardar(emisoras, emisora1);

							}
							else if(op4==4){//Seleccion para cargar una emisora a imprimirla en pantalla
								yosi_sideral.cargar(emisoras);

							}
							else if(op4==5){//Se rompe el ciclo de continuar y se vuelve al menu principal saliendo del ciclo de modo radio
								continuar3=false;
							}
						}
						
					}//termina ciclo modo radio
					else if(op2==3){//Inicia ciclo de modo reproduccion
						while(continuar4){
							System.out.println("Ahora se encuentra en el modo Reproduccion");
							System.out.println("\n1. Cambiar cancion \n2. Escuchar canción \n3. Seleccionar canción \n4. Salir");
							op5=teclado.nextInt();
							teclado.nextLine();
							if(op5==1){//Condicional para cambiar cancion
								System.out.println("1. Cambiar hacia adelante \n2. Cambiar hacia atrás");
								op10=teclado.nextInt();
								teclado.nextLine();
								if(op10==1){
									yosi_sideral.cambiar_c(true,hitsMundial);

								}
								else if(op10==2){
									yosi_sideral.cambiar_c(false,hitsMundial);
								}

							}
							else if(op5==2){//Condicional para imprimir cancion en pantalla
								yosi_sideral.escuchar(hitsMundial);

							}
							else if(op5==3){//Condicional para seleccionar cancion
								yosi_sideral.seleccionar(hitsMundial);
							}
							else if(op5==4){//Se rompe el ciclo con un booleano y se regresa al menu principal
								continuar4=false;
							}
						}
	
					}//Termina ciclo de modo reproduccion

					else if(op2==4){//Inicia ciclo de modo telefono
						System.out.println("Ahora se encuentra en el modo Telefono");
						System.out.println("\n1. Conectar el teléfono \n2. Salir");
						op8=teclado.nextInt();
						teclado.nextLine();
								if(op8==1){//condicional para iniciar menu de modo telefono
									while(continuar5){
										System.out.println("\n1. Ver contactos \n2. Llamar un contacto \n3. Cambiar el audio  \n4. Desconectar el teléfono");
										op6=teclado.nextInt();
										teclado.nextLine();
										if(op6==1){//en ver contactos se imprime el ArrayList de contactos 
											yosi_sideral.contactos(contactos);
										}
										else if(op6==2){
											continuar7=true;
											yosi_sideral.llamar(contactos);//Se llama al metodo llamar de modo_telefono que imprime una llamada 
											while(continuar7){
												System.out.println("1. Finalizar llamada");
												op9=teclado.nextInt();
												teclado.nextLine();
												if(op9==1){//Terminar llamada
													yosi_sideral.finalizar();
													continuar7=false;
												}

											}

										}
										else if(op6==3){//Condicional para cambiar el audio de bocina
											System.out.println("1. Auriculares \n2. Speaker");
											audio=teclado.nextInt();
											teclado.nextLine();
											if(audio==1){
												yosi_sideral.audio(true);
											}
											else if(audio==2){
												yosi_sideral.audio(false);
											}
										}
										else if(op6==4){//Se desconecta el telefono y se sale de modo_telefono para regresar al menu principal
											continuar5=false;
										}
									}
								}
					}//Se termina el ciclo de modo telefono

					//Inicia ciclo de modo productividad
					else if(op2==5){//
						while(continuar6){
							System.out.println("Ahora se encuentra en el modo Productividad");
							System.out.println("\n1. Planear viaje \n2. Salir");
							op7=teclado.nextInt();
							teclado.nextLine();
							if(op7==1){//Se pide un lugar para imprimirlo como lugar de destino
								System.out.println("¿A donde desea ir?");
								respuesta=teclado.nextLine();
								System.out.println(yosi_sideral.viajes(respuesta));
							}
							else if(op7==2){//Sale del ciclo de modo productividad para volver al menu principal
								continuar6=false;
							}
						}
					}
					else if(op2==6){
						yosi_sideral.estado(false);
						continuar2=false;
					}
					else{
						System.out.println("Ingrese algo válido");//Programacion defensiva para el menu principal
					}

				}
				
			}
			else if(op1==2){//Apaga el simulador y sale del menu
				continuar=false;
			}
			else{
				System.out.println("Ingrese algo válido");//Programacion defensiva para encendido o apagado
			}

		}
	
	}
}
