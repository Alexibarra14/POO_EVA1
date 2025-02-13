/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIENDA;

/**
 *
 * @author aleja
 */
public class PRODUCTOS {
    private String nombre;
    private String marca;
    private double precio;
    private String clave;
    private int inventario;
    
    
    
    public void setNombre(String valor){
        nombre= valor;
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setmarca(String valor){
        marca= valor;
        
    }
    public String getMarca(){
        return marca;
    }
    public void setClave(String valor){
        clave= valor;
        
    }
    public String getClave(){
        return clave;
    }
    public void setPrecio(double valor){
        precio=valor;
        
        
    }
    public double getPrecio(){
        return precio;
    }
    public void setInventario(int valor){
        inventario=valor;
        
        
    }
    public int getInventario(){
        return inventario;
    }
    public void imprimirDatos(){
        System.out.println("LOS DATOS SON:");
        System.out.println("NOMBRE DEL PRODUCTO: "+nombre);
        System.out.println("MARCA: "+marca);
        System.out.println("$"+precio);
        System.out.println("CLAVE: "+clave);
        System.out.println("INVENTARIO: "+inventario);
        
        
    }
    
    
}
