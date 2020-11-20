

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
	
	
	public static void main(String[] args) {
		home.makePage();
		about.makePage();
		contact.makePage();
	
	}


	public static void uiHandler(String action) {
		  
		  switch (action) {
			
			case "About us" :
				        		
				            
							 about.getFrame().setVisible(true);
							 home.getFrame().setVisible(false);
							 contact.getFrame().setVisible(false);
							 break;
			case "Home"     :
							 
							 home.getFrame().setVisible(true);
							 about.getFrame().setVisible(false);
							 contact.getFrame().setVisible(false);
							 break;
							 
			case "Go!" :
				
						 	home.getFrame().setVisible(true);
						 	about.getFrame().setVisible(false);
						 	contact.getFrame().setVisible(false);
						 	
						 	 
						 	 
						 	 
						 	 
						 	 
						 	 
							break;
							
			case "Contact" :
				 			contact.getFrame().setVisible(true);
				 			home.getFrame().setVisible(false);
						 	about.getFrame().setVisible(false);
						 //	map.getFrame().setVisible(false);
						 	break;
			}
		
	}
	
	
	
}

