package Frames;
import SQL.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFrame {
    private AppController controller;
    private JFrame frame;
    private JTextField emailField;
    private JPasswordField passwordField;

    public LoginFrame(AppController controller) {
        this.controller = controller;

        frame = new JFrame("LOG IN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);
        frame.getContentPane().setLayout(null);

        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setFont(new Font("Arial", Font.BOLD, 30));
        emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
        emailLabel.setBounds(10, 10, 190, 76);
        frame.getContentPane().add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.BOLD, 30));
        emailField.setHorizontalAlignment(SwingConstants.LEFT);
        emailField.setBounds(210, 10, 466, 76);
        frame.getContentPane().add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 30));
        passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
        passwordLabel.setBounds(10, 96, 190, 76);
        frame.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.BOLD, 30));
        passwordField.setHorizontalAlignment(SwingConstants.LEFT);
        passwordField.setBounds(210, 96, 466, 76);
        frame.getContentPane().add(passwordField);

        JButton loginButton = new JButton("Log In");
        loginButton.setBackground(new Color(192, 192, 192));
        loginButton.setFont(new Font("Arial", Font.BOLD, 30));
        loginButton.setBounds(210, 182, 466, 76);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser();
            }
        });
        frame.getContentPane().add(loginButton);
    }

    private void loginUser() {
    String email = emailField.getText();
    String password = new String(passwordField.getPassword());

    try (Connection conn = DataBaseConnection.getConnection()) {
        String sql = "SELECT * FROM CUSTOMERJ WHERE EMAIL = ? AND LOGIN_PASSWORD = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, password);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    JOptionPane.showMessageDialog(frame, "Log In Successful!");
                    controller.showOrderFrame(); // Navigate to OrderFrame
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid e-mail or password.");
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(frame, "Database Error: " + e.getMessage());
    }
}

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}