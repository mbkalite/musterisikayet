package com.mbkalite.onlinemusterisikayet.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="musteri_tbl")
public class Musteri {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "musteri_adi")
	private String musteriAdi;
	
	@Column(name = "musteri_qad_kod")
	private String musteriQadKod;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "musteri")
	private Set<MusteriSikayet> musteriSikayet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMusteriAdi() {
		return musteriAdi;
	}

	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}

	public String getMusteriQadKod() {
		return musteriQadKod;
	}

	public void setMusteriQadKod(String musteriQadKod) {
		this.musteriQadKod = musteriQadKod;
	}

	
	public Set<MusteriSikayet> getMusteriSikayet() {
		return musteriSikayet;
	}

	public void setMusteriSikayet(Set<MusteriSikayet> musteriSikayet) {
		this.musteriSikayet = musteriSikayet;
	}

	@Override
	public String toString() {
		return "Musteri [id=" + id + ", musteriAdi=" + musteriAdi + ", musteriQadKod=" + musteriQadKod
				+ ", musteriSikayet=" + musteriSikayet + "]";
	}

	
	
	
	
	
	
}
