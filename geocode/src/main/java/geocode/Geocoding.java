package geocode;

import org.slf4j.impl.StaticLoggerBinder;
//import org.slf4j.impl.StaticLoggerBinder;

import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;

public class Geocoding {

	public double[] search(String adress) {

		JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder("f3f9c6b869de4117ae7fd321aaea815d");
		JOpenCageForwardRequest request = new JOpenCageForwardRequest(adress);
		request.setRestrictToCountryCode("gr"); // restrict results to a specific country
		request.setBounds(23.27728,37.63294,24.15948,38.20711); // restrict results to a
		// geographic bounding box (southWestLng, southWestLat, northEastLng,northEastLat)

		JOpenCageResponse response = jOpenCageGeocoder.forward(request);
		JOpenCageLatLng firstResultLatLng = response.getFirstPosition(); // get the coordinate pair of the first result

		double lat = firstResultLatLng.getLat();
		double lng = firstResultLatLng.getLng();
		double coord[] = new double[] { lat, lng };

		return coord;
	}

	public double[] search(String adress, String apiKey) {

		JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(apiKey);
		JOpenCageForwardRequest request = new JOpenCageForwardRequest(adress);
		request.setRestrictToCountryCode("gr"); // restrict results to a specific country
		request.setBounds(23.27728,37.63294,24.15948,38.20711); // restrict results to a
		// geographic bounding box (southWestLng, southWestLat, northEastLng,northEastLat)

		JOpenCageResponse response = jOpenCageGeocoder.forward(request);
		JOpenCageLatLng firstResultLatLng = response.getFirstPosition(); // get the coordinate pair of the first result

		double lat = firstResultLatLng.getLat();
		double lng = firstResultLatLng.getLng();
		double coord[] = new double[] { lat, lng };

		return coord;
	}
	

}

