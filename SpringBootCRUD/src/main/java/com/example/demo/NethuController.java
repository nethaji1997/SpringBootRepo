package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NethuController 
{
	
	@Autowired
	NethajiRepo nethajiRepo;

	@PostMapping("/nethaji")
	public Nethaji addAlien(@RequestBody Nethaji nethaji) {
		nethajiRepo.save(nethaji);
		return nethaji;
	}

	@GetMapping("/nethajis")
	public List<Nethaji> getAllNethajis() {
		return (List<Nethaji>) nethajiRepo.findAll();
	}

	@GetMapping("/nethaji/{aid}")
	public Optional<Nethaji> getNethaji(@PathVariable("aid") int aid) {
		return nethajiRepo.findById(aid);
	}
	
	@DeleteMapping("/nethaji/{aid}")
	public String deleteNethaji(@PathVariable int aid)
	{
		Nethaji a = nethajiRepo.getOne(aid);
		 nethajiRepo.delete(a);
		 return "deleted";
	}
	
	@PutMapping("/updatenethaji")
	public Nethaji saveOrUpdateNethaji(@RequestBody Nethaji nethaji)
	{
		nethajiRepo.save(nethaji);
		return nethaji;
	}
}
