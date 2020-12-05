package geocode;

public class Square {

	private static double[][] lat_long= new double[4][2];
	private static double lat;
	private static double lon;
	
	public static double[][] square(double[] table) {
		lat=table[0]+0.009;
		lon=table[1]-0.012;
		lat_long[0][0]=lat;
		lat_long[0][1]=lon;
		lat_long[1][0]=lat_long[0][0];
		lat_long[1][1]=lat_long[0][1]+0.024;
		lat_long[2][0]=lat_long[1][0]-0.018;
		lat_long[2][1]=lat_long[1][1];
		lat_long[3][0]=lat_long[2][0];
		lat_long[3][1]=lat_long[2][1]-0.024;

		return lat_long;
	}
}
