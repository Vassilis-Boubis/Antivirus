


package GUI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JLabel;



public class Graphstat extends JLabel {

	private int[] graphdata;

	public Graphstat() {
		graphdata= new int[] {15, 40, 130, 250, 180, 300};
		this.setBackground(Color.WHITE);

	}

	@Override
	protected void paintComponent(Graphics graph) {
		super.paintComponent(graph);

		Graphics2D mgraph = (Graphics2D) graph;
		int i, height, width, posx, posy;
		for (i=0;i<graphdata.length;i++) {
			height = (this.getHeight()-30)/graphdata.length - graphdata.length ;
			width = graphdata[i];
			posx = 0;
			posy = height * i+5;

			mgraph.setColor(Color.ORANGE);
			mgraph.fill(new Rectangle(posx, posy, width, height));
		}
	}

}

