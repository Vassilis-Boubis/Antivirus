
/**
 * 
 */

/**
 * @author dimitrispapakyriakopoulos
 *
 */
import java.util.Scanner;

public class Date {

	private int day;
	private int month;
	private int year;

	Scanner input = new Scanner(System.in);

	public Date(int day, int month, int year) {

		this.year = year;
		this.month = checkMonth(month);
		this.day = checkDay(day);

	}

	public Date(int day, String month, int year) {

		this.year = year;
		this.month = findMonthNumber(month);
		this.month = checkMonth(this.month);
		this.day = checkDay(day);
	}

	public int checkMonth(int month) {

		if (month < 0 || month > 12) {
			do {
				System.out.println("Invalid month! Please select a month between 1-12.");
				month = input.nextInt();
			} while (month < 0 || month > 12);
		}
		return month;
	}

	public int checkDay(int day) {

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (this.year % 4 == 0 && (this.year % 100 != 0 || (this.year % 100 == 0 && this.year % 400 == 0)))
			days[2] = 29;

		if (day < 1 || day > days[this.month]) {

			do {
				System.out.println("Invalid day! Please select a day between 1-" + days[this.month] + ".");
				day = input.nextInt();
			} while (day < 1 || day > days[this.month]);
		}
		return day;

	}

	public int findMonthNumber(String m) {
		int x = 0;
		switch (m) {

		case "Jan":
			x = 1;
		case "Feb":
			x = 2;
		case "Mar":
			x = 3;
		case "Apr":
			x = 4;
		case "May":
			x = 5;
		case "Jun":
			x = 6;
		case "Jul":
			x = 7;
		case "Aug":
			x = 8;
		case "Sept":
			x = 9;
		case "Oct":
			x = 10;
		case "Nov":
			x = 11;
		case "Dec":
			x = 12;

		}
		return x;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = checkDay(day);

	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = checkMonth(month);
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}

}

