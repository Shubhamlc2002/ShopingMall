package com.slc.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slc.mall.entity.mall;
import com.slc.mall.service.mallService;
@CrossOrigin("*")
@RestController
@RequestMapping("/mall")
public class mallController {
	@Autowired
	mallService Service;
	
	
	@GetMapping
	public List<mall> getAlldata(){
		return Service.getAllData(); 
		
		
	}
	@PostMapping
	public String  postData(@RequestBody mall mall) {
		return Service.PostData(mall);
		
	}

}
