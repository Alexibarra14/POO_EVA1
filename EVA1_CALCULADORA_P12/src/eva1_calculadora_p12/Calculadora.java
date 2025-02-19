/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_calculadora_p12;

/**
 *
 * @author aleja
 */
public class Calculadora {
    private Calculadora(){}
    
    
    public static int sumar(int n1, int n2){
        int resu;
       resu=n1+n2;
       return resu;
    }
    public static int restar(int n1, int n2){
        int resu;
        resu=n1-n2;
        return resu;
        
       
    }
    public static int multiplicar(int n1, int n2){
        int resu;
        resu=n1*n2;
        return resu;
        
    }
    public static double dividir(int n1,int n2){
        double resu;
        resu=n1/n2;
        return resu;
        
    }
    public static int potencia(int b,int e){
    int resu=1;
       for (int i=0; i < e; i++) {
        resu*=b;
        }  return resu;
    }
    
    
}
