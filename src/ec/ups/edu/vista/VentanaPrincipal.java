/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ups.edu.vista;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *Ventana donde se crea toda la interfaz del 3 en Raya
 * 
 * @author José Quinde
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    private int[][] turno;
    private int jugador1;
    private int compu1;
    private int b1,b2,b3,b4,b5,b6,b7,b8,b9;
    ImageIcon circulo=new ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/circuloazul_dmd.jpg"));
    ImageIcon equis=new ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/equis.png"));
    /**
     * Se crea la imagen del campo para el tres en raya
     */
    public class Imagen extends javax.swing.JPanel {
        /**
         * Se dimensiona la imagen
         */
        public Imagen() {
        this.setSize(310, 310); //se selecciona el tamaño del panel
        }
        //Se crea un método cuyo parámetro debe ser un objeto Graphics
        public void paint(Graphics grafico) {
        Dimension height = getSize();
        //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
        ImageIcon Img = new ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/3 en raya.jpg")); 
        //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafico);
        }
        }
    /**
     * Constructor que inicializa los componentes
     */
    public VentanaPrincipal() {
        initComponents();
        turno=new int[3][3];
        b1=0;
        b2=0;b3=0;b4=0;b5=0;b6=0;b7=0;b8=0;
        b9=0;
        jugador1=1;
        compu1=1;
        Imagen Imagen = new Imagen();
        panel1.add(Imagen);
        panel1.repaint();
    }
   public void gana(){
       //Compara los horizontales
       if(turno[0][0]==1 && turno[0][1]==1 && turno [0][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[1][0]==1 && turno[1][1]==1 && turno [1][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[2][0]==1 && turno[2][1]==0 && turno [2][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
        if(turno[0][0]==2 && turno[0][1]==2 && turno [0][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[1][0]==2 && turno[1][1]==2 && turno [1][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[2][0]==2 && turno[2][1]==2 && turno [2][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       //Compara los verticales
       if(turno[0][0]==1 && turno[1][0]==1 && turno [2][0]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[0][1]==1 && turno[1][1]==1 && turno [2][1]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[0][2]==1 && turno[1][2]==0 && turno [2][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
        if(turno[0][0]==2 && turno[1][0]==2 && turno [2][0]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[0][1]==2 && turno[1][1]==2 && turno [2][1]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[0][2]==2 && turno[1][2]==2 && turno [2][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       //Compara los cruzados
       if(turno[0][0]==1 && turno[1][1]==1 && turno [2][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[2][0]==1 && turno[1][1]==1 && turno [0][2]==1){
           JOptionPane.showMessageDialog(this,"El jugador a Ganado","Felicidades",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
        if(turno[2][0]==2 && turno[1][1]==2 && turno [0][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
       if(turno[0][0]==2 && turno[1][1]==2 && turno [2][2]==2){
           JOptionPane.showMessageDialog(this,"La Computadora gana","GAME-OVER",JOptionPane.OK_OPTION);
           new VentanaPrincipal().setVisible(true);
       }
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTurno1 = new javax.swing.JTextField();
        txtTurno2 = new javax.swing.JTextField();
        btnNueva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3 EN RAYA");

        btn3.setBackground(java.awt.Color.white);
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setBackground(java.awt.Color.white);
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBackground(java.awt.Color.white);
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setBackground(java.awt.Color.white);
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn9.setBackground(java.awt.Color.white);
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(java.awt.Color.white);
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(java.awt.Color.white);
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn1.setBackground(java.awt.Color.white);
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(java.awt.Color.white);
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setText("Jugador ");

        jLabel2.setText("Computadora");

        jLabel3.setText("Turno");

        txtTurno1.setText("0");
        txtTurno1.setEnabled(false);

        txtTurno2.setText("0");
        txtTurno2.setEnabled(false);
        txtTurno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurno2ActionPerformed(evt);
            }
        });

        btnNueva.setText("Nueva Partida");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTurno2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTurno1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTurno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTurno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        Icon icono=new ImageIcon(circulo.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
        btn4.setIcon(icono);
        txtTurno1.setText(String.valueOf(jugador1));
        btn4.setEnabled(false);
        jugador1++;
        turno[1][0]=1;
        b4=1;
        //generador de numeros aleatorios
        if(b1==1){
         Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono1);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
            btn2.setIcon(icono2);
            btn2.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][1]=2;
            b2=1;
                    break;
            }
        }
        else if(b5==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));
            btn1.setIcon(icono1);
            btn1.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][0]=2;
            b1=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn7.getWidth(), btn7.getHeight(), Image.SCALE_DEFAULT));
            btn7.setIcon(icono2);
            btn7.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][0]=2;
            b7=1;
                    break;
            } 
        }
        else if(b7==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));
            btn1.setIcon(icono1);
            btn1.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][0]=2;
            b1=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono2);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;
            } 
        }
        else{
        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(3);
        switch(numeroAleatorio){
          case 1:
        Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));
        btn1.setIcon(icono1);
        btn1.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[0][0]=2;
        b1=1;
                break;  
            case 2:
        Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
        btn5.setIcon(icono2);
        btn5.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][1]=2;
        b5=1;
                break;
                case 3:
        Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn7.getWidth(), btn7.getHeight(), Image.SCALE_DEFAULT));
        btn7.setIcon(icono3);
        btn7.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[2][0]=2;
        b7=1;
                break;
        }
        }
    gana();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        Icon icono=new ImageIcon(circulo.getImage().getScaledInstance(btn7.getWidth(), btn7.getHeight(), Image.SCALE_DEFAULT));
        btn7.setIcon(icono);
        txtTurno1.setText(String.valueOf(jugador1));
        btn7.setEnabled(false);
        jugador1++;
        turno[2][0]=1;
        b7=1;
        //generador de numeros aleatorios
        if(b4==1){
         Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono1);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
            btn8.setIcon(icono2);
            btn8.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][1]=2;
            b8=1;
                    break;
            }
        }
        else if(b5==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
            btn4.setIcon(icono1);
            btn4.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][0]=2;
            b4=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
            btn8.setIcon(icono2);
            btn8.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][1]=2;
            b8=1;
                    break;
            } 
        }
        else if(b8==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
            btn4.setIcon(icono1);
            btn4.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][0]=2;
            b4=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono2);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;
            } 
        }
        else{
        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(3);
        switch(numeroAleatorio){
          case 1:
        Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
        btn4.setIcon(icono1);
        btn4.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][0]=2;
        b4=1;
                break;  
            case 2:
        Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
        btn5.setIcon(icono2);
        btn5.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][1]=2;
        b5=1;
                break;
                case 3:
        Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
        btn8.setIcon(icono3);
        btn8.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[2][1]=2;
        b8=1;
                break;
        }
        }
    gana();
    }//GEN-LAST:event_btn7ActionPerformed

    private void txtTurno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurno2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        Icon icono=new ImageIcon(circulo.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));
        btn1.setIcon(icono);
        txtTurno1.setText(String.valueOf(jugador1));
        jugador1++;
        turno[0][0]=1;
        btn1.setEnabled(false);
        b1=1;
        //generador de numeros aleatorios
        if(b2==1){
         Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono1);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
            btn4.setIcon(icono2);
            btn4.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][0]=2;
            b4=1;
                    break;
            }
        }
        else if(b5==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
            btn2.setIcon(icono1);
            btn2.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][1]=2;
            b2=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
            btn4.setIcon(icono2);
            btn4.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][0]=2;
            b4=1;
                    break;
            } 
        }
        else if(b4==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
            btn2.setIcon(icono1);
            btn2.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][1]=2;
            b2=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono2);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;
            } 
        }
        else{
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(3);
                switch(numeroAleatorio){
                  case 1:
                Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
                btn2.setIcon(icono1);
                btn2.setEnabled(false);
                txtTurno2.setText(String.valueOf(compu1));
                compu1++;
                turno[0][1]=2;
                b2=1;
                        break;  
                    case 2:
                Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
                btn5.setIcon(icono2);
                btn5.setEnabled(false);
                txtTurno2.setText(String.valueOf(compu1));
                compu1++;
                turno[1][1]=2;
                b5=1;
                        break;
                        case 3:
                Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
                btn4.setIcon(icono3);
                btn4.setEnabled(false);
                txtTurno2.setText(String.valueOf(compu1));
                compu1++;
                turno[1][0]=2;
                b4=1;
                        break;
                }
            }
        gana();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
            Icon icono=new ImageIcon(circulo.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
        btn2.setIcon(icono);
        txtTurno1.setText(String.valueOf(jugador1));
        btn2.setEnabled(false);
        jugador1++;
        turno[0][1]=1;
        b2=1;
        //generador de numeros aleatorios
        if(b1==1){
         Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono1);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn3.getWidth(), btn3.getHeight(), Image.SCALE_DEFAULT));
            btn3.setIcon(icono2);
            btn3.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][2]=2;
            b3=1;
                    break;
            }
        }
        else if(b5==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));
            btn1.setIcon(icono1);
            btn1.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][0]=2;
            b1=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn3.getWidth(), btn3.getHeight(), Image.SCALE_DEFAULT));
            btn3.setIcon(icono2);
            btn3.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][2]=2;
            b3=1;
                    break;
            } 
        }
        else if(b3==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));
            btn1.setIcon(icono1);
            btn1.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][0]=2;
            b1=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono2);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;
            } 
        }
        else{
        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(3);
        switch(numeroAleatorio){
          case 1:
        Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));
        btn1.setIcon(icono1);
        btn1.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[0][0]=2;
        b1=1;
                break;  
            case 2:
        Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
        btn5.setIcon(icono2);
        btn5.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][1]=2;
        b5=1;
                break;
                case 3:
        Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn3.getWidth(), btn3.getHeight(), Image.SCALE_DEFAULT));
        btn3.setIcon(icono3);
        btn3.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[0][2]=2;
        b3=1;
                break;
        }
        }
        gana();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        // TODO add your handling code here:
        turno=new int[3][3];
        jugador1=1;
        compu1=1;
        btn1.setIcon(null);
        btn1.setEnabled(true);
        btn2.setIcon(null);
        btn2.setEnabled(true);
        btn3.setIcon(null);
        btn3.setEnabled(true);
        btn4.setIcon(null);
        btn4.setEnabled(true);
        btn5.setIcon(null);
        btn5.setEnabled(true);
        btn6.setIcon(null);
        btn6.setEnabled(true);
        btn7.setIcon(null);
        btn7.setEnabled(true);
        btn8.setIcon(null);
        btn8.setEnabled(true);
        btn9.setIcon(null);
        btn9.setEnabled(true);
        txtTurno1.setText("0");
        txtTurno2.setText("0");
        b1=0;
        b2=0;b3=0;b4=0;b5=0;b6=0;b7=0;b8=0;
        b9=0;
      
    }//GEN-LAST:event_btnNuevaActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        Icon icono=new ImageIcon(circulo.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
        btn3.setIcon(icono);
        txtTurno1.setText(String.valueOf(jugador1));
        btn3.setEnabled(false);
        jugador1++;
        turno[0][2]=1;
        b3=1;
        //generador de numeros aleatorios
        if(b2==1){
         Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono1);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
            btn6.setIcon(icono2);
            btn6.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][2]=2;
            b6=1;
                    break;
            }
        }
        else if(b5==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
            btn2.setIcon(icono1);
            btn2.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][1]=2;
            b2=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
            btn6.setIcon(icono2);
            btn6.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][2]=2;
            b6=1;
                    break;
            } 
        }
        else if(b6==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
            btn2.setIcon(icono1);
            btn2.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][1]=2;
            b2=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono2);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;
            } 
        }
        else{
        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(3);
        switch(numeroAleatorio){
          case 1:
        Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
        btn2.setIcon(icono1);
        btn2.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[0][1]=2;
        b2=1;
                break;  
            case 2:
        Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
        btn5.setIcon(icono2);
        btn5.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][1]=2;
        b5=1;
                break;
                case 3:
        Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
        btn6.setIcon(icono3);
        btn6.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][2]=2;
        b6=1;
                break;
        }
        }
      gana();      
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        Icon icono=new ImageIcon(circulo.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
        btn8.setIcon(icono);
        txtTurno1.setText(String.valueOf(jugador1));
        btn8.setEnabled(false);
        jugador1++;
        turno[2][1]=1;
        b8=1;
        //generador de numeros aleatorios
        if(b7==1){
         Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono1);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn9.getWidth(), btn9.getHeight(), Image.SCALE_DEFAULT));
            btn9.setIcon(icono2);
            btn9.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][2]=2;
            b9=1;
                    break;
            }
        }
        else if(b5==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn7.getWidth(), btn7.getHeight(), Image.SCALE_DEFAULT));
            btn7.setIcon(icono1);
            btn7.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][0]=2;
            b7=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn9.getWidth(), btn9.getHeight(), Image.SCALE_DEFAULT));
            btn9.setIcon(icono2);
            btn9.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][2]=2;
            b9=1;
                    break;
            } 
        }
        else if(b9==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn7.getWidth(), btn7.getHeight(), Image.SCALE_DEFAULT));
            btn7.setIcon(icono1);
            btn7.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][0]=2;
            b7=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono2);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;
            } 
        }
        else{
        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(3);
        switch(numeroAleatorio){
          case 1:
        Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));
        btn1.setIcon(icono1);
        btn1.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[0][0]=2;
        b1=1;
                break;  
            case 2:
        Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
        btn5.setIcon(icono2);
        btn5.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][1]=2;
        b5=1;
                break;
                case 3:
        Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn3.getWidth(), btn3.getHeight(), Image.SCALE_DEFAULT));
        btn3.setIcon(icono3);
        btn3.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[0][2]=2;
        b3=1;
                break;
        }
        }
      gana();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
      Icon icono=new ImageIcon(circulo.getImage().getScaledInstance(btn9.getWidth(), btn9.getHeight(), Image.SCALE_DEFAULT));
        btn9.setIcon(icono);
        txtTurno1.setText(String.valueOf(jugador1));
        btn9.setEnabled(false);
        jugador1++;
        turno[2][2]=1;
        b9=1;
        //generador de numeros aleatorios
        if(b6==1){
         Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono1);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
            btn8.setIcon(icono2);
            btn8.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][1]=2;
            b8=1;
                    break;
            }
        }
        else if(b5==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
            btn8.setIcon(icono1);
            btn8.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][1]=2;
            b8=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
            btn6.setIcon(icono2);
            btn6.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][2]=2;
            b6=1;
                    break;
            } 
        }
        else if(b8==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
            btn6.setIcon(icono1);
            btn6.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][2]=2;
            b6=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono2);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;
            } 
        }
        else{
        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(3);
        switch(numeroAleatorio){
          case 1:
        Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
        btn6.setIcon(icono1);
        btn6.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][2]=2;
        b6=1;
                break;  
            case 2:
        Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
        btn5.setIcon(icono2);
        btn5.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][1]=2;
        b5=1;
                break;
                case 3:
        Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
        btn8.setIcon(icono3);
        btn8.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[2][1]=2;
        b8=1;
                break;
        }
        }
        gana();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        Icon icono=new ImageIcon(circulo.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
        btn6.setIcon(icono);
        txtTurno1.setText(String.valueOf(jugador1));
        btn6.setEnabled(false);
        jugador1++;
        turno[2][1]=1;
        b6=1;
        //generador de numeros aleatorios
        if(b9==1){
         Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono1);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn3.getWidth(), btn3.getHeight(), Image.SCALE_DEFAULT));
            btn3.setIcon(icono2);
            btn3.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][2]=2;
            b3=1;
                    break;
            }
        }
        else if(b5==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn9.getWidth(), btn9.getHeight(), Image.SCALE_DEFAULT));
            btn9.setIcon(icono1);
            btn9.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][2]=2;
            b9=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn3.getWidth(), btn3.getHeight(), Image.SCALE_DEFAULT));
            btn3.setIcon(icono2);
            btn3.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][2]=2;
            b3=1;
                    break;
            } 
        }
        else if(b3==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn9.getWidth(), btn9.getHeight(), Image.SCALE_DEFAULT));
            btn9.setIcon(icono1);
            btn9.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][2]=2;
            b9=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
            btn5.setIcon(icono2);
            btn5.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][1]=2;
            b5=1;
                    break;
            } 
        }
        else{
        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(3);
        switch(numeroAleatorio){
          case 1:
        Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn9.getWidth(), btn9.getHeight(), Image.SCALE_DEFAULT));
        btn9.setIcon(icono1);
        btn9.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[2][2]=2;
        b9=1;
                break;  
            case 2:
        Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
        btn5.setIcon(icono2);
        btn5.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][1]=2;
        b5=1;
                break;
                case 3:
        Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn3.getWidth(), btn3.getHeight(), Image.SCALE_DEFAULT));
        btn3.setIcon(icono3);
        btn3.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[0][2]=2;
        b3=1;
                break;
        }
        }
        gana();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        Icon icono=new ImageIcon(circulo.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
        btn5.setIcon(icono);
        txtTurno1.setText(String.valueOf(jugador1));
        btn5.setEnabled(false);
        jugador1++;
        turno[1][1]=1;
        b5=1;
        //generador de numeros aleatorios
        if(b2==1){
         Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
            btn4.setIcon(icono1);
            btn4.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][0]=2;
            b4=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
            btn6.setIcon(icono2);
            btn6.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][2]=2;
            b6=1;
                    break;
                case 3:
            Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
            btn8.setIcon(icono3);
            btn8.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][1]=2;
            b8=1;
                    break;
            }
        }
        else if(b4==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
            btn2.setIcon(icono1);
            btn2.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][1]=2;
            b2=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
            btn6.setIcon(icono2);
            btn6.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][2]=2;
            b6=1;
                    break;
                 case 3:
            Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
            btn8.setIcon(icono3);
            btn8.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][1]=2;
            b8=1;
                    break;    
            } 
        }
        else if(b6==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
            btn2.setIcon(icono1);
            btn2.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][1]=2;
            b2=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
            btn4.setIcon(icono2);
            btn4.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][0]=2;
            b4=1;
                    break;
                 case 3:
            Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
            btn8.setIcon(icono3);
            btn8.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[2][1]=2;
            b8=1;
                    break;    
            } 
        }
        else if(b8==1){
            Random generadorAleatorios = new Random();
            //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
            int numeroAleatorio = 1+generadorAleatorios.nextInt(2);
            switch(numeroAleatorio){
              case 1:
            Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
            btn2.setIcon(icono1);
            btn2.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[0][1]=2;
            b2=1;
                    break;  
                case 2:
            Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
            btn4.setIcon(icono2);
            btn4.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][0]=2;
            b4=1;
                    break;
                 case 3:
            Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
            btn6.setIcon(icono3);
            btn6.setEnabled(false);
            txtTurno2.setText(String.valueOf(compu1));
            compu1++;
            turno[1][2]=2;
            b6=1;
                    break;    
            } 
        }
        else{
        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 3 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1+generadorAleatorios.nextInt(3);
        switch(numeroAleatorio){
          case 1:
        Icon icono1=new ImageIcon(equis.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
        btn2.setIcon(icono1);
        btn2.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[0][1]=2;
        b2=1;
                break;  
            case 2:
        Icon icono2=new ImageIcon(equis.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
        btn4.setIcon(icono2);
        btn4.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][0]=2;
        b4=1;
                break;
                case 3:
        Icon icono3=new ImageIcon(equis.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
        btn6.setIcon(icono3);
        btn6.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[1][2]=2;
        b6=1;
                break;
                    case 4:
        Icon icono4=new ImageIcon(equis.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
        btn8.setIcon(icono4);
        btn8.setEnabled(false);
        txtTurno2.setText(String.valueOf(compu1));
        compu1++;
        turno[2][1]=2;
        b8=1;
                break;
        }
        } 
        gana();
    }//GEN-LAST:event_btn5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txtTurno1;
    private javax.swing.JTextField txtTurno2;
    // End of variables declaration//GEN-END:variables
}
