
package convercion;
import java.util.Scanner;


public class Convercion {
  
    
    public static void main(String[] args) {
       Scanner ent=new Scanner(System.in);
        System.out.println("Dame los pesos que deseas convertir");
        double peso=ent.nextDouble();
   double D=17.07;
        double E=18.21;
        double Y=0.12;
        double L =21.18;
        
        
        System.out.println("La conversion de peso a Dolar es:" + peso/D);
    System.out.println("La conversion de peso a Euro es:" + peso/E);
     System.out.println("La conversion de peso a Yen es:" + peso/Y);
      System.out.println("La conversion de peso Libra es:" + peso/L);
    }
    
}
