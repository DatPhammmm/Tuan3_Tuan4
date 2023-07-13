package com.example.spring_boot_api_jwt_ad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_api_jwt_ad.entity.KhoaHoc;
import com.example.spring_boot_api_jwt_ad.service.KhoaHocService;




@CrossOrigin("*")

@RequestMapping("/khoahoc")
@RestController
public class KhoaHocController {
	@Autowired
	KhoaHocService service;
	@GetMapping()
	public List<KhoaHoc> findAll() {
		return service.findAll();
	}
	
}
