package co.grandcircus.weatherapilab.model;

public class currentobservation {
	private String Date;
	private String Weather;
	private int Temp;
	
	public String getWeather() {
		return Weather;
	}
	public void setWeather(String weather) {
		Weather = weather;
	}
	
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public int getTemp() {
		return Temp;
	}
	public void setTemp(int temp) {
		Temp = temp;
	}
	
	
}
