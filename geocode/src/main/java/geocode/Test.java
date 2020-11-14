package geocode;

import org.slf4j.impl.StaticLoggerBinder;
//import org.slf4j.impl.StaticLoggerBinder;

import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;


public class Test {
	public static void main  (String args[]) {

		System.out.println("Hello");
		
		// In real live application the JOpenCageGeocoder should be a Singleton
		
		/* JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder("298d9b7dca6840c5a8d44fb2a722e777");

		JOpenCageForwardRequest request = new JOpenCageForwardRequest("Graz");
		request.setMinConfidence(1);
		request.setNoAnnotations(false);
		request.setNoDedupe(true);
		JOpenCageResponse response = jOpenCageGeocoder.forward(request); */
		
		// In real live application the JOpenCageGeocoder should be a Singleton
		
		JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder("f3f9c6b869de4117ae7fd321aaea815d");
		JOpenCageForwardRequest request = new JOpenCageForwardRequest("375 Albert Rd, Woodstock, Cape Town, 7915, South Africa");
		request.setRestrictToCountryCode("za"); // restrict results to a specific country
		request.setBounds(18.367, -34.109, 18.770, -33.704); // restrict results to a geographic bounding box (southWestLng, southWestLat, northEastLng, northEastLat)

		JOpenCageResponse response = jOpenCageGeocoder.forward(request);
		JOpenCageLatLng firstResultLatLng = response.getFirstPosition(); // get the coordinate pair of the first result
		
		double lat = firstResultLatLng.getLat();
		
		System.out.println(lat);
		
		System.out.println("Hello World");
		
	}
}