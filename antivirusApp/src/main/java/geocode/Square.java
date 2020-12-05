package geocode;

public class Square {

	private static double[][] lat_long= new double[4][2];
	
	public static double[][] square(double[] table) {

		lat_long[0][0]=table[0]+0.009;
		lat_long[0][1]=table[1]-0.012;
		lat_long[1][0]=lat_long[0][0];
		lat_long[1][1]=lat_long[0][1]+0.024;
		lat_long[2][0]=lat_long[1][0]-0.018;
		lat_long[2][1]=lat_long[1][1];
		lat_long[3][0]=lat_long[2][0];
		lat_long[3][1]=lat_long[2][1]-0.024;

		return lat_long;
	}
}
