
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MyFrame extends JFrame{
	public MyFrame() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		
		setTitle("Registro");
		setBounds(screenWidth / 2, screenHeight / 2, 500, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		JTabbedPane compExample= new JTabbedPane();
		Registro registro = new Registro();
		IniciarSesion iniciarSesion = new IniciarSesion();
		RestaurarContrasena restaurarContrasena = new RestaurarContrasena();
		Menu menu = new Menu();
		
		JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
        
        JMenu menu1=new JMenu("OPTIONS");
        mb.add(menu1);
        
        JMenu mi1 = new JMenu("Archivo");
        menu1.add(mi1);
        JMenuItem mi2 = new JMenu("Ayuda");
        menu1.add(mi2);
        
        JMenuItem mi3 = new JMenuItem("Ayuda");
        mi2.add(mi3);
        JMenuItem mi4 =new JMenuItem("Salir");
        mi1.add(mi4);
		
		compExample.addTab("Registro", registro);
		compExample.addTab("Iniciar sesion", iniciarSesion);
		compExample.addTab("Restaurar contraseña", restaurarContrasena);
		compExample.addTab("Menu", menu);
		

		
		add(compExample);
	}
}