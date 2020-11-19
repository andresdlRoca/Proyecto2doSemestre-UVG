/******************************************************************
ContactosEmergencia.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 11/05/2020

Clase que se encarga de mostrarle al usuario la informacion de los contactos 
de emergencia ya sea publicos o privados, esto se maneja por medio
de una interfaz grafica para que los datos sean presentados de forma
amigable al usuario.
******************************************************************/

package Interfaz_Hospitales;
import java.awt.Color;
import javax.swing.JFrame;

public class ContactosEmergencia extends javax.swing.JFrame {

    
    public ContactosEmergencia() {
        //llama a initCompopnents y hace set unos variables
        initComponents();
        ContactosPrivados.setOpaque(false);
        ContactosPrivados.setEditable(false);
        ContactosPublicos.setOpaque(false);
        ContactosPublicos.setEditable(false);
        setSize(600,399);
    }


    @SuppressWarnings("unchecked")
    
    private void initComponents() {
        //Codigo para crear la interfaz grafica, con todos los botones, y cajas de texto
        setUndecorated(true);

        jScrollPane1 = new javax.swing.JScrollPane();
        ContactosPublicos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ContactosPrivados = new javax.swing.JTextArea();
        LabelTitulo = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(601, 382));
        setResizable(false);
        getContentPane().setLayout(null);

        ContactosPublicos.setColumns(20);
        ContactosPublicos.setFont(new java.awt.Font("Times New Roman", 0, 15)); 
        ContactosPublicos.setRows(5);
        ContactosPublicos.setText("          Contactos Publicos\n\nCruz Roja: 125 / 2381-6565\n\nIGSS: 128\n\nEmergencia e informacion de\nCOVID-19: 1517 / 1540");
        jScrollPane1.setViewportView(ContactosPublicos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 60, 240, 270);

        ContactosPrivados.setColumns(20);
        ContactosPrivados.setFont(new java.awt.Font("Times New Roman", 0, 15)); 
        ContactosPrivados.setRows(5);
        ContactosPrivados.setText("                Contactos Privados\n\nSeguros El Roble: 1797 / 2285-5080\n\nSeguros Universales: 1789\n\nSeguros G&T: 1778\n\nAseguradora General: 1757\n\nSeguros de Occidente: 2285-5050");
        jScrollPane2.setViewportView(ContactosPrivados);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(320, 60, 250, 270);

        LabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        LabelTitulo.setText("Lista de contactos de emergencia");
        getContentPane().add(LabelTitulo);
        LabelTitulo.setBounds(170, 20, 280, 21);

        ExitButton.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 11)); 
        ExitButton.setText("Salir");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(20, 10, 65, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andre\\Desktop\\GUI\\Servicios-salud.jpg")); 
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-580, 0, 1240, 450);

        pack();
        setLocationRelativeTo(null);
    }
    
    //Se encarga del funcionamiento del boton de salida
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    
    private javax.swing.JTextArea ContactosPrivados;
    private javax.swing.JTextArea ContactosPublicos;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
}
