import javax.swing.*;

public class ProblemaFormulario extends JFrame{

private JLabel label1,label2, label3;
    
    public static void main(String[] ar) {
        ProblemaFormulario formulario1 = new ProblemaFormulario();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(true);
        formulario1.setVisible(true);
//        formulario1.setExtendedState(JFrame.MAXIMIZED_BOTH);//Pantalla Completa
    }
    
    public ProblemaFormulario() {
        setLayout(null);
        label1=new JLabel("Azul");
        label1.setBounds(10,10,300,30);
        add(label1);
        label2=new JLabel("Verde");
        label2.setBounds(10,30,100,30);
        add(label2);
        label3=new JLabel("Rojo");
        label3.setBounds(10,50,100,30);
        add(label3);
    }
}
