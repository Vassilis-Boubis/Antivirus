package geocode;

import java.util.ArrayList;

import CSV.DataProcessor;

public class Search {

	private static DataProcessor data = new DataProcessor();  // Provides access to our data table

	private static Search lastSearch; // The last object created
	
	
	private String userInput; // The address the user has inserted
	private double[] uiCoordinates = new double[2]; // The Latitude and longtitude of the user's input
	private ArrayList<Integer> indexOfCases; // A List which contains the index of each case that is included in an area of a circle with r =1km from user's input
	private int totalNumberOfCasesInSelectedArea; // Total cases that match our selection criteria
	private int[] casesPerDay; // How many cases existed every day in the past 2 weeks in the area selected from user's input
	private int totalCasesInMunicipality; // How many cases the municipality of the search had the past 2 weeks

	
	
	public Search(String userInput) {
		this.userInput = userInput;
		Geocoding g = Geocoding.getInstance();
		double[] coordinates = new double[2];
		coordinates = g.getCoordinates(userInput);
		this.uiCoordinates[0] = coordinates[0];
		this.uiCoordinates[1] = coordinates[1];
		this.indexOfCases = getIndexForCasesInSelectedArea(Square.getCoordinates(coordinates), coordinates);
		this.totalNumberOfCasesInSelectedArea = this.indexOfCases.size();
		this.casesPerDay = casesPerDay();
		//this.totalCasesInMunicipality = casesInMunicipality(data.getData(indexOfCases[0]));
		lastSearch = this;
	}

	public ArrayList<Integer> getIndexForCasesInSelectedArea(double[][] squareCoords, double[] userCoords) { // Returns a list with indexes.
																//Each index represents a line in the data table, where a case is less than
																//1km away from user's input

		ArrayList<Integer> indexList = new ArrayList<Integer>();
		Distance d = new Distance();

		for (int i = 0; i < 2353; i++) {
			if (squareCoords[0][0] >= data.getData(i).getLat() && squareCoords[3][0] <= data.getData(i).getLat()) {
				if (squareCoords[0][1] <= data.getData(i).getLng() && squareCoords[1][1] >= data.getData(i).getLng()) {
					if (d.calculateDistanceInKilometer(data.getData(i).getLat(), data.getData(i).getLng(),
							userCoords[0], userCoords[1])) {
						indexList.add(i);
					}
				}
			}
		}
		if (indexList.size() == 0) {
			indexList.add(-1);
		}
		return indexList;
	}

	public int[] casesPerDay() {

		int[] casesperday = new int[14];
		int count = 0;

		for (int a = 1; a <= 14; a++) {
			for (int i = 0; i < this.totalNumberOfCasesInSelectedArea; i++) {
				if (data.getData(this.indexOfCases.get(i)).getDay() == a) {
					count++;
				}
			}
			casesperday[a - 1] = count;
			count = 0;
		}

		return casesperday;
	}
	
	
	public static Search getLastSearch() {
		return lastSearch;
	}

	/**
	 * @return the userInput
	 */
	public String getUserInput() {
		return userInput;
	}

	/**
	 * @return the uiCoordinates
	 */
	public double getUiCoordinates(int i) {
		return uiCoordinates[i];
	}

	/**
	 * @return the indexOfCases
	 */
	public ArrayList<Integer> getIndexOfCases() {
		return indexOfCases;
	}

	/**
	 * @return the totalNumberOfCasesInSelectedArea
	 */
	public int getTotalNumberOfCasesInSelectedArea() {
		return totalNumberOfCasesInSelectedArea;
	}

	/**
	 * @return the casesPerDay
	 */
	public int getCasesPerDay(int i) {
		return casesPerDay[i];
	}

	/**
	 * @return the totalCasesInMunicipality
	 */
	public int getTotalCasesInMunicipality() {
		return 0;
	}
	
//	public int casesInMunicipality(String municipality) {
//		int cases = 0;
//		boolean flag = false;
//		for (int i = 0; i < 2353; i++) {
//			if (data.getData(i).getMunicipality() == municipality) {
//				cases++;
//				flag = true;
//			}
//			if (flag == true && data.getData(i).getMunicipality() != municipality) {
//				break;
//			}
//		}
//		return cases;
//	}
	
	
	
	

	
}
