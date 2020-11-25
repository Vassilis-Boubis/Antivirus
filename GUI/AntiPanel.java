import java.awt.*;
import javax.swing.*;



public class AntiPanel extends JPanel {
  
	
	
	@Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
    
      g.setColor(new Color(232,234,238));
      g.fillRect(0, 0, 280, 800);
      g.setColor(new Color(247,247,247));
      g.fillRect(280,0,1120,800);
      g.setColor(new Color(255,255,255));
      g.fillRoundRect(1000, 250, 380, 450, 20, 20);
      
      
   }
      
      
      
}

