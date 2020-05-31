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
@Table(name="sikayet_tur_tbl")
public class SikayetTur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "sikayet_turu")
	private String sikayetTuru;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sikayetTur")
	private Set<MusteriSikayet> musteriSikayet;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSikayetTuru() {
		return sikayetTuru;
	}

	public void setSikayetTuru(String sikayetTuru) {
		this.sikayetTuru = sikayetTuru;
	}
	
	

	public Set<MusteriSikayet> getMusteriSikayet() {
		return musteriSikayet;
	}

	public void setMusteriSikayet(Set<MusteriSikayet> musteriSikayet) {
		this.musteriSikayet = musteriSikayet;
	}

	@Override
	public String toString() {
		return "SikayetTur [id=" + id + ", sikayetTuru=" + sikayetTuru + ", musteriSikayet=" + musteriSikayet + "]";
	}


	
	
	
}
