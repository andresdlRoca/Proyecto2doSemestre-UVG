/******************************************************************
Principal.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 11/05/2020

Esta clase presentar la interfaz gráfica del directorio de hospitales.
También es la encargada de interactuar con el usuario y presentarle 
todo de una manera más amigable.

******************************************************************/
package Interfaz_Hospitales;

import java.awt.Image;
import java.awt.Toolkit;

public class Principal extends javax.swing.JFrame {
    Directorio directorio = new Directorio();
    

    
    public Principal() {
        //llama a initComponents
        initComponents();
        directorio.setAllHashmaps();
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        //Codigo para crear la interfaz grafica, con todos los botones, y cajas de texto

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CampoN1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jResul = new javax.swing.JScrollPane();
        jResul1 = new javax.swing.JTextArea();
        jMapa = new javax.swing.JLabel();
        JlabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 16));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 110, 60));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el numero de departamento: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 330, 70));

        CampoN1.setBackground(new java.awt.Color(0, 51, 102));
        CampoN1.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        CampoN1.setForeground(new java.awt.Color(255, 255, 255));
        CampoN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoN1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 100, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Los hospitales disponibles son:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 590, 40));

        jButtonConfirmar.setBackground(new java.awt.Color(0, 0, 102));
        jButtonConfirmar.setFont(new java.awt.Font("Lucida Grande", 0, 15));
        jButtonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 100, 50));

        jResul.setBackground(new java.awt.Color(0, 0, 102));
        jResul.setForeground(new java.awt.Color(255, 255, 255));

        jResul1.setBackground(new java.awt.Color(0, 51, 102));
        jResul1.setColumns(20);
        jResul1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); 
        jResul1.setForeground(new java.awt.Color(255, 255, 255));
        jResul1.setRows(5);
        jResul.setViewportView(jResul1);

        getContentPane().add(jResul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 600, 400));

        jMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mapa.jpeg")));
        getContentPane().add(jMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 560, 670));

        JlabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoa.png")));
        getContentPane().add(JlabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -240, -1, -1));

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //Cierra la interfaz de Principal
        this.dispose();
        
    }

    private void CampoN1ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {
       int num1=Integer.parseInt(CampoN1.getText());
       jResul1.setText(directorio.getinfo(num1));
       
    }


    //Variables
    private javax.swing.JTextField CampoN1;
    private javax.swing.JLabel JlabelFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jMapa;
    private javax.swing.JScrollPane jResul;
    private javax.swing.JTextArea jResul1;

}
