package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@RequestMapping("book")
	public ModelAndView details(Book book)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("details",book);
		mv.setViewName("first.jsp");
		System.out.println(" Book Details");
		return mv;
	}
	
	@RequestMapping("mark")
	public ModelAndView studentDetails(Mark mark)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("details",mark);
		mv.setViewName("mark.jsp");
		System.out.println(" Mark details ");
		return mv;
	}

}
