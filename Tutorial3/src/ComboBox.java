import javax.swing.*;
import java.awt.event.*;

public class ComboBox extends JFrame implements ItemListener{
	
    private JComboBox combo1;
    
    public static void main(String[] ar) {
    	ComboBox formulario1=new ComboBox();
        formulario1.setBounds(0,0,300,150);
        formulario1.setVisible(true);
    } 
    
    public ComboBox() {
        setLayout(null);
        combo1=new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==combo1) {
            String seleccionado=(String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
    }    
}

