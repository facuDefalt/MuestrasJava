/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU;


import Entidades.Tarea;
import Servicios.tareaService;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Event;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.CENTER;

/**
 *
 * @author PC
 */
public class ListaTareas extends javax.swing.JFrame {
    /*declaro las variables con las que voy a trabaja
    distinguida de las demas por el sufijo Aux:*/
    private String nombreTareaAux;
    private int diaAux;
    private int mesAux;
    private int añoAux;
    private int horaAux;
    private int minutoAux;
    private tareaService ts=new tareaService();
    
    public ListaTareas() {
        init();
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        llenarTareas(ts.RevisarTareas());
        
        
    }
    
    public void llenarTareas(List<Tarea> tareas){
         listaT.removeAll(); // Limpia el panel antes de agregar los nuevos componentes.
        listaT.revalidate(); // Actualiza el diseño del contenedor.
        listaT.repaint(); // Redibuja el contenedor.
        System.out.println("estoy por entrar al bucle pai");
        if (tareas == null || tareas.isEmpty()) {
        System.out.println("La lista de tareas está vacía o es nula");
        return;
        }
        listaT.setLayout(new BoxLayout(listaT, BoxLayout.Y_AXIS));
        for (Tarea tarea : tareas) {
            System.out.println("deberia dibujar algo");
            JPanel tareaPanel = new JPanel();
            tareaPanel.setBackground(new Color(252,243,207));
            tareaPanel.setLayout(new BoxLayout(tareaPanel, BoxLayout.X_AXIS));

            JTextField lista = new JTextField();
            lista.setBackground(new Color(252,243,207));
            lista.setHorizontalAlignment(CENTER);
            lista.setSize(30, 30);
            lista.setText(tarea.toString());
            lista.setEditable(false); //Para evitar que el usuario edite directamente.
            lista.setColumns(20);

            JButton btnAccion = new JButton("Completar");
            btnAccion.addMouseListener(crearEventoBtn(tarea));
            tareaPanel.add(lista);
            tareaPanel.add(btnAccion);

            listaT.add(tareaPanel);
        }
        listaT.repaint();
    }
    
    public MouseListener crearEventoBtn(Tarea tarea){
        System.out.println("estoy en la funcion btn");
        MouseListener evento= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
                tarea.setEstado("Completado");
                ts.editar(tarea);
                llenarTareas(ts.RevisarTareas());
            }
            

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                
            }

            @Override
            public void mouseExited(MouseEvent me) {
                
            }
        };
                return evento;
    }
    //renombro las variables en la funcion para no generar confusion (agrego terminacion con F de final):
    public void guardarDatos(String nombreTareaF,int diaF,int mesF,int añoF,int horaF,int minutoF){
        Tarea tarea=new Tarea();
        LocalDate date=LocalDate.of(añoF,mesF,diaF);
        LocalTime time=LocalTime.of(horaF, minutoF,0);
        tarea.setNombreTarea(nombreTareaF);
        tarea.setFecha(LocalDateTime.of(date, time));
        tarea.setEstado("Pendiente");
        ts.GuardarTarea(tarea);
        llenarTareas(ts.RevisarTareas());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tareaNombre = new javax.swing.JTextField();
        Dia = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        minuto = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listaT = new javax.swing.JPanel();
        salida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 231, 159));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 730));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Tareas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 500, 40);

        jPanel2.setBackground(new java.awt.Color(252, 243, 207));
        jPanel2.setLayout(null);

        tareaNombre.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tareaNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tareaNombre.setText("Tarea a realizar");
        jPanel2.add(tareaNombre);
        tareaNombre.setBounds(50, 40, 330, 23);

        Dia.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Dia.setText("Dia a realizar");
        Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaActionPerformed(evt);
            }
        });
        jPanel2.add(Dia);
        Dia.setBounds(10, 80, 100, 23);

        jPanel3.setBackground(new java.awt.Color(208, 236, 231));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AGREGAR");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(170, 160, 100, 37);

        mes.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        mes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mes.setText("Mes a realizar");
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        jPanel2.add(mes);
        mes.setBounds(170, 80, 100, 23);

        minuto.setBackground(new java.awt.Color(252, 243, 207));
        minuto.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        minuto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minuto.setText("00");
        minuto.setBorder(null);
        minuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutoActionPerformed(evt);
            }
        });
        jPanel2.add(minuto);
        minuto.setBounds(240, 130, 20, 30);

        año.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        año.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        año.setText("Año a realizar");
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });
        jPanel2.add(año);
        año.setBounds(330, 80, 100, 23);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingresar Tarea");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 440, 18);

        hora.setBackground(new java.awt.Color(252, 243, 207));
        hora.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        hora.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hora.setText("00");
        hora.setBorder(null);
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });
        jPanel2.add(hora);
        hora.setBounds(170, 130, 20, 30);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hora de aviso:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 110, 440, 18);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(190, 130, 50, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 70, 440, 210);

        listaT.setBackground(new java.awt.Color(252, 243, 207));
        listaT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listaT.setLayout(new javax.swing.BoxLayout(listaT, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(listaT);
        listaT.setBounds(10, 280, 480, 520);

        salida.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        salida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salida.setText("X");
        salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salidaMouseExited(evt);
            }
        });
        jPanel1.add(salida);
        salida.setBounds(470, 0, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.nombreTareaAux=tareaNombre.getText();
        this.diaAux=Integer.parseInt(Dia.getText());
        this.mesAux=Integer.parseInt(mes.getText());
        this.añoAux=Integer.parseInt(año.getText());
        this.horaAux=Integer.parseInt(hora.getText());
        this.minutoAux=Integer.parseInt(minuto.getText());
        guardarDatos(nombreTareaAux,diaAux,mesAux,añoAux,horaAux,minutoAux);
        Dia.setText("Dia a realizar");
        mes.setText("Mes a realizar");
        año.setText("Año a realizar");
        hora.setText("00");
        minuto.setText("00");
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void minutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutoActionPerformed

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void salidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseEntered
        salida.setForeground(new Color(231, 76, 60));
        salida.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_salidaMouseEntered

    private void salidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseExited
        salida.setForeground(Color.BLACK);
    }//GEN-LAST:event_salidaMouseExited

    private void salidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salidaMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Dia;
    private javax.swing.JTextField año;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel listaT;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField minuto;
    private javax.swing.JLabel salida;
    private javax.swing.JTextField tareaNombre;
    // End of variables declaration//GEN-END:variables
}
