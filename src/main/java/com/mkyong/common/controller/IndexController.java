package com.mkyong.common.controller;

import com.mkyong.common.entity.User;
import com.mkyong.common.repository.FightRepository;
import com.mkyong.common.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class IndexController {
	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = {"/", "/index"})
	protected ModelAndView indexPage(@ModelAttribute User user) throws Exception {

		ModelAndView model = new ModelAndView("index");
		model.addObject("user", user);

		return model;
	}
}