package co.grandcircus.weatherapilab.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.weatherapilab.Service.WeatherApiService;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherApiService weatherService;
	
	@RequestMapping("/")
	public String weather(Model model) {
		return "index";
	}
	
	@PostMapping("/results")
    public String showSearch(@RequestParam double longitude, @RequestParam double latitude,
            Model model) {
        model.addAttribute("weather", weatherService.getWeather(latitude, longitude));
        System.out.println(model.toString());
        return "results";
    }

}
