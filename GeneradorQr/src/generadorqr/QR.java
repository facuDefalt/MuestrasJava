package generadorqr;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class QR extends javax.swing.JFrame {

    
    public QR() {
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        tctLink = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BtnGenerar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        Closebtn = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tctLink.setBackground(new java.awt.Color(255, 51, 255));
        tctLink.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tctLink.setForeground(new java.awt.Color(255, 255, 255));
        tctLink.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tctLink.setText("Ingrese un Link");
        tctLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tctLinkActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnGenerar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BtnGenerar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnGenerar.setText("GENERAR");
        BtnGenerar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGenerarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnGenerarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 255));

        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        Closebtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Closebtn.setText("X");
        Closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClosebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClosebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClosebtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tctLink, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Closebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tctLink, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tctLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tctLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tctLinkActionPerformed

    private void BtnGenerarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGenerarMouseEntered
        BtnGenerar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BtnGenerarMouseEntered

    private void BtnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGenerarMouseClicked
        int size=1000;
        String tipoArchivo="png";
        
        String codigo=tctLink.getText().trim();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de texto está vacío. Ingresa un código para generar el QR.");
            return; // Salir del método para evitar el error
        }else{
            System.out.println(codigo);
        }
        //Indico la ruta de la imagen
        String filePath="";
        JFileChooser chooser=new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            filePath=chooser.getSelectedFile().getAbsolutePath();
        }
        
        //Generar nombre
        UUID id=UUID.randomUUID();
        String randomName=id.toString();
        
        //Genero QR
        QRCodeWriter qrcode=new QRCodeWriter();
        try{
            BitMatrix matrix=qrcode.encode(codigo, BarcodeFormat.QR_CODE, size, size);
            File f=new File(filePath + "/" +randomName+ "." +tipoArchivo);
            int matrixWidth=matrix.getWidth();
            BufferedImage image=new BufferedImage(matrixWidth,matrixWidth,BufferedImage.TYPE_INT_RGB);
            image.createGraphics();
            
            Graphics2D gd=(Graphics2D) image.getGraphics();
            gd.setColor(Color.WHITE);//color fondo
            gd.fillRect(0, 0, size, size);
            gd.setColor(Color.BLACK);//color QR
            
            for(int i=0;i<matrixWidth;i++){
                for(int j=0;j<matrixWidth;j++){
                    if(matrix.get(i, j)){
                        gd.fillRect(i, j, 1, 1);
                    }
                }
            }
            
            //Mostrar QR
            ImageIO.write(image, tipoArchivo, f);
            Image mImagen=new ImageIcon(filePath +"/"+ randomName +"."+ tipoArchivo).getImage();
            ImageIcon mIcon=new ImageIcon(mImagen.getScaledInstance(this.lblCodigo.getWidth(), this.lblCodigo.getHeight(), Image.SCALE_SMOOTH));
            lblCodigo.setIcon(mIcon);
            
        } catch (IOException ex) {
            Logger.getLogger(QR.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriterException ex) {
            Logger.getLogger(QR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtnGenerarMouseClicked

    private void ClosebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseExited
        Closebtn.setForeground(Color.BLACK);
    }//GEN-LAST:event_ClosebtnMouseExited

    private void ClosebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseEntered
        Closebtn.setForeground(Color.RED);
    }//GEN-LAST:event_ClosebtnMouseEntered

    private void ClosebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ClosebtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnGenerar;
    private javax.swing.JLabel Closebtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField tctLink;
    // End of variables declaration//GEN-END:variables
}
