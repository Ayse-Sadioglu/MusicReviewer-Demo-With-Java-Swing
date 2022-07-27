package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Choice;
import java.awt.ScrollPane;
import java.awt.Font;
import java.awt.Point;
import java.awt.Scrollbar;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controller.*;
import Model.*;
import javax.swing.DropMode;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import net.miginfocom.swing.MigLayout;
import javax.swing.JDesktopPane;
import javax.swing.Box;

public class Giris extends JFrame {
	

	private JPasswordField passwordField;
	private JTextField txtKullaniciAdi;
	private JTextField txtSifre;
	private JTextField textField;
	String nickname;
	char[] password;
	static Controller controller;
	private Panel panel;
	private Panel panel_1;
	private Panel panel_2;
	private Panel panel_3;
	private Panel panel_4;
	private Panel panel_5;
	private Panel panel_6;
	private Panel panel_7;
	private Panel panel_8;
	private Panel panel_9;
	private JDesktopPane desktopPane;
	private JDesktopPane desktopPane_1;
	private Component glue;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		controller = new Controller();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giris frame = new Giris();
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    frame.setSize(screenSize.width, screenSize.height);
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
	public Giris() {
		setType(Type.UTILITY);
		getContentPane().setEnabled(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(new MigLayout("", "[223px][6px][224px][195px,grow][258px][]", "[93px][19px][19px][][][grow][][][][][grow][][19px][][][][][][][][][][][][][][][]"));
		
		panel = new Panel();
		panel.setForeground(SystemColor.inactiveCaption);
		panel.setBackground(SystemColor.inactiveCaption);
		getContentPane().add(panel, "cell 3 2,grow");
		
		glue = Box.createGlue();
		getContentPane().add(glue, "flowx,cell 3 3");
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Music Reviewer'a Hos Geldiniz");
		lblNewJgoodiesTitle.setFocusTraversalKeysEnabled(false);
		lblNewJgoodiesTitle.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lblNewJgoodiesTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewJgoodiesTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewJgoodiesTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewJgoodiesTitle.setFont(new Font("Cambria", Font.BOLD, 99));
		lblNewJgoodiesTitle.setForeground(new Color(255, 255, 255));
		getContentPane().add(lblNewJgoodiesTitle, "cell 3 3,growx,aligny center");
		
		panel_1 = new Panel();
		panel_1.setForeground(SystemColor.inactiveCaption);
		panel_1.setBackground(SystemColor.inactiveCaption);
		getContentPane().add(panel_1, "cell 3 4,grow");
		
		txtKullaniciAdi = new JTextField();
		txtKullaniciAdi.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtKullaniciAdi.setEnabled(false);
		txtKullaniciAdi.setEditable(false);
		txtKullaniciAdi.setForeground(Color.GRAY);
		txtKullaniciAdi.setBackground(Color.GRAY);
		txtKullaniciAdi.setText("Kullanici Adi:");
		getContentPane().add(txtKullaniciAdi, "flowx,cell 3 7,alignx center,aligny top");
		txtKullaniciAdi.setColumns(10);
		
		txtSifre = new JTextField();
		txtSifre.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtSifre.setEnabled(false);
		txtSifre.setEditable(false);
		txtSifre.setText("Sifre:");
		txtSifre.setForeground(Color.GRAY);
		txtSifre.setColumns(10);
		txtSifre.setBackground(Color.GRAY);
		getContentPane().add(txtSifre, "flowx,cell 3 8,alignx center,aligny top");
		
		Button button = new Button("Giris Yap");
		button.setFont(new Font("Dialog", Font.PLAIN, 30));
		button.addActionListener(new ActionListener() {
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
				}
				else {
					System.out.println(nickname+" hosgeldiniz");
				}
			}
		});
		button.setActionCommand("GirisYapma");
		getContentPane().add(button, "cell 3 9,alignx center");
		
		desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.DARK_GRAY);
		getContentPane().add(desktopPane_1, "cell 3 10,grow");
		
		panel_9 = new Panel();
		panel_9.setFont(new Font("Dialog", Font.PLAIN, 30));
		panel_9.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel_9, "cell 3 13,alignx center,aligny center");
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.DARK_GRAY);
		getContentPane().add(desktopPane, "cell 3 14,grow");
		
		panel_8 = new Panel();
		panel_8.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel_8, "cell 3 18");
		
		panel_7 = new Panel();
		panel_7.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel_7, "cell 3 19");
		
		panel_5 = new Panel();
		panel_5.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel_5, "cell 3 20");
		
		panel_3 = new Panel();
		panel_3.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel_3, "cell 3 21");
		
		panel_4 = new Panel();
		panel_4.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel_4, "cell 3 22");
		
		panel_2 = new Panel();
		panel_2.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel_2, "cell 3 23");
		
		panel_6 = new Panel();
		panel_6.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel_6, "cell 3 24");
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textField.setFocusTraversalKeysEnabled(false);
		textField.setToolTipText("");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(textField, "cell 3 7,alignx trailing,aligny top");
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		passwordField.setColumns(10);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(passwordField, "cell 3 8,alignx trailing,aligny top");
	}
}
