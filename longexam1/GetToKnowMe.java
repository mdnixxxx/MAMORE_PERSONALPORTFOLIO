package longexam1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class GetToKnowMe extends JFrame implements MyNameInfo, MyBirthInfo, MyEducationInfo {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetToKnowMe frame = new GetToKnowMe();
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
	public GetToKnowMe() {
		
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
			}
		});
		pnlBtn_About.setBackground(new Color(255, 255, 255));
		pnlBtn_About.setBounds(435, 0, 95, 96);
		pnl_Header.add(pnlBtn_About);
		pnlBtn_About.setLayout(null);
		
		JLabel lbl_Aboutme = new JLabel("    ABOUT ME");
		lbl_Aboutme.setForeground(new Color(201, 10, 228));
		lbl_Aboutme.setBounds(0, 42, 95, 14);
		pnlBtn_About.add(lbl_Aboutme);
		
		JPanel pnl_design = new JPanel();
		pnl_design.setBackground(new Color(219, 35, 245));
		pnl_design.setBounds(0, 0, 95, 14);
		pnlBtn_About.add(pnl_design);
		
		JPanel pnlBtn_Works = new JPanel();
		pnlBtn_Works.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Works works = new Works();
				works.setVisible(true);
				dispose();
			}
		});
		pnlBtn_Works.setLayout(null);
		pnlBtn_Works.setBackground(Color.WHITE);
		pnlBtn_Works.setBounds(540, 0, 95, 96);
		pnl_Header.add(pnlBtn_Works);
		
		JLabel lbl_Works = new JLabel("        WORKS");
		lbl_Works.setForeground(new Color(106, 0, 106));
		lbl_Works.setBounds(0, 42, 95, 14);
		pnlBtn_Works.add(lbl_Works);
		
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
		
		// FOR ABOUT ME CLASS ONLY
		JPanel pnl_Main = new JPanel();
		pnl_Main.setBackground(new Color(255, 255, 255));
		pnl_Main.setBounds(0, 94, 740, 363);
		contentPane.add(pnl_Main);
		pnl_Main.setLayout(null);
		
		JPanel pnl_Side = new JPanel();
		pnl_Side.setBackground(new Color(233, 199, 245));
		pnl_Side.setBounds(0, 0, 258, 362);
		pnl_Main.add(pnl_Side);
		pnl_Side.setLayout(null);
		
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
		
		JPanel pnlBtn_WhoAmI = new JPanel();
		pnlBtn_WhoAmI.setBackground(new Color(255, 255, 255));
		pnlBtn_WhoAmI.setBounds(22, 136, 207, 32);
		pnl_Side.add(pnlBtn_WhoAmI);
		pnlBtn_WhoAmI.setLayout(null);
		
		JLabel lbl_Who = new JLabel("WHO AM I");
		lbl_Who.setForeground(new Color(164, 0, 164));
		lbl_Who.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 13));
		lbl_Who.setBounds(73, 11, 63, 14);
		pnlBtn_WhoAmI.add(lbl_Who);
		
		JPanel pnlBtn_Birth = new JPanel();
		pnlBtn_Birth.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent e) {
				Birth birth = new Birth ();
				birth.setVisible(true);
				dispose();
			}
		});
		pnlBtn_Birth.setLayout(null);
		pnlBtn_Birth.setBackground(Color.WHITE);
		pnlBtn_Birth.setBounds(22, 179, 207, 32);
		pnl_Side.add(pnlBtn_Birth);
		
		JLabel lbl_Birth = new JLabel("   BIRTH");
		lbl_Birth.setForeground(new Color(164, 0, 164));
		lbl_Birth.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 13));
		lbl_Birth.setBounds(78, 11, 63, 14);
		pnlBtn_Birth.add(lbl_Birth);
		
		JPanel pnlBtn_Education = new JPanel();
		pnlBtn_Education.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent e) {
				Education education = new Education();
				education.setVisible(true);
				dispose();
			}
		});
		pnlBtn_Education.setLayout(null);
		pnlBtn_Education.setBackground(Color.WHITE);
		pnlBtn_Education.setBounds(22, 222, 207, 32);
		pnl_Side.add(pnlBtn_Education);
		
		JLabel lbl_Education = new JLabel("EDUCATION");
		lbl_Education.setForeground(new Color(164, 0, 164));
		lbl_Education.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 13));
		lbl_Education.setBounds(73, 11, 72, 14);
		pnlBtn_Education.add(lbl_Education);
		
		JPanel pnlBtn_Hobbies = new JPanel();
		pnlBtn_Hobbies.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent e) {
				Hobbies hobbies = new Hobbies();
				hobbies.setVisible(true);
				dispose();
			}
		});
		pnlBtn_Hobbies.setLayout(null);
		pnlBtn_Hobbies.setBackground(Color.WHITE);
		pnlBtn_Hobbies.setBounds(22, 268, 207, 32);
		pnl_Side.add(pnlBtn_Hobbies);
		
		JLabel lbl_Hobbies = new JLabel("  HOBBIES");
		lbl_Hobbies.setForeground(new Color(164, 0, 164));
		lbl_Hobbies.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 13));
		lbl_Hobbies.setBounds(71, 11, 63, 14);
		pnlBtn_Hobbies.add(lbl_Hobbies);
		
		JPanel pnlBtn_Achievements = new JPanel();
		pnlBtn_Achievements.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent e) {
				Achievements achieve = new Achievements();
				achieve.setVisible(true);
				dispose();
			}
		});
		pnlBtn_Achievements.setLayout(null);
		pnlBtn_Achievements.setBackground(Color.WHITE);
		pnlBtn_Achievements.setBounds(22, 311, 207, 32);
		pnl_Side.add(pnlBtn_Achievements);
		
		JLabel lbl_Achievements = new JLabel("ACHIEVEMENTS");
		lbl_Achievements.setForeground(new Color(164, 0, 164));
		lbl_Achievements.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 13));
		lbl_Achievements.setBounds(57, 11, 93, 14);
		pnlBtn_Achievements.add(lbl_Achievements);
		
		JLabel img_Smallpic = new JLabel("");
		img_Smallpic.setIcon(new ImageIcon(GetToKnowMe.class.getResource("/pictires/other details.png")));
		img_Smallpic.setBounds(10, -11, 238, 431);
		pnl_Side.add(img_Smallpic);
		
		//ONLY FOR GET TO KNOW ME CLASS 
		JLabel lbl_TName = new JLabel("NAME");
		lbl_TName.setForeground(new Color(213, 196, 47));
		lbl_TName.setFont(new Font("Sylfaen", Font.BOLD, 20));
		lbl_TName.setBounds(280, 57, 140, 23);
		pnl_Main.add(lbl_TName);
		
		JLabel lbl_Name = new JLabel(Name);
		lbl_Name.setFont(new Font("Dialog", Font.ITALIC, 13));
		lbl_Name.setBounds(301, 80, 175, 14);
		pnl_Main.add(lbl_Name);
		
		JLabel lbl_Nickname = new JLabel(NickName);
		lbl_Nickname.setFont(new Font("Dialog", Font.ITALIC, 13));
		lbl_Nickname.setBounds(301, 136, 175, 14);
		pnl_Main.add(lbl_Nickname);
		
		JLabel lbl_TNickname = new JLabel("NICKNAME");
		lbl_TNickname.setForeground(new Color(213, 196, 47));
		lbl_TNickname.setFont(new Font("Sylfaen", Font.BOLD, 20));
		lbl_TNickname.setBounds(280, 117, 140, 23);
		pnl_Main.add(lbl_TNickname);
		
		JLabel lbl_TAge = new JLabel("AGE");
		lbl_TAge.setForeground(new Color(213, 196, 47));
		lbl_TAge.setFont(new Font("Sylfaen", Font.BOLD, 20));
		lbl_TAge.setBounds(510, 23, 140, 23);
		pnl_Main.add(lbl_TAge);
		
		JLabel lbl_Age = new JLabel(Age);
		lbl_Age.setFont(new Font("Dialog", Font.ITALIC, 13));
		lbl_Age.setBounds(531, 46, 175, 14);
		pnl_Main.add(lbl_Age);
		
		JLabel lbl_TGender = new JLabel("GENDER");
		lbl_TGender.setForeground(new Color(213, 196, 47));
		lbl_TGender.setFont(new Font("Sylfaen", Font.BOLD, 20));
		lbl_TGender.setBounds(510, 83, 140, 23);
		pnl_Main.add(lbl_TGender);
		
		JLabel lbl_Gender = new JLabel(Gender);
		lbl_Gender.setFont(new Font("Dialog", Font.ITALIC, 13));
		lbl_Gender.setBounds(531, 102, 175, 14);
		pnl_Main.add(lbl_Gender);
		
		JLabel lbl_TCourse = new JLabel("COURSE");
		lbl_TCourse.setForeground(new Color(213, 196, 47));
		lbl_TCourse.setFont(new Font("Sylfaen", Font.BOLD, 20));
		lbl_TCourse.setBounds(280, 171, 140, 23);
		pnl_Main.add(lbl_TCourse);
		
		JTextArea txtA_Course = new JTextArea();
		txtA_Course.setEditable(false);
		txtA_Course.setOpaque(false);
		txtA_Course.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtA_Course.setText("Bachelor of Science in \nInformation Technology with \nSpecialization in Mobile \nand Web Application");
		txtA_Course.setBounds(301, 195, 194, 72);
		pnl_Main.add(txtA_Course);
		
		JLabel lbl_TReason = new JLabel("REASON");
		lbl_TReason.setForeground(new Color(213, 196, 47));
		lbl_TReason.setFont(new Font("Sylfaen", Font.BOLD, 20));
		lbl_TReason.setBounds(510, 137, 140, 23);
		pnl_Main.add(lbl_TReason);
		
		JTextArea txtA_Reason = new JTextArea();
		txtA_Reason.setOpaque(false);
		txtA_Reason.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtA_Reason.setText("Technology is one of the most \ngrowing and most successful \nindustry in the world today. "
				+ "\nTherefore, there is no doubt \nthat IT or other related \nprofessions are in demand. It \nis certain that there will be"
				+ "\na lot of opportunity in this \nindustry.");
		txtA_Reason.setEditable(false);
		txtA_Reason.setBounds(525, 156, 205, 148);
		pnl_Main.add(txtA_Reason);
		
		JLabel img_Bg = new JLabel("");
		img_Bg.setIcon(new ImageIcon(GetToKnowMe.class.getResource("/pictires/bgdesign.png")));
		img_Bg.setBounds(148, -22, 592, 507);
		pnl_Main.add(img_Bg);
	}
}
