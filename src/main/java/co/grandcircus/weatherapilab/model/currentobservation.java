package co.grandcircus.weatherapilab.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class currentobservation {
	  @JsonProperty("Date")
	    private String date;
	  @JsonProperty("Weather")
	    private String weather;
	 @JsonProperty("Temp")
	    private int temp;
	
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	
}
