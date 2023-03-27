import java.util.Scanner;


public class CondicionalesJavaej5 {
   /* Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.*/

   
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        System.out.println("Ingrese una letra que represente a los socios:");
        String L=Leer.nextLine();
        System.out.println("Ingrese el importe del tratamiento:");
        float n=Leer.nextInt();
        switch (L.toUpperCase()){
            case "A":
                System.out.println("usted debreia pagar"+(n-n*0.5));
                break;
            case "B":
                System.out.println("usted debreia pagar"+(n-n*0.35));          
                break;
            case "C":
                System.out.println("vos no aportas nada?cagate pagas sin descueno $"+n);
                break;
           
        }
    
    
    
    
    }
}