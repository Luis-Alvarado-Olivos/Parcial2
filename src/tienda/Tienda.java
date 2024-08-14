
package tienda;

/**
 *
 * @author luisc
 */

public class Tienda {
   public static void main(String[] args) {
        
       Mercado merca = new Mercado();
       InterfazTienda inter = new InterfazTienda(merca.getItems().toArray(new String[0]));
       Caja cj = new Caja(merca, inter);  
       
       inter.setVisible(true);
    }
    
}
