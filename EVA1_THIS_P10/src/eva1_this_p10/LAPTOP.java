/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_this_p10;

/**
 *
 * @author aleja
 */
public class LAPTOP {
    private  String procesador;
    private  String  memoria;
    private int discoduro;
    private String pantalla;
    private String marca;
    private String modelo;
    
    
    
    
    public LAPTOP(){
        this.procesador="DATOS NO INGRESADOS";
        this.memoria="DATOS NO INGRESADOS";
        this.marca="SIN MARCA";
        this.pantalla="DATOS NO INGRESADOS";
        this.discoduro=0;
        this.modelo="DATOS NO INGRESADOS";
        
    }
    public LAPTOP(String procesador, String memoria, int discoduro, String pantalla, String marca, String modelo){
        this.procesador=procesador;
        this.memoria=memoria;
        this.discoduro=discoduro;
        this.pantalla=pantalla;
        this.marca=marca;
        this.modelo=modelo;
        
    }
    public void setProcesador(String procesador){
        this.procesador=procesador;
        
    }
    public String getProcesador(){
        return this.procesador;
        
    }
    public void setMemoria(String memoria){
        this.memoria=memoria;
        
    }
    public String getMemoria(){
        return this.memoria;
        
    }
    public void setDiscoDuro(int dicoduro){
        this.discoduro=discoduro;
        
    }
    public int getDiscoDuro(){
        return this.discoduro;
        
    }
    public void setPantalla(String pantalla){
        this.pantalla=pantalla;
        
    }
    public String getPantalla(){
        return this.pantalla;
        
    }
    public void setMarca(String marca){
        this.marca=marca;
        
    }
    public String getMarca(){
        return this.marca;
        
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
        
    }
    public String getModelo(){
        return this.modelo;
        
    }
    public void imprimirDatos(){
         System.out.println("El procesador es: "+this.procesador);
         System.out.println("La memoria es de : "+this.memoria);
         System.out.println("El Disco duro es de: "+this.discoduro+"GB");
         System.out.println("La pantalla es: "+this.pantalla);
         System.out.println("La marca es:  "+this.marca);
         System.out.println("El modelo es: "+this.modelo);
    }
}
