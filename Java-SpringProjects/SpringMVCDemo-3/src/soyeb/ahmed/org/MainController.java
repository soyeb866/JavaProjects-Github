package soyeb.ahmed.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController{
	
	@RequestMapping(value="/")
	public String welcome() {
		return "home";
	}

	//@RequestMapping("displayInfo")
	/*
	 * public String dsiplayInfo(HttpServletRequest request) { String name =
	 * request.getParameter("name"); String age = request.getParameter("age");
	 * String email = request.getParameter("email");
	 * 
	 * request.setAttribute("name", name); request.setAttribute("age", age);
	 * request.setAttribute("email", email);
	 * 
	 * return "displayInfo"; }
	 */
	
	
	
	/*
	 * @RequestMapping("/displayInfo") public String
	 * dsiplayInfo(@RequestParam("name") String name,
	 * 
	 * @RequestParam("age") String age,
	 * 
	 * @RequestParam("email") String email, Model model) {
	 * model.addAttribute("name", name); model.addAttribute("age", age);
	 * model.addAttribute("email", email);
	 * 
	 * return "displayInfo"; }
	 */
	
	//@RequestMapping("displayInfo")
	//@GetMapping("displayInfo")
	@PostMapping("displayInfo")
	public ModelAndView dsiplayInfo(@RequestParam("name") String name, 
			@RequestParam("age") String age, 
			@RequestParam("email") String email) {
		
		ModelAndView modelAndView = new ModelAndView("displayInfo");		
		Date date = new Date();
		List<String> team = new ArrayList<>();
		team.add("Soyeb");
		team.add("Zahir");
		team.add("Nasir");
		
		modelAndView.addObject("name", name);
		modelAndView.addObject("age", age);
		modelAndView.addObject("email", email);
		
		modelAndView.addObject("date",date);
		modelAndView.addObject("team",team);
		
		return modelAndView;
	}
	
	
}
