package Frames;
import Main.OrderSys;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;

public class BurgerFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;
	private JTextField txtCount;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	private String size;
	
	public void purchase(JButton name,String size,String counter,double price) {
		controller.showPurchaseFrame();
		OrderSys.addOrder(name.getText(),size,Integer.parseInt(counter),price);
	}
	
	public BurgerFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("BURGER ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel lblBurgerOrder = new JLabel("BURGER ORDER");
		lblBurgerOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblBurgerOrder.setBounds(10, 10, 466, 99);
		lblBurgerOrder.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblBurgerOrder);
		
		JButton btnHamburger = new JButton("HAMBURGER");
		btnHamburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnS.isSelected()) {
					size = "S";
				}else if(rdbtnM.isSelected()) {
					size = "M";
				}else if(rdbtnL.isSelected()) {
					size = "L";
				}
				purchase(btnHamburger,size, txtCount.getText(),250);
			}
		});
		btnHamburger.setBackground(new Color(192, 192, 192));
		btnHamburger.setBounds(10, 119, 466, 76);
		btnHamburger.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(btnHamburger);
		
		JButton btnCheeseburger = new JButton("CHEESEBURGER");
		btnCheeseburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnS.isSelected()) {
					size = "S";
				}else if(rdbtnM.isSelected()) {
					size = "M";
				}else if(rdbtnL.isSelected()) {
					size = "L";
				}
				purchase(btnCheeseburger,size, txtCount.getText(),240);
			}
		});
		btnCheeseburger.setBackground(new Color(192, 192, 192));
		btnCheeseburger.setFont(new Font("Arial", Font.BOLD, 20));
		btnCheeseburger.setBounds(10, 205, 466, 76);
		contentPane.add(btnCheeseburger);
		
		JButton btnFishburger = new JButton("FISHBURGER");
		btnFishburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnS.isSelected()) {
					size = "S";
				}else if(rdbtnM.isSelected()) {
					size = "M";
				}else if(rdbtnL.isSelected()) {
					size = "L";
				}
				purchase(btnFishburger,size, txtCount.getText(),300);
			}
		});
		btnFishburger.setBackground(new Color(192, 192, 192));
		btnFishburger.setFont(new Font("Arial", Font.BOLD, 20));
		btnFishburger.setBounds(10, 291, 466, 76);
		contentPane.add(btnFishburger);
		
		JButton btnChickenburger = new JButton("CHICKENBURGER");
		btnChickenburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnS.isSelected()) {
					size = "S";
				}else if(rdbtnM.isSelected()) {
					size = "M";
				}else if(rdbtnL.isSelected()) {
					size = "L";
				}
				purchase(btnChickenburger,size, txtCount.getText(),210);
			}
		});
		btnChickenburger.setBackground(new Color(192, 192, 192));
		btnChickenburger.setFont(new Font("Arial", Font.BOLD, 20));
		btnChickenburger.setBounds(10, 377, 466, 76);
		contentPane.add(btnChickenburger);
		
		JLabel lblPrces = new JLabel("PRICES");
		lblPrces.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces.setBounds(486, 10, 301, 99);
		contentPane.add(lblPrces);
		
		JLabel lblTl = new JLabel("250 TL");
		lblTl.setHorizontalAlignment(SwingConstants.CENTER);
		lblTl.setFont(new Font("Arial", Font.BOLD, 30));
		lblTl.setBounds(486, 119, 301, 76);
		contentPane.add(lblTl);
		
		JLabel lblPrces_1_1 = new JLabel("270 TL");
		lblPrces_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_1.setBounds(486, 205, 301, 76);
		contentPane.add(lblPrces_1_1);
		
		JLabel lblPrces_1_2 = new JLabel("300 TL");
		lblPrces_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_2.setBounds(486, 291, 301, 76);
		contentPane.add(lblPrces_1_2);
		
		JLabel lblPrces_1_3 = new JLabel("210 TL");
		lblPrces_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_3.setBounds(486, 377, 301, 76);
		contentPane.add(lblPrces_1_3);
	}
}
