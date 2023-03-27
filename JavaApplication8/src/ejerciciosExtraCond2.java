import java.util.Scanner;


public class ejerciciosExtraCond2 {

   
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que:
        B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
        Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        int a,b,c,d,p=0;
        System.out.println("Ingrese un valor para la variable A: ");
        a=Leer.nextInt();
        System.out.println("Ingrese un valor para la variable B: ");
        b=Leer.nextInt();
        System.out.println("Ingrese un valor para la variable C: ");
        c=Leer.nextInt();
        System.out.println("Ingrese un valor para la variable D: ");
        d=Leer.nextInt();
        System.out.println("los valores de los numeros  ingresados son: A="+a+";B="+b+";C="+c+";D="+d);
        
            p=a;
            a=b;
            b=c;
            c=d;
            d=p;
        
        System.out.println("los valores de los numeros removidos son: A="+a+";B="+b+";C="+c+";D="+d);
    }
}
