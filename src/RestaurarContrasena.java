
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RestaurarContrasena extends JPanel{
	public RestaurarContrasena() {
		setLayout(null);

		setBackground(Color.BLACK);
		
		JLabel titulo = new JLabel("¿Olvidaste tu contraseña?");
		titulo.setFont(new Font("Arial", Font.PLAIN, 30));
		titulo.setForeground(Color.WHITE);
		titulo.setBounds(70, 90, 400, 50);
		add(titulo);

		JLabel correoLbl = new JLabel("Correo Electrónico");
		correoLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		correoLbl.setForeground(Color.WHITE);
		correoLbl.setBounds(150, 140, 200, 50);
		add(correoLbl);
		
		JTextField correoLTf = new JTextField();
		correoLTf.setFont(new Font("Arial", Font.PLAIN, 15));
		correoLTf.setBounds(150, 180, 200, 30);
		add(correoLTf);
		
		JButton aceptarBtn = new JButton("Restaurar");
		aceptarBtn.setFont(new Font("Arial", Font.PLAIN, 12));
		aceptarBtn.setBackground(new Color(66, 2, 157));
		aceptarBtn.setForeground(Color.WHITE);
		aceptarBtn.setBorderPainted(false);
		aceptarBtn.setBounds(150, 230, 200, 40);
		add(aceptarBtn);
		
		JButton recordarContrasenaBtn = new JButton("Regresar al login");
		recordarContrasenaBtn.setFont(new Font("Arial", Font.PLAIN, 12));
		recordarContrasenaBtn.setBackground(new Color(0, 0, 0));
		recordarContrasenaBtn.setForeground(Color.WHITE);
		recordarContrasenaBtn.setBorderPainted(false);
		recordarContrasenaBtn.setBounds(150, 290, 200, 15);
		add(recordarContrasenaBtn);
	}
}
