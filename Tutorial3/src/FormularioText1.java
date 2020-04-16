import javax.swing.*;
import java.awt.event.*;

public class FormularioText1 extends JFrame implements ActionListener{
	
	private JTextField textfield1,textfield2;
	private JLabel label1, label2;
    private JButton boton1;
    
    public static void main(String[] ar) {
        FormularioText1 formulario1=new FormularioText1();
        formulario1.setBounds(0,10,260,300);
        formulario1.setVisible(true);
        formulario1.setTitle("Suma");
    }
    
    public FormularioText1() {
        setLayout(null);
        label1=new JLabel("Ingrese un Número ");
        label1.setBounds(30,10,120,30);
        add(label1);
        textfield1=new JTextField();
        textfield1.setBounds(30,40,100,30);
        add(textfield1);
        label2=new JLabel("Ingrese un Número ");
        label2.setBounds(30,70,120,30);
        add(label2);
        textfield2=new JTextField();
        textfield2.setBounds(30,100,100,30);
        add(textfield2);
        boton1=new JButton("Sumar");
        boton1.setBounds(30,140,100,30);
        add(boton1);
        boton1.addActionListener(this);
//        label3=new JLabel("Resultado ");
//        label3.setBounds(30,170,100,30);
//        add(label3);
//        textfield3=new JTextField();
//        textfield3.setBounds(30,200,100,30);
//        add(textfield3);       
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int suma=x1+x2;
            String total=String.valueOf(suma);
            setTitle(total);
        }
    }
}
