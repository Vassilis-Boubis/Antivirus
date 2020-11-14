package geocode;

import java.util.Scanner;

public class Test {

	public static void main (String args[]) {

		Geocoding test = new Geocoding();


		Scanner input = new Scanner(System.in);

		String user = input.nextLine();

		double[] coords = new double[2];

		coords = test.search(user);

		System.out.println(coords[0]);


	}


}


