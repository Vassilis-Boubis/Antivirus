/**
 * 
 */
package GUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import geocode.Search;
import javax.swing.JPanel;

/*
 *         This class, inherits from JPanel and, creates a custom Analytics page
 *         every time it is called. This Panel draws a 2x2 graph which shows the
 *         daily amount of COVID-19 cases in a selected area specified by other
 *         classes. Also, it creates a round pie-graph, which shows the % of
 *         COVID-19 cases of a municipality, that are included in the same
 *         specified area.
 */
public class AnalyticsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5516713698908357181L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(new Color(232, 234, 238)); // Paint the background theme
		g.fillRect(0, 0, 280, 800);
		g.setColor(new Color(247, 247, 247));
		g.fillRect(280, 0, 1120, 800);
		g.setColor(Color.WHITE);
		g.fillRoundRect(1030, 430, 340, 320, 10, 10);

		g.setColor(new Color(16, 44, 86));
		g.drawRoundRect(1030, 430, 340, 320, 10, 10);
		Search obj = Search.getLastSearch();
		if (obj.getIndexOfCases().get(0) != -1) {
			int max = obj.getCasesPerDay(0); // finds max number of daily cases
			for (int i = 1; i < 14; i++) {
				if (obj.getCasesPerDay(i) > max) {
					max = obj.getCasesPerDay(i);
				}
			}
			g.setColor(new Color(26, 127, 237));
			g.fillRect(300, 400, 3, 350);
			g.fillRect(300, 750, 420, 3);
			int i, y1, y2;
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(3));
			for (i = 0; i < 14; i++) { // Create the graph
				g.setColor(new Color(16, 44, 86));
				g.fillRect(305 + 27 * i, (int) (750 - 300 * obj.getCasesPerDay(i) / (1.15 * max)), 25,
						(int) (300 * obj.getCasesPerDay(i) / (1.15 * max)));
				g.drawString(Integer.toString(obj.getCasesPerDay(i)), 305 + 27 * i,
						(int) (750 - 300 * obj.getCasesPerDay(i) / (1.15 * max) - 2));
			}
		}
		int municipality = obj.getTotalCasesInMunicipality();
		int selected = obj.getTotalNumberOfCasesInSelectedArea();
		if (obj.getIndexOfCases().get(0) == -1) {
			selected = 0;
		}
		int i;
		int width = 15; // Create the % circle with line width = 15
		for (i = 0; i <= width; i++) {
			g.setColor(new Color(16, 44, 86));
			g.drawOval(1110 - i, 500 - i, 200 + 2 * i, 200 + 2 * i);
			g.setColor(new Color(26, 127, 237));
			if (municipality != 0) {
				g.drawArc(1110 - i, 500 - i, 200 + 2 * i, 200 + 2 * i, 0 + 90, -360 * selected / municipality); // Last
																												// 2
																												// arguments
																												// are
																												// startAngle
																												// and
																												// arcAngle
			} else {
				g.drawArc(1110 - i, 500 - i, 200 + 2 * i, 200 + 2 * i, 0 + 55, 360);
			}
		}

	}

}
