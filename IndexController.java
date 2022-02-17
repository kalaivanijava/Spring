package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController
{
	@RequestMapping("Home")
	//public String index(@RequestParam("name") string str,HttpSession session)
	public String index(String name,HttpSession session)
	{
		//ModelAndView mv=new ModelAndView();//
		//mv.addObject("details",user);//
		//mv.setViewName("index.jsp");//
		//return mv;//
		//session.Attributr("name",str);
		//return "index.jsp";
		System.out.println(" Home page ");
		session.setAttribute("name", name);
		return "index.jsp";
	}
	@RequestMapping("truth")
	public String truth()
	{
		System.out.println(" Second page");
		return "truth.jsp";
	}
	@RequestMapping("third")
	public String third()
	{
		System.out.println("Third page");
		return "third.jsp";
	}

}
