// 2022-12-12

package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class DayTimeClientFrame extends JFrame {

	private JPanel contentPane;
	private JButton bariable;
	private JLabel TimeDisplayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayTimeClientFrame frame = new DayTimeClientFrame();
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
	public DayTimeClientFrame() {
		setTitle("DayTimeClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		bariable = new JButton("Request Server Time");
		bariable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***************************************/
				try {
					/*
					 * 1. Spcket 생성
					 */
					Socket socket = new Socket("192.168.15.08", 8000);
					
					/*
					 * 2. Socket으로 부터 InputStream 얻기
					 */
					
					/*
					 * InputStream[byte stream] 을 Reader[character stream]로 변경하는
					 * 브릿지스트림(InputStreamReader)을 사용해서 변경
					 */
					InputStream in =socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(in, "UTF-8");
					BufferedReader br = new BufferedReader(isr);
					String serverTime = br.readLine();
					System.out.println(serverTime);
					socket.close();
					TimeDisplayLabel.setText(serverTime);
					socket.close();
					
				}catch (Exception e1) {
					System.out.println(e1.getMessage());
				}	
				/*****************************************************/
				
			}
		});
		contentPane.add(bariable, BorderLayout.SOUTH);
		
		TimeDisplayLabel = new JLabel("12:00");
		TimeDisplayLabel.setForeground(new Color(255, 0, 255));
		TimeDisplayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TimeDisplayLabel.setFont(new Font("궁서", Font.PLAIN, 16));
		contentPane.add(TimeDisplayLabel, BorderLayout.CENTER);
	}
	
	

}
