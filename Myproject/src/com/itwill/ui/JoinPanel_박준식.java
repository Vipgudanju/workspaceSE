package com.itwill.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;

public class JoinPanel_박준식 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public JoinPanel_박준식() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 34));
		lblNewLabel.setBounds(107, 35, 146, 73);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(41, 162, 57, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(22, 205, 76, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("이름");
		lblNewLabel_3.setBounds(41, 253, 57, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("핸드폰");
		lblNewLabel_4.setBounds(41, 302, 57, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("주소");
		lblNewLabel_5.setBounds(41, 362, 57, 15);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("이메일");
		lblNewLabel_6.setBounds(41, 421, 57, 15);
		add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(122, 159, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 250, 116, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 202, 116, 21);
		add(passwordField);
		
		textField_2 = new JTextField();
		textField_2.setBounds(122, 299, 116, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(122, 359, 116, 21);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(122, 418, 116, 21);
		add(textField_4);
		textField_4.setColumns(10);

	}
}
