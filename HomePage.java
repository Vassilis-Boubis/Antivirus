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


public class HomePage  {

	private JFrame frame;
	private JPanel panel;
	private JLabel searchLabel;
	private JLabel searchresult;
	private JTextField input;
	private JButton button;
	private JButton home;
	private JButton about;
	private JButton contact;
	private JButton login;
	private JLabel imglabel;
	private  ImageIcon image = new ImageIcon(getClass().getResource("Antivirus.png"));
	
	
	
	public void makePage() {
		
		

				
		// GUI frame and panel creation
				frame = new JFrame();
				frame.setSize(1000,1000);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Antivirus by DETechtives BETA version 1v.0.1");
				
				panel = new JPanel();
				frame.add(panel);
				panel.setLayout(null);
				
				
				// "Search" label
				
				searchLabel= new JLabel("Search: ");
				searchLabel.setBounds(165, 160, 80, 30);
				panel.add(searchLabel);
				searchresult = new JLabel();
				searchresult.setBounds(300, 300, 180, 50);
				panel.add(searchresult);
				
				// Search bar
				
				input = new JTextField("Where do you want to go?", 50);
				input.setBounds(250, 160, 400, 30);
				panel.add(input);
				panel.setBackground(Color.WHITE);
				
				
				// Go search button
				
				button = new JButton("Go!");
				button.setBackground(Color.BLUE);
				button.setBounds(650, 160, 50, 30);
				panel.add(button);
				button.addActionListener(new ActionListener( ) {
					
					@Override
					public void actionPerformed(ActionEvent e) {
							
							String action = e.getActionCommand();
							MasterCtrl.uiHandler(action);
						
					}
				});
				
				
				
				//Put the head buttons
				home = new JButton("Home");  //Home
				home.setBackground(Color.BLUE);
				home.setForeground(Color.BLUE);
				home.setBounds(5, 5, 60, 50);
				panel.add(home);
				
				about = new JButton("About us");    //About us
				about.setBackground(Color.BLUE);
				about.setForeground(Color.BLUE);
				about.setBounds(85, 5, 70, 50);
				panel.add(about);
				about.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
							
							String action = e.getActionCommand();
							MasterCtrl.uiHandler(action);
						
					}
				});
					
				
				contact = new JButton("Contact");    //Contact
				contact.setBackground(Color.BLUE);
				contact.setForeground(Color.BLUE);
				contact.setBounds(165, 5, 70, 50);
				panel.add(contact);
				contact.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
							
							String action = e.getActionCommand();
							MasterCtrl.uiHandler(action);
						
					}
				});
				
				
				login = new JButton("Login");  //Login
				login.setBackground(Color.BLUE);
				login.setForeground(Color.BLUE);
				login.setBounds(825, 5, 70, 50);
				panel.add(login);
				
				
				// add image
				
				imglabel = new JLabel();
				imglabel.setIcon(image);
				imglabel.setBounds(220, 5, 420, 100);
				panel.add(imglabel);
				
				
				frame.setVisible(true);
	}



	/**
	 * @return the input
	 */
	public JTextField getInput() {
		return input;
	}



	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}



	


	
}

