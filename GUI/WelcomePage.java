import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author dimitrispapakyriakopoylos
 *
 */
public class WelcomePage {

	private JFrame frame;
	private JPanel panel;
	private JLabel imglabel;
	private JLabel imglabel2;
	private ImageIcon image = new ImageIcon(getClass().getResource("space.jpeg"));
	private ImageIcon image2 = new ImageIcon(getClass().getResource("logo.jpeg"));
	private ImageIcon image3 = new ImageIcon(getClass().getResource("ff3366.png"));
	private JLabel msg ;
	private JButton start;
	private JLabel startb;
	
	public void makePage() {
		
	
		// GUI frame and panel creation
		frame = new JFrame();
		frame.setSize(900,890);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Program ends when we close the window
		frame.setTitle("Antivirus by DETechtives BETA version 1v.0.1");
		panel = new JPanel();
		frame.add(panel);
		
		
		// Creation of Copywrite message
		
		msg = new JLabel("Copyright ©2020 All rights reserved | DETechtives");
		msg.setFont(new Font("Helvectica", Font.PLAIN,15));  //Font of message. Constructor of new Font: (Font name, Type(Bold,plain,italic etc), Size)
		msg.setForeground(Color.WHITE); //Color of letters
		msg.setBounds(275, 750, 500, 150); 
		
		
		
		//Antivirus logo
		
		imglabel2 = new JLabel();
		imglabel2.setIcon(image2);
		imglabel2.setBounds(250, 205, 400, 150);
		
		
		//Start button
		start = new JButton("start");
		start.setIcon(image3);
		start.setBounds(415, 400, 70, 30);
		startb = new JLabel("START");
		startb.setFont(new Font("Arial", Font.BOLD,15));
		start.add(startb);
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
					String action = e.getActionCommand();
					MasterCtrl.uiHandler(action);
				
			}
		});
		
		
		
		
		// add background image
		
		imglabel = new JLabel();
		imglabel.setIcon(image);
		imglabel.add(msg);
		imglabel.add(imglabel2);
		imglabel.add(start);
		
		
		
		panel.add(imglabel);
		
		frame.setVisible(true);
		
		
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	
	
	

}

