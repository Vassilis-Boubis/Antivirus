package GUI;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jxmapviewer.JXMapViewer;

import geocode.Geocoding;
import geocode.MapDisplay;

public class TestGeoMap {

	public static void main(String[] args) {

        show();

	}

	//Creates GUI elements, does forward geocoding of desired location
	public static void show() {

		JPanel p = new JPanel();

        JFrame frame = new JFrame();

        frame = frameCreator(1400, 800);

        frame.add(p);

        String location = locationInput();

        double[] ping = new double[2];

        //Follows the Singleton structure
        Geocoding geo = Geocoding.getInstance();

        MapDisplay showMap = new MapDisplay();

        JXMapViewer mapViewer = new JXMapViewer();

        ping = geo.getCoordinates(location);

        mapViewer = showMap.create(ping[0], ping[1]);

        p.getRootPane().add(mapViewer);

        frame.setVisible(true);

	}


	//User inputs location
	public static String locationInput() {

		String location;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter address (Attica):");

		location = input.nextLine();



		return location;
	}

	//Creates JFrame
	public static JFrame frameCreator(int width, int length) {

		JFrame frame = new JFrame("MAP");


        frame.setSize(width, length);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return frame;

	}

}
