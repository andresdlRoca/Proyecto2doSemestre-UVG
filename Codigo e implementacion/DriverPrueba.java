import java.util.Scanner;

public class DriverPrueba { //Clase driver para probar las partes del programa

    public static void main(String[] args) {
        
        int opcion = 0; //Variable que controla las opciones del menu

        Scanner scan = new Scanner(System.in);
        ContactosEmergencia CE = new ContactosEmergencia();
        ClaseDirectorio CD = new ClaseDirectorio();

        CE.crearListaContactos();
        CD.setMapaguatemala();


        //Loop principal
        while (opcion != 3) {
            try {
                //Opciones del sistema
                System.out.println("\n\n----------Sistema de paciente de COVID-19----------");
                System.out.println("1. Correr ContactosEmergencia.java");
                System.out.println("2. Correr clasedirectorio.java");
                System.out.println("3. Salir del programa");

                opcion = scan.nextInt();

                //Switch
                switch (opcion) {
                    case 1: {
                        scan.nextLine();
                        System.out.println("--Numeros de emergencia--");
                        System.out.println("1. Numeros de emergencia publicos");
                        System.out.println("2. Numeros de emergencia privados");

                        int seleccionnum = scan.nextInt();
                        System.out.println(CE.getContacto(seleccionnum)); 

                        break;
                    }
                        
                    case 2 : {

                        System.out.println("PlaceHolder ClaseDirectorio.java");

                        break;
                    }

                    case 3 : {
                        System.out.println("Fin del programa...");
                        break;
                    }
                
                    default : {
                        System.out.println("Ingreso una opcion invalida, intente de nuevo");
                    }
                        break;
                }

            } catch (Exception e) {
                System.out.println("Ingreso una opcion invalida, intente de nuevo");
                scan.nextLine();
            }

            
        }


    }

}