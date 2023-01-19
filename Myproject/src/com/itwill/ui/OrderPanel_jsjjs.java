package com.itwill.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JCheckBox;

public class OrderPanel_jsjjs extends JPanel {
	private JLabel lblNewLabel;
	private JLabel orderListLB;
	private JCheckBox cartCheckBox;
	private JLabel productImg;
	private JLabel lblNewLabel_1;
	private JLabel orderTotalNameLB;
	private JLabel orderTotalPriceLB;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 *  Create the panel.
	 */
	public OrderPanel_jsjjs() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 400, 620);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주문이완료되었습니다.");
		JOptionPane.showMessageDialog(null, "주문이 완료되었습니다."); // add
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(42, 77, 316, 81);
		panel.add(lblNewLabel);
		
		JPanel orderTotalPricePanel = new JPanel();
		orderTotalPricePanel.setBounds(42, 407, 316, 50);
		panel.add(orderTotalPricePanel);
		orderTotalPricePanel.setLayout(null);
		
		JLabel orderTotalNameLB = new JLabel("총결제 금액");
		orderTotalNameLB.setBounds(0, 10, 105, 30);
		orderTotalPricePanel.add(orderTotalNameLB);
		
		JLabel orderTotalPriceLB = new JLabel("200,000");
		orderTotalPriceLB.setBounds(229, 18, 75, 15);
		orderTotalPricePanel.add(orderTotalPriceLB);
		
		JLabel productImg = new JLabel("이미지");
		productImg.setBackground(new Color(0, 128, 192));
		productImg.setBounds(43, 227, 98, 120);
		panel.add(productImg);
		
		JButton btnNewButton = new JButton("쇼핑 계속하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(43, 542, 109, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("메인으로");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(244, 542, 97, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(180, 227, 178, 91);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(77, 175, 215, 31);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel orderListLB = new JLabel("YYYY/MM/DD 주문내역");
		orderListLB.setBounds(12, 0, 139, 25);
		panel_1.add(orderListLB);
		
		cartCheckBox = new JCheckBox("");
		cartCheckBox.setBounds(159, 0, 28, 23);
		panel_1.add(cartCheckBox);

	}
}
