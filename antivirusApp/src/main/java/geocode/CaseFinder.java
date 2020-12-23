package geocode;

import java.text.ParseException;
import java.util.ArrayList;

import CSV.DataProcessor;

public class CaseFinder {
	
	private static DataProcessor data = new DataProcessor();

	public ArrayList getResult(double[][] squareCoords, double[] coor) {

		ArrayList<double[]> result = new ArrayList<>();

		double table[] = new double[2];
		double lat = data.getData(0).getLat();
		double lng = data.getData(0).getLng();
		Distance d =new Distance();

		for (int i = 0; i < 2353; i++) {
			if (squareCoords[0][0] >= lat && squareCoords[3][0] <= lat) {
				if (squareCoords[0][1] <= lng && squareCoords[1][1] >= lng) {
					if(d.calculateDistanceInKilometer(lat,lng,coor[0],coor[1])) {
						
						table[0] = lat;
						table[1] = lng;
						result.add(table);
					}
				}
			}
		}
		return result;
	}
		



	public int[] casesPerDay() throws ParseException {

		int[] casesperday = new int[14];
		int count = 0;

		for (int a = 0; a < 14; a++) {
			for (int i = 0; i < 2353; i++) {
				if (data.getData(i).getDay() == a + 1) {
					count++;
				}
			}
			casesperday[a] = count;
			count = 0;
		}

		return casesperday;
	}



	public int casesInMunicipality(String mu) {

		int cases = 0;
		DataProcessor data =  new DataProcessor();
		boolean flag = false;

		for(int i=0; i < 2353; i++) {
			if(data.getData(i).getMunicipality() == mu) {

				cases ++;
				flag = true;
			}

			if (flag == true && data.getData(i).getMunicipality() != mu) {

				break;

			}

		}


		return cases;

	}



	public static void main(String[] args) throws Exception {
		DataProcessor.processData();
		CaseFinder cf = new CaseFinder();
		int[] a=cf.casesPerDay();
		int sum =0;
		for(int i=0; i<14;i++) {
			System.out.println(a[i]);
			sum +=a[i];
		}
		System.out.println(sum);
	}











}
