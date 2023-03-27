import java.util.Scanner;


public class CondicionalesJavaej2 {
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java.*/
   
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        System.out.println("ingrese una frase a continuacon: ");
        String pala=Leer.nextLine();
        String correc="eureka";
        if (pala.equals(correc)){
        System.out.println("Correcto");
        }else{
        System.out.println("incorrecto");
        }
    }
}