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
@Table(name="urun_tbl")
public class Urun {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "stok_kod")
	private String stokKod;
	
	@Column(name = "urun_tur")
	private String urunTur;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "urun")
	private Set<MusteriSikayet> musteriSikayet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStokKod() {
		return stokKod;
	}

	public void setStokKod(String stokKod) {
		this.stokKod = stokKod;
	}

	public String getUrunTur() {
		return urunTur;
	}

	public void setUrunTur(String urunTur) {
		this.urunTur = urunTur;
	}
	
	

	public Set<MusteriSikayet> getMusteriSikayet() {
		return musteriSikayet;
	}

	public void setMusteriSikayet(Set<MusteriSikayet> musteriSikayet) {
		this.musteriSikayet = musteriSikayet;
	}

	@Override
	public String toString() {
		return "Urun [id=" + id + ", stokKod=" + stokKod + ", urunTur=" + urunTur + ", musteriSikayet=" + musteriSikayet
				+ "]";
	}

	
	
	
	
}
