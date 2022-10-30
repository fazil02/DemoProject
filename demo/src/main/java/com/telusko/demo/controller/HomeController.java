package com.telusko.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.model.Alien;
import com.telusko.demo.repo.AlienRepo;

@Controller
public class HomeController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m)
	{
		//ModelAndView mv = new ModelAndView();
		//mv.setViewName("result");
		// mv.addObject("num3",num3);
		 int num3 = i+j;
		 m.addAttribute("num3", num3);
		
		 return "result";
	}
	@GetMapping("/getAliens")
	public String getAliens(Model m)
	{
		m.addAttribute("results",repo.findAll());
		return "showAliens";
	}
	
	@GetMapping("/getAlien")
	public String getAlien(@RequestParam int aid, Model m)
	{
		
		m.addAttribute("results",repo.getOne(aid));
		return "showAliens";
	}
	@PostMapping("/addAlien")
	public String addAlien(@ModelAttribute ("a1")Alien a)
	{
		repo.save(a);
		return "result";
	}
	
	

}
