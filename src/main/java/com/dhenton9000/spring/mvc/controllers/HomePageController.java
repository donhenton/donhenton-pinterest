package com.dhenton9000.spring.mvc.controllers;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.LoggerFactory;


/**
 * The controller for the homepage
 * @author Don
 *
 */
@Controller
public class HomePageController {
	
	
	
	private static Logger log = LoggerFactory.getLogger(HomePageController.class);
	
	
	@RequestMapping("/home")
	public ModelAndView homePage() {
		String message = "Hello World, Spring 3.0!";
		return new ModelAndView("tiles.homepage", "message", message);
	}
	
	@RequestMapping("/credits")
	public ModelAndView creditsPage() {
		
		return new ModelAndView("tiles.creditspage");
	}	
	
}
