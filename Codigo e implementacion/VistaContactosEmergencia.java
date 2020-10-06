/******************************************************************
VistaContactosEmergencia.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 10/9/2020

Clase que vista que le muestra al usuario la informacion de los
contactos de emergencia
******************************************************************/

public class VistaContactosEmergencia {
    
    //Metodo que muestra los contactos por medio de la linea de comando usando
    //el string proporcionado por el hashmap en la clase modelo.
    public void mostrarContactos(String contactos) {
        System.out.println("Los contactos de emergencia elegidos son: \n" + contactos);
    }

    public void mostrarError() {
        System.out.println("Se ha ingresado una opcion invalida intentalo de nuevo");
    }

}
