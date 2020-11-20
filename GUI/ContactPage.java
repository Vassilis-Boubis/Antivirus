import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author dimitrispapakyriakopoylos
 *
 */
public class ContactPage  {

	
	
	private  JFrame frame;
	private  JPanel panel;
	private ImageIcon image = new ImageIcon(getClass().getResource("Antivirus.png"));
	private JLabel imglabel;
	private JLabel body;
	private  JButton home;
	private  JButton about;
	private  JButton contact;
	private  JButton login;
	
	
	
	public void makePage() {
		
		//Create the frame
		frame = new JFrame();
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Antivirus by DETechtives BETA version 1v.0.1");
		
		//Create the panel
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.add(panel);
		panel.setLayout(null);
		
		
		
		
		//Put the head buttons
		home = new JButton("Home");  //Home
		home.setBackground(Color.BLUE);
		home.setForeground(Color.BLUE);
		home.setBounds(5, 5, 60, 50);
		panel.add(home);
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
					String action = e.getActionCommand();
					MasterCtrl.uiHandler(action);
				
			}
		});
		
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
		
		
		login = new JButton("Login");  //Login
		login.setBackground(Color.BLUE);
		login.setForeground(Color.BLUE);
		login.setBounds(825, 5, 70, 50);
		panel.add(login);
		
		
		//Create body;
		
		String text= "Contact page ";
				
		
		body = new JLabel(text);
		body.setBounds(350, 300, 250, 150);
		panel.add(body);
		
		//Put the logo on
		imglabel = new JLabel();
		imglabel.setIcon(image);
		imglabel.setBounds(220, 5, 420, 100);
		panel.add(imglabel);
		
		
		
		frame.setVisible(false);
		
		
		
		
		
	}



	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}
	
	
	
	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}



	
}

