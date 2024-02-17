import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ComboBoxExample extends JPanel{
	public ComboBoxExample(){
		String [] frutaStrings = {"Manzana", "Naranja","Pera", "Uva"};
		
		JComboBox<String> listaFrutasBox = new JComboBox<String>(frutaStrings);
		listaFrutasBox.setSelectedIndex(0);
		add(listaFrutasBox);
		
	}
}
