package longexam1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class Works extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Works frame = new Works();
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
	public Works() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(270, 90, 754, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnl_Header = new JPanel();
		pnl_Header.setBackground(new Color(255, 255, 255));
		pnl_Header.setBounds(0, 0, 740, 95);
		contentPane.add(pnl_Header);
		pnl_Header.setLayout(null);
		
		JPanel pnlBtn_About = new JPanel();
		pnlBtn_About.addMouseListener(new MouseAdapter(){
			public void mouseClicked (MouseEvent e) {
				GetToKnowMe gtkm = new GetToKnowMe();
				gtkm.setVisible(true);
				dispose();
			}
		});
		pnlBtn_About.setBackground(new Color(255, 255, 255));
		pnlBtn_About.setBounds(435, 0, 95, 96);
		pnl_Header.add(pnlBtn_About);
		pnlBtn_About.setLayout(null);
		
		JLabel lbl_Aboutme = new JLabel("    ABOUT ME");
		lbl_Aboutme.setForeground(new Color(106, 0, 106));
		lbl_Aboutme.setBounds(0, 42, 95, 14);
		pnlBtn_About.add(lbl_Aboutme);
		
		JPanel pnlBtn_Works = new JPanel();
		pnlBtn_Works.setLayout(null);
		pnlBtn_Works.setBackground(Color.WHITE);
		pnlBtn_Works.setBounds(540, 0, 95, 96);
		pnl_Header.add(pnlBtn_Works);
		
		JLabel lbl_Works = new JLabel("      WORKS");
		lbl_Works.setForeground(new Color(201, 10, 228));
		lbl_Works.setBounds(0, 42, 95, 14);
		pnlBtn_Works.add(lbl_Works);
		
		JPanel pnl_design = new JPanel();
		pnl_design.setBackground(new Color(219, 35, 245));
		pnl_design.setBounds(0, 0, 95, 14);
		pnlBtn_Works.add(pnl_design);
		
		JPanel pnlBtn_Contact = new JPanel();
		pnlBtn_Contact.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Contact contact = new Contact();
				contact.setVisible(true);
				dispose();
			}
		});
		pnlBtn_Contact.setLayout(null);
		pnlBtn_Contact.setBackground(Color.WHITE);
		pnlBtn_Contact.setBounds(645, 0, 95, 96);
		pnl_Header.add(pnlBtn_Contact);
		
		JLabel lbl_Contact = new JLabel("   CONTACT");
		lbl_Contact.setForeground(new Color(106, 0, 106));
		lbl_Contact.setBounds(0, 42, 95, 14);
		pnlBtn_Contact.add(lbl_Contact);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(128, 128, 128));
		separator.setBounds(739, 94, -738, 14);
		pnl_Header.add(separator);
		
		JLabel lbl_HName = new JLabel("Danica Anne Mamore");
		lbl_HName.setForeground(new Color(164, 0, 164));
		lbl_HName.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lbl_HName.setBounds(36, 28, 160, 17);
		pnl_Header.add(lbl_HName);
		
		JLabel lbl_HCourse = new JLabel("INFORMATION TECHNOLOGY");
		lbl_HCourse.setForeground(new Color(105, 105, 105));
		lbl_HCourse.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_HCourse.setBounds(36, 46, 203, 14);
		pnl_Header.add(lbl_HCourse);
		
		//FOR WORK CLASS ONLY
		JPanel pnl_Main = new JPanel();
		pnl_Main.setBackground(new Color(64, 0, 64));
		pnl_Main.setBounds(0, 94, 740, 363);
		contentPane.add(pnl_Main);
		pnl_Main.setLayout(null);
		
		JButton btn_Homepage = new JButton("Homepage");
		btn_Homepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Landing landing = new Landing();
				landing.setVisible(true);
				dispose();
			}
		});
		btn_Homepage.setForeground(new Color(196, 0, 196));
		btn_Homepage.setBackground(new Color(233, 199, 245));
		btn_Homepage.setBounds(623, 329, 107, 23);
		pnl_Main.add(btn_Homepage);
		
		JLabel lbl_MyWorks = new JLabel("MY PREVIOUS WORKS");
		lbl_MyWorks.setForeground(new Color(213, 196, 47));
		lbl_MyWorks.setFont(new Font("Segoe UI Black", Font.PLAIN, 35));
		lbl_MyWorks.setBounds(168, 21, 394, 49);
		pnl_Main.add(lbl_MyWorks);
		
		JPanel pnlBtn_Library = new JPanel();
		pnlBtn_Library.setBackground(new Color(233, 199, 245));
		pnlBtn_Library.setBounds(278, 88, 188, 166);
		pnl_Main.add(pnlBtn_Library);
		pnlBtn_Library.setLayout(null);
		
		JLabel img_Library = new JLabel("");
		img_Library.setIcon(new ImageIcon(Works.class.getResource("/pictires/libsystem.png")));
		img_Library.setBounds(0, 0, 188, 166);
		pnlBtn_Library.add(img_Library);
		
		JPanel pnlBtn_BMI = new JPanel();
		pnlBtn_BMI.setBackground(new Color(233, 199, 245));
		pnlBtn_BMI.setBounds(511, 88, 188, 166);
		pnl_Main.add(pnlBtn_BMI);
		pnlBtn_BMI.setLayout(null);
		
		JLabel img_BMI = new JLabel("");
		img_BMI.setIcon(new ImageIcon(Works.class.getResource("/pictires/bmicalcu.png")));
		img_BMI.setBounds(0, 0, 188, 166);
		pnlBtn_BMI.add(img_BMI);
		
		JPanel pnlBtn_TicTacToe = new JPanel();
		pnlBtn_TicTacToe.setBackground(new Color(233, 199, 245));
		pnlBtn_TicTacToe.setBounds(41, 90, 188, 166);
		pnl_Main.add(pnlBtn_TicTacToe);
		pnlBtn_TicTacToe.setLayout(null);
		
		JLabel img_TicTac = new JLabel("");
		img_TicTac.setIcon(new ImageIcon(Works.class.getResource("/pictires/tictactoe (1).png")));
		img_TicTac.setBounds(0, 0, 188, 166);
		pnlBtn_TicTacToe.add(img_TicTac);
		
		JTextArea txtA_TicTac = new JTextArea();
		txtA_TicTac.setText("A game in which two players take \nturns drawing three Os or three \nXs in the gaps of a grid of \nnine squares to form a row, a \ncolumn, or a diagonal.");
		txtA_TicTac.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtA_TicTac.setForeground(new Color(255, 255, 255));
		txtA_TicTac.setBackground(new Color(64, 0, 64));
		txtA_TicTac.setEditable(false);
		txtA_TicTac.setBounds(41, 267, 198, 72);
		pnl_Main.add(txtA_TicTac);
		
		JTextArea txtA_Library = new JTextArea();
		txtA_Library.setForeground(new Color(255, 255, 255));
		txtA_Library.setText("A system that allows the user \nto borrow or rent a book from \nthe management or the admin.");
		txtA_Library.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtA_Library.setEditable(false);
		txtA_Library.setBackground(new Color(64, 0, 64));
		txtA_Library.setBounds(278, 267, 188, 49);
		pnl_Main.add(txtA_Library);
		
		JTextArea txtA_BMI = new JTextArea();
		txtA_BMI.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtA_BMI.setText("A convenient system to determine \na person's body mass index using \nhis or her's height and weight.");
		txtA_BMI.setForeground(new Color(255, 255, 255));
		txtA_BMI.setEditable(false);
		txtA_BMI.setBackground(new Color(64, 0, 64));
		txtA_BMI.setBounds(511, 267, 198, 49);
		pnl_Main.add(txtA_BMI);
	}

}
