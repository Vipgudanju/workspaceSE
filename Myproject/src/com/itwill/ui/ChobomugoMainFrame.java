package com.itwill.ui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class ChobomugoMainFrame extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChobomugoMainFrame frame = new ChobomugoMainFrame();
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
	public ChobomugoMainFrame() {
		setBounds(100, 100, 400, 620);

	}

}
