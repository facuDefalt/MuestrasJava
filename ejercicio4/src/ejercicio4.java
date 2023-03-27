import java.util.Scanner;

public class ejercicio4 {
    public static void main (String[] args) {
        Scanner Leer=new Scanner(System.in);
    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    System.out.print("ingrese una cantidad de grados centigrados: ");
    float temp=Leer.nextInt();
    float F= 32 + (9 * temp / 5);
    System.out.println("usted ingreso aproximadamente="+F+" grados Fahrenheit");
    }
}