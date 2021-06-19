package com.company.michele;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthorizeForm {
    private JPanel firstPanel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton clickToAuth;

    private final String login = "UserMichele";
    private final String password = "adminMichele";
    static JFrame frame;
    public AuthorizeForm() {
        clickToAuth.addActionListener(e -> {
            String inputLogin = loginField.getText();
            char[] inputPassword = passwordField.getPassword();
            String userPass = String.valueOf(inputPassword);

            if (userPass.equals(password) && inputLogin.equals(login)){
                frame.setVisible(false);
                JFrame frame2 = new JFrame("Your Cabinet");
                frame2.setContentPane(new PersonalCabinet().getCabinet());
                frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
                frame2.setSize(1000,500);
                frame2.setVisible(true);

            }
            else {
                JOptionPane.showMessageDialog(null, "You are idiot");
            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("Application");
        frame.setContentPane(new AuthorizeForm().firstPanel);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        //frame.pack();
        frame.setVisible(true);
    }
}
