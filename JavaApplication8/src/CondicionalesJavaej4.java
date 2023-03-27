import java.util.Scanner;


public class CondicionalesJavaej4 {
   /* Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.*/

   
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int n=Leer.nextInt();
        switch (n){
            case 1:
                System.out.println("En romano:I");
                break;
            case 2:
                System.out.println("En romano:II");          
                break;
            case 3:
                System.out.println("En romano:III");
                break;
            case 4:
                System.out.println("En romano:IV");
                break;
            case 5:
                System.out.println("En romano:V");
                break;
            case 6:
                System.out.println("En romano:VI");
                break;
            case 7:
                System.out.println("En romano:VII");
                break;
            case 8:
                System.out.println("En romano:VIII");
                break;
            case 9:
                System.out.println("En romano:IX");
                break;
            case 10:
                System.out.println("En romano:X");
                break;
        }
    
    
    
    
    }
}
