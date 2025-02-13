/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_constructores_p8;

/**
 *
 * @author aleja
 */
public class EVA1_CONSTRUCTORES_P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VEHICULO carro= new VEHICULO();
       carro.imprimirDatos();
       
       
       VEHICULO carr=new  VEHICULO ("Ford","belico",2005,"ROJO",50000);
       carr.imprimirDatos();
    }
    
}
