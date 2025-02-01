/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1_poo;

/**
 *
 * @author brend
 */
public class P1_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UN OBJETO
        //INSTANCIAR
        //Identificador para guardadr la direccion en memoria
        //Variable
        Persona perso1;// DECLARAMOS UNA VARIABLE DE TIPO PERSONA
        //Asignamos memoria
        perso1= new Persona();//Creamos un objeto de tipo Persona
        perso1.edad=10;
        perso1.genero="m";
        perso1.nombre="Alejandro";
        perso1.imprirDatos();
        System.out.println(perso1);
        //JAVA:
        //NO ACCEDEMOS A DIRECCIONES REALES DE MEMORIA (RAM)
        //A LAS DIRECCIONES DE MEMORIA (FALSAS) SE LES LLAMA
        //Referencias
    }
    
}
class Persona{
    //DATOS- ESTADO- ATRIBUTOS
    String nombre;
    int edad;
    String genero;
    //COMPORTAMIENTO
   void imprirDatos(){
       System.out.println("Nombre: "+ nombre);
       System.out.println("Edad: "+ edad);
       System.out.println("genero: "+ genero);
   }
}