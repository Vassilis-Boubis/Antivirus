package GUI;

import java.io.IOException;

import CSV.DataProcessor;
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
								if (obj.getUiCoordinates(0) != -1 && obj.getUiCoordinates(1) != -1) {
									analytics.makePage(obj);
									home.getOutOfAttika().setVisible(false);
									home.getFrame().setVisible(false);
								} else {
									home.getOutOfAttika().setVisible(true);
								}
							}
							break;
			case "Go!!" :
							input = analytics.getSearch().getText();
							if (checkInput(input)) {
								Search obj = new Search(input);
								if (obj.getUiCoordinates(0) != -1 && obj.getUiCoordinates(1) != -1) {
									analytics.getFrame().setVisible(false);
									analytics.makePage(obj);
									analytics.getOutOfAttika().setVisible(false);
									home.getFrame().setVisible(false);
								} else {
									analytics.getOutOfAttika().setVisible(true);
								}
							}
							break;
			}

	}


	public static boolean checkInput(String userInput) { // Prevents false searches from accidental button presses.
															// Returns true if everything is okay to go!

		if (userInput.equals("Where do you want to go?") || userInput.equals(" ")) {
			return false;
		}
		
		return true;
	}
	


}

