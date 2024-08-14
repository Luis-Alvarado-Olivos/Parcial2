package tienda;

/**
 *
 * @author luisc
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionListener;

class InterfazTienda extends JFrame {
    
    private final JComboBox<String> itemComboBox;
    private final JButton confirmButton;
    
    
    public InterfazTienda(String[] items) {
        setTitle("MI TIENDA POO");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        getContentPane().setBackground(Color.CYAN);
       
        JLabel label = new JLabel("Escoje algo:");
        label.setBounds(50, 30, 150, 20);
        add(label);

        itemComboBox = new JComboBox<>(items);
        itemComboBox.setBounds(50, 60, 200, 30);
        itemComboBox.setBackground(Color.cyan); 
        itemComboBox.setForeground(Color.BLACK); 
        add(itemComboBox);

        confirmButton = new JButton("Confirmar");
        confirmButton.setBounds(50, 100, 200, 30);
        confirmButton.setBackground(Color.yellow);
        confirmButton.setForeground(Color.black);
        add(confirmButton);
    }
    public void addConfirmListener(ActionListener listener) {
        confirmButton.addActionListener(listener);
    }
    public String getSelectedItem() {
        return (String) itemComboBox.getSelectedItem();
    }
        public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
