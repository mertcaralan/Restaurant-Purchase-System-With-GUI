package Frames;
import Classes.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class FoodFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;
	
	public FoodFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("FOOD ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FOOD ORDER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 10, 466, 99);
		contentPane.add(lblNewLabel);
		
		JButton btnBurger = new JButton("BURGER");
		btnBurger.setBackground(new Color(192, 192, 192));
		btnBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showBurgerFrame();
			}
		});
		btnBurger.setFont(new Font("Arial", Font.BOLD, 20));
		btnBurger.setBounds(10, 119, 466, 76);
		contentPane.add(btnBurger);
		
		JButton btnWrap = new JButton("WRAP");
		btnWrap.setBackground(new Color(192, 192, 192));
		btnWrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showWrapFrame();
			}
		});
		btnWrap.setFont(new Font("Arial", Font.BOLD, 20));
		btnWrap.setBounds(10, 205, 466, 76);
		contentPane.add(btnWrap);
		
		JButton btnSnack = new JButton("SNACK");
		btnSnack.setBackground(new Color(192, 192, 192));
		btnSnack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showSnackFrame();
			}
		});
		btnSnack.setFont(new Font("Arial", Font.BOLD, 20));
		btnSnack.setBounds(10, 291, 466, 76);
		contentPane.add(btnSnack);
		
		JButton btnDessert = new JButton("DESSERT");
		btnDessert.setBackground(new Color(192, 192, 192));
		btnDessert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showDessertFrame();
			}
		});
		btnDessert.setFont(new Font("Arial", Font.BOLD, 20));
		btnDessert.setBounds(10, 377, 466, 76);
		contentPane.add(btnDessert);
	}

}
