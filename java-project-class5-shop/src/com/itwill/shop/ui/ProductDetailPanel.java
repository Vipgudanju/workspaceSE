package com.itwill.shop.ui;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

public class ProductDetailPanel extends JPanel {
	ShopMainFrame frame;
	/**
	 * Create the panel.
	 */
	public ProductDetailPanel() {
		setBackground(new Color(0, 153, 255));
		setLayout(null);
		
		JButton btnNewButton = new JButton("상품리스트 화면전환");
		btnNewButton.setBounds(51, 331, 194, 23);
		add(btnNewButton);

	}
}
