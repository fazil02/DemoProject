package com.telusko.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.demo.model.Alien;
import com.telusko.demo.repo.AlienRepo;
@RestController
public class AilenController {
	@Autowired
	AlienRepo repo;
	
	@GetMapping("/aliens")
	public List<Alien> getAliens()
	{
		List<Alien> list =repo.findAll();
		return list;
	}
	
	@GetMapping("alien/{aid}")
	public Alien getAlien(@PathVariable("aid") int aid)
	{
		Alien a = repo.findById(aid).orElse(new Alien(0,"no such id is found"));
		return a;
	}
	
	@PostMapping("/alien")
	public Alien createAlien(Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	

}
