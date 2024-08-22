package tienda.Views;

/**
 *
 * @author luisc
 */
import java.util.ArrayList;
import java.util.List;

class Mercado {
    private final List<String> items;

    public Mercado() {
        items = new ArrayList<>();
        
        items.add("Manzana");
        items.add("Pera");
        items.add("Banano");
        items.add("Sandia");
        items.add("Naranja");
        items.add("Mandarina");
        items.add("Uvas");
        items.add("Papaya");
        items.add("Mango");
        items.add("Mamones");
        items.add("Melon");
        items.add("Tomate");
        items.add("Cebolla");
        items.add("Perejil");
        items.add("Platano");
        items.add("Papa");
        items.add("Ajo");
        items.add("Zanahoria");
        items.add("Pimenton");
        items.add("Cilantro");
    
}
        public List<String> getItems() {
        return items;
    }
}