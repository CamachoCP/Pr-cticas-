
package areatriangulo;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
 Scanner ent=new Scanner (System.in);
             
        Double altura, base, area ;
        System.out.println("Ingrese la altura del triangulo");
   altura=ent.nextDouble();
        System.out.println("Ingresa la base del triangulo");
    base=ent.nextDouble();
    
    area=(base*altura)/2;
    
        System.out.println("El area del Triangulo es:" + area);
     
    }
    
}
