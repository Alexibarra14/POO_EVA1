/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_modifica_p4;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_MODIFICA_P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cap= new Scanner(System.in);
        VEHICULO carro= new VEHICULO();
        System.out.println("Ingressa el año del auto:");
        int año= cap.nextInt();
        cap.nextLine();
        carro.setAño(año);
        System.out.println("INGRESA EL COLOR DEL AUTO:");
        String color= cap.nextLine();
        carro.setColor(color);
        System.out.println("INGRESA LA MARCA DE EL AUTO");
        String marca=cap.nextLine();
        carro.setMarca(marca);
        System.out.println("INGRESA EL PRECIO DE EL AUTO");
        double precio =cap.nextDouble();
        cap.nextInt();
        carro.setPrecio(precio);
        System.out.println("INGRESA EL MODELO DE EL AUTO");
        String modelo= cap.nextLine();
        carro.setModelo(modelo);
    System.out.println("Año :" + carro.getAño());
       System.out.println("COLOR :" + carro.getColor());
       System.out.println("MARCA :" + carro.getMarca());
       System.out.println("MODELO :" + carro.getModelo());
       System.out.println("PRECIO :" + carro.getPrecio());
                 
    }
    
}
