package views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class LoginView extends JPanel {
	private JPasswordField password_txtField;
	private JTextField username_txtField;
	JButton btnNewButton;

	public LoginView() {
		setLayout(null);
		
		password_txtField = new JPasswordField();
		password_txtField.setBounds(179, 155, 122, 27);
		add(password_txtField);
		password_txtField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(97, 106, 62, 27);
		add(lblNewLabel);
		
		username_txtField = new JTextField();
		username_txtField.setColumns(10);
		username_txtField.setBounds(179, 106, 122, 27);
		add(username_txtField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(97, 155, 62, 27);
		add(lblPassword);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setBounds(183, 210, 89, 23);
		add(btnNewButton);

	}
	public void addEventListenerToSubmitButton(ActionListener listener){
		btnNewButton.addActionListener(listener);
	}
	public String getUsername(){
		return username_txtField.getText();
	}
	public String getPassword(){
		return String.valueOf(password_txtField.getPassword());
	}
}
