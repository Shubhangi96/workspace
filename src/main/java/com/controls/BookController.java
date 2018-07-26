package com.controls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.classes.Book;

@Controller
public class BookController {
	@RequestMapping("/login")
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
	
}
