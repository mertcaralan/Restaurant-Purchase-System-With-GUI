package Frames;
import Main.OrderSys;
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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;

public class SauceFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;
	private JTextField txtCount;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private String size;
	
	public void purchase(JButton name,String size,String counter,double price) {
		controller.showPurchaseFrame();
		OrderSys.addOrder(name.getText(),size,Integer.parseInt(counter),price);
	}
	
	
	public SauceFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("SAUCE ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSauceOrder = new JLabel("SAUCE ORDER");
		lblSauceOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblSauceOrder.setFont(new Font("Arial", Font.BOLD, 30));
		lblSauceOrder.setBounds(10, 10, 466, 99);
		contentPane.add(lblSauceOrder);
		
		JLabel lblSizePreference = new JLabel("Size Preference");
		lblSizePreference.setHorizontalAlignment(SwingConstants.CENTER);
		lblSizePreference.setFont(new Font("Arial", Font.BOLD, 30));
		lblSizePreference.setBounds(10, 463, 422, 99);
		contentPane.add(lblSizePreference);
		
		JLabel lblEnter = new JLabel("Item Count");
		lblEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnter.setFont(new Font("Arial", Font.BOLD, 30));
		lblEnter.setBounds(10, 572, 422, 99);
		contentPane.add(lblEnter);
		
		JRadioButton rdbtnS = new JRadioButton("S");
		buttonGroup.add(rdbtnS);
		rdbtnS.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnS.setFont(new Font("Arial", Font.BOLD, 30));
		rdbtnS.setBackground(Color.LIGHT_GRAY);
		rdbtnS.setBounds(438, 463, 115, 99);
		contentPane.add(rdbtnS);
		
		txtCount = new JTextField();
		txtCount.setText("1");
		txtCount.setHorizontalAlignment(SwingConstants.CENTER);
		txtCount.setForeground(Color.BLACK);
		txtCount.setFont(new Font("Arial", Font.BOLD, 30));
		txtCount.setColumns(10);
		txtCount.setBackground(Color.LIGHT_GRAY);
		txtCount.setBounds(438, 572, 349, 99);
		contentPane.add(txtCount);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		buttonGroup.add(rdbtnM);
		rdbtnM.setSelected(true);
		rdbtnM.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnM.setFont(new Font("Arial", Font.BOLD, 30));
		rdbtnM.setBackground(Color.LIGHT_GRAY);
		rdbtnM.setBounds(555, 463, 115, 99);
		contentPane.add(rdbtnM);
		
		JRadioButton rdbtnL = new JRadioButton("L");
		buttonGroup.add(rdbtnL);
		rdbtnL.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnL.setFont(new Font("Arial", Font.BOLD, 30));
		rdbtnL.setBackground(Color.LIGHT_GRAY);
		rdbtnL.setBounds(672, 463, 115, 99);
		contentPane.add(rdbtnL);
		
		JButton btnKetchup = new JButton("KETCHUP");
		btnKetchup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnS.isSelected()) {
					size = "S";
				}else if(rdbtnM.isSelected()) {
					size = "M";
				}else if(rdbtnL.isSelected()) {
					size = "L";
				}
				purchase(btnKetchup,size, txtCount.getText(),250);
			}
		});
		btnKetchup.setFont(new Font("Arial", Font.BOLD, 20));
		btnKetchup.setBackground(Color.LIGHT_GRAY);
		btnKetchup.setBounds(10, 119, 466, 76);
		contentPane.add(btnKetchup);
		
		JButton btnBbq = new JButton("BBQ");
		btnBbq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnS.isSelected()) {
					size = "S";
				}else if(rdbtnM.isSelected()) {
					size = "M";
				}else if(rdbtnL.isSelected()) {
					size = "L";
				}
				purchase(btnBbq,size, txtCount.getText(),250);
			}
		});
		btnBbq.setFont(new Font("Arial", Font.BOLD, 20));
		btnBbq.setBackground(Color.LIGHT_GRAY);
		btnBbq.setBounds(10, 205, 466, 76);
		contentPane.add(btnBbq);
		
		JButton btnMayonnaise = new JButton("MAYONNAISE");
		btnMayonnaise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnS.isSelected()) {
					size = "S";
				}else if(rdbtnM.isSelected()) {
					size = "M";
				}else if(rdbtnL.isSelected()) {
					size = "L";
				}
				purchase(btnMayonnaise,size, txtCount.getText(),250);
			}
		});
		btnMayonnaise.setFont(new Font("Arial", Font.BOLD, 20));
		btnMayonnaise.setBackground(Color.LIGHT_GRAY);
		btnMayonnaise.setBounds(10, 291, 466, 76);
		contentPane.add(btnMayonnaise);
		
		JButton btnMustard = new JButton("MUSTARD");
		btnMustard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnS.isSelected()) {
					size = "S";
				}else if(rdbtnM.isSelected()) {
					size = "M";
				}else if(rdbtnL.isSelected()) {
					size = "L";
				}
				purchase(btnMustard,size, txtCount.getText(),250);
			}
		});
		btnMustard.setFont(new Font("Arial", Font.BOLD, 20));
		btnMustard.setBackground(Color.LIGHT_GRAY);
		btnMustard.setBounds(10, 377, 466, 76);
		contentPane.add(btnMustard);
		
		JLabel lblPrces = new JLabel("PRICES");
		lblPrces.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces.setBounds(486, 10, 301, 99);
		contentPane.add(lblPrces);
		
		JLabel lblTl_1 = new JLabel("7 TL");
		lblTl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTl_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblTl_1.setBounds(486, 202, 301, 76);
		contentPane.add(lblTl_1);
		
		JLabel lblPrces_1_1 = new JLabel("5 TL");
		lblPrces_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_1.setBounds(486, 116, 301, 76);
		contentPane.add(lblPrces_1_1);
		
		JLabel lblPrces_1_2 = new JLabel("5 TL");
		lblPrces_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_2.setBounds(486, 288, 301, 76);
		contentPane.add(lblPrces_1_2);
		
		JLabel lblPrces_1_3 = new JLabel("7 TL");
		lblPrces_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_3.setBounds(486, 374, 301, 76);
		contentPane.add(lblPrces_1_3);
	}

}
