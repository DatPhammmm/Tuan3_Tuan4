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

import redis.clients.jedis.Connection;
import redis.clients.jedis.Jedis;




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
	
	@PostMapping("/create")
	public KhoaHoc create(@RequestBody KhoaHoc auth) {
		
		Jedis jedis = new Jedis("redis://default:YFglioJCKlf4EelIRqP3qMRcfuWsKNxi@redis-16916.c279.us-central1-1.gce.cloud.redislabs.com:16916");
	    Connection connection = jedis.getConnection();
		String formattedMessage ="Ten Khoa Hoc:"+auth.getNameKhoaHoc() +" gia:"+ auth.getGia()+" ma Khoa Hoc:"+auth.getMaKhoaHoc()+" noi Dung:"+auth.getNoiDung()+" tac Gia:"+auth.getTacGia() + "\n";  
	    jedis.append("datPham", formattedMessage);
		return service.saveKhoaHoc(auth);	
	}
}

