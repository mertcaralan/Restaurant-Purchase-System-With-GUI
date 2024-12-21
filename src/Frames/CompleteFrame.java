package Frames;
import Main.OrderSys;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Classes.Order;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CompleteFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;
	private JTextField textID;
	public String[] ids = {};
	
	public CompleteFrame(AppController controller) {
		
		this.controller = controller;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 812);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoYouWant_1 = new JLabel("THANKS FOR ORDERING !");
		lblDoYouWant_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouWant_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblDoYouWant_1.setBounds(10, 10, 777, 76);
		contentPane.add(lblDoYouWant_1);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 96, 777, 302);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textID = new JTextField();
		textID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					Order order = OrderSys.searchOrderByOrderID(Integer.parseInt(textID.getText()));
					
					if(order != null ) {
						textArea.setText("\nORDER ID : " + textID.getText()+ "\n\n======================================\n" + order.toString());
					}else {
						textArea.setText("Invalid ID !");
					}
					
					textID.setText("");
		        }
			}
		});
		textID.setHorizontalAlignment(SwingConstants.CENTER);
		textID.setForeground(Color.BLACK);
		textID.setFont(new Font("Arial", Font.BOLD, 30));
		textID.setColumns(10);
		textID.setBackground(Color.LIGHT_GRAY);
		textID.setBounds(492, 494, 295, 76);
		contentPane.add(textID);
		
		JLabel lblDoYouWant_1_1 = new JLabel("ID :");
		lblDoYouWant_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouWant_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblDoYouWant_1_1.setBounds(408, 494, 74, 76);
		contentPane.add(lblDoYouWant_1_1); 

		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnExit.setFont(new Font("Arial", Font.BOLD, 30));
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(10, 666, 777, 76);
		contentPane.add(btnExit);
		
		JComboBox comboBox = new JComboBox(ids);
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String selectedItem = (String) comboBox.getSelectedItem();
		        if (selectedItem != null) {
		            textArea.setText("ID is ready to be deleted! Currently selected: " + selectedItem);
		        } else {
		            textArea.setText("ComboBox is empty or no selection made!");
		        }
			}
		});
	    comboBox.setBounds(408, 580, 379, 76);
	    contentPane.add(comboBox);
	    
	    
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        ids = OrderSys.getOrderIDsAsArray();
		        System.out.println(Arrays.toString(ids));
		        textArea.setText(OrderSys.displayOrders());

		        comboBox.removeAllItems();
		        for (String id : ids) {
		            comboBox.addItem(id);
		        }
		    }
		});

		btnDisplay.setFont(new Font("Arial", Font.BOLD, 30));
		btnDisplay.setBackground(Color.LIGHT_GRAY);
		btnDisplay.setBounds(10, 408, 777, 76);
		contentPane.add(btnDisplay);

		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order order = OrderSys.searchOrderByOrderID(Integer.parseInt(textID.getText()));
				
				if(order != null ) {
					textArea.setText("\nORDER ID : " + textID.getText()+ "\n\n======================================\n" + order.toString());
				}else {
					textArea.setText("Invalid ID !");
				}
				
				textID.setText("");
			}
		});
		btnSearch.setFont(new Font("Arial", Font.BOLD, 30));
		btnSearch.setBackground(Color.LIGHT_GRAY);
		btnSearch.setBounds(10, 494, 388, 76);
		contentPane.add(btnSearch);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedItemID = comboBox.getSelectedItem().toString();
				if(OrderSys.deleteOrder(Integer.parseInt(selectedItemID))){
					comboBox.removeItem(comboBox.getSelectedItem().toString());
					textArea.setText("Order " + selectedItemID + " has been deleted !");
				}else {
					textArea.setText("Delete operation could not be done !");
				}
			}
		});
		btnDelete.setFont(new Font("Arial", Font.BOLD, 30));
		btnDelete.setBackground(Color.LIGHT_GRAY);
		btnDelete.setBounds(10, 580, 388, 76);
		contentPane.add(btnDelete);
	}
}
