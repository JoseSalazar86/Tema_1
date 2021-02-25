/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_1;

/**
 *
 * @author Jose Salazar
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=-3;
        byte b=5;
        float f=1e-10f;
        double d=3.14;
        boolean b1=i>i;
        boolean b2=i<b;
        boolean b3=b<=f;
        boolean b4=f>=d;
        boolean b5=d!=0;
        boolean b6=1==f;
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
    }
    
}
