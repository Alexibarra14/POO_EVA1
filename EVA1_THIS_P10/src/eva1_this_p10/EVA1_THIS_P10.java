/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_this_p10;

/**
 *
 * @author aleja
 */
public class EVA1_THIS_P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PERSONA perso=new PERSONA("JUAN", "IBARRA", 5);
        
        LAPTOP lap=new LAPTOP();
        lap.imprimirDatos();
        
        LAPTOP laptop=new LAPTOP("RYZEN 5", "1TB", 555, "35 PULGADAS", "HP", "ASUS");
        laptop.imprimirDatos();
    }
    
}
