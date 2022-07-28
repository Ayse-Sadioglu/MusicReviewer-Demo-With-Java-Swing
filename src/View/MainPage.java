package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;
import Model.Kullanici;

import javax.print.DocFlavor.URL;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Cursor;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Panel;
import javax.swing.JMenu;
import java.awt.ScrollPane;
import java.awt.SystemColor;
import java.awt.TextField;
import javax.swing.JProgressBar;

public class MainPage extends JFrame {

	private JPanel contentPane;
	String nickname;
	char[] password;
	static Controller controller;
	static MainPage frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		controller = new Controller();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainPage();
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
	public MainPage() {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setPreferredSize(new Dimension(screenSize.width, screenSize.height));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1536, 857);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(new Color(243, 244, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 250, 250));
		panel_1.setBounds(0, 0, 1697, 1191);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1522, 133);
		panel.setBackground(new Color(147, 181, 198));
		panel_1.add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(228, 216, 220));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(737, 52, 170, 31);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Create Account");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1 .setBackground(new Color(228, 216, 220));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(974, 52, 170, 31);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Albums");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1_1.setBackground(new Color(228, 216, 220));

		btnNewButton_1_1_1.setBounds(1201, 52, 170, 31);
		panel.add(btnNewButton_1_1_1);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("   MUSIC REVIEWER\r\n");
		lblNewLabel_4.setBounds(147, 10, 518, 123);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_4.setIcon(new ImageIcon(MainPage.class.getResource("/Images/a.png")));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_4.setForeground(new Color(248, 248, 255));
		
		TextField textField = new TextField();
		textField.setBounds(100, 181, 1334, 32);
		panel_1.add(textField);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBackground(new Color(201, 204, 213));
		textField.setText("Create an account and start reviewing songs!");
		
		int label_album_width = 200;
		int label_album_height = 230;
	
		
		
		JLabel label_album1 = new JLabel();
		label_album1.setBounds(85, 48, label_album_width, label_album_height);
		label_album1.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("/Images/pink.jpg")).getImage().getScaledInstance(label_album_width, label_album_height, Image.SCALE_SMOOTH)));
		
		JLabel label_album2 = new JLabel();
		label_album2.setBounds(391, 48, label_album_width, label_album_height);
		label_album2.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("/Images/ram.jpg")).getImage().getScaledInstance(label_album_width, label_album_height, Image.SCALE_SMOOTH)));
		
		JLabel label_album3 = new JLabel();
		label_album3.setBounds(671, 48, label_album_width, label_album_height);
		label_album3.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("/Images/st.jpg")).getImage().getScaledInstance(label_album_width, label_album_height, Image.SCALE_SMOOTH)));
		
	
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(228, 216, 220));
		panel_2.setBounds(100, 239, 1334, 558);
		panel_1.add(panel_2);
		
		panel_2.add(label_album1);
		panel_2.add(label_album2);
		panel_2.add(label_album3);
		
		JLabel label_album1_1 = new JLabel();
		label_album1_1.setBounds(85, 314, 200, 230);
		label_album1_1.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("/Images/metal.jpeg")).getImage().getScaledInstance(label_album_width, label_album_height, Image.SCALE_SMOOTH)));

		panel_2.add(label_album1_1);
		
		JLabel label_album2_1 = new JLabel();
		label_album2_1.setBounds(969, 48, 200, 230);
		label_album2_1.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("/Images/tame.png")).getImage().getScaledInstance(label_album_width, label_album_height, Image.SCALE_SMOOTH)));

		panel_2.add(label_album2_1);
		
		JLabel label_album1_1_1 = new JLabel();
		label_album1_1_1.setBounds(391, 314, 200, 230);
		label_album1_1_1.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("/Images/wy.jpg")).getImage().getScaledInstance(label_album_width, label_album_height, Image.SCALE_SMOOTH)));

		panel_2.add(label_album1_1_1);
		
		JLabel label_album1_1_1_1 = new JLabel();
		label_album1_1_1_1.setBounds(671, 314, 200, 230);
		label_album1_1_1_1.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("/Images/fw.png")).getImage().getScaledInstance(label_album_width, label_album_height, Image.SCALE_SMOOTH)));

		panel_2.add(label_album1_1_1_1);
		
		JLabel label_album1_1_1_1_1 = new JLabel();
		label_album1_1_1_1_1.setBounds(969, 314, 200, 230);
		label_album1_1_1_1_1.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("/Images/deluxe.jpg")).getImage().getScaledInstance(label_album_width, label_album_height, Image.SCALE_SMOOTH)));

		panel_2.add(label_album1_1_1_1_1);
		
		


	
	}
}
