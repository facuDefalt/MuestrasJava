/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Igu;

import Entidades.Imagen;
import Entidades.Jugador;
import Entidades.Tablero;
import Entidades.imagenAsociada;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class Juego extends javax.swing.JFrame {
    public static Imagen imgJugadorEquis;
    public static Imagen imgJugadorCirculo;
    public static JLabel nombrePlEquis;
    public static JLabel nombrePlCirculo;
    
    public static JLabel puntajeX;
    public static JLabel puntajeO;
    
    private Jugador player2,player1;
    private Tablero tablero;
    
    public Juego(Jugador player1,Jugador player2) {
        this.player1=player1;
        this.player2=player2;
        init();
        imgJugadorEquis = ImgJugador1;
        imgJugadorCirculo = ImgJugador2;
        nombrePlEquis=jugador1;
        nombrePlCirculo=Jugador2;
        puntajeX=puntajeJ1;
        puntajeO=puntajeJ2;
        tablero.cambiarEstilos(imagenAsociada.EQUIS);
    }
    
    
    public void init(){
        
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        jugador1.setText(player1.getNombre());
        Jugador2.setText(player2.getNombre());
        
        tablero=new Tablero();
        tablero.setJugador1(player1);
        tablero.setJugador2(player2);
        tablero.setAltoCI(100);
        tablero.setAnchoCI(100);
        tablero.setMargen(5);
        tablero.setCuadroInterno(new Color(14,19,43));
        tablero.setColorTablero(new Color(239,180,255));
        tablero.setLocation(75,200);
        tablero.generarTablero();
        tablero.setVisible(true);
        
        panelFondo.add(tablero);
        
    }

    public Jugador getPlayer2() {
        return player2;
    }

    public void setPlayer2(Jugador player2) {
        this.player2 = player2;
    }

    public Jugador getPlayer1() {
        return player1;
    }

    public void setPlayer1(Jugador player1) {
        this.player1 = player1;
    }
    
    //---------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        ImgJugador1 = new Entidades.Imagen();
        ImgJugador2 = new Entidades.Imagen();
        jLabel1 = new javax.swing.JLabel();
        Jugador2 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        puntajeJ2 = new javax.swing.JLabel();
        puntosJ2 = new javax.swing.JLabel();
        puntajeJ1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(470, 620));

        panelFondo.setBackground(new java.awt.Color(14, 19, 43));
        panelFondo.setPreferredSize(new java.awt.Dimension(470, 620));
        panelFondo.setLayout(null);

        ImgJugador1.setText("imagen1");
        ImgJugador1.setAlignmentX(75.0F);
        ImgJugador1.setAlignmentY(50.0F);
        ImgJugador1.setRuta("/Imagenes/Jugador1.png");
        panelFondo.add(ImgJugador1);
        ImgJugador1.setBounds(75, 50, 124, 124);

        ImgJugador2.setText("imagen2");
        ImgJugador2.setRuta("/Imagenes/Jugador2.png");
        panelFondo.add(ImgJugador2);
        ImgJugador2.setBounds(280, 50, 116, 127);

        jLabel1.setBackground(new java.awt.Color(60, 63, 65));
        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 192, 255));
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        panelFondo.add(jLabel1);
        jLabel1.setBounds(450, 10, 13, 25);

        Jugador2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        Jugador2.setForeground(new java.awt.Color(255, 200, 255));
        Jugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jugador2.setText("name");
        panelFondo.add(Jugador2);
        Jugador2.setBounds(290, 140, 90, 30);

        jugador1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        jugador1.setForeground(new java.awt.Color(180, 232, 255));
        jugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugador1.setText("name");
        panelFondo.add(jugador1);
        jugador1.setBounds(90, 140, 90, 30);

        puntajeJ2.setFont(new java.awt.Font("Bodoni MT Black", 1, 36)); // NOI18N
        puntajeJ2.setForeground(new java.awt.Color(255, 255, 255));
        puntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntajeJ2.setText("0");
        panelFondo.add(puntajeJ2);
        puntajeJ2.setBounds(250, 70, 60, 60);

        puntosJ2.setFont(new java.awt.Font("Bodoni MT Black", 1, 26)); // NOI18N
        puntosJ2.setForeground(new java.awt.Color(255, 255, 255));
        puntosJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntosJ2.setText("-");
        panelFondo.add(puntosJ2);
        puntosJ2.setBounds(230, 70, 20, 60);

        puntajeJ1.setFont(new java.awt.Font("Bodoni MT Black", 1, 36)); // NOI18N
        puntajeJ1.setForeground(new java.awt.Color(255, 255, 255));
        puntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntajeJ1.setText("0");
        panelFondo.add(puntajeJ1);
        puntajeJ1.setBounds(170, 70, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Entidades.Imagen ImgJugador1;
    private Entidades.Imagen ImgJugador2;
    private javax.swing.JLabel Jugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jugador1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel puntajeJ1;
    private javax.swing.JLabel puntajeJ2;
    private javax.swing.JLabel puntosJ2;
    // End of variables declaration//GEN-END:variables
}
