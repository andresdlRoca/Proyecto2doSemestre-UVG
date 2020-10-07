/******************************************************************
DriverCovid.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 07/10/2020

Clase que se encarga de toda la interaccion que el usuario tiene 
con el programa, le permite interactuar al usuario con todas las funciones
que el programa tiene.
******************************************************************/
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DriverCovid { 

    public static void main(String[] args) {
        
        int opcion = 0; //Variable que controla las opciones del menu
        boolean logcondicion = true;
        String fileName = "UserInfoTest.csv";
        boolean logCondition = true;
        boolean wrongPassword = true;
        int opcionLogIn = 0;

        Scanner scan = new Scanner(System.in);
        ModeloContactosEmergencia contactosModel = new ModeloContactosEmergencia();
        VistaContactosEmergencia contactosVista = new VistaContactosEmergencia();
        ControladorContactosEmergencia CE = new ControladorContactosEmergencia(contactosModel, contactosVista);
        ClaseDirectorio CD = new ClaseDirectorio();
        HistorialMedico histmedico = new HistorialMedico();
        InfoCovid info = new InfoCovid();
        Sintomas Sint = new Sintomas();
        InicioSesion log = new InicioSesion();

        CE.inicializarContactos();
        CD.setAllHashmaps();

        //Loop principal
        while (opcion != 7) {
            
	        while (opcionLogIn != 3){
	        
	            System.out.println("Elija un numero:");
	            System.out.println("1. Ingresar sesion");
	            System.out.println("2. Crear cuenta");
	            System.out.println("3. Continuar"); 
	            
	            opcionLogIn = scan.nextInt();
	            
	            if (opcionLogIn == 1){
	                logCondition = true;
	                while(logCondition){
	                    scan.nextLine();
	                    System.out.println("Ingrese su usuario");
	                    String inputUsername = scan.nextLine();

	                    System.out.println("Ingrese su contraseña");
	                    String inputPassword = scan.nextLine();

	                    

	                    log.logIn(inputUsername, fileName);

	                    
	                    if(log.csvUsername.equals(inputUsername)){
	                        System.out.println("");
	                    }else{
	                        break;
	                        
	                    }


	                    
	                    if(inputPassword.equals(log.csvPassword)){
	                        JOptionPane.showMessageDialog(null, "Bienvenido a nuestro programa " + log.csvName );
	                        logCondition = false;

	                    }else{
	                        while(wrongPassword){
	                            System.out.println("Esa contraseña es incorrecta, ingrese otra vez");
	                            inputPassword = scan.nextLine();

	                            if(inputPassword.equals(log.csvPassword)){
	                            JOptionPane.showMessageDialog(null, "Bienvenido a nuestro programa " + log.csvName );
	                            wrongPassword = false;
	                            logCondition = false;
	                            }
	                        }
	                    }


	                }

	            } else if (opcionLogIn == 2){
	                
	                scan.nextLine();
	                System.out.println("Porfavor ingrese su usuario para continuar.");
	                String username = scan.nextLine();
	                
	                System.out.println("Ingrese su contraseña");
	                String password = scan.nextLine();

	                System.out.println("Ingrese su nombre porfavor");
	                String name = scan.nextLine();

	                System.out.println("Ingrese su vivienda");
	                String address = scan.nextLine();

	                System.out.println("Ingrese su edad");
	                String age = scan.nextLine();

	                System.out.println("Ingrese su correo electronico");
	                String email = scan.nextLine();

	                

	                log.saveAccount(username, password, name, address, age, email, fileName);

	            } else if (opcionLogIn == 3){
	            	histmedico.RegistroHistorial();
	        	}
	        }

	        



            try {
                //Opciones del sistema
                System.out.println("\n\n----------Sistema de paciente de COVID-19----------");
                System.out.println("1. Menu de numeros de emergencia");
                System.out.println("2. Menu de directorio de hospitales por departamento");
                System.out.println("3. Informe de paciente");
                System.out.println("4. Informacion importante sobre el COVID-19");
                System.out.println("5. Revisar sus sintomas");
                System.out.println("6. Cerrar sesion");
                System.out.println("7. Salir del programa\n");

                opcion = scan.nextInt();

                //Switch
                switch (opcion) {

                    //Despliega los numeros nacionales de emergencias medicas 
                    case 1: {
                        scan.nextLine();
                        System.out.println("--Numeros de emergencia--");
                        System.out.println("1. Numeros de emergencia publicos");
                        System.out.println("2. Numeros de emergencia privados");

                        int seleccionnum = scan.nextInt();
                        CE.buscarContactos(seleccionnum);

                        break;
                    }
                    
                    //Despliega directorio de hospitales por departamento segun el que desee ver el usuario
                    case 2 : {
                        System.out.println("--Directorio de hospitales por departamento--");
                        System.out.println("Ingrese el departamento que quiere ver");
                        System.out.println("1. Guatemala\n2. Alta Verapaz\n3. Baja Verapaz\n4. Chimaltenango\n5. Chiquimula\n6. Suchitepequez\n" + 
                        "7. El Progreso\n8. Escuintla\n9. Huehuetenango\n10. Izabal\n11. Jalapa\n12. Jutiapa\n13. Peten\n14. Quetzaltenango\n15. Quiche\n" + 
                        "16. Sacatepequez\n17. San Marcos\n18. Santa Rosa\n19. Solola\n20. Totonicapan\n21. Zacapa\n22. Retalhuleu\n");
                        int indice = scan.nextInt();
                        System.out.println(CD.getInformacion(indice-1)); 
                        break;
                    }

                    //Despliega informacion al usuario de su informe como paciente
                    case 3 : {
                        //Despliega el historial del usuario segun lo que ingreso en el registro
                        histmedico.InformacionPaciente();

                        //Despliega la probabilidad del usuario de ser contagiado por COVID-19
                        histmedico.CalculoProbabilidad();

                        break;
                    }

                    case 4 : {
                        System.out.println("--Menu de informacion de COVID-19--");
                        System.out.println( info.DesplegarSintomas());
                        System.out.println(info.DesplegarManeras());
                        System.out.println(info.DesplegarCuidados());
                        break;
                    }

                    //Ingreso de sintomas que presenta el usuario
                    case 5 : {
                        Sint.IngresarSintomas();
                        break;
                    }


                    //Cierre de sesion del usuario
                    case 6 : {
                        scan.nextLine();
                        System.out.println("Seguro que desea cerrar su sesion? (y/n)");
                        String eleccion = scan.nextLine();
                        if (eleccion.equalsIgnoreCase("y")) {
                            System.out.println("Cerrando sesion...\n");
                            logcondicion = true;
                        } else if (eleccion.equalsIgnoreCase("n")) {
                            System.out.println("Ok, se continuara la sesion\n");
                            logcondicion = false;
                        } else {
                            System.out.println("Eligio una opcion invalida\n");
                        }

                        break;
                    }
                    
                    case 7 : {
                        System.out.println("Hasta Luego\nFin del programa...");
                        break;
                    }
                
                    default : {
                        System.out.println("Ingreso una opcion invalida, intente de nuevo");
                    }

                }

            } catch (InputMismatchException | NullPointerException e) {
                System.out.println("Ingreso una opcion invalida, intente de nuevo");
                scan.nextLine();
            }   
        }
    }

}
