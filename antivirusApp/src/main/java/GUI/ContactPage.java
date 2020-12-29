package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ContactPage {


	//Frame, panel and main parts common for every page


	private JFrame frame;
	private ContactPanel panel;
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


	// Contact body: Profile images, labels and social media icons for contact


	//Labels and images for dpapa

	private ImageIcon dpapa = new ImageIcon(getClass().getResource("dpapa.jpeg"));
	private JLabel papak = new JLabel();
	private ImageIcon linkedIn = new ImageIcon(getClass().getResource("in.jpeg"));
	private JLabel lin = new JLabel();
	private JLabel linkedInLink = new JLabel("https://www.linkedin.com/in/dpapakyriak");
	private JLabel gitHubLink = new JLabel("https://github.com/dpapakyriak");
	private JLabel mailLink = new JLabel("t8190137@aueb.gr");
	private ImageIcon gitHub = new ImageIcon(getClass().getResource("github.jpeg"));
	private JLabel git = new JLabel();
	private ImageIcon mail = new ImageIcon(getClass().getResource("mail.jpeg"));
	private JLabel email = new JLabel();


	//Labels and images for lepla

	private ImageIcon lepla = new ImageIcon(getClass().getResource("lepla.png"));
	private JLabel leplat =  new JLabel();
	private JLabel lplin = new JLabel();
	private JLabel lplinkedInLink = new JLabel("https://www.linkedin.com/in/eleftherios-platis-95b5561b4");
	private JLabel lpgitHubLink = new JLabel("https://github.com/lepla");
	private JLabel lpmailLink = new JLabel("t8190144@aueb.gr");
	private JLabel lpgit = new JLabel();
	private JLabel lpemail = new JLabel();


	// Labels for vboubis

	private ImageIcon vboubis = new ImageIcon(getClass().getResource("vboubis.jpeg"));
	private JLabel vaboubis = new JLabel();
	private JLabel vblin = new JLabel();
	private JLabel vblinkedInLink = new JLabel("https://www.linkedin.com/in/vassilis-bubis-b898a81b9");
	private JLabel vbgitHubLink = new JLabel("https://github.com/Vassilis-Boubis");
	private JLabel vbmailLink = new JLabel("t8190117@aueb.gr");
	private JLabel vbgit = new JLabel();
	private JLabel vbemail = new JLabel();


	// Labels abak

	private ImageIcon abak = new ImageIcon(getClass().getResource("abak.jpeg"));
	private JLabel abaka = new JLabel();
	private JLabel ablin = new JLabel();
	private JLabel ablinkedInLink = new JLabel("https://www.linkedin.com/in/anastasis-bakaros-05b57a1b8");
	private JLabel abgitHubLink = new JLabel("https://github.com/anastasisbak");
	private JLabel abmailLink = new JLabel("t8190111@aueb.gr");
	private JLabel abgit = new JLabel();
	private JLabel abemail = new JLabel();

	// Labels for anasto

	private ImageIcon anasto = new ImageIcon(getClass().getResource("anasto.jpeg"));
	private JLabel anastop = new JLabel();
	private JLabel malin = new JLabel();
	private JLabel malinkedInLink = new JLabel("https://www.linkedin.com/in/emmanouil-anastopoulos-ba59081b9");
	private JLabel magitHubLink = new JLabel("N/A");
	private JLabel mamailLink = new JLabel("t8190250@aueb.gr");
	private JLabel magit = new JLabel();
	private JLabel maemail = new JLabel();


	// Labels for gkletsos

	private ImageIcon gkletsos = new ImageIcon(getClass().getResource("gkletsos.jpeg"));
	private JLabel kgkletsos = new JLabel();
	private JLabel kglin = new JLabel();
	private JLabel kglinkedInLink = new JLabel("N/A");
	private JLabel kggitHubLink = new JLabel("N/A");
	private JLabel kgmailLink = new JLabel("t8190031@aueb.gr");
	private JLabel kggit = new JLabel();
	private JLabel kgemail = new JLabel();


//	// Labels for teo

//	private ImageIcon teo = new ImageIcon(getClass().getResource("teo.jpeg"));
//	private JLabel teok;
//	private ImageIcon tklinkedIn = new ImageIcon(getClass().getResource("in.jpeg"));
//	private JLabel tklin;
//	private JLabel tklinkedInLink;
//	private JLabel tkgitHubLink;
//	private JLabel tkmailLink;
//	private ImageIcon tkgitHub = new ImageIcon(getClass().getResource("github.jpeg"));
//	private JLabel tkgit;
//	private ImageIcon tkmail = new ImageIcon(getClass().getResource("mail.jpeg"));
//	private JLabel tkemail;



	// Group arrays containing data

	private ImageIcon[] images = {dpapa, lepla, vboubis, abak, gkletsos, anasto};
	private JLabel[] team = {papak, leplat, vaboubis, abaka, kgkletsos, anastop};
	private JLabel[] linkedLabel = {lin, lplin, vblin, ablin, kglin, malin};
	private JLabel[] linkedLink = {linkedInLink, lplinkedInLink, vblinkedInLink, ablinkedInLink, kglinkedInLink, malinkedInLink};
	private JLabel[] gitLabel = {git, lpgit, vbgit, abgit, kggit, magit};
	private JLabel[] gitLink = {gitHubLink, lpgitHubLink, vbgitHubLink, abgitHubLink, kggitHubLink, magitHubLink};
	private JLabel[] emailLabel = {email, lpemail, vbemail, abemail, kgemail, maemail};
	private JLabel[] emailLink = {mailLink, lpmailLink, vbmailLink, abmailLink, kgmailLink, mamailLink};
	private int i;





	// make page method; creates the page with all the essential functions


	public void makePage() {

		// GUI frame and panel creation
		frame = new JFrame();
		frame.setSize(1400,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Antivirus by DETechtives BETA version 1v.0.1");

		panel = new ContactPanel();
	    frame.add(panel);
		panel.setLayout(null);


		// Set the frame to be appeared always in the center of the screen, regardless monitor
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height - 950);


		// Home button creation
		homeb = new JButton("HOME");
		homeb.setIcon(backgroundColor);
		home = new JLabel("HOME");
		home.setFont(new Font("Helvectiva", Font.BOLD,12));
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
		aboutb.setIcon(backgroundColor);
		about = new JLabel("ABOUT US");
		about.setFont(new Font("Helvectiva", Font.BOLD,12));
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
		contactb.setIcon(white);
		contact = new JLabel("CONTACT");
		contact.setFont(new Font("Helvectiva", Font.BOLD,12));
		contact.setForeground(new Color(16, 44, 86));
		contactb.setBounds(120, 350, 100, 30);
		contactb.add(contact);
		panel.add(contactb);




		//Logo

		logol = new JLabel();
		logol.setIcon(logo);
		logol.setBounds(290, 5, 250, 50);
		panel.add(logol);





		int x,y;

		for (i=0 ; i<team.length ; i++) {
			y = 250;
			x = i;
			if (i >= 4) {
				x = i-3;
				y = 540;
			}
			team[i].setIcon(images[i]);
			team[i].setBounds(340 + 250 * x, y, 150, 150);
			panel.add(team[i]);
			linkedLabel[i].setIcon(linkedIn);
			linkedLabel[i].setBounds(350 + 250 * x, y +170, 30, 30);
			panel.add(linkedLabel[i]);
			linkedLink[i].setBounds(340 + 250 * x, y + 210, 280, 30);
			linkedLabel[i].setName("Lin"+Integer.toString(i));
			linkedLink[i].setVisible(false);
			panel.add(linkedLink[i]);

			linkedLabel[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent evt) {
					mouseIn( evt.getComponent().getName());

				}
				@Override
				public void mouseExited(MouseEvent evt) {
					mouseOut( evt.getComponent().getName());
				}
			});
			gitLabel[i].setIcon(gitHub);
			gitLabel[i].setBounds(400 + 250 * x, y +170, 30, 30);
			panel.add(gitLabel[i]);
			gitLink[i].setBounds(340 + 250 * x, y + 210, 280, 30);
			gitLabel[i].setName("Git"+Integer.toString(i));
			gitLink[i].setVisible(false);
			panel.add(gitLink[i]);

			gitLabel[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent evt) {
					mouseIn( evt.getComponent().getName());


				}
				@Override
				public void mouseExited(MouseEvent evt) {
					mouseOut( evt.getComponent().getName());
				}
			});
			emailLabel[i].setIcon(mail);
			emailLabel[i].setBounds(450 + 250 * x, y +170, 30, 30);
			panel.add(emailLabel[i]);
			emailLink[i].setBounds(340 + 250 * x, y + 210, 280, 30);
			emailLabel[i].setName("Eml"+Integer.toString(i));
			emailLink[i].setVisible(false);
			panel.add(emailLink[i]);
			emailLabel[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent evt) {
					mouseIn( evt.getComponent().getName());

				}
				@Override
				public void mouseExited(MouseEvent evt) {
					mouseOut( evt.getComponent().getName());
				}
			});

		}



		frame.setResizable(false);
		frame.setVisible(false);

	}







	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}



	public void mouseIn(String name) {
		i=0;


		switch (name.substring(0, 3)) {

		case "Lin" :
						for (i=0;i<team.length;i++) {
							if (name.equals(linkedLabel[i].getName())) {
								linkedLink[i].setVisible(true);
								break;
							}
						}
						break;

		case "Git" :
					for (i=0;i<team.length;i++) {
						if (name.equals(gitLabel[i].getName())) {
							gitLink[i].setVisible(true);
							break;
						}
					}
					break;

		case "Eml" :


					for (i=0;i<team.length;i++) {
						if (name.equals(emailLabel[i].getName())) {
							emailLink[i].setVisible(true);
							break;
						}
					}
					break;


		}
	}




	public void mouseOut(String name) {
		i=0;


		switch (name.substring(0, 3)) {

		case "Lin" :
						for (i=0;i<team.length;i++) {
							if (name.equals(linkedLabel[i].getName())) {
								linkedLink[i].setVisible(false);
								break;
							}
						}
						break;

		case "Git" :
					for (i=0;i<team.length;i++) {
						if (name.equals(gitLabel[i].getName())) {
							gitLink[i].setVisible(false);
							break;
						}
					}
					break;

		case "Eml" :


					for (i=0;i<team.length;i++) {
						if (name.equals(emailLabel[i].getName())) {
							emailLink[i].setVisible(false);
							break;
						}
					}
					break;


		}
	}






}

