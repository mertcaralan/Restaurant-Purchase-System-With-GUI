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

public class DrinkFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;

	
	public DrinkFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("DRINK ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDrnkOrder = new JLabel("DRINK ORDER");
		lblDrnkOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrnkOrder.setFont(new Font("Arial", Font.BOLD, 30));
		lblDrnkOrder.setBounds(10, 10, 466, 99);
		contentPane.add(lblDrnkOrder);
		
		JButton btnCold = new JButton("COLD");
		btnCold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showColdDrinkFrame();
			}
		});
		btnCold.setFont(new Font("Arial", Font.BOLD, 20));
		btnCold.setBackground(Color.LIGHT_GRAY);
		btnCold.setBounds(10, 119, 466, 76);
		contentPane.add(btnCold);
		
		JButton btnHot = new JButton("HOT");
		btnHot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.showHotDrinkFrame();
			}
		});
		btnHot.setFont(new Font("Arial", Font.BOLD, 20));
		btnHot.setBackground(Color.LIGHT_GRAY);
		btnHot.setBounds(10, 205, 466, 76);
		contentPane.add(btnHot);
	}

}
