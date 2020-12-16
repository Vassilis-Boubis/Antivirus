package geocode;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Geocoding g = Geocoding.getInstance();
		double a[] = g.getCoordinates("37-39 falirou st");
		System.out.println(a[0]);
		System.out.println(a[1]);

		Geocoding z = Geocoding.getInstance();
		;
		double v[] = z.getCoordinates("Αλίμου 10 17455");
		System.out.println(v[0]);
		System.out.println(v[1]);

		Distance obj = new Distance();
		double distance = obj.calculateDistanceInKilometer(a[0], a[1], v[0], v[1]);
		System.out.println(distance);

		double sqr[][] = Square.getCoordinates(a);
		CaseFinder cf = new CaseFinder();
		ArrayList<double[]> resultList = new ArrayList();
		resultList = cf.getResult(sqr);
		for(double[] i : resultList) {
			System.out.println(i[0] + " | "+i[1]);

		}
		

	}
}
