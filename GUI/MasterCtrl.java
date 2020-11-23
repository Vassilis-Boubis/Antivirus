

/**
 * 
 */

/**
 * @author dimitrispapakyriakopoylos
 *
 */




public class MasterCtrl  {

	
	private static HomePage home = new HomePage();
	private static AboutUsPage about = new AboutUsPage();
	private static ContactPage contact = new ContactPage();
	private static WelcomePage intro = new WelcomePage();
	
	
	public static void main(String[] args) {
		intro.makePage();
		home.makePage();
		about.makePage();
		contact.makePage();
	
	}


	public static void pageHandler(String action) {
		  
		  switch (action) {
			
//			case "About us" :
//				  
//							 about.getFrame().setVisible(true);
//							 home.getFrame().setVisible(false);
//							 contact.getFrame().setVisible(false);
//							 break;
//			case "Home"     :
//							 
//							 home.getFrame().setVisible(true);
//							 about.getFrame().setVisible(false);
//							 contact.getFrame().setVisible(false);
//							 break;
//							 
//							
//			case "Contact" :
//				 			contact.getFrame().setVisible(true);
//				 			home.getFrame().setVisible(false);
//						 	about.getFrame().setVisible(false);
//						 //	map.getFrame().setVisible(false);
//						 	break;
						 	
			case "start" :
							home.getFrame().setVisible(true);
							intro.getFrame().setVisible(false);
							break;
			}
		
	}
	
	
	public static void uiHandler(String action) {
		
		switch (action) {
		
		case "Prevention" :
							
							home.getSp2().setVisible(true);
							home.getBlue2().setBounds(1130, 220, 50, 3);
							home.getSp().setVisible(false);
							home.getSp3().setVisible(false);
							break;
							
		case "Symptoms" :
			
							home.getSp().setVisible(true);
							home.getBlue2().setBounds(1020, 220, 50, 3);
							home.getSp2().setVisible(false);
							home.getSp3().setVisible(false);
							break;
							
		case "Treatments" :
							
							home.getSp3().setVisible(true);
							home.getBlue2().setBounds(1240, 220, 50, 3);
							home.getSp2().setVisible(false);
							home.getSp().setVisible(false);
							break;
		}
		
		
		
	}
	
	
	
	
	
	
	
}

