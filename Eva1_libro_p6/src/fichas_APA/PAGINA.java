/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichas_APA;

/**
 *
 * @author aleja
 */
public class PAGINA {
    private String namepage;
    private String nameweb;
    private int año;
    private int mes;
    private int dia;
    private String url;
    
    
    
    public String getNamePage(){
        return namepage;
        
    }
    public void setNamePage(String valor){
        namepage = valor;
        
        
    }
    public String getNameWeb(){
        return nameweb;
    }
    public void setNameWeb(String valor){
        nameweb=valor;
    }
    public int getAño(){
        return año;
        
    }
    public void setAño(int valor){
        año=valor;
        
    }
    public int getMes(){
        return mes;
    }
    public void setMes(int valor){
        mes=valor;
    }
    public int getDia(){
        return dia;
        
    }
    public void setDia(int valor){
        dia=valor;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(String valor){
        url=valor;
    }
    public void imprimirReferencias(){
        System.out.println(namepage+","+nameweb+","+año+"/"+mes+"/"+dia+","+url);
    }
}
