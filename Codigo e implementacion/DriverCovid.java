/******************************************************************
DriverCovid.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 10/9/2020

Clase que se encarga de toda la interaccion que el usuario tiene 
con el programa, le permite interactuar al usuario con todas las funciones
que el programa tiene.
******************************************************************/

import java.util.InputMismatchException;
import java.util.Scanner;

public class DriverCovid { 

    public static void main(String[] args) {
        
        int opcion = 0; //Variable que controla las opciones del menu
        boolean logcondicion = true;

        Scanner scan = new Scanner(System.in);
        ContactosEmergencia CE = new ContactosEmergencia();
        ClaseDirectorio CD = new ClaseDirectorio();
        Login log = new Login();
        HistorialMedico histmedico = new HistorialMedico();

        CE.crearListaContactos();
        CD.setAllHashmaps();

        //Loop principal
        while (opcion != 5) {
            while(logcondicion) {
                try {
                    log.getLogIn();
                    histmedico.RegistroHistorial();
                    logcondicion = false;    
                } catch (InputMismatchException e) {
                    System.err.println("Ingreso un dato invalido, intente de nuevo");
                } 
            }

            try {
                //Opciones del sistema
                System.out.println("\n\n----------Sistema de paciente de COVID-19----------");
                System.out.println("1. Menu de numeros de emergencia");
                System.out.println("2. Menu de directorio de hospitales por departamento");
                System.out.println("3. Informe de paciente");
                System.out.println("4. Cerrar sesion");
                System.out.println("5. Salir del programa\n");

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
                        System.out.println(CE.getContacto(seleccionnum)); 

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

                    //Cierre de sesion del usuario
                    case 4 : {
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
                    
                    case 5 : {
                        System.out.println("Hasta Luego\nFin del programa...");
                        break;
                    }
                
                    default : {
                        System.out.println("Ingreso una opcion invalida, intente de nuevo");
                    }

                }

            } catch (Exception e) {
                System.out.println("Ingreso una opcion invalida, intente de nuevo");
                scan.nextLine();
            }   
        }
    }

}