/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_dobrecarga_metodos_p13;

/**
 *
 * @author aleja
 */
public class EVA1_DOBRECARGA_METODOS_P13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HOlA MUNDO");
        System.out.println(5);
        System.out.println(50.5);
        System.out.println(3>5);
        System.out.println(new EVA1_DOBRECARGA_METODOS_P13() );
        System.out.println(sumar(1,2));
        System.out.println(sumar("hola","mundo"));
        sumar();
        
    }
    
    //encabecado del metodo
                       //firma
    public static int sumar(int v1,int v2){//sumar(int,int)
      //implementacion
        int resu;
        resu=v1+v2;
        return resu;
        
    }
    public static String sumar(String v1,String v2){//sumar(String, String)
        String resu;
        resu=v1+v2;
        return resu;
        
    }
    public static void sumar(){
        System.out.println("No hace nada");
    }
}
