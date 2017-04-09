package store.antnest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	
	@RequestMapping("index")
	public ModelAndView index(HttpServletRequest req,HttpServletResponse res){
		System.out.println("===========");
		return new ModelAndView("index");
	}

}
