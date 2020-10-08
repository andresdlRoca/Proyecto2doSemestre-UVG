/*
Sintomas.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel González Ramos 
Manuel Alejandro Archila Moran
Última modificación: 11/9/2020
Clase que se encarga de preguntarle al usuario sobre sus sintomas y
presentar alguna recomendación segun los sintomas que presente, si
sus sintomas son muy graves se le recomienda atender al medico lo
mas pronto posible, ademas el usuario puede ver los hospitales disponibles en guatemala.
 */



import java.util.Scanner;

//Inicio de la clase
public class Sintomas{
	//Atributos 
	String[] sintomasComunes = new String[] {"fiebre","tos Seca ","cansancio"};
	String[] sintomasMenosComunes = new String[] {"dolor de garganta","diarrea","conjuntivitis","dolor de cabeza","erupciones cutáneas"};
	String[] sintomasGraves = new String[] {"dificultad para respirar","presión en el pecho ","incapacidad de moverse"};
		 
	Scanner teclado = new Scanner(System.in);
	Scanner entrada = new Scanner(System.in);
	
	//instanciando la clase directorio
	ClaseDirectorio d = new ClaseDirectorio();


//inicio del metodo que le solicita al usuario sus sintomas y le da recomendaciones segun sus sintomas, y si son muy graves le recomienda visitar al medico y le muestra los hopitales disponibles en guatemala.
	public void IngresarSintomas(){
		boolean ejecucion = true;
		while (ejecucion){
			try{	
				System.out.println("Cuales son sus sintomas?");
				String st= teclado.nextLine();
					if(st.equals("fiebre")||st.equals("tos seca")|| st.equals("cansancio")){
						System.out.println("");
						System.out.println("Sus sintomas no son tan graves, por eso le recomendamos lo siguiente:");
						System.out.println("");
						System.out.println(" _____________________________________________");
						System.out.println("|               Tips                          |");
						System.out.println("|          para estos Sintomas:               |");
						System.out.println("|      1.  Te con miel                        |");
						System.out.println("|      2.  Vapor de agua                      |");
						System.out.println("|      3.  Gargaras de agua con sal           |");
						System.out.println("|               Medicamentos                  |");
						System.out.println("|        °ibuprofen 500ml(por 10 dias )       |");
						System.out.println("|        ° Loratadina 10MG (por 5 dias)       |");
						System.out.println("|      	 °Aspirinas (por 15 dias)             |");
						System.out.println(" _____________________________________________ ");
						}else if (st.equals("dolor de garganta")||st.equals("diarrea")|| st.equals("conjuntivitis")||st.equals("erupciones cutáneas")||st.equals("dolor de cabeza")){
							System.out.println("");
							System.out.println("Sus sintomas no son tan graves,sin embargo son bastante inusuales por eso le recomendamos lo siguiente:");
							System.out.println("");
							System.out.println(" _____________________________________________________________");
							System.out.println("|               °Tips                                         |");
							System.out.println("|          para estos Sintomas:                               |");
							System.out.println("|      1. Te de manzanilla  ( diarrea)                        |");
							System.out.println("|      2. Te de guayabo     diarrea)                          |");
							System.out.println("|      3. Coloca rodajas de pepino en los ojos(conjuntivitis) |");
							System.out.println("|      4. Coloca tus manos en agua con hielo (dolor de cabeza)|");
							System.out.println("|      5. gargaras de agua oxigenada(dolor de garganta)       |");
							System.out.println("|      			°Medicamentos:                                |");
							System.out.println("|        1. Gastrexx (por 10 dias )                           |");
							System.out.println("|        2. Redoxon   (por 5 dias)                            |");
							System.out.println("|        3. Kralfato (por 5 dias)                             |");
							System.out.println("|      	 4. Vintax   (por 15 dias)                            |");
							System.out.println(" ______________________________________________________________");
							
						}else if (st.equals("dificultad para respirar")||st.equals("presion en el pecho")|| st.equals("incapacidad para moverse")){
							System.out.println("");
							System.out.println("Sus Sintomas son muy graves, le recomendamos visitar a un medico");
							System.out.println("Desea ver los hospitales que atienden covid en Guatemala?");
							System.out.println("1. Si");
							System.out.println("2. No ");
							int opcion = entrada.nextInt();
							
							if (opcion == 1){
								System.out.println("\n\n--Directorio de hospitales por departamento--");
								System.out.println("Ingrese el departamento que quiere ver");
								System.out.println("1. Guatemala\n2. Alta Verapaz\n3. Baja Verapaz\n4. Chimaltenango\n5. Chiquimula\n6. Suchitepequez\n" + 
								"7. El Progreso\n8. Escuintla\n9. Huehuetenango\n10. Izabal\n11. Jalapa\n12. Jutiapa\n13. Peten\n14. Quetzaltenango\n15. Quiche\n" + 
								"16. Sacatepequez\n17. San Marcos\n18. Santa Rosa\n19. Solola\n20. Totonicapan\n21. Zacapa\n22. Retalhuleu\n");
								int indice = entrada.nextInt();
								d.setAllHashmaps();
								
								System.out.println(d.getInformacion(indice-1)); 
													
							}else if (opcion == 2 ){
								System.out.println("Visite un medico lo antes posible");
								System.out.println("Que su salud mejore");
							}
								
						}
						
						else
							System.out.println("Sus sintomas  presentados no muestran que sea portador  de el virus de Covid-19");
					
				
			} catch (Exception e) {
				//System.out.println("dato invalido");
				}
		ejecucion = false;
		
		
		}
		
	}
}
