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
            
        }else
            encendido=true;
}     
    public void subirVolumen(){
        if(volumen<100 && encendido==true)
          if(volumen<100)
          volumen +=1;//ACUMULADOR
    }
    public void bajarVolumen(){
        
        if(volumen>0 && encendido==true)
         volumen-=1;
    }
    public void imprimirDatos(){
        if(encendido== true)
            System.out.println("TV ENCENDIDA");
        else 
            System.out.println("TV APAGADA");
       
        System.out.println("volumen"+volumen);
        System.out.println("canal:"+canal);
        
    }
    public void subirCanal(){
              if(encendido== true){
              if (canal==10)
                  canal=0;
              else
                  canal+=1;
              
              
              }
}                
    public void bajarCanar(){
              if(encendido== true)
                  if(canal==0)
                      canal=10;
              else
                  canal-=1;
    }
    public void setCanal(int valor){
        canal=valor;
    }
}
