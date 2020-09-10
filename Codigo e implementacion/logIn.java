/******************************************************************
ContactosEmergencia.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 8/30/2020

Clase que se encarga de registrar/logear a los usuarios que utilicen el 
programa, de esta manera se puede guardar todos sus datos y personalizar
la experiencia del programa.
******************************************************************/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;


class logIn{
	Scanner scan = new Scanner(System.in);
	boolean usernameGate = true;
	String username;
	String password;
	boolean passwordGate = true;
	int choiceAccount;
	String name;
	String address;
	String age;
	String email;



	
	HashMap<String, ArrayList<String>> dataBank = new HashMap<String, ArrayList<String>>();

	public void getLogIn(){
		usernameGate = true;

		

		while(usernameGate){
			System.out.println("Bienvenido a nuestro programa, porfavor ingrese su usuario para continuar.");
			username = scan.next();
			passwordGate = true;

			if(dataBank.containsKey(username)){
				
				while(passwordGate){
					System.out.println("Ingrese su contraseña porfavor");
					password = scan.next();
					if(dataBank.get(username).contains(password)){
					System.out.println("Seccion ingresada correctamente.");
					passwordGate = false;
					usernameGate = false;
					}else{
						System.out.println("Contrasena ingresada incorrecta, ingrese otra vez.");
						
					}
				}
			}else{
				System.out.println("Ese usuario no esta registrado en nuestra base de datos, Desea crear una cuenta nueva?\n1.Si\n2.No");
				choiceAccount = scan.nextInt();

				if(choiceAccount == 2){
					System.out.println("");
				}else{

					System.out.println("Ingrese su contraseña");
					password = scan.next();
					

					System.out.println("Ingrese su nombre porfavor");
					name = scan.next();
					

					System.out.println("Ingrese su vivienda");
					address = scan.next();
						

					System.out.println("Ingrese su edad");
					age = scan.next();
					

					System.out.println("Ingrese su correo electronico");
					email = scan.next();
					



					dataBank.put(username, new ArrayList<String>());
					dataBank.get(username).add(password);
					dataBank.get(username).add(name);
					dataBank.get(username).add(address);
					dataBank.get(username).add(age);
					dataBank.get(username).add(email);

					System.out.println(dataBank);

					
					usernameGate = false;

				}
				
			}

		}
		
	}
}