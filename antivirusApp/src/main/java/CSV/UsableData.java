package CSV;

public class UsableData {

	// Creates an Object of every data from database with municipality, address,
	// geocoordinates, and Date of reported case

	private String address;
	private String municipality; //
	private double lat;
	private double lng;
	private int day;
	private int month;
	private int year;

	public UsableData(String address, String municipality, double lat, double lng, int day, int month, int year) {

		this.address = address;
		this.municipality = municipality;
		this.lat = lat;
		this.lng = lng;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	/**
	 * @return the municipality
	 */
	public String getMunicipality() {
		return municipality;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * @return the lng
	 */
	public double getLng() {
		return lng;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

}
