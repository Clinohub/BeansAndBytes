public class WeatherAdviser {

	public String provideWeatherAdvisory(int temperature) {
		if (temperature < 0)
			return "It's freezing! Wear a heavy coat.";
		else if (temperature <= 10)
			return "It's cold! Bundle up.";
		else if (temperature <= 20)
			return "It's cool! A light jacket will do.";
		else if (temperature < 30)
			return "It's warm! Enjoy the day";
		
		return "It's hot, don't get cooked or melt outside";
	}

	public static void main(String[] args) {
		WeatherAdviser adviser = new WeatherAdviser();

		System.out.println(adviser.provideWeatherAdvisory(-5));
		System.out.println(adviser.provideWeatherAdvisory(5));
		System.out.println(adviser.provideWeatherAdvisory(15));
		System.out.println(adviser.provideWeatherAdvisory(25));
		System.out.println(adviser.provideWeatherAdvisory(39));
	}

} 
