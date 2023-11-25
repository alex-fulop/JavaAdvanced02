package org.example.exercitiu1;

public class Main {

	/*
	 *
	 *  ex1. Weather Conditions and Forecast Create an enum named WeatherCondition that represents
	 *  various weather conditions: CLEAR, CLOUDY, RAIN, SNOW, THUNDERSTORM. Each condition should have
	 *  an associated description and an array of possible activities that match the weather.
	 *  Implement a class WeatherForecast that provides suggestions for activities based on the weather.
	 *  Write a program that predicts the weather and recommends activities.
	 *
	 * */

	public static void main(String[] args) {
		WeatherCondition condition = WeatherCondition.RAIN;
		String channel = "ProTV";

		if (channel.equals("ProTV")) {
			WeatherForcast.getWeather(condition);
		}
	}
}
