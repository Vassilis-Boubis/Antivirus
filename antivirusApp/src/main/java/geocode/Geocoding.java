package geocode;

import java.util.Scanner;

import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;

public class Geocoding {

	private static Geocoding gc;

	//Geocoding prevents the instantiation from any other class.
	private Geocoding() { }

	//Global point of access
	public static Geocoding getInstance() {

		if (gc == null) {

			gc = new Geocoding();

		}

		return gc;
	}


	//Returns latitude, longitude with the use of the default API key
	public double[] getCoordinates(String address) {

		Scanner input = new Scanner(System.in);

		while (true) {

			JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder("f3f9c6b869de4117ae7fd321aaea815d");
			JOpenCageForwardRequest request = new JOpenCageForwardRequest(address);

			request.setRestrictToCountryCode("gr");
			request.setBounds(23.27728, 37.63294, 24.15948, 38.20711);



			try {

				JOpenCageResponse response = jOpenCageGeocoder.forward(request);
				JOpenCageLatLng firstResultLatLng = response.getFirstPosition();
				double lat = firstResultLatLng.getLat();
				double lng = firstResultLatLng.getLng();
				double coord[] = new double[] { lat, lng };
				return coord;

			} catch (NullPointerException e) {

				System.err.println(
						"The area you have inserted is out of bounds(Attica)\n\nPlease enter the address again:");
				address = input.nextLine();

			}
		}

	}

	//Returns latitude and longitude with custom API key
	public double[] getCoordinates(String address, String apiKey) {

		Scanner input = new Scanner(System.in);

		while (true) {

			JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder(apiKey);
			JOpenCageForwardRequest request = new JOpenCageForwardRequest(address);

			request.setRestrictToCountryCode("gr");
			request.setBounds(23.27728, 37.63294, 24.15948, 38.20711);



			try {

				JOpenCageResponse response = jOpenCageGeocoder.forward(request);
				JOpenCageLatLng firstResultLatLng = response.getFirstPosition();
				double lat = firstResultLatLng.getLat();
				double lng = firstResultLatLng.getLng();
				double coord[] = new double[] { lat, lng };
				return coord;

			} catch (NullPointerException e) {

				System.err.println(
						"The area you have inserted is out of bounds(Attica)\n\nPlease enter the address again:");
				address = input.nextLine();

			}
		}

	}

}
