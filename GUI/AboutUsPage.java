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

/**
 * 
 */

/**
 * @author dimitrispapakyriakopoylos
 *
 */
public class AboutUsPage {

	private JFrame frame;
	private AboutPanel panel;
	private JButton homeb;
	private JLabel home;
	private ImageIcon white = new ImageIcon(getClass().getResource("ffffff.png"));
	private JButton aboutb;
	private JLabel about;
	private ImageIcon backgroundColor = new ImageIcon(getClass().getResource("e9ebee.png"));
	private JButton contactb;
	private JLabel contact;
	private ImageIcon logo = new ImageIcon(getClass().getResource("logo.jpeg"));
	private JLabel logol;
	private JButton wawb;  //Who are we  button
	private JLabel waw;	   //Who are we label
	private JButton hiwb;
	private JLabel hiw;
	private JButton faqsb;
	private JLabel  faqs;
	private ImageIcon image4 = new ImageIcon(getClass().getResource("F7F7F7.png"));
	private JTextArea whoAreWe;
	private JTextArea howItWorks;
	private JTextArea faq;
	private JScrollPane sp;   //Scrollpanels
	private JScrollPane sp2;
	private JScrollPane sp3;
	private JLabel blue;
	private ImageIcon blueColor = new ImageIcon(getClass().getResource("0066ff.png"));
	private ImageIcon whoimg = new ImageIcon(getClass().getResource("whoarewe.jpeg"));
	private ImageIcon hiwimg = new ImageIcon(getClass().getResource("howitworks.jpeg"));
	private ImageIcon faqsimg = new ImageIcon(getClass().getResource("faqs.jpeg"));
	private JLabel body;
	
	
	
	
	
