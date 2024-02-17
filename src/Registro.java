import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registro extends JPanel{
	public Registro() {
setLayout(null);
		
		setBackground(Color.BLACK);
		
		JLabel titulo = new JLabel("Nuevo Usuario");
		titulo.setFont(new Font("Arial", Font.PLAIN, 30));
		titulo.setForeground(Color.WHITE);
		titulo.setBounds(150, 90, 200, 50);
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
		
		JLabel CorreoLbl = new JLabel("Correo");
		CorreoLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		CorreoLbl.setForeground(Color.WHITE);
		CorreoLbl.setBounds(150, 230, 200, 50);
		add(CorreoLbl);
		
		JTextField CorreoTf = new JTextField();
		CorreoTf.setFont(new Font("Arial", Font.PLAIN, 15));
		CorreoTf.setBounds(150, 270, 200, 30);
		add(CorreoTf);
		
		JLabel ContrasenaLbl = new JLabel("Contraseña");
		ContrasenaLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		ContrasenaLbl.setForeground(Color.WHITE);
		ContrasenaLbl.setBounds(150, 320, 200, 50);
		add(ContrasenaLbl);
		
		JPasswordField ContraseñaPf = new JPasswordField();
		ContraseñaPf.setFont(new Font("Arial", Font.PLAIN, 15));
		ContraseñaPf.setBounds(150, 360, 200, 30);
		add(ContraseñaPf);
		
		JCheckBox cb = new JCheckBox("Acepto términos y condiciones");
		cb.setBounds(150, 410, 200, 30);
		cb.setBackground(Color.BLACK);
		cb.setForeground(Color.WHITE);
		add(cb);
		
		JButton cancelarBtn = new JButton("Cancelar");
		cancelarBtn.setFont(new Font("Arial", Font.PLAIN, 12));
		cancelarBtn.setBackground(Color.GRAY);
		cancelarBtn.setForeground(Color.WHITE);
		cancelarBtn.setBorderPainted(false);
		cancelarBtn.setBounds(150, 460,90, 40);
		add(cancelarBtn);
		
		JButton aceptarBtn = new JButton("Aceptar");
		aceptarBtn.setFont(new Font("Arial", Font.PLAIN, 12));
		aceptarBtn.setBackground(new Color(66, 2, 157));
		aceptarBtn.setForeground(Color.WHITE);
		aceptarBtn.setBorderPainted(false);
		aceptarBtn.setBounds(255, 460,90, 40);
		add(aceptarBtn);
	}
}
