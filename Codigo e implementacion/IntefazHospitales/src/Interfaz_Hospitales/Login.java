/******************************************************************
Login.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 11/05/2020

Clase que funciona para crear una interfaz grafica del sistema de
Log in y para registrar nuevas cuentas.
******************************************************************/
package Interfaz_Hospitales;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        //lama al metodo de initComponents para crear la interfaz cuando el objeto es creado
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {
        //Codigo para crear la interfaz grafica, con todos los botones, y cajas de texto

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jButtonSignUp = new javax.swing.JButton();
        jButtonSignIn = new javax.swing.JButton();
        inputPassword = new javax.swing.JPasswordField();
        inputUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(137, 196, 244));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/precovid.PNG")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(75, 119, 190));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 15)); 
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jButtonSignUp.setBackground(new java.awt.Color(0, 0, 51));
        jButtonSignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButtonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignUp.setText("Sign Up");
        jButtonSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 90, 30));

        jButtonSignIn.setBackground(new java.awt.Color(0, 0, 51));
        jButtonSignIn.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButtonSignIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignIn.setText("Sign In");
        jButtonSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignInActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 90, 30));

        inputPassword.setBackground(new java.awt.Color(0, 0, 51));
        inputPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        inputPassword.setForeground(new java.awt.Color(255, 255, 255));
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 210, 30));

        inputUsername.setBackground(new java.awt.Color(0, 0, 51));
        inputUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        inputUsername.setForeground(new java.awt.Color(255, 255, 255));
        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 210, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_user_20px_2.png"))); 
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 20, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_padlock_20px.png"))); 
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {
        //Guarda lo que el usuario ingresa en la caja de texto de usuario 
        inputUsername.setText("");
    }

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {
        //Guardo lo que el usuario ingresa en la caja de texto de password
        inputPassword.setText("");
    }

    private void jButtonSignInActionPerformed(java.awt.event.ActionEvent evt) {
        //Funcion del boton de Sign in
        String csvUsername = null, csvPassword = null, csvName, csvAddress, csvAge, csvEmail;
        String username = inputUsername.getText();
        String password = "";
         //Como el password es guardado en forma encryptada hay que desincryptarla
        char[] pass = inputPassword.getPassword(); 
        for(int i=0; i<pass.length; i++){
            password+=pass[i];
        }

        boolean found = true;
        try{
            //Un try para leer el csv y guardar la informacion del csv en variables
            Scanner s = new Scanner(new File("DataLogIn.csv"));
            s.useDelimiter("[,\n]");

            while(s.hasNext() && found){
                csvUsername = s.next();
                csvPassword = s.next();
                csvName = s.next();
                csvAddress = s.next();
                csvAge = s.next();
                csvEmail = s.next();

                if(csvUsername.equals(username)){ //Coomparar que el usuario que fue ingresado esta en el csv
                    found = false;
                }else{

                }
            }

            if(csvUsername.equals(username) && csvPassword.equals(password)){
                //Si el usuario y el password son iguales que en el del csv cierra la ventana de sign in y habre otra.
                JOptionPane.showMessageDialog(null, "Bienvenido a nuestro programa");
                Interfazgeneral ga=new Interfazgeneral();
                ga.setVisible(true);
                ga.pack();
                ga.setLocationRelativeTo(null);
                ga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                
            }

        }catch(HeadlessException | FileNotFoundException E){
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }

    private void jButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {
        //Cierra la interfaz de sign in y habre la de sign up
        CreateAccount ca = new CreateAccount();
        ca.setVisible(true);
        ca.pack();
        ca.setLocationRelativeTo(null);
        ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {
        //Cierra el programa
        System.exit(0);
    }

    
    

    //Crea las variables
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JButton jButtonSignIn;
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    
}
