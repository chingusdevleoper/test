package com.test.project.controller;
 
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class TestProjectController {
	
	private static final Logger logger = Logger.getLogger(TestProjectController.class);

	String message = "Welcome to Spring MVC!";
	String message2 = "Welcome to Spring MVC 2!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "username", required=false ) String user_Name, 	@RequestParam(value = "password", required=false) String password) {
		
		
		System.out.println("in controller");
		System.out.println("Logged in User:: " + user_Name + " " + "Password:: " + password);
		
		ModelAndView mv;
		if(logger.isDebugEnabled()){
			logger.debug("showMessage is executed!");
		}
		
		logger.info("in controller");
		logger.info("Logged in User:: " + user_Name + " " + "Password:: " + password);
		
		if(!user_Name.equalsIgnoreCase("admin") || !password.equalsIgnoreCase("admin")){
			  mv = new ModelAndView("logIn");
			  mv.addObject("msg", "Invalid Credentials!!");
				
		}
		else{
	    mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", user_Name);
		}
		
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
 
