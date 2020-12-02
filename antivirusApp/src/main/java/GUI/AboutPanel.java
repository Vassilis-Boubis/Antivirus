package GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 *
 */

/**
 * @author dimitrispapakyriakopoylos
 *
 */
public class AboutPanel extends JPanel {



	@Override
	   public void paintComponent(Graphics g) {
	      super.paintComponent(g);

	      g.setColor(new Color(232,234,238));
	      g.fillRect(0, 0, 280, 800);
	      g.setColor(new Color(247,247,247));
	      g.fillRect(280,0,1120,800);
	      g.setColor(new Color(255,255,255));
	      g.fillRect(0, 295, 280, 40);
	      g.fillRoundRect(530, 290, 640, 450, 10, 10);
	      g.setColor(new Color(26, 127, 237));
	      g.fillRect(0, 295, 5, 40);


	   }
}

