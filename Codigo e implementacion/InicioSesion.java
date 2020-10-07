/******************************************************************
InicioSesion.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 07/10/2020

Clase que se encarga de registrar/logear a los usuarios que utilicen el 
programa, de esta manera se puede guardar todos sus datos y personalizar
la experiencia del programa.
******************************************************************/

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;
import java.io.File;

import java.util.Scanner;


class InicioSesion{
	Scanner scan = new Scanner(System.in);
	public Scanner s;
	String csvUsername = ""; String csvPassword = ""; String csvName = ""; String csvAddress = ""; String csvAge = ""; String csvEmail = "";
	



	public void logIn(String inputUsername, String fileName){
		//Metodo para hacer log in
		boolean found = true;
		

		try{
			//Lee el csv con la informacion y guarda los datos en variables
			s = new Scanner(new File(fileName));	
			s.useDelimiter("[,\n]");

			while(s.hasNext() && found){
				csvUsername = s.next();
				csvPassword = s.next();				
				csvName = s.next();					
				csvAddress = s.next();				
				csvAge = s.next();			
				csvEmail = s.next();
				

				if(csvUsername.equals(inputUsername)){
					//Si encuentra el usuario que fue ingresado, para el loop
					found = false;
				}else{
					//Muestra un mensaje diciendo que el usuario ingresado no esta en la base de datos
					JOptionPane.showMessageDialog(null, "Ese usuario no esta guardado en nuestro sistema");
				}
			}
		}
		
		catch(Exception E){
			JOptionPane.showMessageDialog(null, "Ese usuario no esta guardado en nuestro sistema");
		}
	}

		
	public void saveAccount(String username, String password, String name, String address, String age, String email, String fileName){
		//Para crear una cuenta nueva
		try{
			FileWriter fw = new FileWriter(fileName, true);
			
			fw.append(username);
			fw.append(',');
			fw.append(password);
			fw.append(',');
			fw.append(name);
			fw.append(',');
			fw.append(address);
			fw.append(',');
			fw.append(age);
			fw.append(',');
			fw.append(email);
			fw.append('\n');

			fw.flush();
			fw.close();

			JOptionPane.showMessageDialog(null,"Cuenta creada");
		}
		catch(Exception E){

			JOptionPane.showMessageDialog(null,"No se pudo crear cuenta");
		}
	}
} 
