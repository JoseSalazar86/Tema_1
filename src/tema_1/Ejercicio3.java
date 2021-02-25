package tema_1;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Salazar
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  sc=new Scanner (System.in);
        short anio=0,actual=0;
        System.out.println("introduce tu  año de nacimiento");
        anio =sc.nextShort();
        System.out.println("introduce el año actual");
        actual =sc.nextShort();
        System.out.println("tu edad es: "+(actual-anio));
    }
    
}
