package org.example.exercitiu1;

public class WeatherForcast {
	public static void getWeather(WeatherCondition weatherCondition) {
		System.out.println("Current weather: " + weatherCondition.name());
		System.out.println(weatherCondition.getDescription());
		System.out.println("Recommended activities: ");
		for (String activity : weatherCondition.getActivities()) {
			System.out.println(activity);
		}
	}
}
