package Frames;
import Classes.*;
import Main.OrderSys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PurchaseFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;

	public PurchaseFrame(AppController controller) {
		this.controller = controller;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoYouWant = new JLabel("Do you want to continue purchasing?");
		lblDoYouWant.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouWant.setFont(new Font("Arial", Font.BOLD, 30));
		lblDoYouWant.setBounds(10, 10, 777, 99);
		contentPane.add(lblDoYouWant);
		
		JButton btnYes = new JButton("YES");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showOrderFrame();
			}
		});
		btnYes.setFont(new Font("Arial", Font.BOLD, 20));
		btnYes.setBackground(Color.LIGHT_GRAY);
		btnYes.setBounds(10, 119, 384, 76);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("NO");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showCompleteFrame();
			}
		});
		btnNo.setFont(new Font("Arial", Font.BOLD, 20));
		btnNo.setBackground(Color.LIGHT_GRAY);
		btnNo.setBounds(403, 119, 384, 76);
		contentPane.add(btnNo);
	}
}
