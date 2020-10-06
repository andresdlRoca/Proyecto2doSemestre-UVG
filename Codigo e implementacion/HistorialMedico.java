/******************************************************************
HistorialMedico.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 10/9/2020
Clase que solicita al usuario su historial medico
incluyendo su edad, sexo y padecimientos para poder 
determinar una probabilidad de riesgo si en dado caso
tuviese Covid.
******************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class HistorialMedico{
	//Atributos
	private double Riesgo;
	private int Edad;
	private int sexo;
	private ArrayList<Integer> Enfermedades;
	private String[] ListaEnf = {"Hipertension","Diabetes","Enfermedad Pulmonar Obstructiva Cronica","Enfermedad Renal Cronica","Inmunosupresion(cancer, lupus, etc.)"};
	private String[] Sexo = {"Masculino","Femenino"};
	private Scanner entrada = new Scanner(System.in);
	
	//Metodo Constructor
	public HistorialMedico(){
		Enfermedades = new ArrayList<Integer>();
	}
	//Metodo que solicita la informacion del usuario.
	public void RegistroHistorial(){
		boolean runhistorial = true;
		while (runhistorial){
			try {
				System.out.println("Porfavor ingrese la siguiente informacion para completar su perfil de paciente");
				System.out.println("\nIngrese su sexo: \n1. Masculino\n2. Femenino");
				sexo = entrada.nextInt();
				sexo = sexo - 1;
				System.out.println("\nIngrese su edad: ");
				Edad = entrada.nextInt();
				int Ingreso=0;
				//Ciclo que llena el arreglo enfermedades dependiendo las que el usuario padezca.
				for (int i=0;i<5;i++){
					System.out.println("\nUsted padece "+ListaEnf[i]+"? \n1.Si\n2.No");
					Ingreso = entrada.nextInt();
					if (Ingreso == 1){
						Enfermedades.add(i);
					} else if (Ingreso != 1 || Ingreso != 2) {
						System.out.println("Ingreso una opcion invalida, intentelo de nuevo");
						i = i-1;
					}
				}
				runhistorial = false;
			} catch(InputMismatchException e) {
				System.err.println("Se ingresaron datos invalidos, intentelo de nuevo");
				entrada.nextLine();
			}
		}
	}
	
	//Metodo que calcula la probabilidad en base a la edad y sexo del usuario
	public void CalculoProbabilidad(){
		//Probabilidad por edad y sexo
		double probabilidadEdad=0.0;
		if (Edad<20&&sexo==1){
			probabilidadEdad=8.90;
		} else if (Edad<30&&sexo==1){
			probabilidadEdad=16.20;
		} else if (Edad<40&&sexo==1){
			probabilidadEdad=27.90;
		} else if (Edad<60&&sexo==1){
			probabilidadEdad=60.90;
		} else if (Edad<80&&sexo==1){
			probabilidadEdad=86.30;
		} else if (Edad<100&&sexo==1){
			probabilidadEdad=92.70;
		} else if (Edad<20&&sexo==0){
			probabilidadEdad=14.90;
		} else if (Edad<30&&sexo==0){
			probabilidadEdad=25.90;
		} else if (Edad<40&&sexo==0){
			probabilidadEdad=41.20;
		} else if (Edad<60&&sexo==0){
			probabilidadEdad=73.80;
		} else if (Edad<80&&sexo==0){
			probabilidadEdad=92.00;
		} else if (Edad<100&&sexo==0){
			probabilidadEdad=95.20;
		}
		//Probabilidad por enfermedades
		int NumEnfermedades = Enfermedades.size();
		double probabilidadEnfermedad=0.0;
		if (NumEnfermedades==1){
			probabilidadEnfermedad = 5;
		} else if (NumEnfermedades==2){
			probabilidadEnfermedad = 10;
		} else if (NumEnfermedades==3){
			probabilidadEnfermedad = 20;
		} else if (NumEnfermedades==4){
			probabilidadEnfermedad = 30;
		} else if (NumEnfermedades==5){
			
		}
		//Calculo de probabilidad total
		double probabilidadTotal = 0.0;
		probabilidadTotal = probabilidadEnfermedad + probabilidadEdad;
		System.out.println("Nivel de riesgo: ");
		if (probabilidadTotal>0&&probabilidadTotal<25){
			System.out.println("Bajo");
		} else if (probabilidadTotal>24&&probabilidadTotal< 40){
			System.out.println("Medio bajo");
		} else if (probabilidadTotal>39&&probabilidadTotal<60){
			System.out.println("Medio");
		} else if (probabilidadTotal>59&&probabilidadTotal<85){
			System.out.println("Medio alta");
		} else if (probabilidadTotal>84){
			System.out.println("Alta");
		} else if (probabilidadTotal>100){
			System.out.println("Extremo Alta");
		}
		
	}

	//Metodo que muestra la ficha de informacion del usuario de una manera detallada y clara.
	public void InformacionPaciente(){
		System.out.println("--------------------------\nEdad: "+Edad);
		System.out.println("Sexo: "+Sexo[sexo]);
		System.out.println("Padecimientos: ");
		//Ciclo que extrae del arreglo de enfermedades, especificamente las que el usuario selecciono
		for (int i=0; i<Enfermedades.size();i++){
			System.out.println("- "+ListaEnf[Enfermedades.get(i)]);
		}	
	}
	
	
}
