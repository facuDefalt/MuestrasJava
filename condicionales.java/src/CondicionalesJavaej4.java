import java.util.Scanner;


public class CondicionalesJavaej4 {

   
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
        es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
        diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
        la función Substring y equals() de Java.*/
        System.out.println("Ingrese una palabra a continuacion: ");
        String pala=Leer.nextLine();
        if (pala.substring(1, 2).equals("a") || pala.substring(1, 2).equals("A") ){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
                    
        }
    }
}