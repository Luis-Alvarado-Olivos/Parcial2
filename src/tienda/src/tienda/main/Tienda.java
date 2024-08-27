
package tienda.main;

import tienda.modelo.Mercado;
import tienda.servicio.InterfazTienda;
import tienda.servicio.Seleccionar;


/**
 *
 * @author luisc
 */

public class Tienda {
   public static void main(String[] args) {
        
       Mercado merca = new Mercado();
       InterfazTienda inter = new InterfazTienda(merca.getItems().toArray(new String[0]));
       Seleccionar cj = new Seleccionar(merca, inter);  
       
       inter.setVisible(true);
    }
    
}
