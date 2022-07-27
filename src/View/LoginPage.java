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

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	String nickname;
	char[] password;
	static Controller controller;
	static LoginPage frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		controller = new Controller();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginPage();
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
	public LoginPage() {
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
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 303, 837);
		panel.setBackground(new Color(83, 97, 98));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginPage.class.getResource("/Images/library_music_icon.png")));
		lblNewLabel.setBounds(32, 98, 231, 247);
		panel.add(lblNewLabel);
		
		JButton GirisYapButtonu = new JButton("G\u0130R\u0130\u015E YAP");
		GirisYapButtonu.setIcon(new ImageIcon(LoginPage.class.getResource("/Images/paper_plane_icon.png")));
		GirisYapButtonu.setBorder(null);
		GirisYapButtonu.setActionCommand("GirisYap");
		GirisYapButtonu.setEnabled(false);
		GirisYapButtonu.setForeground(Color.BLACK);
		GirisYapButtonu.setBackground(new Color(192, 96, 20));
		GirisYapButtonu.setBounds(0, 432, 303, 61);
		panel.add(GirisYapButtonu);
		
		JButton KayitOlButtonu = new JButton("KAYIT OL\r\n\r\n");
		KayitOlButtonu.setIcon(new ImageIcon(LoginPage.class.getResource("/Images/paper_plane_icon.png")));
		KayitOlButtonu.setBorder(null);
		KayitOlButtonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Giris giris = new Giris();
				giris.main(null);
				frame.dispose();
			}
		});
		KayitOlButtonu.setActionCommand("KayitOl");
		KayitOlButtonu.setForeground(Color.DARK_GRAY);
		KayitOlButtonu.setBackground(new Color(192, 96, 20));
		KayitOlButtonu.setBounds(0, 515, 303, 61);
		panel.add(KayitOlButtonu);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(313, 0, 1261, 820);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(243, 244, 237));
		
		JLabel lblNewLabel_1 = new JLabel("Kullan\u0131c\u0131 Ad\u0131");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(256, 249, 317, 119);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(256, 130, 149, 165);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(LoginPage.class.getResource("/Images/group_man_user_woman_icon.png")));
		
		textField = new JTextField();
		textField.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textField.setForeground(Color.BLACK);
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setCaretColor(Color.BLACK);
		textField.setBounds(481, 293, 408, 40);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(LoginPage.class.getResource("/Images/ic_fluent_person_lock_regular_icon.png")));
		lblNewLabel_3.setBounds(266, 378, 262, 194);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u015Eifre\r\n");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(300, 491, 317, 140);
		panel_1.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setBounds(481, 532, 408, 40);
		panel_1.add(passwordField);
		
		JButton GirisYap = new JButton("Giri\u015F Yap");
		GirisYap.setBackground(new Color(66, 70, 66));
		GirisYap.setForeground(new Color(192, 96, 20));
		GirisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//kullanici adi - sifre kontrol
				password = passwordField.getPassword();
				nickname = textField.getText();
				String sifre="";
				for (int i=0; i<password.length;i++) {
					sifre = sifre+password[i];
				}
				System.out.println(nickname+" , " +sifre);
				Kullanici kullanici = controller.girisYap(nickname,sifre);
				if(kullanici == null) {
					//kullanici bulunamadi
					System.out.println("Kullanici bulunamadi");
					
					JPanel panel_2 = new JPanel();
					panel_2.setBackground(SystemColor.inactiveCaption);
					panel_2.setBounds(252, 0, 387, 56);
					panel_1.add(panel_2);
					panel_2.setLayout(null);
					
					JLabel lblNewLabel_6 = new JLabel("Uyarı: Hatalı bir şifre veya kullanıcı adı girdiniz");
					lblNewLabel_6.setIcon(new ImageIcon(LoginPage.class.getResource("/Images/alert_attention_danger_error_internet_icon.png")));
					lblNewLabel_6.setBounds(10, 10, 346, 39);
					panel_2.add(lblNewLabel_6);
					frame.repaint();
					passwordField.setText("");
					textField.setText("");
				}
				else {
					System.out.println(nickname+" hosgeldiniz");
					
					JPanel panel_2 = new JPanel();
					panel_2.setBackground(SystemColor.inactiveCaption);
					panel_2.setBounds(252, 0, 387, 56);
					panel_1.add(panel_2);
					panel_2.setLayout(null);
					
					JLabel lblNewLabel_6 = new JLabel("Giriş başarılı");
					lblNewLabel_6.setIcon(new ImageIcon(LoginPage.class.getResource("/Images/circle_correct_mark_success_tick_icon.png")));
					lblNewLabel_6.setBounds(10, 10, 346, 39);
					panel_2.add(lblNewLabel_6);
					frame.repaint();	
				}
			}
		});
		GirisYap.setForeground(Color.GRAY);
		GirisYap.setBackground(Color.DARK_GRAY);
		GirisYap.setFont(new Font("Tahoma", Font.BOLD, 20));
		GirisYap.setBorder(null);
		GirisYap.setBounds(726, 692, 163, 40);
		panel_1.add(GirisYap);
		
		JLabel lblNewLabel_4 = new JLabel("MUSIC REV\u0130EWER\r\n");
		lblNewLabel_4.setIcon(new ImageIcon(LoginPage.class.getResource("/Images/music_sound_sound wave_wave_icon.png")));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_4.setBounds(481, 59, 354, 95);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(LoginPage.class.getResource("/Images/audio_cd_disc_disk_drive_icon.png")));
		lblNewLabel_5.setBounds(938, -278, 341, 559);
		panel_1.add(lblNewLabel_5);
	}
}
