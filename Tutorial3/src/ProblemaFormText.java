import javax.swing.*;
import java.awt.event.*;

public class ProblemaFormText extends JFrame implements ActionListener {
	
	private JTextField textfield1,textfield2;
	private JLabel label1, label2;
    private JButton boton1;
    
    public static void main(String[] ar) {
    	ProblemaFormText formulario1=new ProblemaFormText();
        formulario1.setBounds(0,0,400,250);
        formulario1.setVisible(true);
    }
    
    public ProblemaFormText() {
        setLayout(null);
        label1=new JLabel("Ingrese su Usuario ");
        label1.setBounds(10,10,120,30);
        add(label1);
        textfield1=new JTextField();
        textfield1.setBounds(10,40,100,30);
        add(textfield1);
        label2=new JLabel("Ingrese su Contraseña ");
        label2.setBounds(10,80,150,30);
        add(label2);
        textfield2=new JPasswordField();
        textfield2.setBounds(10,110,100,30);
        add(textfield2);
        boton1=new JButton("Login");
        boton1.setBounds(10,150,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            if (cad1.equals("juan") & cad2.equals("abc123")) {
            	setTitle("Correcto");
            }else {
            	setTitle("Incorrecto");
            }       
        }
    }
}
