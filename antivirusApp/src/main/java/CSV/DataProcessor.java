package CSV;

import java.io.*;
import java.util.Scanner;

public class DataProcessor {
	public static void main(String[] args) throws Exception {
		/*
		 *
		 *
		 * //parsing a CSV file into Scanner class constructor Scanner sc = new
		 * Scanner(new File("data.txt")); sc.useDelimiter(";"); // sets the delimiter
		 * pattern while (sc.hasNext()) // returns a boolean value {
		 * System.out.print(sc.next()); // find and returns the next complete token from
		 * this scanner } sc.close(); // closes the scanner
		 * 
		 * 
		 * 
		 */
		String line = "";
		String splitBy = ";";
		
		int count = 0;

		try {
			// parsing a CSV file into BufferedReader class constructor
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				String[] address = line.split(splitBy);

				address[2] = address[2].substring(0, 2) + "." + address[2].substring(3, 9);
				address[3] = address[3].substring(0, 2) + "." + address[3].substring(3, 9);

				UsableData obj = new UsableData(address[0], address[1], Double.parseDouble(address[2]),
						Double.parseDouble(address[3]));

				
				
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}