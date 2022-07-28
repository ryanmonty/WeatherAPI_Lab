package co.grandcircus.weatherapilab.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.weatherapilab.model.WeatherResponse;

@Service
public class WeatherApiService {
	private RestTemplate request = new RestTemplate();

	public WeatherResponse getWeather(double latitude, double longitude) {
		String url = "https://forecast.weather.gov/MapClick.php?lat={lat}&lon={lon}&FcstType=json";
		WeatherResponse report = 
				request.getForObject(url, WeatherResponse.class, latitude, longitude);
		return report;
	}
}
