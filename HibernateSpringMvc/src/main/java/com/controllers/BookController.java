package com.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BookController {
	/*@RequestMapping("/login")
public String gotoLog(){return "Login";}
	
	@RequestMapping("/")
   public ModelAndView bookform()
   {
		return new ModelAndView("bookform","command", new Book());
   }
	@RequestMapping("/savebook")
	 public ModelAndView display(@ModelAttribute("book") Book book)
	   {
			return new ModelAndView("displaybooks");
	   }
		

	@RequestMapping("/testhello")
	public ModelAndView sayhello(@RequestParam("username") String username)
	{
		return new ModelAndView("hello","message","Hello this is a new message "+username);
	}
	*/
	@RequestMapping("/prompt")
	public String gett(){return "prompt";}
	@RequestMapping(name="/test",method=RequestMethod.POST)
	public String testing(){return "test";}
		
	
}
