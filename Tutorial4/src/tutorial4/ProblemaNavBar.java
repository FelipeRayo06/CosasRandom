package tutorial4;

import javax.swing.*;
import java.awt.event.*;

public class ProblemaNavBar extends JFrame implements ActionListener{
	
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1,mi2;
    private JTextField textfield1,textfield2;
    
    public static void main(String[] ar) {
    	ProblemaNavBar formulario1=new ProblemaNavBar();
        formulario1.setBounds(0,0,300,200);
        formulario1.setVisible(true);
    }   
    
    public ProblemaNavBar() {
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Opciones");
        mb.add(menu1);
        mi1=new JMenuItem("Redimensionar ventana");
        menu1.add(mi1);
        mi1.addActionListener(this);
        mi2=new JMenuItem("Salir");
        menu1.add(mi2);
        mi2.addActionListener(this);
        textfield1=new JTextField();
        textfield1.setBounds(10,10,100,30);
        add(textfield1);
        textfield2=new JTextField();
        textfield2.setBounds(10,50,100,30);
        add(textfield2);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mi1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int ancho=Integer.parseInt(cad1);
            int alto=Integer.parseInt(cad2);
            setSize(ancho,alto);
        }
        if (e.getSource()==mi2) {
            System.exit(0);
        }
    }
    
     
}
