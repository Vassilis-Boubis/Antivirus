package geocode;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;

public class Geocoding {

	private static Geocoding gc;
	private static double[][] coords = new double[4][2];

	/*
	 * First variable of the table[] must be the latitude and the second must be the
	 * longitude of the address.
	 *
	 * If you sum 0,009 and latitude, you will go 1km to north and if you sum 0,012
	 * and longitude you will go 1km to east With this logic we are able to find the
	 * bounds of the square that has sides of 1km and center the inserted
	 * coordinates.
	 */

	// Geocoding prevents the instantiation from any other class.
	private Geocoding() {
	}

	// Global point of access
	public static Geocoding getInstance() {

		if (gc == null) {

			gc = new Geocoding();

		}

		return gc;
	}

	// Returns latitude, longitude with the use of the default API key
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

	// Returns latitude and longitude with custom API key
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

	public static double[][] getSquareCoords(double[] table) {

		coords[0][0] = table[0] + 0.009;
		coords[0][1] = table[1] - 0.012;
		coords[1][0] = coords[0][0];
		coords[1][1] = coords[0][1] + 0.024;
		coords[2][0] = coords[1][0] - 0.018;
		coords[2][1] = coords[1][1];
		coords[3][0] = coords[2][0];
		coords[3][1] = coords[2][1] - 0.024;

		return coords;
	}

	// Returns the municipality name with the use of reverse geocoding
	// The parameter should always be the double array that getCoordinates returns
	// Has a default API key
	public String reverseMunicipality(double[] coords) throws IOException {

		String language = "gr";
		String apiKey = "f3f9c6b869de4117ae7fd321aaea815d";
		String urlString = "https://api.opencagedata.com/geocode/v1/json?no_annotations=1&q=" + coords[0] + "+"
				+ coords[1] + "&limit=1&no_dedupe=1&language=" + language + "&min_confidence=3&key=" + apiKey;

		URL url = new URL(urlString);

		// read from the URL
		Scanner scan = new Scanner(url.openStream());
		String str = new String();
		while (scan.hasNext())
			str += scan.nextLine();
		scan.close();

		// build a JSON object
		JSONObject obj = new JSONObject(str);

		// get the first result
		JSONArray result = obj.getJSONArray("results");

		JSONObject itemR = result.getJSONObject(0);

		JSONObject components = itemR.getJSONObject("components");

		try {
			String municipality = components.getString("municipality");
			return municipality.toString();
		} catch (org.json.JSONException noMunicipality) {
			try {
				String suburb = components.getString("suburb");
				return suburb.toString();
			} catch (org.json.JSONException noMunicipalityNoSuburb) {
				String town = components.getString("town");
				return town.toString();
			}

		}

	}

}
