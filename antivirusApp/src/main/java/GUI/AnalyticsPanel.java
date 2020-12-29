/**
 * 
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics;

import geocode.MapDisplay;
import geocode.Search;
import javax.swing.JPanel;

import org.jxmapviewer.JXMapViewer;

/**
 * @author Dimitris Papakyriakopoulos
 * 
 * This class, inherits from JPanel and, creates a custom Analytics page every time it is called. This Panel draws a 2x2 graph
 * which shows the daily amount of COVID-19 cases in a selected area specified by other classes. Also, it
 * creates a round pie-graph, which shows the % of COVID-19 cases of a municipality, that are included in the same
 * specified area.
 */
public class AnalyticsPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5516713698908357181L;

	public void paintComponent(Graphics g) {
	      super.paintComponent(g);	      	         
	      
	      
	      g.setColor(new Color(232,234,238)); // Paint the background theme
	      g.fillRect(0, 0, 280, 800);
	      g.setColor(new Color(247,247,247));
	      g.fillRect(280,0,1120,800);
	      
	  
	      Search obj = Search.getLastSearch();
	      int max = obj.getCasesPerDay(0);  // finds max number of daily cases
	      for (int i = 1; i < 14; i++) {
	    	  if (obj.getCasesPerDay(i) > max) {
	    		  max = obj.getCasesPerDay(i);
	    	  }
	      } 
	      g.setColor(new Color(26, 127, 237));
	      g.drawLine(300, 400, 300, 700);
	      g.drawLine(300, 700, 600, 700);
	      int i,y1,y2;
	      
	      for (i=0;i< 13;i++) {		// Create the graph
	    	  g.setColor(Color.BLACK);
	    	  y1 = (int) ( 700 - 300 * obj.getCasesPerDay(i)/(1.2 * max));
	    	  y2 = (int) ( 700 - 300 * obj.getCasesPerDay(i + 1)/(1.2 * max));
	    	  g.drawLine(300 + 22 *i, y1, 300 + 22 * i +20, y2);
	      }
	      
	      
	      int width = 15;
	      for (i = 0; i <= width; i++) {
	    	  g.setColor(Color.BLACK);
	    	  g.drawOval(1150 - i, 500 - i, 200 + 2 * i, 200 + 2 * i);
	    	  g.setColor(Color.CYAN);
	    	  g.drawArc(1150 - i, 500 - i, 200 + 2 * i, 200 + 2 * i, 0, 90);  // Last 2 arguments are startAngle and arcAngle
	    	  
	      }
	      
	      
	      
	      
	   }

}

//y1 = (int) ( 700 - 500 * Results.getAiPredictions(i)/ Results.max);
//y2 = (int) ( 700 - 500 * Results.getAiPredictions(i + 1)/ Results.max);
//g.drawLine(100 + 2 *i, y1, 100 + 2*i +2, y2);