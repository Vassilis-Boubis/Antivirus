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
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height - 950);









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



		String text1 = "\nΠιο συχνά συμπτώματα:\n\n" + "\u2022 Πυρετός\n" + "\u2022 Ξηρός βήχας\n"
                + "\u2022 Κούραση\n\n\n" + "Πιο σπάνια συμπτώματα:\n\n" + "\u2022 Πόνοι\n" + "\u2022 Πονόλαιμος\n"
                + "\u2022 Διάρροια\n" + "\u2022 Επιπεφυκίτιδα\n" + "\u2022 Πονοκέφαλος\n"
                + "\u2022 Απώλεια γεύσης ή όσφρησης\n"
                + "\u2022 Δερματικό εξάνθημα ή αποχρωματισμός στα δάχτυλα των χεριών\n" + " ή των ποδιών\n\n\n"
                + "Σοβαρά συμπτώματα:\n\n" + "\u2022 Δυσκολία στην αναπνοή ή δύσπνοια\n"
                + "\u2022 Πόνος ή πίεση στο στήθος\n" + "\u2022 Απώλεια ομιλίας ή κίνησης\n\n\n"
                + "Αν έχετε σοβαρά συμπτώματα, ζητήστε άμεση ιατρική βοήθεια.\n"
                + "Καλέστε από πριν προτού επισκεφτείτε τον ιατρό σας ή κάποιον\n"
                + "χώρο παροχής υπηρεσιών υγείας.\n\n"
                + "Άτομα με ήπια συμπτώματα που κατά τ' άλλα είναι υγιή θα πρέπει\n"
                + "να διαχειριστούν τα συμπτώματά τους στο σπίτι.\n\n"
                + "Κατά μέσο όρο, χρειάζονται 5-6 ημέρες από τη στιγμή που κάποιος\n"
                + "θα μολυνθεί με τον ιό μέχρι να εμφανίσει τα συμπτώματα, ωστόσο\n"
                + "μπορεί να χρειαστούν έως και 14 ημέρες.\n\n\n\n";



		symptoms = new JTextArea(text1);
		symptoms.setBounds(1005, 200, 370, 450);
		symptoms.setEditable(false);
		symptoms.setFont(new Font("Arial", Font.PLAIN, 12));
		sp = new JScrollPane(symptoms);   //Ability to scroll
		sp.setBounds(1015, 258, 365, 430);
		sp.setBorder(BorderFactory.createEmptyBorder());
		panel.add(sp);


		String text2 = "\n\nΓια την αποφυγή της εξάπλωσης του COVID-19:\n\n\n\n"
                + "\u2022 Πλένετε τακτικά τα χέρια σας. Χρησιμοποιείτε σαπούνι και νερό\n "
                + "ή αλκοολούχο αντισηπτικό χεριών.\n\n"
                + "\u2022 Κρατάτε απόσταση ασφαλείας από οποιονδήποτε βήχει ή φτερνίζεται.\n\n"
                + "\u2022 Όπου δεν είναι δυνατό να διατηρήσετε φυσική απόσταση, φορέστε\n" + "μάσκα.\n\n"
                + "\u2022 Μην ακουμπάτε τα μάτια, τη μύτη ή το στόμα σας.\n\n"
                + "\u2022 Καλύπτετε τη μύτη και το στόμα σας με το εσωτερικό του αγκώνα σας "
                + "ή με ένα χαρτομάντιλο όταν βήχετε ή φτερνίζεστε.\n\n"
                + "\u2022 Μείνετε σπίτι αν δεν αισθάνεστε καλά.\n\n"
                + "\n\nΑν έχετε πυρετό, βήχα και δυσκολία στην αναπνοή, ζητήστε ιατρική " + "βοήθεια.\n\n"
                + "Καλέστε εγκαίρως ώστε ο πάροχος υγείας σας να σας κατευθύνει γρήγορα\n"
                + " στον κατάλληλο χώρο παροχής υπηρεσιών υγείας. Με αυτόν τον τρόπο,\n"
                + "προστατεύεστε και αποφεύγετε την εξάπλωση των ιών ή άλλων μολύνσεων.\n" + "Μάσκες\n\n\n"
                + "Οι μάσκες μπορούν να βοηθήσουν να αποφευχθεί η εξάπλωση του ιού από τα\n"
                + "άτομα που τις φορούν προς τους άλλους. Οι μάσκες μόνο δεν προστατεύουν\n"
                + "κατά του COVID-19, αλλά θα πρέπει να συνδυάζονται με τη φυσική απόσταση\n"
                + "και την υγιεινή των χεριών. Ακολουθήστε τις συμβουλές που παρέχονται\n"
                + "από την τοπική αρμόδια αρχή υγείας.\n\n\n";


		prevention = new JTextArea(text2);
		prevention.setBounds(1005, 200, 370, 450);
		prevention.setEditable(false);
		prevention.setFont(new Font("Arial", Font.PLAIN, 12));
		sp2 = new JScrollPane(prevention);   //Ability to scroll
		sp2.setBounds(1015, 258, 365, 430);
		sp2.setBorder(BorderFactory.createEmptyBorder());
		sp2.setVisible(false);
		panel.add(sp2);




		String text3 = "\n\nΑυτοφροντίδα\n\n\n"
                + "Αν αισθάνεστε άρρωστοι, θα πρέπει να ξεκουραστείτε, να πίνετε αρκετά υγρά\n"
                + " και να τρώτε υγιεινά. Παραμείνετε σε ξεχωριστό δωμάτιο από τα υπόλοιπα\n"
                + "μέλη της οικογένειας και χρησιμοποιήστε ξεχωριστό μπάνιο, αν αυτό είναι\n"
                + "εφικτό. Καθαρίζετε και απολυμαίνετε τακτικά τις επιφάνειες που αγγίζονται.\n"
                + "Κάθε μέλος της οικογένειας πρέπει να ακολουθεί υγιεινό τρόπο ζωής στο σπίτι.\n"
                + "\n\nΑκολουθήστε μια υγιεινή διατροφή, κοιμηθείτε, παραμείνετε δραστήριοι και\n"
                + "διατηρήστε τις κοινωνικές σας επαφές με τα αγαπημένα σας πρόσωπα μέσω\n"
                + "τηλεφώνου ή διαδικτύου. Τα παιδιά χρειάζονται περισσότερη αγάπη και προσοχή\n"
                + " από τους ενήλικες αυτές τις δύσκολες στιγμές. Ακολουθείτε, όσο είναι δυνατόν,\n"
                + " τις καθημερινές σας δραστηριότητες και προγράμματα.\n"
                + "\n\nΕίναι φυσιολογικό να αισθάνεστε λυπημένοι, αγχωμένοι ή μπερδεμένοι κατά τη\n"
                + "διάρκεια αυτής της κρίσης. Μιλώντας σε άτομα που εμπιστεύεστε, όπως φίλους και\n"
                + " μέλη της οικογένειάς σας, μπορεί να βοηθήσει. Αν νιώθετε ψυχικά καταβεβλημένοι,\n"
                + " επικοινωνήστε με έναν σύμβουλο ή εργαζόμενο στον τομέα της υγείας.\n\n";


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

