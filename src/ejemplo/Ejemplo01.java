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
    
    public static void main(String[] arg){
        saludarAlPublico("Gustavo Sosa");
    }
    
    public static void saludarAlPublico(String nombreSaluda){
        String variable = devolverNombre();
        nombreSaluda = nombreSaluda + variable;
        System.out.println("Hola Programacion Visual "+nombreSaluda);//nuevo cambio
    }   
    
    public static String devolverNombre(){
        String nombreDevuelto = "jugando";
        return nombreDevuelto;
    }
}
