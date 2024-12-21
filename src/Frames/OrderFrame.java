package Frames;
import Classes.*;
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

public class OrderFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;

	public OrderFrame(AppController controller) {
		setTitle("ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What do you want to order?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 10, 466, 99);
		contentPane.add(lblNewLabel);
		
		JButton btnFood = new JButton("FOOD");
		btnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showFoodFrame();
			}
		});
		btnFood.setBackground(new Color(192, 192, 192));
		btnFood.setFont(new Font("Arial", Font.BOLD, 20));
		btnFood.setBounds(10, 119, 466, 76);
		contentPane.add(btnFood);
		
		JButton btnDrink = new JButton("DRINK");
		btnDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showDrinkFrame();
			}
		});
		btnDrink.setFont(new Font("Arial", Font.BOLD, 20));
		btnDrink.setBackground(Color.LIGHT_GRAY);
		btnDrink.setBounds(10, 205, 466, 76);
		contentPane.add(btnDrink);
		
		JButton btnSauce = new JButton("SAUCE");
		btnSauce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showSauceFrame();
			}
		});
		btnSauce.setFont(new Font("Arial", Font.BOLD, 20));
		btnSauce.setBackground(Color.LIGHT_GRAY);
		btnSauce.setBounds(10, 291, 466, 76);
		contentPane.add(btnSauce);
		
		JButton btnComplete = new JButton("COMPLETE");
		btnComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showCompleteFrame();
			}
		});
		btnComplete.setFont(new Font("Arial", Font.BOLD, 20));
		btnComplete.setBackground(Color.LIGHT_GRAY);
		btnComplete.setBounds(10, 377, 466, 76);
		contentPane.add(btnComplete);
	}
}
