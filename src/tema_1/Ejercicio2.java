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
public class Ejercicio2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        int gradoC=0;
        int farenF=0;
        
        System.out.println("introduce los grados celcius");
        gradoC =sc.nextInt();
        farenF=9*gradoC/5+32;
        System.out.println("la equivalencia de grados celcius a fahrenheit son: "+farenF);
    }
}
