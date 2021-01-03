package GUI;

import java.io.IOException;

import CSV.DataProcessor;
import geocode.Geocoding;
import geocode.Search;

public class MasterCtrl  {


	private static HomePage home = new HomePage();
	private static AboutUsPage about = new AboutUsPage();
	private static ContactPage contact = new ContactPage();
	private static WelcomePage intro = new WelcomePage();
	private static AnalyticsPage analytics = new AnalyticsPage();


	public static void main(String args[]) throws Exception {
		DataProcessor.processData();
		intro.makePage();
		home.makePage();
		about.makePage();
		contact.makePage();
	}


	public static void pageHandler(String action) throws IOException {

		  switch (action) {

			case "ABOUT US" :

							 about.getFrame().setVisible(true);
							 home.getFrame().setVisible(false);
							 contact.getFrame().setVisible(false);
							 break;
			case "HOME"     :

							 home.getFrame().setVisible(true);
							 about.getFrame().setVisible(false);
							 contact.getFrame().setVisible(false);
							 analytics.getFrame().setVisible(false);
							 break;


			case "CONTACT" :
				 			contact.getFrame().setVisible(true);
				 			home.getFrame().setVisible(false);
						 	about.getFrame().setVisible(false);
						 	break;

			case "start" :
							home.getFrame().setVisible(true);
							intro.getFrame().setVisible(false);
							break;
			case "Go!" :
							String input = home.getSearch().getText();
							if (checkInput(input)) {
								Search obj = new Search(input);
								analytics.makePage(obj);
								home.getFrame().setVisible(false);
							}
							break;
			case "Go!!" :
							input = analytics.getSearch().getText();
							if (checkInput(input)) {
								Search obj = new Search(input);
								analytics.getFrame().setVisible(false);
								analytics.makePage(obj);
								home.getFrame().setVisible(false);
							}
							break;
			}

	}


	public static boolean checkInput(String userInput) { // Prevents false searches from accidental button presses.
															// Returns true if everything is okay to go!

		if (userInput.equals("Where do you want to go?") || userInput.equals(" ")) {
			return false;
		}
		
		Geocoding geo = Geocoding.getInstance();
		double[] coords = geo.getCoordinates(userInput);
		if (coords[0] == 0 && coords[1] == 0) {
			return false;
		}
		return true;
	}







}

