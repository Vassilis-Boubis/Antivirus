package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class HomePage {

	private JFrame frame;
	private AntiPanel panel;
	private JTextArea symptoms;
	private JTextArea prevention;
	private JTextArea treatments;
	private ImageIcon image = new ImageIcon(getClass().getResource("e9ebee.png"));
	private ImageIcon image2 = new ImageIcon(getClass().getResource("ffffff.png"));
	private ImageIcon image3 = new ImageIcon(getClass().getResource("0066ff.png"));
	private ImageIcon image4 = new ImageIcon(getClass().getResource("F7F7F7.png"));
	private ImageIcon logo = new ImageIcon(getClass().getResource("logo.jpeg"));
	private JLabel logol;
	private ImageIcon map = new ImageIcon(getClass().getResource("map.png"));
	private JLabel mapl;
	private JButton homeb;
	private JLabel home;
	private JButton aboutb;
	private JLabel about;
	private JButton contactb;
	private JLabel contact;
	private JTextField search;
	private ImageIcon gs = new ImageIcon(getClass().getResource("search.png"));
	private JButton go;
	private JButton widg1b;
	private JLabel widg1;
	private JLabel blue2;
	private JButton widg2b;
	private JLabel widg2;
	private JButton widg3b;
	private JLabel widg3;
	private JScrollPane sp;
	private JScrollPane sp2;
	private JScrollPane sp3;



	public void makePage() {

		// GUI frame and panel creation
		frame = new JFrame();
		frame.setSize(1400,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Antivirus by DETechtives BETA version 1v.0.1");

		panel = new AntiPanel();
		frame.add(panel);
		panel.setLayout(null);


		// Set the frame to be appeared always in the center of the screen, regardless monitor
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height);










		// Home button creation
		homeb = new JButton("HOME");
		homeb.setIcon(image2);
		home = new JLabel("HOME");
		home.setFont(new Font("Helvectiva", Font.BOLD,16));
		home.setForeground(new Color(16, 44, 86));
		homeb.setBounds(120, 250, 70, 30);
		homeb.add(home);
		panel.add(homeb);




		// About Us button creation
		aboutb = new JButton("ABOUT US");
		aboutb.setIcon(image);
		about = new JLabel("ABOUT US");
		about.setFont(new Font("Helvectiva", Font.BOLD,16));
		about.setForeground(new Color(16, 44, 86));
		aboutb.setBounds(120, 300, 100, 30);
		aboutb.add(about);
		panel.add(aboutb);
		aboutb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

					String action = e.getActionCommand();
					MasterCtrl.pageHandler(action);

			}
		});



		// Contact button creation
		contactb = new JButton("CONTACT");
		contactb.setIcon(image);
		contact = new JLabel("CONTACT");
		contact.setFont(new Font("Helvectiva", Font.BOLD,16));
		contact.setForeground(new Color(16, 44, 86));
		contactb.setBounds(120, 350, 100, 30);
		contactb.add(contact);
		panel.add(contactb);
		contactb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

					String action = e.getActionCommand();
					MasterCtrl.pageHandler(action);

			}
		});





		//Create the tier 2
		//Add search bar

		search = new JTextField("Where do you want to go?", 50);
		search.setBounds(350, 160, 600, 40);
		panel.add(search);


		// Go search button

		go = new JButton("Go!");
		go.setIcon(gs);
		go.setBounds(955, 160, 42, 38);
		panel.add(go);



		logol = new JLabel();
		logol.setIcon(logo);
		logol.setBounds(290, 5, 250, 50);
		panel.add(logol);


		mapl = new JLabel();
		mapl.setIcon(map);
		mapl.setBounds(400, 300, 650, 400);
		panel.add(mapl);







		// Create the tier 3

		widg1b = new JButton("Symptoms");
		widg1b.setIcon(image4);
		widg1 = new JLabel("Symptoms");
		widg1.setFont(new Font("Helvectiva", Font.BOLD, 14));
		widg1.setForeground(new Color(16, 44, 86));
		widg1b.add(widg1);
		widg1b.setBounds(1010, 185, 95, 30);
		panel.add(widg1b);
		widg1b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

					String action = e.getActionCommand();
					uiHandler(action);

			}
		});



		blue2 = new JLabel();
		blue2.setIcon(image3);
		blue2.setBounds(1020, 220, 50, 3);
		panel.add(blue2);


		widg2b = new JButton("Prevention");
		widg2b.setIcon(image4);
		widg2 = new JLabel("Prevention");
		widg2.setFont(new Font("Helvectiva", Font.BOLD, 14));
		widg2.setForeground(new Color(16, 44, 86));
		widg2b.add(widg2);
		widg2b.setBounds(1120, 185, 95, 30);
		panel.add(widg2b);
		widg2b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

					String action = e.getActionCommand();
					uiHandler(action);

			}
		});

		widg3b = new JButton("Treatments");
		widg3b.setIcon(image4);
		widg3 = new JLabel("Treatments");
		widg3.setFont(new Font("Helvectiva", Font.BOLD, 14));
		widg3.setForeground(new Color(16, 44, 86));
		widg3b.add(widg3);
		widg3b.setBounds(1230, 185, 100, 30);
		panel.add(widg3b);
		widg3b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

					String action = e.getActionCommand();
					uiHandler(action);

			}
		});



		String text1 = "\nÎ Î¹Î¿ ÏƒÏ…Ï‡Î½Î¬ ÏƒÏ…Î¼Ï€Ï„ÏŽÎ¼Î±Ï„Î±:\n\n"
				+ "\u2022 Î Ï…Ï�ÎµÏ„ÏŒÏ‚\n"
				+ "\u2022 ÎžÎ·Ï�ÏŒÏ‚ Î²Î®Ï‡Î±Ï‚\n"
				+ "\u2022 ÎšÎ¿Ï�Ï�Î±ÏƒÎ·\n\n\n"
				+ "Î Î¹Î¿ ÏƒÏ€Î¬Î½Î¹Î± ÏƒÏ…Î¼Ï€Ï„ÏŽÎ¼Î±Ï„Î±:\n\n"
				+ "\u2022 Î ÏŒÎ½Î¿Î¹\n"
				+ "\u2022 Î Î¿Î½ÏŒÎ»Î±Î¹Î¼Î¿Ï‚\n"
				+ "\u2022 Î”Î¹Î¬Ï�Ï�Î¿Î¹Î±\n"
				+ "\u2022 Î•Ï€Î¹Ï€ÎµÏ†Ï…ÎºÎ¯Ï„Î¹Î´Î±\n"
				+ "\u2022 Î Î¿Î½Î¿ÎºÎ­Ï†Î±Î»Î¿Ï‚\n"
				+ "\u2022 Î‘Ï€ÏŽÎ»ÎµÎ¹Î± Î³ÎµÏ�ÏƒÎ·Ï‚ Î® ÏŒÏƒÏ†Ï�Î·ÏƒÎ·Ï‚\n"
				+ "\u2022 Î”ÎµÏ�Î¼Î±Ï„Î¹ÎºÏŒ ÎµÎ¾Î¬Î½Î¸Î·Î¼Î± Î® Î±Ï€Î¿Ï‡Ï�Ï‰Î¼Î±Ï„Î¹ÏƒÎ¼ÏŒÏ‚ ÏƒÏ„Î± Î´Î¬Ï‡Ï„Ï…Î»Î± Ï„Ï‰Î½ Ï‡ÎµÏ�Î¹ÏŽÎ½\n"
				+ " Î® Ï„Ï‰Î½ Ï€Î¿Î´Î¹ÏŽÎ½\n\n\n"
				+ "Î£Î¿Î²Î±Ï�Î¬ ÏƒÏ…Î¼Ï€Ï„ÏŽÎ¼Î±Ï„Î±:\n\n"
				+ "\u2022 Î”Ï…ÏƒÎºÎ¿Î»Î¯Î± ÏƒÏ„Î·Î½ Î±Î½Î±Ï€Î½Î¿Î® Î® Î´Ï�ÏƒÏ€Î½Î¿Î¹Î±\n"
				+ "\u2022 Î ÏŒÎ½Î¿Ï‚ Î® Ï€Î¯ÎµÏƒÎ· ÏƒÏ„Î¿ ÏƒÏ„Î®Î¸Î¿Ï‚\n"
				+ "\u2022 Î‘Ï€ÏŽÎ»ÎµÎ¹Î± Î¿Î¼Î¹Î»Î¯Î±Ï‚ Î® ÎºÎ¯Î½Î·ÏƒÎ·Ï‚\n\n\n"
				+ "Î‘Î½ Î­Ï‡ÎµÏ„Îµ ÏƒÎ¿Î²Î±Ï�Î¬ ÏƒÏ…Î¼Ï€Ï„ÏŽÎ¼Î±Ï„Î±, Î¶Î·Ï„Î®ÏƒÏ„Îµ Î¬Î¼ÎµÏƒÎ· Î¹Î±Ï„Ï�Î¹ÎºÎ® Î²Î¿Î®Î¸ÎµÎ¹Î±.\n"
				+ "ÎšÎ±Î»Î­ÏƒÏ„Îµ Î±Ï€ÏŒ Ï€Ï�Î¹Î½ Ï€Ï�Î¿Ï„Î¿Ï� ÎµÏ€Î¹ÏƒÎºÎµÏ†Ï„ÎµÎ¯Ï„Îµ Ï„Î¿Î½ Î¹Î±Ï„Ï�ÏŒ ÏƒÎ±Ï‚ Î® ÎºÎ¬Ï€Î¿Î¹Î¿Î½\n"
				+ "Ï‡ÏŽÏ�Î¿ Ï€Î±Ï�Î¿Ï‡Î®Ï‚ Ï…Ï€Î·Ï�ÎµÏƒÎ¹ÏŽÎ½ Ï…Î³ÎµÎ¯Î±Ï‚.\n\n"
				+ "Î†Ï„Î¿Î¼Î± Î¼Îµ Î®Ï€Î¹Î± ÏƒÏ…Î¼Ï€Ï„ÏŽÎ¼Î±Ï„Î± Ï€Î¿Ï… ÎºÎ±Ï„Î¬ Ï„' Î¬Î»Î»Î± ÎµÎ¯Î½Î±Î¹ Ï…Î³Î¹Î® Î¸Î± Ï€Ï�Î­Ï€ÎµÎ¹\n"
				+ "Î½Î± Î´Î¹Î±Ï‡ÎµÎ¹Ï�Î¹ÏƒÏ„Î¿Ï�Î½ Ï„Î± ÏƒÏ…Î¼Ï€Ï„ÏŽÎ¼Î±Ï„Î¬ Ï„Î¿Ï…Ï‚ ÏƒÏ„Î¿ ÏƒÏ€Î¯Ï„Î¹.\n\n"
				+ "ÎšÎ±Ï„Î¬ Î¼Î­ÏƒÎ¿ ÏŒÏ�Î¿, Ï‡Ï�ÎµÎ¹Î¬Î¶Î¿Î½Ï„Î±Î¹ 5-6 Î·Î¼Î­Ï�ÎµÏ‚ Î±Ï€ÏŒ Ï„Î· ÏƒÏ„Î¹Î³Î¼Î® Ï€Î¿Ï… ÎºÎ¬Ï€Î¿Î¹Î¿Ï‚\n"
				+ "Î¸Î± Î¼Î¿Î»Ï…Î½Î¸ÎµÎ¯ Î¼Îµ Ï„Î¿Î½ Î¹ÏŒ Î¼Î­Ï‡Ï�Î¹ Î½Î± ÎµÎ¼Ï†Î±Î½Î¯ÏƒÎµÎ¹ Ï„Î± ÏƒÏ…Î¼Ï€Ï„ÏŽÎ¼Î±Ï„Î±, Ï‰ÏƒÏ„ÏŒÏƒÎ¿\n"
				+ "Î¼Ï€Î¿Ï�ÎµÎ¯ Î½Î± Ï‡Ï�ÎµÎ¹Î±ÏƒÏ„Î¿Ï�Î½ Î­Ï‰Ï‚ ÎºÎ±Î¹ 14 Î·Î¼Î­Ï�ÎµÏ‚.\n\n\n\n";



		symptoms = new JTextArea(text1);
		symptoms.setBounds(1005, 200, 370, 450);
		symptoms.setEditable(false);
		symptoms.setFont(new Font("Arial", Font.PLAIN, 12));
		sp = new JScrollPane(symptoms);   //Ability to scroll
		sp.setBounds(1015, 258, 365, 430);
		sp.setBorder(BorderFactory.createEmptyBorder());
		panel.add(sp);


		String text2 = "\n\nÎ“Î¹Î± Ï„Î·Î½ Î±Ï€Î¿Ï†Ï…Î³Î® Ï„Î·Ï‚ ÎµÎ¾Î¬Ï€Î»Ï‰ÏƒÎ·Ï‚ Ï„Î¿Ï… COVID-19:\n\n\n\n" +
				"\u2022 Î Î»Î­Î½ÎµÏ„Îµ Ï„Î±ÎºÏ„Î¹ÎºÎ¬ Ï„Î± Ï‡Î­Ï�Î¹Î± ÏƒÎ±Ï‚. Î§Ï�Î·ÏƒÎ¹Î¼Î¿Ï€Î¿Î¹ÎµÎ¯Ï„Îµ ÏƒÎ±Ï€Î¿Ï�Î½Î¹ ÎºÎ±Î¹ Î½ÎµÏ�ÏŒ\n "
				+ "Î® Î±Î»ÎºÎ¿Î¿Î»Î¿Ï�Ï‡Î¿ Î±Î½Ï„Î¹ÏƒÎ·Ï€Ï„Î¹ÎºÏŒ Ï‡ÎµÏ�Î¹ÏŽÎ½.\n\n" +
				"\u2022 ÎšÏ�Î±Ï„Î¬Ï„Îµ Î±Ï€ÏŒÏƒÏ„Î±ÏƒÎ· Î±ÏƒÏ†Î±Î»ÎµÎ¯Î±Ï‚ Î±Ï€ÏŒ Î¿Ï€Î¿Î¹Î¿Î½Î´Î®Ï€Î¿Ï„Îµ Î²Î®Ï‡ÎµÎ¹ Î® Ï†Ï„ÎµÏ�Î½Î¯Î¶ÎµÏ„Î±Î¹.\n\n" +
				"\u2022 ÎŒÏ€Î¿Ï… Î´ÎµÎ½ ÎµÎ¯Î½Î±Î¹ Î´Ï…Î½Î±Ï„ÏŒ Î½Î± Î´Î¹Î±Ï„Î·Ï�Î®ÏƒÎµÏ„Îµ Ï†Ï…ÏƒÎ¹ÎºÎ® Î±Ï€ÏŒÏƒÏ„Î±ÏƒÎ·, Ï†Î¿Ï�Î­ÏƒÏ„Îµ\n"
				+ "Î¼Î¬ÏƒÎºÎ±.\n\n" +
				"\u2022 ÎœÎ·Î½ Î±ÎºÎ¿Ï…Î¼Ï€Î¬Ï„Îµ Ï„Î± Î¼Î¬Ï„Î¹Î±, Ï„Î· Î¼Ï�Ï„Î· Î® Ï„Î¿ ÏƒÏ„ÏŒÎ¼Î± ÏƒÎ±Ï‚.\n\n" +
				"\u2022 ÎšÎ±Î»Ï�Ï€Ï„ÎµÏ„Îµ Ï„Î· Î¼Ï�Ï„Î· ÎºÎ±Î¹ Ï„Î¿ ÏƒÏ„ÏŒÎ¼Î± ÏƒÎ±Ï‚ Î¼Îµ Ï„Î¿ ÎµÏƒÏ‰Ï„ÎµÏ�Î¹ÎºÏŒ Ï„Î¿Ï… Î±Î³ÎºÏŽÎ½Î± ÏƒÎ±Ï‚ "
				+ "Î® Î¼Îµ Î­Î½Î± Ï‡Î±Ï�Ï„Î¿Î¼Î¬Î½Ï„Î¹Î»Î¿ ÏŒÏ„Î±Î½ Î²Î®Ï‡ÎµÏ„Îµ Î® Ï†Ï„ÎµÏ�Î½Î¯Î¶ÎµÏƒÏ„Îµ.\n\n" +
				"\u2022 ÎœÎµÎ¯Î½ÎµÏ„Îµ ÏƒÏ€Î¯Ï„Î¹ Î±Î½ Î´ÎµÎ½ Î±Î¹ÏƒÎ¸Î¬Î½ÎµÏƒÏ„Îµ ÎºÎ±Î»Î¬.\n\n" +
				"\n\nÎ‘Î½ Î­Ï‡ÎµÏ„Îµ Ï€Ï…Ï�ÎµÏ„ÏŒ, Î²Î®Ï‡Î± ÎºÎ±Î¹ Î´Ï…ÏƒÎºÎ¿Î»Î¯Î± ÏƒÏ„Î·Î½ Î±Î½Î±Ï€Î½Î¿Î®, Î¶Î·Ï„Î®ÏƒÏ„Îµ Î¹Î±Ï„Ï�Î¹ÎºÎ® "
				+ "Î²Î¿Î®Î¸ÎµÎ¹Î±.\n\n" +
				"ÎšÎ±Î»Î­ÏƒÏ„Îµ ÎµÎ³ÎºÎ±Î¯Ï�Ï‰Ï‚ ÏŽÏƒÏ„Îµ Î¿ Ï€Î¬Ï�Î¿Ï‡Î¿Ï‚ Ï…Î³ÎµÎ¯Î±Ï‚ ÏƒÎ±Ï‚ Î½Î± ÏƒÎ±Ï‚ ÎºÎ±Ï„ÎµÏ…Î¸Ï�Î½ÎµÎ¹ Î³Ï�Î®Î³Î¿Ï�Î±\n"
				+ " ÏƒÏ„Î¿Î½ ÎºÎ±Ï„Î¬Î»Î»Î·Î»Î¿ Ï‡ÏŽÏ�Î¿ Ï€Î±Ï�Î¿Ï‡Î®Ï‚ Ï…Ï€Î·Ï�ÎµÏƒÎ¹ÏŽÎ½ Ï…Î³ÎµÎ¯Î±Ï‚. ÎœÎµ Î±Ï…Ï„ÏŒÎ½ Ï„Î¿Î½ Ï„Ï�ÏŒÏ€Î¿,\n"
				+ "Ï€Ï�Î¿ÏƒÏ„Î±Ï„ÎµÏ�ÎµÏƒÏ„Îµ ÎºÎ±Î¹ Î±Ï€Î¿Ï†ÎµÏ�Î³ÎµÏ„Îµ Ï„Î·Î½ ÎµÎ¾Î¬Ï€Î»Ï‰ÏƒÎ· Ï„Ï‰Î½ Î¹ÏŽÎ½ Î® Î¬Î»Î»Ï‰Î½ Î¼Î¿Î»Ï�Î½ÏƒÎµÏ‰Î½.\n" +
				"ÎœÎ¬ÏƒÎºÎµÏ‚\n\n\n" +
				"ÎŸÎ¹ Î¼Î¬ÏƒÎºÎµÏ‚ Î¼Ï€Î¿Ï�Î¿Ï�Î½ Î½Î± Î²Î¿Î·Î¸Î®ÏƒÎ¿Ï…Î½ Î½Î± Î±Ï€Î¿Ï†ÎµÏ…Ï‡Î¸ÎµÎ¯ Î· ÎµÎ¾Î¬Ï€Î»Ï‰ÏƒÎ· Ï„Î¿Ï… Î¹Î¿Ï� Î±Ï€ÏŒ Ï„Î±\n" +
				 "Î¬Ï„Î¿Î¼Î± Ï€Î¿Ï… Ï„Î¹Ï‚ Ï†Î¿Ï�Î¿Ï�Î½ Ï€Ï�Î¿Ï‚ Ï„Î¿Ï…Ï‚ Î¬Î»Î»Î¿Ï…Ï‚. ÎŸÎ¹ Î¼Î¬ÏƒÎºÎµÏ‚ Î¼ÏŒÎ½Î¿ Î´ÎµÎ½ Ï€Ï�Î¿ÏƒÏ„Î±Ï„ÎµÏ�Î¿Ï…Î½\n"
				+ "ÎºÎ±Ï„Î¬ Ï„Î¿Ï… COVID-19, Î±Î»Î»Î¬ Î¸Î± Ï€Ï�Î­Ï€ÎµÎ¹ Î½Î± ÏƒÏ…Î½Î´Ï…Î¬Î¶Î¿Î½Ï„Î±Î¹ Î¼Îµ Ï„Î· Ï†Ï…ÏƒÎ¹ÎºÎ® Î±Ï€ÏŒÏƒÏ„Î±ÏƒÎ·\n"
				+ "ÎºÎ±Î¹ Ï„Î·Î½ Ï…Î³Î¹ÎµÎ¹Î½Î® Ï„Ï‰Î½ Ï‡ÎµÏ�Î¹ÏŽÎ½. Î‘ÎºÎ¿Î»Î¿Ï…Î¸Î®ÏƒÏ„Îµ Ï„Î¹Ï‚ ÏƒÏ…Î¼Î²Î¿Ï…Î»Î­Ï‚ Ï€Î¿Ï… Ï€Î±Ï�Î­Ï‡Î¿Î½Ï„Î±Î¹\n"
				+ "Î±Ï€ÏŒ Ï„Î·Î½ Ï„Î¿Ï€Î¹ÎºÎ® Î±Ï�Î¼ÏŒÎ´Î¹Î± Î±Ï�Ï‡Î® Ï…Î³ÎµÎ¯Î±Ï‚.\n\n\n";


		prevention = new JTextArea(text2);
		prevention.setBounds(1005, 200, 370, 450);
		prevention.setEditable(false);
		prevention.setFont(new Font("Arial", Font.PLAIN, 12));
		sp2 = new JScrollPane(prevention);   //Ability to scroll
		sp2.setBounds(1015, 258, 365, 430);
		sp2.setBorder(BorderFactory.createEmptyBorder());
		sp2.setVisible(false);
		panel.add(sp2);




		String text3 = "\n\nÎ‘Ï…Ï„Î¿Ï†Ï�Î¿Î½Ï„Î¯Î´Î±\n\n\n" +
				"Î‘Î½ Î±Î¹ÏƒÎ¸Î¬Î½ÎµÏƒÏ„Îµ Î¬Ï�Ï�Ï‰ÏƒÏ„Î¿Î¹, Î¸Î± Ï€Ï�Î­Ï€ÎµÎ¹ Î½Î± Î¾ÎµÎºÎ¿Ï…Ï�Î±ÏƒÏ„ÎµÎ¯Ï„Îµ, Î½Î± Ï€Î¯Î½ÎµÏ„Îµ Î±Ï�ÎºÎµÏ„Î¬ Ï…Î³Ï�Î¬\n"
				+ " ÎºÎ±Î¹ Î½Î± Ï„Ï�ÏŽÏ„Îµ Ï…Î³Î¹ÎµÎ¹Î½Î¬. Î Î±Ï�Î±Î¼ÎµÎ¯Î½ÎµÏ„Îµ ÏƒÎµ Î¾ÎµÏ‡Ï‰Ï�Î¹ÏƒÏ„ÏŒ Î´Ï‰Î¼Î¬Ï„Î¹Î¿ Î±Ï€ÏŒ Ï„Î± Ï…Ï€ÏŒÎ»Î¿Î¹Ï€Î±\n"
				+ "Î¼Î­Î»Î· Ï„Î·Ï‚ Î¿Î¹ÎºÎ¿Î³Î­Î½ÎµÎ¹Î±Ï‚ ÎºÎ±Î¹ Ï‡Ï�Î·ÏƒÎ¹Î¼Î¿Ï€Î¿Î¹Î®ÏƒÏ„Îµ Î¾ÎµÏ‡Ï‰Ï�Î¹ÏƒÏ„ÏŒ Î¼Ï€Î¬Î½Î¹Î¿, Î±Î½ Î±Ï…Ï„ÏŒ ÎµÎ¯Î½Î±Î¹\n"
				+ "ÎµÏ†Î¹ÎºÏ„ÏŒ. ÎšÎ±Î¸Î±Ï�Î¯Î¶ÎµÏ„Îµ ÎºÎ±Î¹ Î±Ï€Î¿Î»Ï…Î¼Î±Î¯Î½ÎµÏ„Îµ Ï„Î±ÎºÏ„Î¹ÎºÎ¬ Ï„Î¹Ï‚ ÎµÏ€Î¹Ï†Î¬Î½ÎµÎ¹ÎµÏ‚ Ï€Î¿Ï… Î±Î³Î³Î¯Î¶Î¿Î½Ï„Î±Î¹.\n" +
				"ÎšÎ¬Î¸Îµ Î¼Î­Î»Î¿Ï‚ Ï„Î·Ï‚ Î¿Î¹ÎºÎ¿Î³Î­Î½ÎµÎ¹Î±Ï‚ Ï€Ï�Î­Ï€ÎµÎ¹ Î½Î± Î±ÎºÎ¿Î»Î¿Ï…Î¸ÎµÎ¯ Ï…Î³Î¹ÎµÎ¹Î½ÏŒ Ï„Ï�ÏŒÏ€Î¿ Î¶Ï‰Î®Ï‚ ÏƒÏ„Î¿ ÏƒÏ€Î¯Ï„Î¹.\n"
				+ "\n\nÎ‘ÎºÎ¿Î»Î¿Ï…Î¸Î®ÏƒÏ„Îµ Î¼Î¹Î± Ï…Î³Î¹ÎµÎ¹Î½Î® Î´Î¹Î±Ï„Ï�Î¿Ï†Î®, ÎºÎ¿Î¹Î¼Î·Î¸ÎµÎ¯Ï„Îµ, Ï€Î±Ï�Î±Î¼ÎµÎ¯Î½ÎµÏ„Îµ Î´Ï�Î±ÏƒÏ„Î®Ï�Î¹Î¿Î¹ ÎºÎ±Î¹\n"
				+ "Î´Î¹Î±Ï„Î·Ï�Î®ÏƒÏ„Îµ Ï„Î¹Ï‚ ÎºÎ¿Î¹Î½Ï‰Î½Î¹ÎºÎ­Ï‚ ÏƒÎ±Ï‚ ÎµÏ€Î±Ï†Î­Ï‚ Î¼Îµ Ï„Î± Î±Î³Î±Ï€Î·Î¼Î­Î½Î± ÏƒÎ±Ï‚ Ï€Ï�ÏŒÏƒÏ‰Ï€Î± Î¼Î­ÏƒÏ‰\n"
				+ "Ï„Î·Î»ÎµÏ†ÏŽÎ½Î¿Ï… Î® Î´Î¹Î±Î´Î¹ÎºÏ„Ï�Î¿Ï…. Î¤Î± Ï€Î±Î¹Î´Î¹Î¬ Ï‡Ï�ÎµÎ¹Î¬Î¶Î¿Î½Ï„Î±Î¹ Ï€ÎµÏ�Î¹ÏƒÏƒÏŒÏ„ÎµÏ�Î· Î±Î³Î¬Ï€Î· ÎºÎ±Î¹ Ï€Ï�Î¿ÏƒÎ¿Ï‡Î®\n"
				+ " Î±Ï€ÏŒ Ï„Î¿Ï…Ï‚ ÎµÎ½Î®Î»Î¹ÎºÎµÏ‚ Î±Ï…Ï„Î­Ï‚ Ï„Î¹Ï‚ Î´Ï�ÏƒÎºÎ¿Î»ÎµÏ‚ ÏƒÏ„Î¹Î³Î¼Î­Ï‚. Î‘ÎºÎ¿Î»Î¿Ï…Î¸ÎµÎ¯Ï„Îµ, ÏŒÏƒÎ¿ ÎµÎ¯Î½Î±Î¹ Î´Ï…Î½Î±Ï„ÏŒÎ½,\n"
				+ " Ï„Î¹Ï‚ ÎºÎ±Î¸Î·Î¼ÎµÏ�Î¹Î½Î­Ï‚ ÏƒÎ±Ï‚ Î´Ï�Î±ÏƒÏ„Î·Ï�Î¹ÏŒÏ„Î·Ï„ÎµÏ‚ ÎºÎ±Î¹ Ï€Ï�Î¿Î³Ï�Î¬Î¼Î¼Î±Ï„Î±.\n" +
				"\n\nÎ•Î¯Î½Î±Î¹ Ï†Ï…ÏƒÎ¹Î¿Î»Î¿Î³Î¹ÎºÏŒ Î½Î± Î±Î¹ÏƒÎ¸Î¬Î½ÎµÏƒÏ„Îµ Î»Ï…Ï€Î·Î¼Î­Î½Î¿Î¹, Î±Î³Ï‡Ï‰Î¼Î­Î½Î¿Î¹ Î® Î¼Ï€ÎµÏ�Î´ÎµÎ¼Î­Î½Î¿Î¹ ÎºÎ±Ï„Î¬ Ï„Î·\n"
				+ "Î´Î¹Î¬Ï�ÎºÎµÎ¹Î± Î±Ï…Ï„Î®Ï‚ Ï„Î·Ï‚ ÎºÏ�Î¯ÏƒÎ·Ï‚. ÎœÎ¹Î»ÏŽÎ½Ï„Î±Ï‚ ÏƒÎµ Î¬Ï„Î¿Î¼Î± Ï€Î¿Ï… ÎµÎ¼Ï€Î¹ÏƒÏ„ÎµÏ�ÎµÏƒÏ„Îµ, ÏŒÏ€Ï‰Ï‚ Ï†Î¯Î»Î¿Ï…Ï‚ ÎºÎ±Î¹\n"
				+ " Î¼Î­Î»Î· Ï„Î·Ï‚ Î¿Î¹ÎºÎ¿Î³Î­Î½ÎµÎ¹Î¬Ï‚ ÏƒÎ±Ï‚, Î¼Ï€Î¿Ï�ÎµÎ¯ Î½Î± Î²Î¿Î·Î¸Î®ÏƒÎµÎ¹. Î‘Î½ Î½Î¹ÏŽÎ¸ÎµÏ„Îµ ÏˆÏ…Ï‡Î¹ÎºÎ¬ ÎºÎ±Ï„Î±Î²ÎµÎ²Î»Î·Î¼Î­Î½Î¿Î¹,\n"
				+ " ÎµÏ€Î¹ÎºÎ¿Î¹Î½Ï‰Î½Î®ÏƒÏ„Îµ Î¼Îµ Î­Î½Î±Î½ ÏƒÏ�Î¼Î²Î¿Ï…Î»Î¿ Î® ÎµÏ�Î³Î±Î¶ÏŒÎ¼ÎµÎ½Î¿ ÏƒÏ„Î¿Î½ Ï„Î¿Î¼Î­Î± Ï„Î·Ï‚ Ï…Î³ÎµÎ¯Î±Ï‚.\n\n";


		treatments = new JTextArea(text3);
		treatments.setBounds(1005, 200, 370, 450);
		treatments.setEditable(false);
		treatments.setFont(new Font("Arial", Font.PLAIN, 12));
		sp3 = new JScrollPane(treatments);   //Ability to scroll
		sp3.setBounds(1015, 258, 365, 430);
		sp3.setBorder(BorderFactory.createEmptyBorder());
		sp3.setVisible(false);
		panel.add(sp3);








		frame.setVisible(false);



	}


	public void uiHandler(String action) {

		switch (action) {

		case "Prevention" :

							sp2.setVisible(true);
							blue2.setBounds(1130, 220, 50, 3);
							sp.setVisible(false);
							sp3.setVisible(false);
							break;

		case "Symptoms" :

							sp.setVisible(true);
							blue2.setBounds(1020, 220, 50, 3);
							sp2.setVisible(false);
							sp3.setVisible(false);
							break;

		case "Treatments" :

							sp3.setVisible(true);
							blue2.setBounds(1240, 220, 50, 3);
							sp2.setVisible(false);
							sp.setVisible(false);
							break;
		}



	}







	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}







}

