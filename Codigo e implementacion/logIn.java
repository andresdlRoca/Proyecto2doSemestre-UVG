/******************************************************************
Login.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 10/9/2020

Clase que se encarga de registrar/logear a los usuarios que utilicen el 
programa, de esta manera se puede guardar todos sus datos y personalizar
la experiencia del programa.
******************************************************************/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

class Login{
	Scanner scan = new Scanner(System.in);
	boolean usernameGate = true;
	boolean passwordGate = true;
	String username, password, name, address, email;
	int choiceAccount, age;

	//Hashmap que registra la informacion de todos los usuarios registrados
	HashMap<String, ArrayList<String>> dataBank = new HashMap<String, ArrayList<String>>();

	//Metodo para registrar/logear al usuario dentro del programa
	public void getLogIn(){
		usernameGate = true;

		while(usernameGate){
			System.out.println("Bienvenido a nuestro programa, porfavor ingrese su usuario para continuar.");
			username = scan.nextLine();
			passwordGate = true;

			//Se chequea si el usuario existe dentro de la base de datos
			if(dataBank.containsKey(username)){

				//Si existe se le pide la contraseña al usuario
				while(passwordGate){
					System.out.println("Ingrese su contraseña porfavor");
					password = scan.nextLine();
					if(dataBank.get(username).contains(password)){
					System.out.println("Seccion ingresada correctamente.");
					passwordGate = false;
					usernameGate = false;
					}else{
						System.out.println("Contrasena ingresada incorrecta, ingrese otra vez.");	
					}
				}
			}else{

				//Si no existe se le pregunta al usuario si se quiere registrar
				System.out.println("Ese usuario no esta registrado en nuestra base de datos, Desea crear una cuenta nueva?\n1.Si\n2.No");
				choiceAccount = scan.nextInt();

				if(choiceAccount == 2){
					System.out.println("");
				}else{
					//Recoleccion de datos del usuario
					scan.nextLine();
					System.out.println("Ingrese su contraseña");
					password = scan.nextLine();
					
					System.out.println("Ingrese su nombre porfavor");
					name = scan.nextLine();
					
					System.out.println("Ingrese su vivienda");
					address = scan.nextLine();
						

					System.out.println("Ingrese su edad");
					age = scan.nextInt();
					
					scan.nextLine();
					System.out.println("Ingrese su correo electronico");
					email = scan.nextLine();
					
					//Se guardan los datos dentro del hashmap
					dataBank.put(username, new ArrayList<String>());
					dataBank.get(username).add(password);
					dataBank.get(username).add(name);
					dataBank.get(username).add(address);
					dataBank.get(username).add(Integer.toString(age));
					dataBank.get(username).add(email);

					System.out.println(dataBank);

					usernameGate = false;
				}
				
			}

		}
		
	}
}