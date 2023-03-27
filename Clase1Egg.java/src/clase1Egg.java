import java.util.Scanner;

public class clase1Egg {
    public static void main (String[] args) {
        Scanner Leer=new Scanner(System.in);
        
        /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma*/
    System.out.print ("Hola buenas,¡que te parece si sumamos un par de numeros?");
    System.out.print("Ingrese los numeros a continuacion: ");
    int n=Leer.nextInt();
    int n2=Leer.nextInt();
    int suma=n+n2;
    System.out.println("el resulado de tu suma es de "+ suma);
    
    }
}