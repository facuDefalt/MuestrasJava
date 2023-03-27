import java.util.Scanner;


public class CondicionalesJava {

   /*Crear un programa que dado un numero determine si es par o impar.*/
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        System.out.print("ingrese un numero a continuacion: ");
        int numero=Leer.nextInt();
        boolean par=numero%2==0;
        if (par){
            System.out.println("su numero es par");
        } else  {
              System.out.println("su numero no es par");
        }
    }
}