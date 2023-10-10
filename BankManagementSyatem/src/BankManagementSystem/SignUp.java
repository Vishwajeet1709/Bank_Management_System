package BankManagementSystem;

import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SignUp extends JFrame{
	
	SignUp(){
		setLayout(null);
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
		getContentPane().setBackground(Color.WHITE);
		
		Random ApplicationNum = new Random();
		long Rand = Math.abs(ApplicationNum.nextLong() % 9000l) + 1000l;
		
		JLabel formno = new JLabel("APPLICATION NUMBER " + Rand);
		formno.setFont(new Font("Raleway", Font.BOLD, 38));
		formno.setBounds(140, 20, 600, 40);
		add(formno);
		
		JLabel PersonalDetails = new JLabel("Page 1 : Personal Details");
		PersonalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		PersonalDetails.setBounds(290, 80, 400, 30);
		add(PersonalDetails);
	}
	public static void main(String args[]) {
		new SignUp();
	}
}