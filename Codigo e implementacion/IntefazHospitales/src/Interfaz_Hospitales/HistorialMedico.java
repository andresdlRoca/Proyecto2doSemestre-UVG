/******************************************************************
HistorialMedico.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 11/05/2020

Clase que funciona para crear una interfaz grafica del sistema que 
toma informacion del usuario y regresa calculos con esa
informacion
******************************************************************/
package Interfaz_Hospitales;

import java.awt.Toolkit;


public class HistorialMedico extends javax.swing.JFrame {

    
    public HistorialMedico() {
        //llama a initComponents y agrega unos botones
        initComponents();
        GrupoDeBotones.add(Masculino);
        GrupoDeBotones.add(Femenino);
        BotonesDeEdad.add(E1);
        BotonesDeEdad.add(E2);
        BotonesDeEdad.add(E3);
        BotonesDeEdad.add(E4);
        BotonesDeEdad.add(E5);
        BotonesDeEdad.add(E6);
    }
    

    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        //Codigo para crear la interfaz grafica, con todos los botones, y cajas de texto

        GrupoDeBotones = new javax.swing.ButtonGroup();
        BotonesDeEdad = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        B2 = new javax.swing.JCheckBox();
        B3 = new javax.swing.JCheckBox();
        B4 = new javax.swing.JCheckBox();
        B1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        Masculino = new javax.swing.JRadioButton();
        Femenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        E1 = new javax.swing.JRadioButton();
        E2 = new javax.swing.JRadioButton();
        E3 = new javax.swing.JRadioButton();
        E4 = new javax.swing.JRadioButton();
        E6 = new javax.swing.JRadioButton();
        E5 = new javax.swing.JRadioButton();
        MuestraProbabilidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setForeground(new java.awt.Color(0, 153, 255));
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18));
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Calculadora de riesgo");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Edad");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Sexo:");

        B2.setBackground(new java.awt.Color(153, 204, 255));
        B2.setFont(new java.awt.Font("Tahoma", 1, 11));
        B2.setForeground(new java.awt.Color(51, 153, 255));
        B2.setText("Inmunosupresion(cancer, lupus, etc.)");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(153, 204, 255));
        B3.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        B3.setForeground(new java.awt.Color(51, 153, 255));
        B3.setText("Enfermedad Pulmonar Obstructiva Cronica");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(153, 204, 255));
        B4.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        B4.setForeground(new java.awt.Color(51, 153, 255));
        B4.setText("Enfermedad Renal Cronica");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(153, 204, 255));
        B1.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        B1.setForeground(new java.awt.Color(51, 153, 255));
        B1.setText("Hipertension");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Marque si padece alguna de estas enfermedades: ");

        Masculino.setForeground(new java.awt.Color(51, 153, 255));
        Masculino.setText("Masculino");
        Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasculinoActionPerformed(evt);
            }
        });

        Femenino.setForeground(new java.awt.Color(255, 0, 204));
        Femenino.setText("Femenino");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Probabilidad de riesgo: ");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        E1.setForeground(new java.awt.Color(51, 153, 255));
        E1.setText("0-20");
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        E2.setForeground(new java.awt.Color(51, 153, 255));
        E2.setText("20-30");
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        E3.setForeground(new java.awt.Color(51, 153, 255));
        E3.setText("30-40");
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        E4.setForeground(new java.awt.Color(51, 153, 255));
        E4.setText("40-60");
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        E6.setForeground(new java.awt.Color(51, 153, 255));
        E6.setSelected(true);
        E6.setText("80-100");
        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });

        E5.setForeground(new java.awt.Color(51, 153, 255));
        E5.setText("60-80");
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        MuestraProbabilidad.setBackground(new java.awt.Color(153, 204, 255));
        MuestraProbabilidad.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MuestraProbabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 9, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(B4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(137, 137, 137)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(E1)
                                        .addGap(18, 18, 18)
                                        .addComponent(E2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(E4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(E5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(E6)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(E3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Femenino)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E2)
                    .addComponent(E1)
                    .addComponent(E3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(Masculino)
                    .addComponent(Femenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E5)
                    .addComponent(E6)
                    .addComponent(E4))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B4)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(MuestraProbabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void MasculinoActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        double probabilidadEdad=0;
        if (Masculino.isSelected()){
            if (E1.isSelected()&&Masculino.isSelected()){
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=17.30;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=15.60;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=10.20;
                }  else if (B1.isSelected()) {
                    probabilidadEdad=8.90;
                } else {
                    probabilidadEdad=6.90;
                } 
            } else if (E2.isSelected()&&Masculino.isSelected()){
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=16.20+10;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=16.20+6;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=16.20+3;
                } else if (B1.isSelected()) {
                    probabilidadEdad=16.20+1;
                } else {
                    probabilidadEdad=13.60;
                } 
            } else if (E3.isSelected()&&Masculino.isSelected()){
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=27.90+13;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=27.90+8;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=27.90+6;
                } else if (B1.isSelected()) {
                    probabilidadEdad=27.90+2;
                } else {
                    probabilidadEdad=23.60;
                } 
            } else if (E4.isSelected()&&Masculino.isSelected()){
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=60.90+16;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=60.90+10;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=60.90+8;
                } else if (B1.isSelected()) {
                    probabilidadEdad=60.90+4;
                } else {
                    probabilidadEdad=50.40;
                } 
            } else if (E5.isSelected()&&Masculino.isSelected()){
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=86.30+13;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=86.30+8;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=86.30+6;
                } else if (B1.isSelected()) {
                    probabilidadEdad=86.30+3;
                } else {
                    probabilidadEdad=74.50;
                } 
            } else if (E6.isSelected()&&Masculino.isSelected()){
                probabilidadEdad=92.70;
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=92.70+6;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=92.70+5;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=92.70+4;
                } else if (B1.isSelected()) {
                    probabilidadEdad=92.70+3;
                } else {
                    probabilidadEdad=86.90;
                } 
            }
        } else if (Femenino.isSelected()){
            if (E1.isSelected()&&Femenino.isSelected()){
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=17.30;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=15.60;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=10.20;
                }  else if (B1.isSelected()) {
                    probabilidadEdad=8.90;
                } else {
                    probabilidadEdad=4.50;
                } 
            } else if (E2.isSelected()&&Femenino.isSelected()){
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=16.20+10;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=16.20+7;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=16.20+5;
                } else if (B1.isSelected()) {
                    probabilidadEdad=16.20+3;
                } else {
                    probabilidadEdad=14.60;
                } 
            } else if (E3.isSelected()&&Femenino.isSelected()){
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=27.90+15;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=27.90+10;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=27.90+8;
                } else if (B1.isSelected()) {
                    probabilidadEdad=27.90+4;
                } else {
                    probabilidadEdad=25.60;
                } 
            } else if (E4.isSelected()&&Femenino.isSelected()){
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=60.90+18;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=60.90+12;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=60.90+10;
                } else if (B1.isSelected()) {
                    probabilidadEdad=60.90+6;
                } else {
                    probabilidadEdad=54.80;
                } 
            } else if (E5.isSelected()&&Femenino.isSelected()){
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=86.30+13;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=86.30+8;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=86.30+6;
                } else if (B1.isSelected()) {
                    probabilidadEdad=86.30+3;
                } else {
                    probabilidadEdad=79.60;
                } 
            } else if (E6.isSelected()&&Femenino.isSelected()){
                probabilidadEdad=92.70;
                if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()&&B4.isSelected()){
                    probabilidadEdad=92.70+6;
                } else if (B1.isSelected()&&B2.isSelected()&&B3.isSelected()){
                    probabilidadEdad=92.70+5;
                } else if (B1.isSelected()&&B2.isSelected()){
                    probabilidadEdad=92.70+4;
                } else if (B1.isSelected()) {
                    probabilidadEdad=92.70+3;
                } else {
                    probabilidadEdad=84.70;
                } 
            }
        }
        String Temp = Double.toString(probabilidadEdad);
        String Print = Temp + " %";
        MuestraProbabilidad.setText(Print);
    }

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    //Variables
    private javax.swing.JCheckBox B1;
    private javax.swing.JCheckBox B2;
    private javax.swing.JCheckBox B3;
    private javax.swing.JCheckBox B4;
    private javax.swing.ButtonGroup BotonesDeEdad;
    private javax.swing.JRadioButton E1;
    private javax.swing.JRadioButton E2;
    private javax.swing.JRadioButton E3;
    private javax.swing.JRadioButton E4;
    private javax.swing.JRadioButton E5;
    private javax.swing.JRadioButton E6;
    private javax.swing.JRadioButton Femenino;
    private javax.swing.ButtonGroup GrupoDeBotones;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JTextField MuestraProbabilidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    
}
