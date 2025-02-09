/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_encendido_p5;

/**
 *
 * @author brend
 */
public class Eva1_Encendido_P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televicion tv = new Televicion();
        tv.encendidoApagar();
        tv.bajarVolumen();
        tv.imprimirDatos();
        tv.encendidoApagar();
        tv.subirVolumen();
        tv.imprimirDatos();
        tv.encendidoApagar();
        tv.setCanal(8);
        tv.subirCanal();
        tv.imprimirDatos();
         tv.subirCanal();
         tv.imprimirDatos();
          tv.subirCanal();
           tv.imprimirDatos();
        tv.bajarCanar();
        tv.imprimirDatos();
       
        
    }
    
}
