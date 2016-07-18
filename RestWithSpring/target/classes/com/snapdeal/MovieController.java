package com.snapdeal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/movie")
public class MovieController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
		System.out.println("i am movie controller");

		model.addAttribute("movie", name);
		return "list";

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {
		System.out.println("I am controller default");

		model.addAttribute("movie", "this is default movie");
		return "list";

	}

}