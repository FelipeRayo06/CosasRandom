import javax.swing.*;

public class Formulario extends JFrame {
	
    private JLabel label1,label2;
    
    public static void main(String[] ar) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(true);
        formulario1.setVisible(true);
//        formulario1.setExtendedState(JFrame.MAXIMIZED_BOTH);//Pantalla Completa
    }
    
    public Formulario() {
        setLayout(null);
        label1=new JLabel("Sistema de Facturación.");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2=new JLabel("Vesion 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
    }
    
   
}


