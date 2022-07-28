package co.grandcircus.weatherapilab.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.weatherapilab.model.WeatherReport;

@Service
public class WeatherApiService {
	private RestTemplate request = new RestTemplate();

	public WeatherReport getWeather() {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		WeatherReport report = 
				request.getForObject(url, WeatherReport.class);
		return report;
	}
}
