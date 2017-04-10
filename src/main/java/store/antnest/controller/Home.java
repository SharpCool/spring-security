package store.antnest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	private static Logger logger=LoggerFactory.getLogger(User.class);
	@RequestMapping("index")
	public ModelAndView index(HttpServletRequest req,HttpServletResponse res){
		logger.info("===========");
		return new ModelAndView("index");
	}

}
