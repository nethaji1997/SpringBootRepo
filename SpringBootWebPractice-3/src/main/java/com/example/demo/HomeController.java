package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@Autowired
	AlienRepo repo;

//	@RequestMapping("/aliens")
//	@ResponseBody
//	public String getAliens() {
//		return repo.findAll().toString();
//	}
	@RequestMapping(path="/getAliens", produces= {"application/xml"})
	@ResponseBody
	public List<Alien> getAliens()
	{
		return repo.findAll();
	}
}
//	@RequestMapping("/addAlien")
//	public String home(Alien alien)
//	{
//		repo.save(alien);
//		return "showAlien.jsp";
//	}

//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam int aid)
//	{
//		ModelAndView mv=new ModelAndView("showAlien.jsp");
//		Alien alien = repo.findById(aid).orElse(new Alien());
//		return mv;
//	}
