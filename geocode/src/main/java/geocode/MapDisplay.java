package geocode;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;



public class MapDisplay {

	//Returns a JXMapviewer object so it can be added to a JPanel
	public JXMapViewer create(double lat, double lng) {

	   	JXMapViewer mapViewer = new JXMapViewer();
	   	mapViewer.setBounds(300, 200, 350, 250);

        // Create a TileFactoryInfo for OpenStreetMap
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        mapViewer.setTileFactory(tileFactory);


        // Use 8 threads in parallel to load the tiles
        tileFactory.setThreadPoolSize(8);

        GeoPosition position = new GeoPosition(lat, lng);

        // Zoom set to 3.
        mapViewer.setZoom(4);

        mapViewer.setAddressLocation(position);

        return mapViewer;



	}

}
