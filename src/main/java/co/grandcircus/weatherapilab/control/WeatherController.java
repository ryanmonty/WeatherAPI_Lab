package co.grandcircus.weatherapilab.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.weatherapilab.Service.WeatherApiService;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherApiService weatherService;
	
	@RequestMapping("/")
	public String weather(Model model) {
		model.addAttribute("weather", weatherService.getWeather());
		return "index";
	}

}
