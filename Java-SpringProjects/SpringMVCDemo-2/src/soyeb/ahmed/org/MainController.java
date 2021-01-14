package soyeb.ahmed.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController{
	
	//@RequestMapping(value="/", method=RequestMethod.GET)
	@RequestMapping(value="/")
	public String welcome() {
		return "home";
	}

}
