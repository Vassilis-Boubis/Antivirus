/**
 *
 */
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.jxmapviewer.JXMapViewer;

import geocode.MapDisplay;
import geocode.Search;


public class AnalyticsPage {

	private JFrame frame;
	private AnalyticsPanel panel;
	private JButton homeb;
	private JLabel home;
	private JButton aboutb;
	private JLabel about;
	private JButton contactb;
	private JLabel contact;
	private ImageIcon image = new ImageIcon(getClass().getResource("/antivirusApp/Source/images/e9ebee.png"));
	private ImageIcon logo = new ImageIcon(getClass().getResource("/antivirusApp/Source/images/logo.jpeg"));
	private JLabel logol;
	private JTextField search;
	private ImageIcon gs = new ImageIcon(getClass().getResource("/antivirusApp/Source/images/search.png"));
	private JButton go;
	private JTextArea descriptiveStatistics;
	private JLabel graph;
	private JLabel percentage;
	private JLabel percentLabel;
	private JLabel noMunCasesMessage;
	private JLabel outOfAttika;
	private JLabel zeroCases;


	public void makePage(Search obj) {

		// GUI frame and panel creation
		frame = new JFrame();
		frame.setSize(1400,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Antivirus by DETechtives BETA version 1v.0.1");

		panel = new AnalyticsPanel();
		frame.add(panel);
		panel.setLayout(null);


		// Set the frame to be appeared always in the center of the screen, regardless monitor
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height - 950);


		// Home button creation
				homeb = new JButton("HOME");
				homeb.setIcon(image);
				home = new JLabel("HOME");
				home.setFont(new Font("Helvectiva", Font.BOLD,12));
				home.setForeground(new Color(16, 44, 86));
				homeb.setBounds(120, 250, 70, 30);
				homeb.setSize(100, 35);
				homeb.add(home);
				panel.add(homeb);
				homeb.addActionListener(new ActionListener() {

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





				// About Us button creation
				aboutb = new JButton("ABOUT US");
				aboutb.setIcon(image);
				about = new JLabel("ABOUT US");
				about.setFont(new Font("Helvectiva", Font.BOLD,12));
				about.setForeground(new Color(16, 44, 86));
				aboutb.setBounds(120, 300, 100, 30);
				aboutb.setSize(100, 35);
				aboutb.add(about);
				panel.add(aboutb);
				aboutb.addActionListener(new ActionListener() {

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



				// Contact button creation
				contactb = new JButton("CONTACT");
				contactb.setIcon(image);
				contact = new JLabel("CONTACT");
				contact.setFont(new Font("Helvectiva", Font.BOLD,12));
				contact.setForeground(new Color(16, 44, 86));
				contactb.setBounds(120, 350, 100, 30);
				contactb.setSize(100, 35);
				contactb.add(contact);
				panel.add(contactb);
				contactb.addActionListener(new ActionListener() {

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

				//Create the tier 2
				//Add search bar

				search = new JTextField(obj.getUserInput(), 50);
				search.setBounds(300, 100, 600, 40);
				panel.add(search);


				outOfAttika = new JLabel("* This Location is not in Attika, Greece. Try again! *");
				outOfAttika.setFont(new Font("Arial", Font.PLAIN, 14));
				outOfAttika.setForeground(Color.RED);
				outOfAttika.setBounds(330, 145, 400, 30);
				outOfAttika.setVisible(false);
				panel.add(outOfAttika);



				// Go search button

				go = new JButton("Go!");
				go.setIcon(gs);
				go.setBounds(905, 100, 42, 38);
				panel.add(go);
				go.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

							String action = e.getActionCommand()+"!";
							try {
								MasterCtrl.pageHandler(action);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

					}
				});



				logol = new JLabel();
				logol.setIcon(logo);
				logol.setBounds(290, 5, 250, 50);
				panel.add(logol);





				//Display Map
			    MapDisplay showMap = new MapDisplay();
			    JXMapViewer mapViewer = new JXMapViewer();
			    mapViewer = showMap.create(obj.getUiCoordinates(0), obj.getUiCoordinates(1));
			    mapViewer.setBounds(1000, 50, 350, 250);
			    panel.getRootPane().add(mapViewer);


			    int totalCases = obj.getTotalNumberOfCasesInSelectedArea();
			    if (obj.getIndexOfCases().get(0) == -1) {
			    	totalCases = 0;
			    }

			    String stats = "Total COVID-19 cases in your selected area:		"+ Integer.toString(totalCases);
			    stats += "\n\n\nTotal COVID-19 cases in Municipality:		" + Integer.toString(obj.getTotalCasesInMunicipality());
			    descriptiveStatistics = new JTextArea(stats);
			    descriptiveStatistics.setEditable(false);
			    descriptiveStatistics.setBackground(new Color(247,247,247));
			    descriptiveStatistics.setBounds(350, 200, 450, 100);
			    panel.add(descriptiveStatistics);


			    graph = new JLabel("COVID-19 cases in the last 14 days:");
			    graph.setFont(new Font("Arial", Font.BOLD, 14));
			    graph.setForeground(new Color(16, 44, 86));
			    graph.setBounds(300, 330, 300, 50);
			    panel.add(graph);



			    zeroCases = new JLabel("There were 0 COVID-19 cases in this location the past 14 days.");
			    zeroCases.setFont(new Font("Arial", Font.BOLD, 13));
			    zeroCases.setBounds(340, 450, 400, 40);
			    if (totalCases == 0) {
			    	zeroCases.setVisible(true);
			    } else {
			    	zeroCases.setVisible(false);
			    }
			    panel.add(zeroCases);


			    String percent;
			    if (obj.getTotalCasesInMunicipality() != 0) {
			    	if (obj.getIndexOfCases().get(0) != -1) {
			    		percent = Double.toString((double) obj.getTotalNumberOfCasesInSelectedArea() / obj.getTotalCasesInMunicipality()).substring(2,4)+"%";
			    	} else {
			    		percent = Integer.toString(0) + "%";
			    	}
			    } else {
			    	percent = "N/A";
			    }
			    percentage = new JLabel(percent);
			    percentage.setFont(new Font("Arial", Font.BOLD, 60));
			    percentage.setBounds(1160, 550, 150, 100);
			    panel.add(percentage);



			    percentLabel = new JLabel("% of cases compared to Total Municipality cases:");
			    percentLabel.setBounds(1050, 400, 350, 100);
			    panel.add(percentLabel);

			    noMunCasesMessage = new JLabel("*No COVID - 19 cases were recorded in your location's municipality*");
			    noMunCasesMessage.setFont(new Font("Arial", Font.PLAIN, 10));
			    noMunCasesMessage.setForeground(Color.RED);
			    noMunCasesMessage.setBounds(1045, 720, 350, 30);
			    noMunCasesMessage.setVisible(false);
			    if (obj.getTotalCasesInMunicipality() == 0) {
			    	noMunCasesMessage.setVisible(true);
			    }
			    panel.add(noMunCasesMessage);




		frame.setResizable(false);
		frame.setVisible(true);
	}


	/**
	 * @return the search
	 */
	public JTextField getSearch() {
		return search;
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}


	/**
	 * @return the outOfAttika
	 */
	public JLabel getOutOfAttika() {
		return outOfAttika;
	}

}
