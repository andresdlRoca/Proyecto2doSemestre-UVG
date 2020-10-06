/******************************************************************
ModeloContactosEmergencia.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 10/9/2020

Clase que modelo de los contactos de emergencia que guarda toda la informacion
que se le puede proporcionar al usuario relacionado al tema de los contactos
de emergencia
******************************************************************/

import java.util.HashMap;

public class ModeloContactosEmergencia {
    
        //Hahsmap que guarda la informacion de los numeros en strings.
        private HashMap<Integer, String> contactosdeemergencia = new HashMap<Integer, String>();

        /*Lista de contactos:
        1. Numeros de emergencia publicos
        2. Numeros de emergencia privados (Seguros Medicos)
        */
    
        //Se encargara de crear los contenidos de la lista de contactos de emergencia
        public void crearListaContactos() {
            contactosdeemergencia.put(1, "Lista de numeros de emergencia publicos:\nCruz Roja: 125 / 2381-6565\nIGSS: 128\nEmergencia e informarmacion de COVID-19: 1517 / 1540\n");
            contactosdeemergencia.put(2, "Lista de numeros de emergencia privados:\nSeguros El Roble: 1797 / 2285-5080\nSeguros Universales: 1789\nSeguros G&T: 1778\nAseguradora General: 1757\nSeguros de Occidente: 2285-5050\n");
        }
        
         //Getter que se encarga de regresar el valor que el usuaario eliga
        public String getContacto(int index) {
            return contactosdeemergencia.get(index);
        }

}
