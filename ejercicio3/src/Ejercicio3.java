import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {
        Scanner Leer=new Scanner(System.in);
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.*/
        System.out.print("Ingrese una frase: ");
        String pala=Leer.nextLine();
        String Grande=pala.toUpperCase();
        String chico=pala.toLowerCase();
        System.out.println(Grande);
        System.out.println(chico);
        
    }
}