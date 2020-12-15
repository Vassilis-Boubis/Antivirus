package geocode;

public class Main {

	public static void main(String[] args) {

		Geocoding g = Geocoding.getInstance();
		double a[] = g.getCoordinates("Αγίας Παρασκευής 66β,16777");
		System.out.println(a[0]);
		System.out.println(a[1]);

		Geocoding z = Geocoding.getInstance();;
		double v[] = z.getCoordinates("Αλίμου 10 17455");
		System.out.println(v[0]);
		System.out.println(v[1]);

		Distance obj = new Distance();
		double distance = obj.calculateDistanceInKilometer(a[0], a[1], v[0], v[1]);
		System.out.println(distance);

	}
}
