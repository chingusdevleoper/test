package com.test.project.controller;
 
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.project.DAO.ProjectsDAO;
 
@Controller
public class TestProjectController {
	
	private static final Logger logger = Logger.getLogger(TestProjectController.class);

	String message = "Welcome to Spring MVC!";
	String message2 = "Welcome to Spring MVC 2!";
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "j_username", required=false ) String user_Name, 	@RequestParam(value = "j_password", required=false) String password) {
		
		
		System.out.println("in controller");
		System.out.println("Logged in User:: " + user_Name + " " + "Password:: " + password);
		
		ModelAndView mv;
		if(logger.isDebugEnabled()){
			logger.debug("showMessage is executed!");
		}
		
		logger.info("in showMessage");
		logger.info("Logged in User:: " + user_Name + " " + "Password:: " + password);
		
	    ProjectsDAO obj = (ProjectsDAO) context.getBean("projectDAO");
		List<String> existingProjectsList= obj.loadExistingProjects();
		
	    mv = new ModelAndView("helloworld");
		mv.addObject("existingProjectsList", existingProjectsList);
		mv.addObject("name", user_Name);
		
		
		return mv;
	}
	
	@RequestMapping("/New" )
	public ModelAndView NewProject(
			@RequestParam(value = "j_username", required=false ) String user_Name) {
			
		System.out.println("in NewProject");
		ModelAndView mv;
		if(logger.isDebugEnabled()){
			logger.debug("showMessage is executed!");
		}
		logger.info("in NewProject");
	    ProjectsDAO obj = (ProjectsDAO) context.getBean("projectDAO");
	    mv = new ModelAndView("addNewProject");
		mv.addObject("name", user_Name);

		return mv;
	}
	
	/*@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	   public ModelAndView addStudent() {
		System.out.println("in controller 2");
		 
		ModelAndView mv = new ModelAndView("testPage");
		mv.addObject("message", message2);
		mv.addObject("name", "omkar");
	
	      return mv;
	   }*/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultPage(ModelMap map) {
        return "redirect:/list";
    }
  /*  @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listEmployees(ModelMap map) {
 
        map.addAttribute("employee", new EmployeeEntity());
        map.addAttribute("employeeList", employeeManager.getAllEmployees());
 
        return "editEmployeeList";
    }*/
 
   /* @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployee(
            @ModelAttribute(value = "employee") EmployeeEntity employee,
            BindingResult result) {
        employeeManager.addEmployee(employee);
        return "redirect:/list";
    }*/
 
    /*@RequestMapping("/delete/{employeeId}")
    public String deleteEmplyee(@PathVariable("employeeId") Integer employeeId) {
        employeeManager.deleteEmployee(employeeId);
        return "redirect:/list";
    }*/
 
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "login";
    }
 
    @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {
        model.addAttribute("error", "true");
        return "denied";
    }
 
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {
        return "logout";
    }
}
 
