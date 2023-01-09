package com.itwill.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.itwill.User.UserService;

public class LoginPanel_박준식 extends JPanel {
	private JLabel loginTitle_LB;
	private JLabel idLB;
	private JTextField id_TF;
	private JLabel pwLB;
	private JPasswordField pw_TF;
	private JButton searchIdPw_LB;
	private JButton joinBtn;
	private JButton main_btn;
	private JButton loginBtn;
	private JLabel pwLB_1;
	private JLabel loginTitle_LB_1;
	private JButton loginBtn_1;

	/**
	 * Create the panel.
	 */
	public LoginPanel_박준식() {
		setLayout(null);
		
		searchIdPw_LB = new JButton("아이디/비밀번호 찾기");
		searchIdPw_LB.setBounds(130, 361, 152, 23);
		add(searchIdPw_LB);
		
		JButton joinBtn = new JButton("회원가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		joinBtn.setBounds(130, 425, 152, 23);
		add(joinBtn);
		
		JButton main_btn = new JButton("메인으로");
		main_btn.setBounds(130, 482, 152, 23);
		add(main_btn);
		
		id_TF = new JTextField();
		id_TF.setBounds(130, 231, 152, 21);
		add(id_TF);
		id_TF.setColumns(10);
		
		pw_TF = new JPasswordField();
		pw_TF.setBounds(130, 295, 152, 21);
		add(pw_TF);
		
		JLabel idLB = new JLabel("아이디");
		idLB.setBounds(40, 234, 57, 15);
		add(idLB);
		
		JLabel pwLB_1 = new JLabel("비밀번호");
		pwLB_1.setBounds(40, 298, 57, 15);
		add(pwLB_1);
		
		loginTitle_LB_1 = new JLabel("로그인");
		loginTitle_LB_1.setFont(new Font("굴림", Font.PLAIN, 34));
		loginTitle_LB_1.setForeground(new Color(128, 128, 255));
		loginTitle_LB_1.setBounds(140, 107, 107, 62);
		add(loginTitle_LB_1);
		
		JButton loginBtn_1 = new JButton("로그인");
		loginBtn_1.setContentAreaFilled(false);
		loginBtn_1.setBorderPainted(false);
		loginBtn_1.setBounds(130, 552, 152, 23);
		add(loginBtn_1);
		
		/******************** 로그인 **********************/
		
		
		JLabel idFalse_LB = new JLabel("");
		idFalse_LB.setBounds(40, 259, 57, 15);
		add(idFalse_LB);
		
		JLabel pwFalse_LB = new JLabel("");
		pwFalse_LB.setBounds(40, 322, 57, 15);
		add(pwFalse_LB);
		
		
		

	}
	
	
	 
}
