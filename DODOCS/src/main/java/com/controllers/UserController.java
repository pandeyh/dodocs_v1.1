package com.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.beans.User;
import com.dao.UserProfileDAO;
import com.impl.UserProfileImpl;



@Controller
public class UserController  extends WebMvcConfigurerAdapter{

	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/registerSuccess").setViewName("registerSuccess");
    }

    @RequestMapping(value="/addUser", method=RequestMethod.GET)
    public String showForm(User user) {
        return "Registration";
    }

	
	 @RequestMapping(value="/saveUser", method=RequestMethod.POST)
	    public String checkPersonInfo(@Valid User person, BindingResult bindingResult) {
	        if (bindingResult.hasErrors()) {
	            return "Registration";
	        }
	        UserProfileDAO userDAO = new UserProfileImpl();
	        userDAO.createUserProfile(person);
	        return "registerSuccess";
	    }
	 
	 @RequestMapping(value="/profile",method = RequestMethod.GET)
	 public String getUser(@ModelAttribute String userName,Model model)
	 {
		 
		 
		 UserProfileDAO user =new UserProfileImpl();
		 user.getUserProfile(userName);
		 model.addAttribute("userName", userName);
		 return "Profile"+"?id="+userName;
		 
	 }
	 @RequestMapping(value="/searchProfile",method = RequestMethod.GET)
		public String searchUser(Model model)
		{
		 model.addAttribute("user",new User());
			return "Profile";	
		}
	 
	 @RequestMapping(value="/login",method=RequestMethod.POST)
	 public String login(User user, Model model)
	 {
		 UserProfileDAO userDao = new UserProfileImpl();
		// User usr = user;
		
		
		 	boolean isUserExists = userDao.validateUser(user);
		 	if(isUserExists)
		 	{
		 		model.addAttribute("user",user.getEmailId());
		 	}
		 	else
		 	{
		 		model.addAttribute("user", "User "+user.getEmailId()+" doesn't exists");
		 	}
		 	return "loginResult";
		 	
		 
	 }
	 @RequestMapping(value="/login",method=RequestMethod.GET)
	 public String login(Model model)
	 {
		 model.addAttribute(new User());
		 return "Login";
		 	
		 
	 }
	
}
