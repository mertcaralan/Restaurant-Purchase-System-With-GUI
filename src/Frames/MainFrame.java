package Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;

	public MainFrame(AppController controller) {
		this.controller = controller;
		setTitle("WELCOME");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 10, 466, 99);
		contentPane.add(lblNewLabel);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showRegistrationFrame();
			}
		});
		btnRegister.setBackground(new Color(192, 192, 192));
		btnRegister.setFont(new Font("Arial", Font.BOLD, 30));
		btnRegister.setBounds(10, 119, 466, 76);
		contentPane.add(btnRegister);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showLoginFrame();
			}
		});
		btnLogin.setFont(new Font("Arial", Font.BOLD, 30));
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setBounds(10, 205, 466, 76);
		contentPane.add(btnLogin);
	}
}