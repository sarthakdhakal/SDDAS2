package controlller;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import views.LoginView;

public class NorthamptonVehicleHireCompany extends JFrame {

	private JPanel contentPane;
	LoginView loginView = new LoginView();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NorthamptonVehicleHireCompany frame = new NorthamptonVehicleHireCompany();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public NorthamptonVehicleHireCompany() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(loginView);
		loginView.addEventListenerToSubmitButton(new LoginButtonClicked());
	}
x
	private class LoginButtonClicked implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String username = loginView.getUsername();
			String password = loginView.getPassword();
			System.out.println(username);
			System.out.println(password);
//			getContentPane().removeAll();
//			setContentPane();
//			revalidate();
		}
	}
}
