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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        int base=0;
        int altura=0;
        
        System.out.println("Introduce la base del triangulo");
        base =sc.nextInt();
        System.out.println("Introduce la altura del triangulo");
        altura =sc.nextInt();
        
        int superficie=base*altura/2;
        System.out.println("la superficie del triangulo es: "+superficie);
    }
    
}
