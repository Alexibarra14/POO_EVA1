/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIENDA;

/**
 *
 * @author aleja
 */
public class CLIENTES {
    private String nombre;
    private String apellido;
    private String rfc;
    private String tp;
    private int edad;
    private int numero;
    
    
  public void setNombre(String valor){
      nombre= valor;
  }
  public String getNombre(){
      return nombre;
  }
  public void setApellido(String valor){
      apellido= valor;
  }
  public String getApellido(){
      return apellido;
  }
  public void setRfc(String valor){
      rfc= valor;
  }
  public String getRfc(){
      return rfc;
  }
  public void setTP(String valor){
      tp= valor;
  }
  public String getTp(){
      return tp;
  }
  public void setEdad(int valor){
      edad= valor;
  }
  public int getEdad(){
      return edad;
  }
  public void setNumero(int valor){
      numero= valor;
  }
  public int getNumero(){
      return numero;
  }
  public void imprimirDatos(){
      System.out.println("LOS DATOS DEL CLIENTE SON:");
      System.out.println("NOMBRE: "+ nombre);
      System.out.println("APELLIDO: "+ apellido);
      System.out.println("RFC: "+ rfc);
      System.out.println("TIPO DE PERSONA: "+ tp);
      System.out.println("EDAD: "+ edad);
      System.out.println("NUMERO: "+ numero);
      
  }
}
