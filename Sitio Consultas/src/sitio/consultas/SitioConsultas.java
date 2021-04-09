package sitio.de.consultas.voolkia;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Daniel Mariano Ruiz
 */
public class SitioDeConsultasVoolkia {

   
    public static void main(String[] args) {
        
    /* Sitio de consultas masivas realizado sabiendo que hubiese sido mejor 
        crearlo usando una estructura de datos, como hacía cuando cursaaba C++.
        He elegido Java porque estoy aprendiendo desde hace varias semanas y 
        recién estoy viendo todo lo que son los Ciclos.
        Por lo tanto, he tenido que limitarme a pedir datos al usuario
        (o mejor dicho, a insertar los datos correspondientes a cada vendedor).
    
        Por otro lado, sé que había que usar el siguiente link:
        http://developers.mercadolibre.com/. Mi idea a futuro es crear 
        aplicaciones móviles (o web). Sin embargo, para ello debo pasar otras
        instancias, ejemplo: seguir aprendiendo a utilizar el lenguaje Java.

        Gracias :)
    */
    
    Scanner entrada = new Scanner (System.in);
    int seller_id, site_id;    
    int id_publicacion, id_categoria;
    String titulo_publicacion, nombre_de_categoria;
    
    
    JOptionPane.showMessageDialog(null, " Bienvenidos al sector de consultas masivas ");
    
    seller_id = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese su seller_id: "));
    JOptionPane.showMessageDialog(null, " El seller_id ingresado es: " + seller_id);
    
    site_id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su site_id: \n "
            + " 1 - MLA : \n" 
            + " 2 - LIB . \n"
            + " 3 - OTHER. \n"));    
    
    switch (site_id) {
        case 1:     JOptionPane.showMessageDialog(null, " El seller_id ingresado es MLA. ");
                    break;
                    
        case 2:     JOptionPane.showMessageDialog(null, " El seller_id ingresado es LIB. ");
                    break;
                    
        case 3:     JOptionPane.showMessageDialog(null, " El seller_id ingresado es OTHER. ");
                    break;
                    
        default:    JOptionPane.showMessageDialog(null, " Opción no reconocida. \n "
                    + "Por favor, Introduzca otro seller_id. \n ");
                    break;
    }
    
       
    do {
        id_publicacion = Integer.parseInt(JOptionPane.showInputDialog(" El id_publicación es: "));
        
        if (id_publicacion > 0) {
            titulo_publicacion = JOptionPane.showInputDialog("El título de la publicación es: ");  
            id_categoria = Integer.parseInt(JOptionPane.showInputDialog(" El id_categoría es: "));
            nombre_de_categoria = JOptionPane.showInputDialog("Pertenece a la categoría: ");
        } else {
            JOptionPane.showMessageDialog(null, " El vendedor no posee más publicaciones en este sitio. "); 
        }
                     
          
    } while (id_publicacion > 0);
    
    JOptionPane.showMessageDialog(null, " Gracias por su consulta. Vuelva pronto. ");
    
    
        
        
    }
    
}
