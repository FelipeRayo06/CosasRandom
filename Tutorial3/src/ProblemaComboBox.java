import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProblemaComboBox extends JFrame implements ActionListener{
	
    private JLabel label1, label2;
    private JTextField textfield1;
    private JComboBox combo1;
    private JButton boton1;
    
    public static void main(String[] ar) {
    	ProblemaComboBox formulario1=new ProblemaComboBox();
        formulario1.setBounds(0,0,300,250);
        formulario1.setVisible(true);
    } 
    
    public ProblemaComboBox() {
        setLayout(null);
        label1=new JLabel("Nombre: ");
        label1.setBounds(10,10,100,30);
        add(label1);
        textfield1=new JTextField();
        textfield1.setBounds(100,10,150,20);
        add(textfield1);
        label2=new JLabel("Pais:");
        label2.setBounds(10,40,100,30);
        add(label2);
        combo1=new JComboBox();
        combo1.setBounds(100,40,100,30);
        add(combo1);
        combo1.addItem("--Seleccione un pais--");
        combo1.addItem("Colombia");
        combo1.addItem("Mexico");
        combo1.addItem("Argentina");
        combo1.addItem("Brasil");
        combo1.addItem("USA");
       
        boton1=new JButton("Aceptar");
        boton1.setBounds(10,130,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
        	String cad1=textfield1.getText();
            String cad2=(String)combo1.getSelectedItem();     
            setTitle(cad1 + " " + cad2);
        }
    }       
}

