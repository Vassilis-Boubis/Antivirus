package geocode;




import java.util.ArrayList;

import excel.ReadCell;

public class CaseFinder {

	public ArrayList getResult(double[][] squareCoords) {

		ArrayList<double[]> result = new ArrayList<>();
		ReadCell rc = new ReadCell();
		boolean flag = true;
		int a = 0;
		
		while (flag) {
			double table[] = new double[2];
			double lat = rc.ReadCellData(a, 2);
			double lng = rc.ReadCellData(a, 3);

			if (squareCoords[0][0] >= lat && squareCoords[3][0] <= lat) {
				if (squareCoords[0][1] <= lng && squareCoords[1][1] >= lng) {
					table[0] = lat;
					table[1] = lng;
					result.add(table);
					System.out.println(lat);
					System.out.println(lng);
				}
			}

			if (lat != 0 && lng != 0) {
				a++;
			} else {
				flag = false;

			}

		}
		
		return result;
	}

}
