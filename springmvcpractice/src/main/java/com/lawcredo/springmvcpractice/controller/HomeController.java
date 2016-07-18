package com.lawcredo.springmvcpractice.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloWorld")
public class HomeController {

		@RequestMapping(value = "/hello", method = RequestMethod.GET)
		public String hello(ModelMap model) {
			System.out.println("atul");
			model.addAttribute("msg", "JCG Hello World!");
			return "helloWorld";
		}
		
		@RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
		public String displayMessage(@PathVariable String msg, ModelMap model) {
			model.addAttribute("msg", msg);
			return "helloWorld";
		}
		
	}