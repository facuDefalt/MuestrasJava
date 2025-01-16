package Entidades;


import Igu.Juego;
import Igu.Resultado;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
    @author FacundoMuñoz
 */
public class Tablero extends JPanel {
    private int anchoCI;
    private int altoCI;
    private int margen;
    private Color colorTablero;
    private Color cuadroInterno;
    
    private Jugador jugador1;
    private Jugador jugador2;
    
    private ArrayList<CuadroInterno> cuadros;
    private CuadroInterno cuadroFrontal;
    
    private imagenAsociada jugadorActual;
    private imagenAsociada turnoPartida;
    
    public Tablero() {
        init();
    }
    
    public void init(){
        anchoCI=80;
        altoCI=80;
        cuadroInterno=Color.BLUE;
        colorTablero=Color.RED;
        margen=6;
        jugador1=new Jugador();
        jugador2=new Jugador();
        cuadros=new ArrayList();
        jugadorActual=imagenAsociada.EQUIS;
        turnoPartida=imagenAsociada.EQUIS;
    }
    
    public void generarTablero(){
        setLayout(null);
        setSize(anchoCI*3+margen*4,altoCI*3+margen*4);
        setBackground(colorTablero);
        cuadroFrontal=new CuadroInterno(this.getWidth(),this.getHeight(),Color.BLACK);
        cuadroFrontal.setLocation(0,0);
        cuadroFrontal.setOpaque(false);
        cuadroFrontal.setEnabled(false);
        add(cuadroFrontal);
        crearCuadroInterno();
    }
    
    private void crearCuadroInterno(){
        int x=margen;
        int y=margen;
        
        for(int i=0;i<3;i++){
            x=margen;
            for(int j=0;j<3;j++){
                CuadroInterno cuadro=new CuadroInterno(anchoCI,altoCI,cuadroInterno);
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cuadro.setLocation(x,y);
                cuadro.setI(i);
                cuadro.setJ(j);
                add(cuadro);
                cuadros.add(cuadro);
                crearEventosCuadro(cuadro);
                
                x+=(anchoCI+margen);
            }
            y+=(altoCI+margen);
        }
    }
    //genero los eventos de cada cuadro interno para interactuar con el rotulador del mouse
    public void crearEventosCuadro(CuadroInterno cuadro){
        MouseListener evento=new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
                if(cuadro.isDibujado()) return;
                
                imagenAsociada imgResultado=null;
                
                if(jugadorActual==imagenAsociada.EQUIS){
                cuadro.setTipoImagen(imagenAsociada.EQUIS);
                jugador1.getTablero()[cuadro.getI()][cuadro.getJ()]=1;
                imgResultado=jugador1.tresEnRaya(jugador2);
                resultado(imgResultado,imagenAsociada.EQUIS);
                jugadorActual=imagenAsociada.CIRCULO;
                cambiarEstilos(imagenAsociada.CIRCULO);
                }else if(jugadorActual==imagenAsociada.CIRCULO){
                    cuadro.setTipoImagen(imagenAsociada.CIRCULO);
                    jugador2.getTablero()[cuadro.getI()][cuadro.getJ()]=1;
                    imgResultado=jugador2.tresEnRaya(jugador1);
                    resultado(imgResultado,imagenAsociada.CIRCULO);
                    jugadorActual=imagenAsociada.EQUIS;
                    cambiarEstilos(imagenAsociada.EQUIS);
                }
                cuadro.setDibujado(true);
                repaint();
                //corroboracion de funcion de deteccion de convinaciones
                /*
                if(imgResultado==null)System.out.println("Aun no hay ganador");
                else if(imgResultado==imagenAsociada.EMPATE)System.out.println("EMPATE");
                else if (imgResultado!=null)System.out.println("Hay ganador");
                */
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
        cuadro.addMouseListener(evento);
    }
    
