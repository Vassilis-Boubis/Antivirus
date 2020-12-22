/**
 * 
 */

/**
 * @author dimitrispapakyriakopoylos
 *
 */
public class UsableData {

	
	//Creates an Object of every data from database with municipality, address and geocoordinates
	
	private String municipality;  //
	private String address;
	private double lat;
	private double lng;
	
	public UsableData(String municipality, String address, double lat, double lng) {
		this.municipality = municipality;
		this.address = address;
		this.lat = lat;
		this.lng = lng;
	}
}

