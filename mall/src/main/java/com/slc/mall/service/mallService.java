package com.slc.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slc.mall.entity.mall;
import com.slc.mall.repository.mallRepository;

@Service
public class mallService {
	@Autowired
	mallRepository repo;

	public List<mall> getAllData() {
		
		List<mall> getAlldata=repo.findAll();
		
		return getAlldata;
	}

	public String PostData(mall mall) {
		System.out.println(mall);
		
		 repo.save(mall);
		return "Data ADDed Sucessfully";
	}

}
