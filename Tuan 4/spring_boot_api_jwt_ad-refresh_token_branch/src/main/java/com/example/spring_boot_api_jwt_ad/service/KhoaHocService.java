package com.example.spring_boot_api_jwt_ad.service;

import java.util.List;

import com.example.spring_boot_api_jwt_ad.entity.KhoaHoc;

public interface KhoaHocService {
	public List<KhoaHoc> findAll();
	
	public KhoaHoc findmaKhoaHocBy(Integer maKhoaHoc);

	public KhoaHoc saveKhoaHoc(KhoaHoc auth);

	public void deleteByid(Integer maKhoaHoc);


}