	public void makePage() {
		
		// GUI frame and panel creation
		frame = new JFrame();
		frame.setSize(1400,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Antivirus by DETechtives BETA version 1v.0.1");
				
		panel = new AboutPanel();
	    frame.add(panel);
		panel.setLayout(null);
				
				
		// Set the frame to be appeared always in the center of the screen, regardless monitor
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height);
		
		
		// Home button creation
		homeb = new JButton("HOME");
		homeb.setIcon(backgroundColor);
		home = new JLabel("HOME");
		home.setFont(new Font("Helvectiva", Font.BOLD,16));
		home.setForeground(new Color(16, 44, 86));
		homeb.setBounds(120, 250, 70, 30);
		homeb.add(home);
		panel.add(homeb);
		homeb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
					String action = e.getActionCommand();
					MasterCtrl.pageHandler(action);
				
			}
		});
		
		// About Us button creation
		aboutb = new JButton("ABOUT US");
		aboutb.setIcon(white);
		about = new JLabel("ABOUT US");
		about.setFont(new Font("Helvectiva", Font.BOLD,16));
		about.setForeground(new Color(16, 44, 86));
		aboutb.setBounds(120, 300, 100, 30);
		aboutb.add(about);
		panel.add(aboutb);
		
		
		// Contact button creation
		contactb = new JButton("CONTACT");
		contactb.setIcon(backgroundColor);
		contact = new JLabel("CONTACT");
		contact.setFont(new Font("Helvectiva", Font.BOLD,16));
		contact.setForeground(new Color(16, 44, 86));
		contactb.setBounds(120, 350, 100, 30);
		contactb.add(contact);
		panel.add(contactb);
		
		
		
		//Logo
		logol = new JLabel();
		logol.setIcon(logo);
		logol.setBounds(290, 5, 250, 50);
		panel.add(logol);
		
		
		
		
		
		
		
		wawb = new JButton("Who Are We");
		wawb.setIcon(image4);
		waw = new JLabel("Who Are We");
		waw.setFont(new Font("Helvectiva", Font.BOLD, 14));
		waw.setForeground(new Color(16, 44, 86));
		wawb.add(waw);
		wawb.setBounds(380, 300, 110, 30);
		panel.add(wawb);
		wawb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
					String action = e.getActionCommand();
					uiHandler(action);
				
			}
		});
		
		
		
		hiwb = new JButton("How It Works");
		hiwb.setIcon(image4);
		hiw = new JLabel("How It Works");
		hiw.setFont(new Font("Helvectiva", Font.BOLD, 14));
		hiw.setForeground(new Color(16, 44, 86));
		hiwb.add(hiw);
		hiwb.setBounds(380, 360, 120, 30);
		panel.add(hiwb);
		hiwb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
					String action = e.getActionCommand();
					uiHandler(action);
				
			}
		});
		
		
		faqsb = new JButton("FAQs");
		faqsb.setIcon(image4);
		faqs = new JLabel("FAQs");
		faqs.setFont(new Font("Helvectiva", Font.BOLD, 14));
		faqs.setForeground(new Color(16, 44, 86));
		faqsb.add(faqs);
		faqsb.setBounds(380, 420, 120, 30);
		panel.add(faqsb);
		faqsb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
					String action = e.getActionCommand();
					uiHandler(action);
				
			}
		});
		
		
		
		
		
		
		String text1;
		
		text1 = "\n\nWe are DETechtives, a team of seven Management Science and Technology\n"
				+ "students of the Athens University of Economics and Business. We created\n"
				+ "Antivirus for our Programming II course for Professor Diomidis Spinellis.\n\n\n\n"
				+ "Antivirus is an analytics tools, which was created to serve greek citizens in their daily exits.\n"
				+ "After quarantine, people want to go out with their favourite people to visit a restaurant,\n"
				+ "go for a drink or enjoy the numerous sights of their city.\n\n"
				+ "Unfortunately, COVID-19 has not allowed them to do it safely or at least... with full conciousness!\n"
				+ "And that's because people did not an actual 'picture' of the danger level of the places they consider visiting.\n\n\n"
				+ "Antivirus comes to solve this problem! With our platform, you are only one click away from the risk level of the places you want to visit";
		
		
		
		
		whoAreWe = new JTextArea(text1);
		whoAreWe.setFont(new Font("Arial", Font.PLAIN, 14));
		sp = new JScrollPane(whoAreWe);   //Ability to scroll
		sp.setBounds(550, 300, 600, 430);
		sp.setBorder(BorderFactory.createEmptyBorder());
		panel.add(sp);

		
		body = new JLabel();
		body.setIcon(whoimg);
		body.setBounds(980, 30, 300, 200);
		panel.add(body);
		
		
		
		
		
		
		
		String text2 = "How it works!!!!!";
		
		
		howItWorks = new JTextArea(text2);
		howItWorks.setFont(new Font("Arial", Font.PLAIN, 12));
		sp2 = new JScrollPane(howItWorks);   //Ability to scroll
		sp2.setBounds(550, 300, 600, 430);
		sp2.setBorder(BorderFactory.createEmptyBorder());
		sp2.setVisible(false);
		panel.add(sp2);
		
		
		
		String text3 = "FAQs!!!!";
		
		faq = new JTextArea(text3);
		faq.setFont(new Font("Arial", Font.PLAIN, 12));
		sp3 = new JScrollPane(faq);   //Ability to scroll
		sp3.setBounds(550, 300, 600, 430);
		sp3.setBorder(BorderFactory.createEmptyBorder());
		sp3.setVisible(false);
		panel.add(sp3);
		
		
		blue = new JLabel();
		blue.setIcon(blueColor);
		blue.setBounds(385, 335, 50, 3);
		panel.add(blue);
		
		
		
		frame.setVisible(false);
				
		
	}
	
	
	
	
	
	
	public void uiHandler(String action) {
		
		switch (action) {
		
		case "How It Works" :
							
							sp2.setVisible(true);
							blue.setBounds(385, 395, 50, 3);
							body.setIcon(hiwimg);
							sp.setVisible(false);
							sp3.setVisible(false);
							break;
							
		case "Who Are We" :
			
							sp.setVisible(true);
							blue.setBounds(385, 335, 50, 3);
							body.setIcon(whoimg);
							sp2.setVisible(false);
							sp3.setVisible(false);
							break;
							
		case "FAQs" :
							
							sp3.setVisible(true);
							blue.setBounds(385, 455, 50, 3);
							body.setIcon(faqsimg);
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
