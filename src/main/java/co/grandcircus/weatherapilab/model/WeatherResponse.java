package co.grandcircus.weatherapilab.model;

public class WeatherResponse {
	private location location;
	private currentobservation currentobservation;
	private time time;
	private data data;
	
	public location getLocation() {
		return location;
	}
	public void setLocation(location location) {
		this.location = location;
	}
	public currentobservation getCurrentobservation() {
		return currentobservation;
	}
	public void setCurrentobservation(currentobservation currentobservation) {
		this.currentobservation = currentobservation;
	}
	public time getTime() {
		return time;
	}
	public void setTime(time time) {
		this.time = time;
	}
	public data getData() {
		return data;
	}
	public void setData(data data) {
		this.data = data;
	}
	
	
}
