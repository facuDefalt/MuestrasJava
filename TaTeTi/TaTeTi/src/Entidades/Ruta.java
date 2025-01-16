package Entidades;

public class Ruta {
    public static final String EQUIS="/Imagenes/CruzJ1.png";
    public static final String CIRCULO="/Imagenes/CirculoJ2.png";
    public static final String JUGADOREQUIS="/Imagenes/Jugador1.png";
    public static final String JUGADORCIRCULO="/Imagenes/Jugador2.png";
    public static final String JUGADORAUXILIAR="/Imagenes/JugadorAuxiliar.png";
    
    public static String Linea1="/Imagenes/CirculoLinea1.png";
    public static String Linea2="/Imagenes/CirculoLinea2.png";
    public static String Linea3="/Imagenes/CirculoLinea3.png";
    public static String Linea4="/Imagenes/CirculoLinea4.png";
    public static String Linea5="/Imagenes/CirculoLinea5.png";
    public static String Linea6="/Imagenes/CirculoLinea6.png";
    public static String Linea7="/Imagenes/CirculoLinea7.png";
    public static String Linea8="/Imagenes/CirculoLinea8.png";
    
    public static void cambiarRuta(imagenAsociada tipoImagen){
        if(tipoImagen==imagenAsociada.CIRCULO){
            Linea1="/Imagenes/CirculoLinea1.png";
            Linea2="/Imagenes/CirculoLinea2.png";
            Linea3="/Imagenes/CirculoLinea3.png";
            Linea4="/Imagenes/CirculoLinea4.png";
            Linea5="/Imagenes/CirculoLinea5.png";
            Linea6="/Imagenes/CirculoLinea6.png";
            Linea7="/Imagenes/CirculoLinea7.png";
            Linea8="/Imagenes/CirculoLinea8.png";
        }else{
            Linea1="/Imagenes/EquisLinea1.png";
            Linea2="/Imagenes/EquisLinea2.png";
            Linea3="/Imagenes/EquisLinea3.png";
            Linea4="/Imagenes/EquisLinea4.png";
            Linea5="/Imagenes/EquisLinea5.png";
            Linea6="/Imagenes/EquisLinea6.png";
            Linea7="/Imagenes/EquisLinea7.png";
            Linea8="/Imagenes/EquisLinea8.png";
        }
    }
}
