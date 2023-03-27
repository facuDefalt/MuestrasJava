import java.util.Scanner;

public class ejercicio2 {
    public static void main (String[] args) {
        Scanner Leer=new Scanner(System.in);
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.*/
        System.out.print("Ingrese su nombre: ");
        String nombre=Leer.nextLine();
        System.out.print("bienvenido"+nombre+" que tengas linda tarde");
    }
}