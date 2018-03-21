/**
 * JAVA DOC
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 **/
package ejemplo;

/**
 *
 * @author gustso
 */
public class Ejemplo01 {
    
    public static void saludarAlPublico(String nombreSaluda){
        System.out.println("Hola Programacion Visual "+nombreSaluda);//nuevo cambio
    }
            
    public static void main(String[] arg){
        saludarAlPublico("Gustavo Sosa");
    }
}
