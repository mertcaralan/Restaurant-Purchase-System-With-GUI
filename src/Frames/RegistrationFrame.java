package Frames;
import SQL.*;
import Classes.*;
import Main.OrderSys;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class RegistrationFrame {
    private AppController controller;
    private JFrame frame;
    private JTextField nameField, emailField, addressField, sexField;
    private JPasswordField passwordField;
    private JTextField dayField, monthField, yearField;

    public RegistrationFrame(AppController controller) {
        this.controller = controller;

        frame = new JFrame("REGISTRATION");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(813, 820);
        frame.getContentPane().setLayout(null);

        JLabel nameLabel = new JLabel("Name and Surname:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 30));
        nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        nameLabel.setBounds(10, 10, 307, 76);
        frame.getContentPane().add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.BOLD, 30));
        nameField.setHorizontalAlignment(SwingConstants.LEFT);
        nameField.setBounds(327, 10, 467, 76);
        frame.getContentPane().add(nameField);

        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setFont(new Font("Arial", Font.BOLD, 30));
        emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
        emailLabel.setBounds(10, 96, 307, 76);
        frame.getContentPane().add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.BOLD, 30));
        emailField.setHorizontalAlignment(SwingConstants.LEFT);
        emailField.setBounds(327, 96, 467, 76);
        frame.getContentPane().add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 30));
        passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
        passwordLabel.setBounds(10, 183, 307, 76);
        frame.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.BOLD, 30));
        passwordField.setHorizontalAlignment(SwingConstants.LEFT);
        passwordField.setBounds(327, 183, 467, 76);
        frame.getContentPane().add(passwordField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Arial", Font.BOLD, 30));
        addressLabel.setHorizontalAlignment(SwingConstants.LEFT);
        addressLabel.setBounds(10, 266, 307, 76);
        frame.getContentPane().add(addressLabel);

        addressField = new JTextField();
        addressField.setFont(new Font("Arial", Font.BOLD, 30));
        addressField.setHorizontalAlignment(SwingConstants.LEFT);
        addressField.setBounds(327, 269, 467, 76);
        frame.getContentPane().add(addressField);

        JLabel sexLabel = new JLabel("Sex:");
        sexLabel.setFont(new Font("Arial", Font.BOLD, 30));
        sexLabel.setHorizontalAlignment(SwingConstants.LEFT);
        sexLabel.setBounds(10, 352, 307, 83);
        frame.getContentPane().add(sexLabel);

        sexField = new JTextField();
        sexField.setFont(new Font("Arial", Font.BOLD, 30));
        sexField.setHorizontalAlignment(SwingConstants.LEFT);
        sexField.setBounds(327, 355, 467, 76);
        frame.getContentPane().add(sexField);

        JLabel dayLabel = new JLabel("Day of Birth:");
        dayLabel.setFont(new Font("Arial", Font.BOLD, 30));
        dayLabel.setHorizontalAlignment(SwingConstants.LEFT);
        dayLabel.setBounds(10, 441, 307, 76);
        frame.getContentPane().add(dayLabel);

        dayField = new JTextField();
        dayField.setFont(new Font("Arial", Font.BOLD, 30));
        dayField.setHorizontalAlignment(SwingConstants.LEFT);
        dayField.setBounds(327, 441, 467, 76);
        frame.getContentPane().add(dayField);

        JLabel monthLabel = new JLabel("Month of Birth:");
        monthLabel.setFont(new Font("Arial", Font.BOLD, 30));
        monthLabel.setHorizontalAlignment(SwingConstants.LEFT);
        monthLabel.setBounds(10, 527, 307, 76);
        frame.getContentPane().add(monthLabel);

        monthField = new JTextField();
        monthField.setFont(new Font("Arial", Font.BOLD, 30));
        monthField.setHorizontalAlignment(SwingConstants.LEFT);
        monthField.setBounds(327, 527, 467, 76);
        frame.getContentPane().add(monthField);

        JLabel yearLabel = new JLabel("Year of Birth:");
        yearLabel.setFont(new Font("Arial", Font.BOLD, 30));
        yearLabel.setHorizontalAlignment(SwingConstants.LEFT);
        yearLabel.setBounds(10, 613, 307, 76);
        frame.getContentPane().add(yearLabel);

        yearField = new JTextField();
        yearField.setFont(new Font("Arial", Font.BOLD, 30));
        yearField.setHorizontalAlignment(SwingConstants.LEFT);
        yearField.setBounds(327, 613, 467, 76);
        frame.getContentPane().add(yearField);

        JButton registerButton = new JButton("REGISTER");
        registerButton.setBackground(new Color(192, 192, 192));
        registerButton.setFont(new Font("Arial", Font.BOLD, 30));
        registerButton.setBounds(328, 699, 466, 76);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        frame.getContentPane().add(registerButton);
    }

    private void registerUser() {
        try {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String address = addressField.getText();
            String sex = sexField.getText();
            int day = Integer.parseInt(dayField.getText());
            int month = Integer.parseInt(monthField.getText());
            int year = Integer.parseInt(yearField.getText());

            Customer newCustomer = new Customer();
            newCustomer.set_NameSurname(name);
            newCustomer.set_email(email);
            newCustomer.set_password(password);
            newCustomer.setAddress(address);
            newCustomer.setSex(sex);
            newCustomer.setDayBirth(day);
            newCustomer.setMonthBirth(month);
            newCustomer.setYearBirth(year);

            OrderSys.customer = newCustomer;

            controller.showOrderFrame();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Error: " + e.getMessage());
        }
    }


    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}