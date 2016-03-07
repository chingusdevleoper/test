package com.test.project.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class TestProjectController {
	String message = "Welcome to Spring MVC!";
	String message2 = "Welcome to Spring MVC 2!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	   public ModelAndView addStudent() {
		System.out.println("in controller 2");
		 
		ModelAndView mv = new ModelAndView("testPage");
		mv.addObject("message", message2);
		mv.addObject("name", "omkar");
	
	      return mv;
	   }
}
 