    //funcion para resaltar turnos de los jugadores
    public void cambiarEstilos(imagenAsociada jugadorAct){
        if(jugadorAct==imagenAsociada.CIRCULO){
            Juego.imgJugadorEquis.setRuta(Ruta.JUGADORAUXILIAR);
            Juego.imgJugadorEquis.repaint();
            Juego.nombrePlEquis.setForeground(new Color(240,240,240,100));
            
            Juego.imgJugadorCirculo.setRuta(Ruta.JUGADORCIRCULO);
            Juego.imgJugadorCirculo.repaint();
            Juego.nombrePlCirculo.setForeground(new Color(255,200,255));
            
        }else if(jugadorAct==imagenAsociada.EQUIS){
            Juego.imgJugadorCirculo.setRuta(Ruta.JUGADORAUXILIAR);
            Juego.imgJugadorCirculo.repaint();
            Juego.nombrePlCirculo.setForeground(new Color(240,240,240,100));
            
            Juego.imgJugadorEquis.setRuta(Ruta.JUGADOREQUIS);
            Juego.imgJugadorEquis.repaint();
            Juego.nombrePlEquis.setForeground(new Color(180,232,255));
        }
    }
    
    public void resultado(imagenAsociada imgResult,imagenAsociada jugadorGanador){
        if(imgResult==imagenAsociada.EMPATE){
            System.out.println("EMPATE");   
            Tablero tablero=this;
            //Importar Timer para agregar segundos de espera tras victoria o empate
            Timer timer=new Timer();
            TimerTask tarea=new TimerTask() {
                @Override
                public void run() {
                    Resultado resultado=new Resultado(imagenAsociada.EMPATE,tablero);
                    resultado.setVisible(true);
                }
            };
            timer.schedule(tarea,800);
        }else if (imgResult!=null){
            System.out.println("Hay ganador");
            Ruta.cambiarRuta(jugadorGanador);
            cuadroFrontal.setTipoImagen(imgResult);
            desactivarCuadros(true);
            
            Tablero tablero=this;
            //Importar Timer para agregar segundos de espera tras victoria o empate
            Timer timer=new Timer();
            TimerTask tarea=new TimerTask() {
                @Override
                public void run() {
                    Resultado resultado=new Resultado(jugadorGanador,tablero);
                    resultado.setVisible(true);
                }
            };
            timer.schedule(tarea,800);
        }
    }
    //una vez ganador necesito limpiar el tablero por lo que requiero la siguiente funcion:
    public void desactivarCuadros(boolean valor){
        for(CuadroInterno cuadro : cuadros){
            cuadro.setDibujado(valor);
        }
    }
    
    public void reiniciar(imagenAsociada ganador){
        desactivarCuadros(false);
        borrarImagen();
        cuadroFrontal.setTipoImagen(null);
        if(ganador==imagenAsociada.EQUIS){
            int puntajeNuevo=Integer.parseInt(Juego.puntajeX.getText());
            puntajeNuevo++;
            Juego.puntajeX.setText(String.valueOf(puntajeNuevo));
        }else if(ganador==imagenAsociada.CIRCULO){
            int puntajeNuevo=Integer.parseInt(Juego.puntajeO.getText());
            puntajeNuevo++;
            Juego.puntajeO.setText(String.valueOf(puntajeNuevo));
        }
        if(turnoPartida==imagenAsociada.EQUIS){
            jugadorActual=imagenAsociada.CIRCULO;
            turnoPartida=imagenAsociada.CIRCULO;
        }else{
            turnoPartida=imagenAsociada.EQUIS;
            jugadorActual=imagenAsociada.EQUIS;
        }
        cambiarEstilos(jugadorActual);
        jugador1.limpiar();
        jugador2.limpiar();
        repaint();
    }
    //complementa el borrado del contenido del tablero una vez se genera un empate o una victoria
    public void borrarImagen(){
        for(CuadroInterno cuadro:cuadros){
            cuadro.setTipoImagen(null);
        }
    }
    
    public imagenAsociada getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(imagenAsociada jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    
    
    public ArrayList<CuadroInterno> getCuadros() {
        return cuadros;
    }

    public void setCuadros(ArrayList<CuadroInterno> cuadros) {
        this.cuadros = cuadros;
    }
    
    
    
    public int getAnchoCI() {
        return anchoCI;
    }

    public void setAnchoCI(int anchoCI) {
        this.anchoCI = anchoCI;
    }

    public int getAltoCI() {
        return altoCI;
    }

    public void setAltoCI(int largoCI) {
        this.altoCI = largoCI;
    }

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public Color getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }

    public Color getCuadroInterno() {
        return cuadroInterno;
    }

    public void setCuadroInterno(Color cuadroInterno) {
        this.cuadroInterno = cuadroInterno;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    
    
}
