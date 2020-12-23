package geocode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import CSV.DataProcessor;
import CSV.UsableData;
import excel.ReadCell;

public class CaseFinder {

	public ArrayList getResult(double[][] squareCoords, double[] coor) {

		ArrayList<double[]> result = new ArrayList<>();
		ReadCell rc = new ReadCell();
		boolean flag = true;
		int a = 0;
		

		double searchedLat = coor[0];
		double searchedLong = coor[1];
		
		int excelLength = 2353;
		
		int mid = 1 + (excelLength - 2) / 2;
		
		double midLat;
		
		double table[] = new double[2];
		
		if (squareCoords[0][0] >= rc.readCellData(0, 2) && squareCoords[3][0] <= rc.readCellData(0, 3)) {
			table[0] = rc.readCellData(0, 2);
			mid = 0;
			flag = false;
		}
		
		if (squareCoords[0][0] >= rc.readCellData(excelLength-1, 2) && squareCoords[3][0] <= rc.readCellData(excelLength - 1, 3)) {
			table[0] = rc.readCellData(excelLength - 1, 2);
			mid = excelLength - 1;
			flag = false;
		}
		
		while (flag) {
			midLat = rc.readCellData(mid, 2);
			
			if (squareCoords[0][0] >= midLat && squareCoords[3][0] <= midLat) {
				table[0] = midLat;	
				flag = false;
			} else {
				if (squareCoords[0][0] <= midLat) {
					mid = 1 + (mid - 1) / 2;
				} else if(squareCoords[3][0] >= midLat) {
					mid = mid + ( 1 + (mid - 1) / 2);
				}
			}
			
			
		}
		
		if (table[0] != 0.0) {
			table[1] = rc.readCellData(mid, 3);
		}
		
		
		
		
		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		/*while (flag) {
			double table[] = new double[2];
			double lat = rc.readCellData(a, 2);
			double lng = rc.readCellData(a, 3);

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
		*/
	}
	
	
	public int[] casesPerDay() throws ParseException {
		
		DataProcessor dataprocessor = new DataProcessor();
		int[] casesperday = new int[14];
		int count =0;
		
		for(int a=0; a<14; a++) {
			if (i.getDay() == minday && i.getMonth() == minmonth && i.getYear() == minyear) {
				count++;
			}
		}
		casesperday[a]=count;
		count=0;
		return casesperday;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
