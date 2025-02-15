/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_this_p10;

/**
 *
 * @author aleja
 */
public class PERSONA {
    private String nombre;
    private String apellido;
    private int edad;
    
    
    
    
    public PERSONA(){
        nombre= "SIN NOMBRE";
        apellido= "Sin apellido";
        edad= 0;
        
    }
    public PERSONA(String nombre, String apellido, int edad){
       this.nombre=nombre;
       this.apellido= apellido;
      this.edad=edad;
     
    }
          public void setNombre(String nombre){
           this.nombre=nombre;
          }
          
          public String getNombre(){
              return this.nombre;
          }
          public void setApellido(String apellido){
              this.apellido=apellido;
          }
          public String getApellido(){
              return this.apellido;
              
          }
          public void setEdad(int edad){
              this.edad=edad;
          }
          public int getEdad(){
              return this.edad;
          }
          
          //THIS--> ESTE OBJETO/ ESTA CLASE
          //LES DA ACCESO A TODO EL CONTENIDO DEL OBJETO/CLASE ACTUAL
          
}
