package geocode;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;

public class TestMaps {

	 public static void main(String[] args) throws IOException {

    	 JFrame frame = new JFrame("AUEB");


         JPanel p = new JPanel();
         frame.add(p);


         frame.setSize(1400, 800);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	 JXMapViewer mapViewer = new JXMapViewer();
    	 mapViewer.setBounds(300, 200, 350, 250);

         // Create a TileFactoryInfo for OpenStreetMap
         TileFactoryInfo info = new OSMTileFactoryInfo();
         DefaultTileFactory tileFactory = new DefaultTileFactory(info);
         mapViewer.setTileFactory(tileFactory);


         // Use 8 threads in parallel to load the tiles
         tileFactory.setThreadPoolSize(8);

         // Zoom level adjustments
         GeoPosition aueb = new GeoPosition(37.994349550970995, 23.7326100424694);

         mapViewer.setZoom(2);
         mapViewer.setAddressLocation(aueb);



         // Display the viewer in a JFrame

         p.getRootPane().add(mapViewer);

         frame.setVisible(true);
    }

}
