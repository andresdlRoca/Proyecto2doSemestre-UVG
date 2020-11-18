/******************************************************************
CreateAccount.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 11/05/2020

Clase que funciona para crear una interfaz grafica del sistema de
registrar y crear nuevas cuentas y agregarlas al csv.
******************************************************************/

package Interfaz_Hospitales;
import javax.swing.JFrame;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class CreateAccount extends javax.swing.JFrame {
    
    

    
    public CreateAccount() {
        //llama a initComponents
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {
        //Codigo para crear la interfaz grafica, con todos los botones, y cajas de texto

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonCreate = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        textUsername = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textAddress = new javax.swing.JTextField();
        textAge = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(137, 196, 244));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign Up");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 15)); 
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelClose))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelClose)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(75, 119, 190));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vivienda");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));  
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña");

        jButtonCreate.setBackground(new java.awt.Color(0, 0, 51));
        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButtonCreate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreate.setText("Crear");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonRegresar.setBackground(new java.awt.Color(0, 0, 51));
        jButtonRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        textUsername.setBackground(new java.awt.Color(0, 0, 51));
        textUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        textUsername.setForeground(new java.awt.Color(255, 255, 255));

        textName.setBackground(new java.awt.Color(0, 0, 51));
        textName.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        textName.setForeground(new java.awt.Color(255, 255, 255));

        textAddress.setBackground(new java.awt.Color(0, 0, 51));
        textAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        textAddress.setForeground(new java.awt.Color(255, 255, 255));

        textAge.setBackground(new java.awt.Color(0, 0, 51));
        textAge.setFont(new java.awt.Font("Tahoma", 0, 14));
        textAge.setForeground(new java.awt.Color(255, 255, 255));

        textEmail.setBackground(new java.awt.Color(0, 0, 51));
        textEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        textEmail.setForeground(new java.awt.Color(255, 255, 255));

        textPassword.setBackground(new java.awt.Color(0, 0, 51));
        textPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        textPassword.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textName))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textAddress)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRegresar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textAge)
                            .addComponent(textEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textAge, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {
        //Cierra el programa
        System.exit(0);
    }

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {
        //El boton para crear las cuentas
        //Guarda lo que el usuario ingreso en la cajas y los pone en el csv
        String username = textUsername.getText();
        String name = textName.getText();
        String address = textAddress.getText();
        String age = textAge.getText();
        String email = textEmail.getText();
        String password = textPassword.getText();
        
        
        try{
            FileWriter fw = new FileWriter("DataLogIn.csv", true);
            
            fw.write(username);
            fw.write(',');
            fw.write(password);
            fw.write(',');
            fw.write(name);
            fw.write(',');
            fw.write(address);
            fw.write(',');
            fw.write(age);
            fw.write(',');
            fw.write(email);
            fw.write('\n');
            
            fw.flush();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Cuenta Creada");
         
         
        }catch(Exception E){
            JOptionPane.showMessageDialog(null, "No se pudo crear cuenta");
        }
        //Despues de agregar la informacion al csv cierra el sign up y abre el interfaz de sign in
        Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        
    }

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {
        //Boton para regresar al sing in, cierra el de sign up y abre el de sign in
        Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }


    //Variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textAge;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPassword;
    private javax.swing.JTextField textUsername;

}
