/******************************************************************
ControladorContactosEmergencia.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 06/10/2020

Clase que controla la clase modelo y vision de los contactos de emergencia,
se le pregunta alusuario la region en la que desea ver los contactos 
de emergencia y se le muestra la informacion correspondiente.
******************************************************************/
public class ControladorContactosEmergencia {
    
    private ModeloContactosEmergencia contactosModel;
    private VistaContactosEmergencia contactosVista;

    public ControladorContactosEmergencia(ModeloContactosEmergencia contactosModel, VistaContactosEmergencia contactosVista) {
        this.contactosModel = contactosModel;
        this.contactosVista = contactosVista;
    }

    //Metodo que inicializa los hashmaps que guardan los contactos de emergencia
    public void inicializarContactos() {
        contactosModel.crearListaContactos();
    }

    //Metodo que busca los contactos y se los muestra al usuario.
    public void buscarContactos(int indice) {
        if (indice <= 0 || indice >= 3) {
            contactosVista.mostrarError();
        } else {
            contactosVista.mostrarContactos(contactosModel.getContacto(indice));
        }
        
    }
    
}
