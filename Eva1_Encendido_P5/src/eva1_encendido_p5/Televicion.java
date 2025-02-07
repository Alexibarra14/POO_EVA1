/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_encendido_p5;

/**
 *
 * @author brend
 */
public class Televicion {
    private boolean encendido;
    private int volumen;
    private int canal;
    public void encendidoApagar(){
        if(encendido==true){
            encendido = false;
        }
}     
    public void subirVolumen(){
        volumen +=1;//ACUMULADOR
        if(volumen>100)
            System.out.println("sobrepasaste el limite");
    }
    public void bajarVolumen(){
        volumen-=1;
        if(volumen<0)
            System.out.println("limite alcanzado");
    }
    public void imprimirDatos(){
        if(encendido== true)
            System.out.println("TV ENCENDIDA");
        else 
            System.out.println("TV APAGADA");
       
        System.out.println("volumen"+volumen);
        
    }
}
System.out.println("Año" + carro.getAño());
       System.out.println("COLOR" + carro.getColor());
       System.out.println("MARCA" + carro.getMarca());
       System.out.println("MODELO" + carro.getModelo());
       System.out.println("PRECIO" + carro.getPrecio());