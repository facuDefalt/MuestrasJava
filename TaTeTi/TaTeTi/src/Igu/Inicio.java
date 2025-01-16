package Igu;

import Entidades.Jugador;
import Entidades.imagenAsociada;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JTextField();
        jugador1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JLabel();
        imagen1 = new Entidades.Imagen();
        imagen2 = new Entidades.Imagen();
        imagen3 = new Entidades.Imagen();
        imagen4 = new Entidades.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 19, 49));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 105, 220), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(490, 418));

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

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 192, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ta Te Ti");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jugador2.setBackground(new java.awt.Color(249, 230, 254));
        jugador2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jugador2.setForeground(new java.awt.Color(202, 105, 220));
        jugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jugador2.setText("Jugador2");
        jugador2.setAlignmentX(100.0F);
        jugador2.setAlignmentY(100.0F);
        jugador2.setBorder(null);
        jugador2.setPreferredSize(new java.awt.Dimension(230, 40));
        jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jugador2MouseExited(evt);
            }
        });
        jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugador2ActionPerformed(evt);
            }
        });

        jugador1.setBackground(new java.awt.Color(214, 252, 249));
        jugador1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jugador1.setForeground(new java.awt.Color(101, 175, 245));
        jugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jugador1.setText("Jugador1");
        jugador1.setAlignmentX(100.0F);
        jugador1.setAlignmentY(100.0F);
        jugador1.setBorder(null);
        jugador1.setPreferredSize(new java.awt.Dimension(230, 40));
        jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jugador1MouseExited(evt);
            }
        });
        jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugador1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(42, 22, 79));
        jPanel2.setAlignmentX(130.0F);
        jPanel2.setAlignmentY(230.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(160, 50));

        btnInicio.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(241, 227, 252));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInicio.setText("Empezar");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        imagen1.setText("imagen1");
        imagen1.setRuta("/Imagenes/Jugador1.png");

        imagen2.setText("imagen2");
        imagen2.setRuta("/Imagenes/Jugador2.png");

        imagen3.setText("imagen3");
        imagen3.setRuta("/Imagenes/CruzJ1.png");

        imagen4.setText("imagen4");
        imagen4.setRuta("/Imagenes/circuloJ2.png");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jugador2ActionPerformed

    private void jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jugador1ActionPerformed

    private void jugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugador1MouseEntered
        Border borde=BorderFactory.createLineBorder(new Color(52,136,235),2);
        jugador1.setBorder(borde);
    }//GEN-LAST:event_jugador1MouseEntered

    private void jugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugador1MouseExited
       jugador1.setBorder(null);
    }//GEN-LAST:event_jugador1MouseExited

    private void jugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugador2MouseEntered
        Border borde=BorderFactory.createLineBorder(new Color(165,40,174),2);
        jugador2.setBorder(borde);
    }//GEN-LAST:event_jugador2MouseEntered

    private void jugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugador2MouseExited
        jugador2.setBorder(null);
    }//GEN-LAST:event_jugador2MouseExited

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        this.setVisible(false);
        Jugador player1=new Jugador(imagenAsociada.EQUIS);
        if(jugador1.getText().equals("")){
            player1.setNombre("JUGADOR1");
        }else{
            player1.setNombre(jugador1.getText());
        }
        Jugador player2=new Jugador(imagenAsociada.CIRCULO);
        if(jugador2.getText().equals("")){
            player2.setNombre("JUGADOR2");
        }else{
            player2.setNombre(jugador2.getText());
        }
        
        Juego juego=new Juego(player1,player2);
        juego.setVisible(true);
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        Border borde=BorderFactory.createLineBorder(new Color(241,227,252),2);
        btnInicio.setBorder(borde);
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        btnInicio.setBorder(null);
    }//GEN-LAST:event_btnInicioMouseExited

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnInicio;
    private Entidades.Imagen imagen1;
    private Entidades.Imagen imagen2;
    private Entidades.Imagen imagen3;
    private Entidades.Imagen imagen4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jugador1;
    private javax.swing.JTextField jugador2;
    // End of variables declaration//GEN-END:variables
}
