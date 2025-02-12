/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichas_APA;

/**
 *
 * @author aleja
 */
public class LIBRO {
    private String autor;
    private String titulo;
    private int año;
    private String editorial;
    private String ciudad;
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String valor){
        autor= valor;
        
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String valor){
        titulo=valor;
    }
    public int getAño(){
        return año;
    }
    public void setAño(int valor){
        año= valor;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String valor){
        editorial= valor;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String valor){
        ciudad= valor;
    }
    public void imprimirReferencias(){
        System.out.println(""+ autor+" ("+año+"). "+titulo+","+ciudad+","+editorial);
    }
    
}
