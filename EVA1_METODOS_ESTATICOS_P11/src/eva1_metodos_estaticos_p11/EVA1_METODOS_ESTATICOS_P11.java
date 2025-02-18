/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_metodos_estaticos_p11;

/**
 *
 * @author aleja
 */
public class EVA1_METODOS_ESTATICOS_P11 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Math es una clase que proporciona funciones matematicas
        double valorAleatorio=Math.random();
        int valor= (int) (valorAleatorio*1000);
        System.out.println(valorAleatorio);
        System.out.println(valor);
        
       // Math math=new Math();
       // Persona perso= new Persona();
       // perso.mostrarMensaje();
        //USAR FORMULAS DE TEMPERATURA
     //   Temperaturas tempe=new Temperaturas();
      
        System.out.println(Temperaturas.convertirFaC(100));
        System.out.println(Temperaturas.convertirCaF(100));
        System.out.println(Temperaturas.convertirCak(100));
        System.out.println(Temperaturas.convertirKac(100));
        System.out.println(Temperaturas.convertirKac(100));
        System.out.println(Temperaturas.convertirFak(100));
        System.out.println(Temperaturas.convertirKaf(100));
        
        
        
    }
        class Persona{
        int valor;
        public void mostrarMensaje(){
            System.out.println("HOLA MUNDO");
        }
    }
    
}
