
package tienda.servicio;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tienda.modelo.Mercado;

/**
 *
 * @author luisc
 */
public class Seleccionar  {
    private final Mercado merca;
    private final InterfazTienda inter;

    public Seleccionar (Mercado merca, InterfazTienda inter) {
        this.merca = merca;
        this.inter = inter;

        this.inter.addConfirmListener(new ConfirmListener());
    }
        class ConfirmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String selectedItem = inter.getSelectedItem();
                int confirmation = JOptionPane.showConfirmDialog(inter, "¿Desea confirmar la selección: " + selectedItem + "?");
                if (confirmation == JOptionPane.YES_OPTION) {
                    inter.showMessage("Compra " + selectedItem + " confirmado.");
                }
            } catch (HeadlessException ex) {
                JOptionPane.showMessageDialog(inter, "Ocurrió un error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
