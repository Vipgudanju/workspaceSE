package Event;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatingJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;
	private JButton sendBtn;
	private JTextArea chatTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatingJFrame frame = new ChatingJFrame();
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
	public ChatingJFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windpwClosing");
				System.exit(0);
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 433, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 200, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("K-FOOD");
		lblNewLabel.setIcon(new ImageIcon("C:\\2022_11_JAVA_DEVELOPER\\01.JAVA_FUNDMENTAL_DEVELOPER\\image\\koreanfood.png"));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		chatTF = new JTextField();
		panel_1.add(chatTF);
		chatTF.setColumns(20);
		
		sendBtn = new JButton("??????");
		panel_1.add(sendBtn);
		
		
		chatTA = new JTextArea();
		
		chatTA.setText("??????:?????????\r\n??????:?????????~~~~\n");
		contentPane.add(chatTA, BorderLayout.CENTER);
		/*
		 * ?????????????????? ??????????????????????????????
		 */
		ChatSendButtonActionEventHandler handler=
				new ChatSendButtonActionEventHandler();
		sendBtn.addActionListener(handler);
		
	}//?????????
	/*************Inner class***********/
	public class ChatSendButtonActionEventHandler implements ActionListener{
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("send button click~~");
		/*
		 * frame??? TextField??? TextArea??? ???????????????
		 */
		String chatStr=ChatingJFrame.this.chatTF.getText();
		chatTF.setText("");
		ChatingJFrame.this.chatTA.append("?????????:"+chatStr+"\n");
		chatTF.requestFocus();
		
	}
	
}


}


