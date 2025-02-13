/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_producto_p7;

import TIENDA.CLIENTES;
import TIENDA.PRODUCTOS;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class EVA1_PRODUCTO_P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
    
    PRODUCTOS producto= new PRODUCTOS();
    producto.setNombre("CHETOS");
    producto.setmarca("BARCEL");
    producto.setClave("45CB");
    producto.setPrecio(15);
    producto.setInventario(45);
    producto.imprimirDatos();
    
    
    Scanner cap= new Scanner(System.in);
    String perso;
    CLIENTES cliente= new CLIENTES();
    cliente.setNombre("ALEJANDRO");
    cliente.setApellido("IBARRA");
    cliente.setEdad(24);
    cliente.setRfc("4d4dfd4");
    System.out.println("INGRESA QUE TIPO DE PERSONA ERES SI FISICA O MORAL");
    perso=cap.nextLine();
    cliente.setTP(perso);
    cliente.setNumero(614265589);
    cliente.imprimirDatos();
    }
    
}
