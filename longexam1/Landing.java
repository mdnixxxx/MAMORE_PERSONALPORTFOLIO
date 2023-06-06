package longexam1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Landing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Landing frame = new Landing();
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
	public Landing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(270, 90, 754, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnl_Header = new JPanel();
		pnl_Header.setBackground(new Color(255, 255, 255));
		pnl_Header.setBounds(0, 0, 740, 96);
		contentPane.add(pnl_Header);
		pnl_Header.setLayout(null);
		
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
		
		JPanel pnlBtn_About = new JPanel();
		pnlBtn_About.addMouseListener(new MouseAdapter(){
			public void mouseClicked (MouseEvent e) {
				GetToKnowMe gtk = new GetToKnowMe();
				gtk.setVisible(true);
				dispose();
			}
		});
		pnlBtn_About.setBackground(new Color(255, 255, 255));
		pnlBtn_About.setBounds(426, 0, 95, 96);
		pnl_Header.add(pnlBtn_About);
		pnlBtn_About.setLayout(null);
		
		JLabel lbl_Aboutme = new JLabel("ABOUT ME");
		lbl_Aboutme.setForeground(new Color(106, 0, 106));
		lbl_Aboutme.setBounds(10, 46, 65, 14);
		pnlBtn_About.add(lbl_Aboutme);
		
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
		
		JPanel pnl_Main = new JPanel();
		pnl_Main.setBackground(new Color(0, 0, 0));
		pnl_Main.setBounds(0, 94, 740, 363);
		contentPane.add(pnl_Main);
		pnl_Main.setLayout(null);
		
		JLabel img_Mypic = new JLabel("New label");
		img_Mypic.setIcon(new ImageIcon(Landing.class.getResource("/pictires/MyPic.png")));
		img_Mypic.setBounds(428, 0, 339, 421);
		pnl_Main.add(img_Mypic);
		
		JLabel lbl_Welcome1 = new JLabel("Hello! welcome to my");
		lbl_Welcome1.setForeground(new Color(255, 255, 255));
		lbl_Welcome1.setFont(new Font("Cambria", Font.BOLD, 36));
		lbl_Welcome1.setBounds(58, 85, 371, 51);
		pnl_Main.add(lbl_Welcome1);
		
		JLabel lbl_Welcome2 = new JLabel("personal portfolio!");
		lbl_Welcome2.setForeground(Color.WHITE);
		lbl_Welcome2.setFont(new Font("Cambria", Font.BOLD, 36));
		lbl_Welcome2.setBounds(58, 127, 346, 51);
		pnl_Main.add(lbl_Welcome2);
		
		JLabel lbl_Title = new JLabel("Making visions into reality.");
		lbl_Title.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lbl_Title.setForeground(new Color(255, 255, 255));
		lbl_Title.setBounds(58, 182, 247, 25);
		pnl_Main.add(lbl_Title);
		
		JButton btnNewButton = new JButton("Get to know me");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GetToKnowMe gtk = new GetToKnowMe();
				gtk.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(201, 10, 228));
		btnNewButton.setBounds(58, 277, 130, 23);
		pnl_Main.add(btnNewButton);
		
		JLabel bgdesign = new JLabel("");
		bgdesign.setIcon(new ImageIcon(Landing.class.getResource("/pictires/bgdesign.png")));
		bgdesign.setBounds(-111, -42, 705, 494);
		pnl_Main.add(bgdesign);
	}
}
