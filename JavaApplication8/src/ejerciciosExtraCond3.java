import java.util.Scanner;


public class ejerciciosExtraCond3 {

   
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
         System.out.println("ingrese una letra a continuacon: ");
        String pala=Leer.nextLine();
        
        if (pala.toUpperCase().equals("A") || pala.toUpperCase().equals("E") || pala.toUpperCase().equals("I") || pala.toUpperCase().equals("O") || pala.toUpperCase().equals("U")){
            System.out.println("Usted ingreso una vocal");
        }else{
            System.out.println("Usted no ingreso ninguna vocal");
        }
    
    
    }
}