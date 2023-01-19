package com.itwill.shop.ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MemberInfoPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MemberInfoPanel() {
		setBackground(new Color(255, 204, 204));
		setForeground(new Color(255, 51, 255));
		setLayout(null);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.setBounds(12, 327, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(140, 327, 97, 23);
		add(btnNewButton_1);

	}
}
