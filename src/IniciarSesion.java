import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class IniciarSesion extends JPanel{
	public IniciarSesion() {
		setLayout(null);

setBackground(Color.BLACK);
		
		JLabel titulo = new JLabel("Inicio de sesión");
		titulo.setFont(new Font("Arial", Font.PLAIN, 30));
		titulo.setForeground(Color.WHITE);
		titulo.setBounds(150, 90, 300, 50);
		add(titulo);
		
		JLabel usuarioLbl = new JLabel("Usuario");
		usuarioLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		usuarioLbl.setForeground(Color.WHITE);
		usuarioLbl.setBounds(150, 140, 200, 50);
		add(usuarioLbl);
		
		JTextField usuarioTf = new JTextField();
		usuarioTf.setFont(new Font("Arial", Font.PLAIN, 15));
		usuarioTf.setBounds(150, 180, 200, 30);
		add(usuarioTf);
		
		JLabel contrasenaLbl = new JLabel("Contraseña");
		contrasenaLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		contrasenaLbl.setForeground(Color.WHITE);
		contrasenaLbl.setBounds(150, 230, 200, 50);
		add(contrasenaLbl);
			
		
		JPasswordField contraseñaPf = new JPasswordField();
		contraseñaPf.setFont(new Font("Arial", Font.PLAIN, 15));
		contraseñaPf.setBounds(150, 270, 200, 30);
		add(contraseñaPf);
		
		JButton recordarContrasenaBtn = new JButton("¿Has olvidado tu contraseña?");
		recordarContrasenaBtn.setFont(new Font("Arial", Font.PLAIN, 12));
		recordarContrasenaBtn.setBackground(new Color(0, 0, 0));
		recordarContrasenaBtn.setForeground(Color.WHITE);
		recordarContrasenaBtn.setBorderPainted(false);
		recordarContrasenaBtn.setBounds(150, 310, 200, 15);
		add(recordarContrasenaBtn);
		
		JButton aceptarBtn = new JButton("Iniciar sesion");
		aceptarBtn.setFont(new Font("Arial", Font.PLAIN, 12));
		aceptarBtn.setBackground(new Color(66, 2, 157));
		aceptarBtn.setForeground(Color.WHITE);
		aceptarBtn.setBorderPainted(false);
		aceptarBtn.setBounds(150, 350, 200, 40);
		add(aceptarBtn);
		
	}
}
