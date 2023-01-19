package com.itwill.shop.ui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberJoinPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MemberJoinPanel() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.setBounds(40, 475, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(214, 475, 97, 23);
		add(btnNewButton_1);

	}
}
