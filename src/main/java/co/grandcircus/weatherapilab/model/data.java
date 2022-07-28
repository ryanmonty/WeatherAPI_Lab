package co.grandcircus.weatherapilab.model;

import java.util.ArrayList;
import java.util.List;


public class data {
	 private List<Integer> temperature = new ArrayList<>();
	    private List<String> weather = new ArrayList<>();
	    private List<String> text = new ArrayList<>();

	    public List<Integer> getTemperature() {
	        return temperature;
	    }

	    public void setTemperature(List<Integer> temperature) {
	        this.temperature = temperature;
	    }

	    public List<String> getWeather() {
	        return weather;
	    }

	    public void setWeather(List<String> weather) {
	        this.weather = weather;
	    }


	    public List<String> getText() {
	        return text;
	    }

	    public void setText(List<String> text) {
	        this.text = text;
	    }
	    
	    @Override
	    public String toString() {
	        return "WeatherData [emperature=" + temperature
	                + ", text=" + text + ", weather="
	                + weather + "]";
	    }

}
