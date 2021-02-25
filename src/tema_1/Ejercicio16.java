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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int segundos =(int)(Math.random()*100000)+1;
	
	System.out.println(segundos+"los segundos equivalen a: "+segundos/3600+"horas"+(segundos%3600)/60+"minutos"+segundos%60+"segundos");
    }
    
}
