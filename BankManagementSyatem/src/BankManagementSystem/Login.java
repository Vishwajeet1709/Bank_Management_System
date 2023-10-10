package BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JButton SignIn, Clear, SignUp;
	JTextField CardNumber;
	JPasswordField PinNumber;
	
	Login(){
		
		setLayout(null);
		setTitle("My ATM");
		ImageIcon Image1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image I1 = Image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon I2 = new ImageIcon(I1);
		JLabel label = new JLabel(I2);
		label.setBounds(70, 10, 100, 100);
		add(label);
		
		JLabel text = new JLabel("Welcome To My ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 500, 40);
		add(text);
		
		JLabel CardNo = new JLabel("Enter Card Number : ");
		CardNo.setFont(new Font("Raleway", Font.BOLD, 28));
		CardNo.setBounds(75, 150, 500, 40);
		add(CardNo);
		
		CardNumber = new JTextField();
		CardNumber.setBounds(390, 157, 250, 30);
		CardNumber.setFont(new Font("Arial",Font.BOLD,14));
		add(CardNumber);
		
		JLabel Pin = new JLabel("Enter Your ATM Pin : ");
		Pin.setFont(new Font("Raleway", Font.BOLD, 28));
		Pin.setBounds(75, 220, 500, 40);
		add(Pin);
		
		PinNumber = new JPasswordField();
		PinNumber.setBounds(390, 226, 250, 30);
		PinNumber.setFont(new Font("Arial",Font.BOLD,14));
		add(PinNumber);
		
		SignIn = new JButton("SIGN IN");
		SignIn.setBounds(430, 300, 100, 30);
		SignIn.addActionListener(this);
		add(SignIn);
		
		Clear = new JButton("CLEAR");
		Clear.setBounds(300, 300, 100, 30);
		Clear.addActionListener(this);
		add(Clear);
		
		SignUp = new JButton("SIGN UP");
		SignUp.setBounds(300, 350, 230, 30);
		SignUp.addActionListener(this);
		add(SignUp);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == SignIn) {
			
		} else if(ae.getSource() == Clear) {
			CardNumber.setText("");
			PinNumber.setText("");
			
		} else if(ae.getSource() == SignUp) {
			
		}
	}
	
	public static void main(String args[]) {
		new Login();
		
	}
	
}