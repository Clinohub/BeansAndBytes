public class SwitchExercises {
	public static boolean isWeekDay(int dayNumber) {
		boolean isWeekDay = false;
		switch (dayNumber) {
			case 0:
			case 6:
				isWeekDay = false;
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				isWeekDay = true;
				break;
			default:
				isWeekDay = false;
				break;
		}
		return isWeekDay;
	}

	public static String determineNameOfMonth(int monthNumber) {
		String nameOfMonth = "";
		switch (monthNumber) {
			case 1:
				nameOfMonth = "January";
				break;
			case 2:
				nameOfMonth = "February";
				break;
			case 3:
				nameOfMonth = "March";
				break;
			case 4:
				nameOfMonth = "April";
				break;
			case 5:
				nameOfMonth = "May";
				break;
			case 6:
				nameOfMonth = "June";
				break;
			case 7:
				nameOfMonth = "July";
				break;
			case 8:
				nameOfMonth = "August";
				break;
			case 9:
				nameOfMonth = "September";
				break;
			case 10:
				nameOfMonth = "October";
				break;
			case 11:
				nameOfMonth = "November";
				break;
			case 12:
				nameOfMonth = "December";
				break;
			default:
				nameOfMonth = "Invalid";
				break;
		}
		return nameOfMonth;
	}

	public static String determineNameOfDay(int dayNumber) {
		String nameOfDay = "";
		switch (dayNumber) {
			case 0:
				nameOfDay = "Sunday";
				break;
			case 1:
				nameOfDay = "Monday";
				break;
			case 2:
				nameOfDay = "Tuesday";
				break;
			case 3:
				nameOfDay = "Wednesday";
				break;
			case 4:
				nameOfDay = "Thursday";
				break;
			case 5:
				nameOfDay = "Friday";
				break;
			case 6:
				nameOfDay = "Saturday";
				break;
			default:
				nameOfDay = "Invalid";
				break;
		}
		return nameOfDay;
	}

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(1));
		System.out.println(determineNameOfMonth(1));
		System.out.println(isWeekDay(1));
	}
}
