import javax.swing.*;

import java.awt.event.*;

public class ProblemaFormBotones extends JFrame implements ActionListener{
	
    private JButton boton1,boton2;
    
    public static void main(String[] args){
    	ProblemaFormBotones formulario1 = new ProblemaFormBotones();
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
    }
    
    public ProblemaFormBotones() {
        setLayout(null);
        boton1=new JButton("Varón");
        boton1.setBounds(50,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("Mujer");
        boton2.setBounds(160,100,90,30);
        add(boton2);
        boton2.addActionListener(this);        	
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            setTitle("Varón");
        }
        if (e.getSource()==boton2) {
            setTitle("Mujer");
        }             
    }
    
   
}
