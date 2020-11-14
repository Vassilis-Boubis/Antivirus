/**
 * 
 */

/**
 * @author dimitrispapakyriakopoylos
 *
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class LandPage implements ActionListener {

		
	private JFrame frame;
	private JPanel panel;
	private JLabel searchLabel;
	private Graphstat graph;
	private JLabel titleLabel;
	private JLabel today;
	private JLabel yesterday;
	private JLabel y1;
	private JLabel y2;
	private JLabel y3;
	private JLabel y4;
	private JLabel descr;
	private JLabel searchresult;
	private JTextField input;
	private JButton button;
	private JButton home;
	private JButton about;
	private JButton contact;
	private JButton login;
	private JLabel imglabel;
	private JLabel imglabel2;
	private  ImageIcon image = new ImageIcon(getClass().getResource("Antivirus.png"));
	private ImageIcon img2 = new ImageIcon(getClass().getResource("IMG_6033.JPG"));
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LandPage gui= new LandPage();
		
		
		// GUI frame and panel creation
		gui.frame = new JFrame();
		gui.frame.setSize(900,700);
		gui.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.frame.setTitle("Antivirus by DETechtives BETA version 1v.0.1");
		
		gui.panel = new JPanel();
		gui.frame.add(gui.panel);
		gui.panel.setLayout(null);
		
		
		// "Search" label
		
		gui.searchLabel= new JLabel("Search: ");
		gui.searchLabel.setBounds(165, 160, 80, 30);
		gui.panel.add(gui.searchLabel);
//		gui.titleLabel = new JLabel("Antivirus By DETechtives");
//		gui.titleLabel.setBounds(300, 10, 200, 100);
//		gui.panel.add(gui.titleLabel);
		gui.searchresult = new JLabel();
		gui.searchresult.setBounds(300, 300, 180, 50);
		gui.panel.add(gui.searchresult);
		
		// Search bar
		
		gui.input = new JTextField("Where do you want to go?", 50);
		gui.input.setBounds(250, 160, 400, 30);
		gui.panel.add(gui.input);
		gui.panel.setBackground(Color.WHITE);
		
		
		// Go search button
		
		gui.button = new JButton("Go!");
		gui.button.setBackground(Color.BLUE);
		gui.button.setBounds(650, 160, 50, 30);
		gui.panel.add(gui.button);
		gui.button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text;
				if (gui.input.getText().equals("")|| gui.input.getText().equals("Where do you want to go?")) {
					gui.descr.setVisible(false);
					gui.graph.setVisible(false);
					gui.imglabel2.setVisible(false);
				} else if (gui.input.getText().equals("Koulis")) {
					gui.descr.setVisible(false);
					 gui.imglabel2.setVisible(true);
				}else {	
				  //  text="Deploying nuclear bomb!";
					gui.imglabel2.setVisible(false);
					gui.descr.setVisible(true);
					gui.graph.setVisible(true);
				}
			//	gui.searchresult.setText(text);
			}	
		});
		
		
		// Home About us and contact pages. 
		// Login button for authorised user
		
		gui.home = new JButton("Home");  //Home
		gui.home.setBackground(Color.BLUE);
		gui.home.setForeground(Color.BLUE);
		gui.home.setBounds(5, 5, 60, 50);
		gui.panel.add(gui.home);
		
		gui.about = new JButton("About us");    //About us
		gui.about.setBackground(Color.BLUE);
		gui.about.setForeground(Color.BLUE);
		gui.about.setBounds(85, 5, 70, 50);
		gui.panel.add(gui.about);
		
		gui.contact = new JButton("Contact");    //Contact
		gui.contact.setBackground(Color.BLUE);
		gui.contact.setForeground(Color.BLUE);
		gui.contact.setBounds(165, 5, 70, 50);
		gui.panel.add(gui.contact);
		
		
		gui.login = new JButton("Login");  //Login
		gui.login.setBackground(Color.BLUE);
		gui.login.setForeground(Color.BLUE);
		gui.login.setBounds(825, 5, 70, 50);
		gui.panel.add(gui.login);
		
		
		
		// add image
		
		gui.imglabel = new JLabel();
		gui.imglabel.setIcon(gui.image);
		gui.imglabel.setBounds(220, 5, 420, 100);
		gui.panel.add(gui.imglabel);
		
		gui.imglabel2 = new JLabel();
		gui.imglabel2.setIcon(gui.img2);
		gui.imglabel2.setBounds(150, 350, 520, 300);
		gui.panel.add(gui.imglabel2);
		gui.imglabel2.setVisible(false);
		
		
		// Graph bars
		gui.graph = new Graphstat();
	    gui.graph.setBounds(250, 340, 300, 300);
	    gui.panel.add(gui.graph);
	    gui.graph.setVisible(false);
	    
	    // Graph labels
	    
	    gui.today= new JLabel("Today: ");
	    gui.yesterday = new JLabel("Yesterday: ");
	    gui.y1= new JLabel("10/11/2020: ");
	    gui.y2= new JLabel("9/11/2020: ");
	    gui.y3= new JLabel("8/11/2020: ");
	    gui.y4= new JLabel("7/11/2020: ");
	    gui.descr= new JLabel("Covid-19 cases in your specified area the last 6 days: ");
	    gui.descr.setBounds(250, 270, 380, 30);
	    gui.descr.setVisible(false);
	    gui.panel.add(gui.descr);
	   
	    
		
		gui.frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		String text;
//		if (input.equals(null)) {
//			text="Write something first, then click the button!";
//		} else {
//		    text="Deploying nuclear bomb!";
//		}
//		searchresult.setText(text);
//	}	
//	
	

}

