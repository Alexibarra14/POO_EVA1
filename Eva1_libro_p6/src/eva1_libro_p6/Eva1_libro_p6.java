/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_libro_p6;

import fichas_APA.LIBRO;
import fichas_APA.PAGINA;

/**
 *
 * @author aleja
 */
public class Eva1_libro_p6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LIBRO libro= new LIBRO();
        libro.setAutor("Leonardo da vinci");
        libro.setAño(2005);
        libro.setTitulo("Gran Lobo Salvaje");
        libro.setCiudad("Chihuahua");
        libro.setEditorial("Biblioteca nacional");
        libro.imprimirReferencias();
        PAGINA pagina= new PAGINA();
        pagina.setNamePage("agroinspector");
        pagina.setNameWeb("agroinspector.com");
        pagina.setAño(2022);
        pagina.setMes(07);
        pagina.setDia(17);
        pagina.setUrl("https://agroinspector.com/que-es-la-agricultura-sustentable/");
        pagina.imprimirReferencias();
        
    }
    
    
    
    
}
