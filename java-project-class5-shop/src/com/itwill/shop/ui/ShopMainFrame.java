package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class ShopMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMainFrame frame = new ShopMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShopMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel globalNorthMenupanel = new JPanel();
		globalNorthMenupanel.setBackground(new Color(128, 128, 255));
		contentPane.add(globalNorthMenupanel, BorderLayout.NORTH);
		
		JPanel globalSourthMenupanel = new JPanel();
		globalSourthMenupanel.setOpaque(false);
		globalSourthMenupanel.setBackground(new Color(255, 128, 192));
		contentPane.add(globalSourthMenupanel, BorderLayout.SOUTH);
		
		JButton globalSearchMenuButton = new JButton("New button");
		globalSourthMenupanel.add(globalSearchMenuButton);
		
		JButton globalHomeMenuButton = new JButton("New button");
		globalSourthMenupanel.add(globalHomeMenuButton);
		
		JButton gloabalMemberMenuButton = new JButton("New button");
		gloabalMemberMenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		globalSourthMenupanel.add(gloabalMemberMenuButton);
		
		JTabbedPane shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("제품", null, productTabbedPane, null);
		
		PopularProductPanel popularProductPanel = new PopularProductPanel();
		productTabbedPane.addTab("인기제품", null, popularProductPanel, null);
		
		MemberjoinPanel memberjoinPanel = new MemberjoinPanel();
		popularProductPanel.add(memberjoinPanel);
		
		JTabbedPane memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("회원", null, memberTabbedPane, null);
	}

}
