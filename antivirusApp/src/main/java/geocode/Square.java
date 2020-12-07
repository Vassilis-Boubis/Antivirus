package geocode;

public class Square {

	private static double[][] coords= new double[4][2];

	/*First variable of the table[] must be the latitude and the second must be the longitude
	 * of the address.
	 *
	 * If you sum 0,009 and latitude, you will go 1km to north and if you sum 0,012 and longitude you will go 1km to east
	 * With this logic we are able to find the bounds of the square that has sides of 1km and center the inserted coordinates.
	 */
	public static double[][] square(double[] table) {

		coords[0][0]=table[0]+0.009;
		coords[0][1]=table[1]-0.012;
		coords[1][0]=coords[0][0];
		coords[1][1]=coords[0][1]+0.024;
		coords[2][0]=coords[1][0]-0.018;
		coords[2][1]=coords[1][1];
		coords[3][0]=coords[2][0];
		coords[3][1]=coords[2][1]-0.024;

		return coords;
	}
}
