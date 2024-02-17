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
		ComboBoxExample comboBoxExample = new ComboBoxExample();
		SliderExample sliderExample = new SliderExample();
		RadioExample radioExample = new RadioExample();
		
		
		compExample.addTab("Registro", registro);
		compExample.addTab("ComboBox", comboBoxExample);
		compExample.addTab("RadioButton", radioExample);
		compExample.addTab("Slider", sliderExample);
		
		add(compExample);
	}
}