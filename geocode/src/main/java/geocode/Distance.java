package geocode;

public class Distance {

	public final static double AVERAGE_RADIUS_OF_EARTH_KM = 6371;
	public double calculateDistanceInKilometer(double userLat, double userLng,
	  double venueLat, double venueLng) {

	    double latDistance = Math.toRadians(userLat - venueLat);
	    double lngDistance = Math.toRadians(userLng - venueLng);

	    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
	      + Math.cos(Math.toRadians(userLat)) * Math.cos(Math.toRadians(venueLat))
	      * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);

	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

	    double x = AVERAGE_RADIUS_OF_EARTH_KM * c;
	    return x;
	}
	
	public Distance() {
		
	}


}
