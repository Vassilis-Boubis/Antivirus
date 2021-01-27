package CSV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class DataProcessor {

	private static UsableData datatable[] = new UsableData[2353];

	public static void processData() throws Exception {

		String line = "";
		String splitBy = ";";
		String splitByDash = "/";

		UsableData obj;
		int count = 0;

		try {
			// parsing a CSV file into BufferedReader class constructor
			/*
			 * ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream is = classloader.getResourceAsStream("data.txt");
			 *
			 */
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = classloader.getResourceAsStream("data.txt");
			InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
			BufferedReader br = new BufferedReader(isr);
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				String[] address = line.split(splitBy);

				address[2] = address[2].substring(0, 2) + "." + address[2].substring(3, 9);
				address[3] = address[3].substring(0, 2) + "." + address[3].substring(3, 9);

				String[] date = line.split(splitByDash);

				date[0] = address[4].substring(0, 2);
				date[1] = address[4].substring(3, 5);
				date[2] = address[4].substring(6, 8);

				obj = new UsableData(address[0], address[1], Double.parseDouble(address[2]),
						Double.parseDouble(address[3]), Integer.parseInt(date[0]), Integer.parseInt(date[1]),
						Integer.parseInt(date[2]));
				datatable[count] = obj;
				count++;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public UsableData getData(int i) {
		return datatable[i];
	}
}