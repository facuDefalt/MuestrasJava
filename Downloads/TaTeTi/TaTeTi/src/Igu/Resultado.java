package Igu;

import Entidades.Jugador;
import Entidades.Ruta;
import Entidades.Tablero;
import Entidades.imagenAsociada;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class Resultado extends javax.swing.JFrame {

    private Tablero tablero;
    private imagenAsociada jugadorGanador;
    public Resultado(imagenAsociada jugadorGanador,Tablero tablero) {
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.tablero=tablero;
        this.jugadorGanador=jugadorGanador;
        if(jugadorGanador==imagenAsociada.EQUIS){
            imgIzquierda.setRuta(Ruta.JUGADOREQUIS);
            imgDerecha.setRuta(Ruta.EQUIS);
            lblNombre.setText(Juego.nombrePlEquis.getText());
        }else if(jugadorGanador==imagenAsociada.CIRCULO){
            imgIzquierda.setRuta(Ruta.JUGADORCIRCULO);;
            imgDerecha.setRuta(Ruta.CIRCULO);
            lblNombre.setText(Juego.nombrePlCirculo.getText());
        }else{
            imgDerecha.setRuta(Ruta.JUGADORCIRCULO);
            imgIzquierda.setRuta(Ruta.JUGADOREQUIS);
            lblNombre.setText("EMPATE");
        }
    }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imgIzquierda = new Entidades.Imagen();
        imgDerecha = new Entidades.Imagen();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 19, 49));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 105, 220), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(490, 418));
        jPanel1.setLayout(null);

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
        jPanel1.add(jLabel1);
        jLabel1.setBounds(464, 14, 13, 25);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 192, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VICTORIA");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(75, 37, 355, 47);

        imgIzquierda.setText("imagen1");
        imgIzquierda.setRuta("/Imagenes/Jugador1.png");
        jPanel1.add(imgIzquierda);
        imgIzquierda.setBounds(50, 90, 106, 107);

        imgDerecha.setText("imagen3");
        imgDerecha.setRuta("/Imagenes/CruzJ1.png");
        jPanel1.add(imgDerecha);
        imgDerecha.setBounds(370, 100, 69, 77);

        lblNombre.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(241, 227, 252));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("NOMBRE");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblNombre);
        lblNombre.setBounds(0, 100, 490, 79);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        tablero.reiniciar(jugadorGanador);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_jLabel1MouseExited

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Entidades.Imagen imgDerecha;
    private Entidades.Imagen imgIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
