package com.example.spring_boot_api_jwt_ad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "khoaHoc")

public class KhoaHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maKhoaHoc")
	
	private int maKhoaHoc;
	@Column(name = "nameKhoaHoc")
	private String nameKhoaHoc;

	@Column(name = "noiDung")
	private String noiDung;

	@Column(name = "Gia")
	private double Gia;
	
	@Column(name = "tacGia")
	private String tacGia;

	
	public KhoaHoc(int maKhoaHoc, String nameKhoaHoc, String noiDung, double gia, String tacGia) {
		super();
		this.maKhoaHoc = maKhoaHoc;
		this.nameKhoaHoc = nameKhoaHoc;
		this.noiDung = noiDung;
		Gia = gia;
		this.tacGia = tacGia;
	}
	public int getMaKhoaHoc() {
		return maKhoaHoc;
	}
	public void setMaKhoaHoc(int maKhoaHoc) {
		this.maKhoaHoc = maKhoaHoc;
	}

	
	
	
	public KhoaHoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNameKhoaHoc() {
		return nameKhoaHoc;
	}
	public void setNameKhoaHoc(String nameKhoaHoc) {
		this.nameKhoaHoc = nameKhoaHoc;
	}
	public double getGia() {
		return Gia;
	}
	public void setGia(double gia) {
		Gia = gia;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	
}
