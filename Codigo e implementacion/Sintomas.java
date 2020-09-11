import java.util.Scanner;
public class Sintomas{
	String[] SintomasComunes = new String[] {"fiebre","tos Seca ","cansancio"};
	String[] SintomasMenosComunes = new String[] {"dolor de garganta","diarrea","conjuntivitis","dolor de cabeza","erupciones cutáneas"};
	String[] SintomasGraves = new String[] {"dificultad para respirar","presión en el pecho ","incapacidad de moverse"};
		 
	Scanner teclado = new Scanner(System.in);
	Scanner entrada = new Scanner(System.in);
	
	
	public void IngresarSintomas(){
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
				System.out.println("|      3.  Gárgaras de agua con sal           |");
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
					System.out.println("|      			°Medicamentos:                                |");
					System.out.println("|        1. Gastrexx                                          |");
					System.out.println("|        2. Redoxon                                           |");
					System.out.println("|        3. Kralfato                                          |");
					System.out.println("|      	 4. Vintax                                            |");
					System.out.println(" ______________________________________________________________");
					
				}else if (st.equals("dificultad  para respirara")||st.equals("presion en el pecho")|| st.equals("incapacidad para moverse")){
					System.out.println("");
					System.out.println("Sus Sintomas son muy graves, le recomendamos visitar a un medico ");
					System.out.println("");
				}
				
				
				
				else
					System.out.println("Sus sintomas no presentados no muestran que sea portador  de el virus de Covid-19");
			
			
			
		}
		
}