package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class WelcomePage {

	private JFrame frame;
	private JPanel panel;
	private JLabel imglabel;
	private ImageIcon image = new ImageIcon(getClass().getResource("spaceblue.jpeg"));
	private ImageIcon image3 = new ImageIcon(getClass().getResource("ffffff.png"));
	private JLabel msg ;
	private JButton start;
	private JLabel startb;

	public void makePage() {


		// GUI frame and panel creation
		frame = new JFrame();
		frame.setSize(700,612);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Program ends when we close the window
		frame.setTitle("Antivirus by DETechtives BETA version 1v.0.1");
		panel = new JPanel();
		frame.add(panel);


		// Set the frame to be appeared always in the center of the screen, regardless monitor
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height - 900);

		// Creation of Copyright message

		msg = new JLabel("Copyright ©2020 All rights reserved | DETechtives");
		msg.setFont(new Font("Helvectica", Font.PLAIN,15));  //Font of message. Constructor of new Font: (Font name, Type(Bold,plain,italic etc), Size)
		msg.setForeground(Color.WHITE); //Color of letters
		msg.setBounds(180, 480, 500, 150);





		//Start button
		start = new JButton("start");
		start.setIcon(image3);
		start.setBounds(320, 280, 69, 30);
		startb = new JLabel("START");
		startb.setFont(new Font("Arial", Font.BOLD,10));
		startb.setForeground(Color.CYAN.darker());
		start.add(startb);
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

					String action = e.getActionCommand();
					try {
						MasterCtrl.pageHandler(action);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

			}
		});




		// add background image

		imglabel = new JLabel();
		imglabel.setIcon(image);
		imglabel.add(msg);
		//imglabel.add(imglabel2);
		imglabel.add(start);



		panel.add(imglabel);
		frame.setResizable(false);
		frame.setVisible(true);


	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}





}

