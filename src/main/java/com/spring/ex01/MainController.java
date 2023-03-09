package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("mainController")
@RequestMapping("/abcderf")
public class MainController {
	
	@RequestMapping(value="/asdqwd.do", method = RequestMethod.GET)
	public ModelAndView main1(HttpServletRequest request, HttpServletResponse response)  throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.addObject("kim","hello23 ");
		mav.setViewName("kimasd");
		return mav;
	}
	
	@RequestMapping(value="/bbbb.do", method = RequestMethod.GET)
	public ModelAndView main2(HttpServletRequest request, HttpServletResponse response)  throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.addObject("mk","2page ");
		mav.setViewName("bbb22");
		return mav;
	}
	
}
