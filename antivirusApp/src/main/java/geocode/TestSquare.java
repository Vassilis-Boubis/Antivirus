package geocode;

import java.util.Scanner;

public class TestSquare {

	public static void main(String[] args) {

		Geocoding geocode = new Geocoding();

		Square square = new Square();

		double[] coordsPosition = new double[2];

		double[][] coordsSquare = new double[4][2];

		String location;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter address (Attica):");

		location = input.nextLine();

		coordsPosition = geocode.getCoordinates(location);

		coordsSquare = Square.getCoordinates(coordsPosition);

		for(int i = 0; i <= 3; i++) {

			for(int j =0; j <= 1; j++) {

				System.out.println(coordsSquare[i][j]);

			}

		}
	}

}
