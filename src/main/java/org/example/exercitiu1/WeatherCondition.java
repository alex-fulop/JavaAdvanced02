package org.example.exercitiu1;

public enum WeatherCondition {
	CLEAR("The sky is clear!", new String[]{"Jogging", "Shopping"}),
	CLOUDY("There are some clouds..", new String[]{"Go Driving", "Walk your dog"}),
	RAIN("It is currently raining", new String[]{"Stay inside", "Sleep"}),
	SNOW("It is snowing today", new String[]{"Build a snowman", "Clean the sidewalk"}),
	THUNDERSTORM("There is heavy rain and thunder", new String[]{"Watch TV", "Clean the house"});

	private final String description;
	private final String[] activities;

	WeatherCondition(String description, String[] activities) {
		this.description = description;
		this.activities = activities;
	}

	public String getDescription() {
		return description;
	}

	public String[] getActivities() {
		return activities;
	}
}
