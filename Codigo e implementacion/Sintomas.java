/******************************************************************
Sintomas.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 9/11/2020

Clase que se encarga de preguntarle al usuario sobre sus sintomas y
presentar alguna recomendacion segun los sintomas que presente, si
sus sintomas son muy graves se le recomienda atender al medico lo
mas pronto posible
******************************************************************/

import java.util.Scanner;
public class Sintomas{
	String[] SintomasComunes = new String[] {"fiebre","tos Seca ","cansancio"};
	String[] SintomasMenosComunes = new String[] {"dolor de garganta","diarrea","conjuntivitis","dolor de cabeza","erupciones cutáneas"};
	String[] SintomasGraves = new String[] {"dificultad para respirar","presión en el pecho ","incapacidad de moverse"};
		 
	Scanner teclado = new Scanner(System.in);
	Scanner entrada = new Scanner(System.in);
	
	//Se le pide al usuario que ingrese su sintomas y segun su respuesta se le recomienda algun tratamiento
	public void IngresarSintomas(){
		System.out.println("Cuales son sus sintomas?");
		String st= teclado.nextLine();

			//Sintomas leves
			if(st.equalsIgnoreCase("fiebre")||st.equalsIgnoreCase("tos seca")|| st.equalsIgnoreCase("cansancio")){
				System.out.println("");
				System.out.println("Sus sintomas no son tan graves, por eso le recomendamos lo siguiente:");
				System.out.println("");
				System.out.println(" _____________________________________________");
				System.out.println("|               Tips                          |");
				System.out.println("|          para estos Sintomas:               |");
				System.out.println("|      1.  Te con miel                        |");
				System.out.println("|      2.  Vapor de agua                      |");
				System.out.println("|      3.  Gárgaras de agua con sal           |");
				System.out.println("|               Medicamentos                  |");
				System.out.println("|        °ibuprofen 500ml(por 10 dias )       |");
				System.out.println("|        ° Loratadina 10MG (por 5 dias)       |");
				System.out.println("|      	 °Aspirinas (por 15 dias)             |");
				System.out.println(" _____________________________________________ ");

				//Sintomas algo graves
				}else if (st.equalsIgnoreCase("dolor de garganta")||st.equalsIgnoreCase("diarrea")|| st.equalsIgnoreCase("conjuntivitis")||st.equalsIgnoreCase("erupciones cutáneas")||st.equalsIgnoreCase("dolor de cabeza")){
					System.out.println("");
					System.out.println("Sus sintomas no son tan graves,sin embargo son bastante inusuales por eso le recomendamos lo siguiente:");
					System.out.println("");
					System.out.println(" _____________________________________________________________");
					System.out.println("|               °Tips                                         |");
					System.out.println("|          para estos Sintomas:                               |");
					System.out.println("|      1. Te de manzanilla  ( diarrea)                        |");
					System.out.println("|      2. Te de guayabo     diarrea)                          |");
					System.out.println("|      3. Coloca rodajas de pepino en los ojos(conjuntivitis) |");
					System.out.println("|      			°Medicamentos:                                |");
					System.out.println("|        1. Gastrexx                                          |");
					System.out.println("|        2. Redoxon                                           |");
					System.out.println("|        3. Kralfato                                          |");
					System.out.println("|      	 4. Vintax                                            |");
					System.out.println(" ______________________________________________________________");
					
				//Sintomas muy graves
				}else if (st.equalsIgnoreCase("dificultad para respirar")||st.equalsIgnoreCase("presion en el pecho")|| st.equalsIgnoreCase("incapacidad para moverse")){
					System.out.println("");
					System.out.println("Sus Sintomas son muy graves, le recomendamos visitar a un medico, puede dirigirse a nuestro menu de numeros de emergencia para conseguir ayuda medica inmediata");
					System.out.println("");

				//Opcion por si no se presentan sintomas relacionados con el COVID
				}else {
					System.out.println("Sus sintomas no presentados no muestran que sea portador de Covid-19");	
		}
	}
}