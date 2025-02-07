/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_modifica_p4;

/**
 *
 * @author brend
 */
public class VEHICULO {
    //ATRIBUTOS - PRIVADOS
   private String marca;
   private String modelo;
   private double precio;
   private int año;
   private String color;
   //CONSTRUCTORES - METODOS
   //METODOS- COMPORTAMIENTO
   //GET Y SET
   public String getMarca(){
       return marca;
   }
   public void setMarca(String valor){
       marca= valor;
       
   }
   public String getModelo(){
       return modelo;
   }
   public void setModelo(String valor){
       modelo = valor;
   }
   public double getPrecio(){
       return precio;
   }
   public void setPrecio(double valor){
       precio= valor;
   }
   public int getAño(){
       return año;
       
   }
   public void setAño(int valor){
       año=valor;
   }
   public String getColor(){
       return color;
       
   }
   public void setColor(String valor){
   color= valor;
   }

}
