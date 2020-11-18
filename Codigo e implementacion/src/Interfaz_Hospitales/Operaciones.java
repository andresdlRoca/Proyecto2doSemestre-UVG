/******************************************************************
Operaciones.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 11/05/2020

Clase que funciona para darle tips al usuario con sintomas que 
el usuario ingresa
******************************************************************/

package Interfaz_Hospitales;
public class Operaciones {
    //Atributos 
	String[] sintomasComunes = new String[] {"fiebre","tos Seca ","cansancio"};
	String[] sintomasMenosComunes = new String[] {"dolor de garganta","diarrea","conjuntivitis","dolor de cabeza","erupciones cutáneas","perdida del olfato"};
	String[] sintomasGraves = new String[] {"dificultad para respirar","presión en el pecho ","incapacidad de moverse"};
	

	
	//instanciando la clase directorio



//inicio del metodo que le solicita al usuario sus sintomas y le da recomendaciones segun sus sintomas, y si son muy graves le recomienda visitar al medico y le muestra los hopitales disponibles en gatemala.
	public String IngresarSintomas(String a){
            String a1= a.toLowerCase();
            
            String tip1 = "";
            String tip2 = "";
            String tip3 = "";
            String tip4 = "";
            String tip5 = "";
            String tip6 = "";
            String medi1="";
            String medi2="";
            String medi3="";
            String medi4 ="";
            String medi5= "";
            
           
            if(a1.equals("fiebre")||a1.equals("tos seca")|| a1.equals("cansancio")){
                tip1 = "Te con miel (tos seca)";
                tip2 = "lienzos con el  vapor de agua (fiebre)";
                tip3= "Gargaras de agua con sal(cansansio)";
                medi1= "°ibuprofen 500ml(por 10 dias )";
                medi2  ="° Loratadina 10MG (por 5 dias) ";
                medi3 = " °Aspirinas (por 15 dias) ";
                        
			
            }else if (a1.equals("dolor de garganta")||a1.equals("diarrea")|| a1.equals("conjuntivitis")||a1.equals("erupciones cutáneas")||a.equals("dolor de cabeza")|| a1.equals("perdida del olfato")){
			
                tip1 = " Te de manzanilla  ( diarrea)";
                tip2 = " Te de guayabo     diarrea)       ";
                tip3= " Coloca rodajas de pepino en los ojos(conjuntivitis)";
                tip4= " Coloca tus manos en agua con hielo (dolor de cabeza)";
                tip5= " gargaras de agua oxigenada(dolor de garganta) ";
                medi1= "°Gastrexx (por 10 dias )";
                medi2  ="° Redoxon   (por 5 dias) ";
                medi3 = " °Kralfato (por 5 dias)   ";
                medi4 = "Vintax   (por 15 dias)  ";
               
                        
		}else if (a1.equals("dificultad para respirar")||a1.equals("presion en el pecho")|| a1.equals("incapacidad para moverse")){
                     tip6= "Lamentablemente no podemos recomendarle ningun tip";
                     medi5= "No podemos recomendarle ningún medicamento.Lo mejor es que visite un médico";
					
				
				
				
                 }
                return("Sus tips son los siguientes:\n" 
                       + tip1                        
                        +tip2
                        +tip3
                        +tip4
                        +tip5
                        +tip6
                        +"\nSus medicamentos son los siguientes:\n"
                        +medi1
                        +medi2
                        +medi3
                        +medi4
                        +medi5);
                 
    }
}
