/*package com.mtdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

		@RequestMapping(value = "/hello", method = RequestMethod.GET)
		public String hello(ModelMap model) {
			model.addAttribute("msg", "Material Database Spring Rest Development");
			return "lindex";
		}
		
		@RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
		public String displayMessage(@PathVariable String msg, ModelMap model) {
			model.addAttribute("msg", msg);
			return "lindex";
		}
		
	}*/