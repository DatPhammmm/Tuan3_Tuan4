package com.example.spring_boot_api_jwt_ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_api_jwt_ad.entity.KhoaHoc;
import com.example.spring_boot_api_jwt_ad.repository.KhoaHocRepository;



@Service
public class KhoaHocImpl implements KhoaHocService {
	@Autowired
	private KhoaHocRepository dao;
	@Override
	public List<KhoaHoc> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public KhoaHoc findmaKhoaHocBy(Integer maKhoaHoc) {
		// TODO Auto-generated method stub
		
		return dao.findById(maKhoaHoc).get();
	}
	@Override
	public KhoaHoc saveKhoaHoc(KhoaHoc khoaHoc) {
		// TODO Auto-generated method stub
		return dao.saveAndFlush(khoaHoc);
	}
	@Override
	public void deleteByid(Integer maKhoaHoc) {
		// TODO Auto-generated method stub
		dao.deleteById(maKhoaHoc);
	}


}
