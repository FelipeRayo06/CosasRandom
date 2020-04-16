import javax.swing.*;

public class TextArea extends JFrame {
	
	private JTextField textfield1;
	private JScrollPane scrollpane1;
    private JTextArea textarea1;
    
    public static void main(String[] ar) {
        TextArea formulario1=new TextArea();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
    }  
    
    public TextArea() {
        setLayout(null);
        textfield1=new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        textarea1=new JTextArea();        
        scrollpane1=new JScrollPane(textarea1);    
        scrollpane1.setBounds(10,50,400,300);
        add(scrollpane1);
        
    }
}
