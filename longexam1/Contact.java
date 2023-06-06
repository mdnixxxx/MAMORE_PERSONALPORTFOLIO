package longexam1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Contact extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact frame = new Contact();
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
	public Contact() {
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
		pnlBtn_Works.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent e) {
				Works works = new Works();
				works.setVisible(true);
				dispose();
			}
		});;
		pnlBtn_Works.setLayout(null);
		pnlBtn_Works.setBackground(Color.WHITE);
		pnlBtn_Works.setBounds(540, 0, 95, 96);
		pnl_Header.add(pnlBtn_Works);
		
		JLabel lbl_Works = new JLabel("      WORKS");
		lbl_Works.setForeground(new Color(106, 0, 106));
		lbl_Works.setBounds(0, 42, 95, 14);
		pnlBtn_Works.add(lbl_Works);
		
		JPanel pnlBtn_Contact = new JPanel();
		pnlBtn_Contact.setLayout(null);
		pnlBtn_Contact.setBackground(Color.WHITE);
		pnlBtn_Contact.setBounds(645, 0, 95, 96);
		pnl_Header.add(pnlBtn_Contact);
		
		JLabel lbl_Contact = new JLabel("   CONTACT");
		lbl_Contact.setForeground(new Color(201, 10, 228));
		lbl_Contact.setBounds(0, 42, 95, 14);
		pnlBtn_Contact.add(lbl_Contact);
		
		JPanel pnl_design = new JPanel();
		pnl_design.setBackground(new Color(219, 35, 245));
		pnl_design.setBounds(0, 0, 95, 14);
		pnlBtn_Contact.add(pnl_design);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(128, 128, 128));
		separator.setBounds(739, 94, -738, 14);
		pnl_Header.add(separator);
		
		JPanel pnl_Main = new JPanel();
		pnl_Main.setBackground(new Color(255, 255, 255));
		pnl_Main.setBounds(0, 93, 740, 364);
		contentPane.add(pnl_Main);
		pnl_Main.setLayout(null);
		
		JLabel img_MyPic = new JLabel("");
		img_MyPic.setBounds(461, 0, 346, 422);
		pnl_Main.add(img_MyPic);
		img_MyPic.setIcon(new ImageIcon(Contact.class.getResource("/pictires/MyPic.png")));
		
		JPanel pnl_Maindesign = new JPanel();
		pnl_Maindesign.setBackground(new Color(233, 199, 245));
		pnl_Maindesign.setBounds(0, 34, 740, 255);
		pnl_Main.add(pnl_Maindesign);
		pnl_Maindesign.setLayout(null);
		
		JPanel pnl_Address = new JPanel();
		pnl_Address.setBackground(new Color(233, 199, 245));
		pnl_Address.setBounds(28, 141, 208, 103);
		pnl_Maindesign.add(pnl_Address);
		pnl_Address.setLayout(null);
		
		JLabel img_Address = new JLabel("");
		img_Address.setIcon(new ImageIcon(Contact.class.getResource("/pictires/address.png")));
		img_Address.setBounds(0, 0, 208, 103);
		pnl_Address.add(img_Address);
		
		JPanel pnl_Contact = new JPanel();
		pnl_Contact.setBackground(new Color(233, 199, 245));
		pnl_Contact.setBounds(263, 141, 208, 103);
		pnl_Maindesign.add(pnl_Contact);
		pnl_Contact.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Contact.class.getResource("/pictires/contact.png")));
		lblNewLabel.setBounds(0, 0, 208, 103);
		pnl_Contact.add(lblNewLabel);
		
		JLabel lbl_HName = new JLabel("Danica Anne Mamore");
		lbl_HName.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl_HName.setBounds(28, 35, 392, 42);
		pnl_Maindesign.add(lbl_HName);
		lbl_HName.setForeground(new Color(196, 0, 196));
		lbl_HName.setFont(new Font("Cambria Math", Font.BOLD, 38));
		
		JLabel lbl_HCourse = new JLabel("INFORMATION TECHNOLOGY");
		lbl_HCourse.setBounds(28, 96, 291, 21);
		pnl_Maindesign.add(lbl_HCourse);
		lbl_HCourse.setForeground(new Color(105, 105, 105));
		lbl_HCourse.setFont(new Font("Dialog", Font.ITALIC, 16));
		
		JLabel lbl_HCourse_1 = new JLabel("1st YEAR STUDENT");
		lbl_HCourse_1.setForeground(SystemColor.controlDkShadow);
		lbl_HCourse_1.setFont(new Font("Dialog", Font.ITALIC, 16));
		lbl_HCourse_1.setBounds(28, 74, 291, 21);
		pnl_Maindesign.add(lbl_HCourse_1);
		
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
		btn_Homepage.setBounds(31, 316, 107, 23);
		pnl_Main.add(btn_Homepage);
	}

}
