package longexam1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Education extends JFrame implements MyEducationInfo {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Education frame = new Education();
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
	public Education() {
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
		
		// FOR ABOUT ME

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
		pnlBtn_WhoAmI.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent e) {
				GetToKnowMe gtkm = new GetToKnowMe();
				gtkm.setVisible(true);
				dispose();
			}
		});
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
		
		//FOR EDUCATION CLASS ONLY
		JLabel lbl_MyEdu = new JLabel("MY EDUCATION");
		lbl_MyEdu.setForeground(new Color(142, 0, 142));
		lbl_MyEdu.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl_MyEdu.setFont(new Font("Californian FB", Font.BOLD, 22));
		lbl_MyEdu.setBounds(417, 11, 180, 38);
		pnl_Main.add(lbl_MyEdu);
		
		JLabel lbl_Kinder = new JLabel("KINDERGARTEN");
		lbl_Kinder.setForeground(new Color(213, 196, 47));
		lbl_Kinder.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lbl_Kinder.setBounds(290, 60, 149, 23);
		pnl_Main.add(lbl_Kinder);
		
		JLabel lbl_KidSchool = new JLabel(Kinder);
		lbl_KidSchool.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lbl_KidSchool.setBounds(312, 81, 394, 14);
		pnl_Main.add(lbl_KidSchool);
		
		JLabel lbl_Elementary = new JLabel("ELEMENTARY SCHOOL");
		lbl_Elementary.setForeground(new Color(213, 196, 47));
		lbl_Elementary.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lbl_Elementary.setBounds(290, 116, 205, 23);
		pnl_Main.add(lbl_Elementary);
		
		JLabel lbl_ElemSchool = new JLabel(Elementary);
		lbl_ElemSchool.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lbl_ElemSchool.setBounds(312, 132, 394, 14);
		pnl_Main.add(lbl_ElemSchool);
		
		JLabel lbl_Junior = new JLabel("JUNIOR HIGH SCHOOL");
		lbl_Junior.setForeground(new Color(213, 196, 47));
		lbl_Junior.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lbl_Junior.setBounds(290, 171, 231, 23);
		pnl_Main.add(lbl_Junior);
		
		JLabel lbl_JHS = new JLabel(Junior);
		lbl_JHS.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lbl_JHS.setBounds(312, 193, 394, 14);
		pnl_Main.add(lbl_JHS);
		
		JLabel lbl_Senior = new JLabel("SENIOR HIGH SCHOOL");
		lbl_Senior.setForeground(new Color(213, 196, 47));
		lbl_Senior.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lbl_Senior.setBounds(290, 228, 231, 23);
		pnl_Main.add(lbl_Senior);
		
		JLabel lbl_SHS = new JLabel(Senior);
		lbl_SHS.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lbl_SHS.setBounds(312, 248, 394, 14);
		pnl_Main.add(lbl_SHS);
		
		JLabel lbl_Current = new JLabel("CURRENT");
		lbl_Current.setForeground(new Color(213, 196, 47));
		lbl_Current.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lbl_Current.setBounds(290, 280, 231, 23);
		pnl_Main.add(lbl_Current);
		
		JLabel lbl_CurrentSchool = new JLabel(Current);
		lbl_CurrentSchool.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lbl_CurrentSchool.setBounds(312, 300, 394, 14);
		pnl_Main.add(lbl_CurrentSchool);
		
		JLabel img_Bg = new JLabel("");
		img_Bg.setIcon(new ImageIcon(GetToKnowMe.class.getResource("/pictires/bgdesign.png")));
		img_Bg.setBounds(148, -45, 592, 552);
		pnl_Main.add(img_Bg);
	}

}
