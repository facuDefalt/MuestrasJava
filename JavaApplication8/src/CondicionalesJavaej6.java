
import java.util.Scanner;

public class CondicionalesJavaej6 {
   /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/

   
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a medir:");
        float per=Leer.nextInt();
        int i;
        float suma=0;
        for (i=1;i<=per;i++){
            System.out.println("ingrese la alura del sujeto numero "+i+" en cm");
            int alt=Leer.nextInt();
            suma=suma+alt;
        }
        System.out.println("Hemos terminado con todos los sujetos");
        System.out.println("El promedio de altura estimado es de "+(suma/per));
    }
}