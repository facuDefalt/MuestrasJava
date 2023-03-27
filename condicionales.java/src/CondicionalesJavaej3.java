import java.util.Scanner;


public class CondicionalesJavaej3 {

   
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
        usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        Nota: investigar la función Lenght() en Java*/
        System.out.println("ingrese una frase a contnuacion: ");
        String pala=Leer.nextLine();
        if (pala.length()==8){
            System.out.println("CORRECTO");
        } else if(pala.length()!=8 ){
            System.out.println("INCORRECTO");
        }
 }
}