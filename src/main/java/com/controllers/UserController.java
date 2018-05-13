package com.controllers;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Users;
import com.services.UserServices;

@Controller
@RequestMapping
public class UserController 
{
	private UserServices userServices;
	
	@RequestMapping(value="/register")
	public ModelAndView getRegisterPage()
	{
		ModelAndView view = new ModelAndView("register.jsp");
		return view;
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public ModelAndView getPage()
	{
		ModelAndView view = new ModelAndView("hello.jsp");
		return view;
	}
	
	@RequestMapping(value="/registered",method=RequestMethod.POST)
	public String createUsers(@ModelAttribute("user") Users user)
	{
		if(user.getId() == 0)
		{
			this.userServices.createUser(user);
		}
		
		return "";
	}
	
	@RequestMapping(value = "/users/save", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getSaved(Users users) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (userServices.saveOrupdate(users)) {
            map.put("status", "200");
            map.put("message", "Your record have been saved successfully");
        }
 
        return map;
    }
 
    @RequestMapping(value = "/users/list", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getAll(Users users) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        List<Users> list = userServices.userList();
 
        if (list != null) {
            map.put("status", "200");
            map.put("message", "Data found");
            map.put("data", list);
        } else {
            map.put("status", "404");
            map.put("message", "Data not found");
 
        }
 
        return map;
    }
 
    @RequestMapping(value = "/users/delete", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> delete(Users users) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (userServices.DeleteUsers(users)) {
            map.put("status", "200");
            map.put("message", "Your record have been deleted successfully");
        }
 
        return map;
    }
}
