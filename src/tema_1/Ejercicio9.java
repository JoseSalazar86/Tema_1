/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_1;

import java.util.*;

/**
 *
 * @author Jose Salazar
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        
        System.out.println("introduce un numero");
        int a =sc.nextInt();
        System.out.println("introduce un numero");
        int b =sc.nextInt();
        System.out.println("introduce un numero");
        int  c =sc.nextInt();
        double resultado= ((-b + Math.sqrt((b*b)-(4*a*c)))/(2*a));
        double resultado1= ((-b - Math.sqrt((b*b)-(4*a*c)))/(2*a));
        System.out.println("la raiz cuadra de "+resultado);
        System.out.println("la raiz cuadra de "+resultado1);
    }
    
}
