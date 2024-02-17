import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioExample extends JPanel{

	public RadioExample() {
		JRadioButton maleRdb = new JRadioButton("Masculino"); 
		JRadioButton femaleRdb = new JRadioButton("Femenino");
		
		add(maleRdb);
		add(femaleRdb);
		
		ButtonGroup sexo = new ButtonGroup();
		sexo.add(maleRdb);
		sexo.add(femaleRdb);
	}
}
