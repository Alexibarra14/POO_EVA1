/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_constructores_p8;

/**
 *
 * @author aleja
 */
public class VEHICULO {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;
          //constructores
    //metodos: no tienen valor de retorno
    //modificador de acceso, nombre de la clase,(Lista de parametros)
    //constructor default: Contructor sin parametros
    public VEHICULO(){
        System.out.println("CREANDO OBJETO");
        marca="SIN MARCA";
        modelo="SIN MODELO";
        año=0;
        color="SIN COLOR";
        precio=0;
    }
    public VEHICULO(String mar, String mod, int y,String col,double pre){
        marca=mar;
        modelo=mod;
        año=y;
        color=col;
        precio=pre;
    }

    
  
    public void imprimirDatos(){
        System.out.println("LA MARCA ES:"+marca);
        System.out.println("EL MODELO ES: "+modelo);
        System.out.println("EL AÑO ES :"+año);
        System.out.println("EL COLOR ES :"+color);
        System.out.println("EL PRECIO ES :"+precio);
    }
    
}
