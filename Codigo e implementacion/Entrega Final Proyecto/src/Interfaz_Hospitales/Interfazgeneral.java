/******************************************************************
Interfazgeneral.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 11/05/2020

Clase que funciona para crear una interfaz grafica del sistema que 
funciona como pagina principal para mandar al usuario a las 
diferentes partes del programa.
******************************************************************/
package Interfaz_Hospitales;

import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;

public class Interfazgeneral extends javax.swing.JFrame {

    public Interfazgeneral() {
        //llama a initComponents
        initComponents();
          
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        //Codigo para crear la interfaz grafica, con todos los botones, y cajas de texto

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        botontablerocovid = new javax.swing.JButton();
        Labelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        botontablerocovid.setBackground(new java.awt.Color(0, 181, 204));
        botontablerocovid.setFont(new java.awt.Font("Lucida Grande", 0, 16)); 
        botontablerocovid.setForeground(new java.awt.Color(255, 255, 255));
        botontablerocovid.setText("Tablero Covid Guatemala");
        botontablerocovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botontablerocovidActionPerformed(evt);
            }
        });
        getContentPane().add(botontablerocovid, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 500, 70));

        jButton1.setBackground(new java.awt.Color(0, 181, 204));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 120, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/precovid2.jpeg"))); 
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 330, 240));

        jButton2.setBackground(new java.awt.Color(0, 181, 204));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 16));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Hospitales disponibles");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 240, 70));

        jButton3.setBackground(new java.awt.Color(0, 181, 204));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 16));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Contactos emergencia");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 220, 70));

        jButton4.setBackground(new java.awt.Color(0, 181, 204));
        jButton4.setFont(new java.awt.Font("Lucida Grande", 0, 16));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Sintomas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 140, 70));

        jButton5.setBackground(new java.awt.Color(0, 181, 204));
        jButton5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); 
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Infocovid");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 460, 170, 60));

        jButton7.setBackground(new java.awt.Color(0, 181, 204));
        jButton7.setFont(new java.awt.Font("Lucida Grande", 0, 16));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Probabilidad de Riesgo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 280, 220, 60));

        Labelfondo.setFont(new java.awt.Font("Lucida Grande", 0, 16)); 
        Labelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoa.png"))); 
        getContentPane().add(Labelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, -1, -1));

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //Cierra el programa
        System.exit(0);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //Boton que abre la interfaz Principal
        Principal p=new Principal();
        p.setVisible(true);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        //Boton que abre la interfaz de ContactosEmergencia
        ContactosEmergencia e = new ContactosEmergencia();
        e.setVisible(true);
        e.setLocationRelativeTo(null);
       

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        //Boton que abre la interfaz de Principal1
        Sintomas sintomas = new Sintomas();
        sintomas.setVisible(true);
        sintomas.setLocationRelativeTo(null);
  
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        //Boton que abre la interfaz de Display1
        Display1 d=new Display1();
        d.setVisible(true);
   
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        //Boton que abre la interfaz de HistorialMedico
        HistorialMedico hm=new HistorialMedico();
        hm.setVisible(true);
    }
    
    private void botontablerocovidActionPerformed(java.awt.event.ActionEvent evt) {
        try{
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
    Desktop.getDesktop().browse(new URI("https://tablerocovid.mspas.gob.gt/"));
            }
        }catch(URISyntaxException | IOException ex){
        }
    
    }



    //Variables
    private javax.swing.JLabel Labelfondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton botontablerocovid;
 
}
