package Entidades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class CuadroInterno extends JPanel{
    private int ancho;
    private int alto;
    private Color color;
    private imagenAsociada tipoImagen;
    private boolean dibujado;
    private int i;
    private int j;

    public CuadroInterno(int ancho, int alto, Color color) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        dibujado=false;
        init();
    }
    
    private void init(){
        setSize(ancho,alto);
        setBackground(color);
    }
    
    @Override
    protected void paintComponent(Graphics gg){
        super.paintComponent(gg);
        Graphics2D g=(Graphics2D)gg;
        
        ImageIcon imagen=new ImageIcon();
        if(tipoImagen==imagenAsociada.CIRCULO){
            imagen=new ImageIcon(getClass().getResource(Ruta.CIRCULO));
        }else if(tipoImagen==imagenAsociada.EQUIS){
            imagen=new ImageIcon(getClass().getResource(Ruta.EQUIS));
        }else if(tipoImagen==imagenAsociada.LINEA1){
            imagen=new ImageIcon(getClass().getResource(Ruta.Linea1));
        }else if(tipoImagen==imagenAsociada.LINEA2){
            imagen=new ImageIcon(getClass().getResource(Ruta.Linea2));
        }else if(tipoImagen==imagenAsociada.LINEA3){
            imagen=new ImageIcon(getClass().getResource(Ruta.Linea3));
        }else if(tipoImagen==imagenAsociada.LINEA4){
            imagen=new ImageIcon(getClass().getResource(Ruta.Linea4));
        }else if(tipoImagen==imagenAsociada.LINEA5){
            imagen=new ImageIcon(getClass().getResource(Ruta.Linea5));
        }else if(tipoImagen==imagenAsociada.LINEA6){
            imagen=new ImageIcon(getClass().getResource(Ruta.Linea6));
        }else if(tipoImagen==imagenAsociada.LINEA7){
            imagen=new ImageIcon(getClass().getResource(Ruta.Linea7));
        }else if(tipoImagen==imagenAsociada.LINEA8){
            imagen=new ImageIcon(getClass().getResource(Ruta.Linea8));
        }
        g.drawImage(imagen.getImage(),0,0,this.getWidth(),this.getHeight(),null);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    
    public boolean isDibujado() {
        return dibujado;
    }

    public void setDibujado(boolean dibujado) {
        this.dibujado = dibujado;
    }

    
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public imagenAsociada getTipoImagen() {
        return tipoImagen;
    }

    public void setTipoImagen(imagenAsociada tipoImagen) {
        this.tipoImagen = tipoImagen;
    }
    
    
}
