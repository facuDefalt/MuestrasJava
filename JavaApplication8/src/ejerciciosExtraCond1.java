import java.util.Scanner;


public class ejerciciosExtraCond1 {

   
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
        si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
        System.out.println("Ingrese una cantidad de minutos a continuacion: ");
        int min=Leer.nextInt();
        float horas=min/60;
        float dias=min/1440;
        if (min<60){
            System.out.println("Usted,ingreso una cantidad de minutos que no llega a la hora.Desea ver su equivalente en horas y minutos igualmente?Aprete S/N");
            String resp=Leer.next();
            if (resp.toUpperCase().equals("S")){
                System.out.println("usted ingreso "+min+" minutos,equivalente a "+horas+"hs/"+dias+" dia");
            }else{
                System.out.println("Usted ingreso "+min+" minutos .Tenga lindo dia.");
            }
            
        }else if(horas<24){
            System.out.println("usted ingreso "+min+" minutos,equivalente a "+horas+"hs");
            System.out.println("Usted,ingreso una cantidad de minutos que no llega al dia.Desea ver su equivalente en dias,horas y minutos igualmente?Aprete S/N");
             String resp2=Leer.next();
            switch (resp2. toUpperCase()){
                case "S":
                    System.out.println("usted ingreso "+min+" minutos,equivalente a "+horas+"hs/"+dias+" dia");
                case "N":
                    System.out.println("Usted ingreso "+min+" minutos.enga lindo dia.");
        }
        }else{
            System.out.println("usted ingreso "+min+" minutos,equivalente a "+horas+"hs/"+dias+" dias");
        }}
    
    }

