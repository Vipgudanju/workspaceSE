package com.itwill.ui.박준식;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.itwill.User.UserService;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTabbedPane;
//import java.awt.event.ComponentListener;

public class LoginPanel_박준식 extends JPanel {
	private JTextField loginIdTF;
	private JPasswordField loginpwTF;
	private JLabel idLB;
	private JLabel pwLB;
	private JButton btnNewButton;
	private JButton joinBtn;
	private JButton searchIDPassword_LB;
	private JLabel loginTitle_LB;

	/**
	 * Create the panel.
	 */
	
	/***************** 1.UserService멤버필드 선언 ********************/
	private UserService userService;
	private JButton btnNewButton_1;
	private JLabel loginTitle_LB_1;
	private JPanel loginPanel;
	private JButton loginBtn;
	private JButton searchIDPassword_LB_1;
	private JButton joinBtn_2;
	/******************************************************************/
	
	public LoginPanel_박준식() throws Exception{
		setLayout(null);
		
		loginPanel = new JPanel();
		loginPanel.setBounds(12, 5, 376, 605);
		add(loginPanel);
		loginPanel.setLayout(null);
		
		JLabel idLB = new JLabel("아이디");
		idLB.setBounds(12, 227, 57, 15);
		loginPanel.add(idLB);
		
		JLabel pwLB = new JLabel("비밀번호");
		pwLB.setBounds(12, 312, 57, 15);
		loginPanel.add(pwLB);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(122, 224, 116, 21);
		loginPanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginpwTF = new JPasswordField();
		loginpwTF.setBounds(122, 309, 116, 21);
		loginPanel.add(loginpwTF);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.setBounds(12, 387, 151, 23);
		loginPanel.add(loginBtn);
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/****************** 회원 로그인 ******************/
				try {
					String userId = loginIdTF.getText();
					String userPw = new String(loginpwTF.getPassword());
					
					int result = userService.login(userId, userPw);
					if(result == 0) {
						//로그인성공
						JOptionPane.showMessageDialog(null, "로그인 성공");
						loginIdTF.setText("");
						loginpwTF.setText("");
					}else {
						JOptionPane.showMessageDialog(null, "아이디또는 비밀번호를 확인하세요");
						loginIdTF.setSelectionStart(0);
						loginIdTF.setSelectionEnd(userId.length());
						loginIdTF.requestFocus();
					} 
					
					
					
				}catch (Exception e1) {
					
				}
				
				
			}
		});
		
		
		
		JButton joinBtn_2 = new JButton("회원가입");
		joinBtn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		joinBtn_2.setBounds(175, 387, 151, 23);
		loginPanel.add(joinBtn_2);
		
		loginTitle_LB_1 = new JLabel("로그인");
		loginTitle_LB_1.setFont(new Font("굴림", Font.PLAIN, 34));
		loginTitle_LB_1.setBounds(122, 106, 116, 40);
		loginPanel.add(loginTitle_LB_1);
		
		searchIDPassword_LB_1 = new JButton("아이디/비밀번호 찾기");
		searchIDPassword_LB_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchIDPassword_LB_1.setBounds(175, 441, 151, 23);
		loginPanel.add(searchIDPassword_LB_1);

	}
}
