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
@Table(name="kullanicilar_tbl")
public class Kullanici {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "kullanici_adi")
	private String kullaniciAdi;
	
	@Column(name = "kullanici_sifre")
	private String kullaniciSifre;
	
	@Column(name = "kullanici_yetki")
	private int kullaniciYetki;
	
	@Column(name = "kullanici_eposta")
	private String kullaniciEposta;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sikayetAcan")
	private Set<MusteriSikayet> musteriSikayet;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "birimSorumlusu")
	private Set<MusteriSikayet> musteriSikayet1;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "satisMuduru")
	private Set<MusteriSikayet> musteriSikayet2;
	
	private int birim;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getKullaniciSifre() {
		return kullaniciSifre;
	}

	public void setKullaniciSifre(String kullaniciSifre) {
		this.kullaniciSifre = kullaniciSifre;
	}

	public int getKullaniciYetki() {
		return kullaniciYetki;
	}

	public void setKullaniciYetki(int kullaniciYetki) {
		this.kullaniciYetki = kullaniciYetki;
	}

	public String getKullaniciEposta() {
		return kullaniciEposta;
	}

	public void setKullaniciEposta(String kullaniciEposta) {
		this.kullaniciEposta = kullaniciEposta;
	}

	public int getBirim() {
		return birim;
	}

	public void setBirim(int birim) {
		this.birim = birim;
	}
	
	

	public Set<MusteriSikayet> getMusteriSikayet() {
		return musteriSikayet;
	}

	public void setMusteriSikayet(Set<MusteriSikayet> musteriSikayet) {
		this.musteriSikayet = musteriSikayet;
	}

	public Set<MusteriSikayet> getMusteriSikayet1() {
		return musteriSikayet1;
	}

	public void setMusteriSikayet1(Set<MusteriSikayet> musteriSikayet1) {
		this.musteriSikayet1 = musteriSikayet1;
	}

	public Set<MusteriSikayet> getMusteriSikayet2() {
		return musteriSikayet2;
	}

	public void setMusteriSikayet2(Set<MusteriSikayet> musteriSikayet2) {
		this.musteriSikayet2 = musteriSikayet2;
	}

	@Override
	public String toString() {
		return "Kullanici [id=" + id + ", kullaniciAdi=" + kullaniciAdi + ", kullaniciSifre=" + kullaniciSifre
				+ ", kullaniciYetki=" + kullaniciYetki + ", kullaniciEposta=" + kullaniciEposta + ", musteriSikayet="
				+ musteriSikayet + ", musteriSikayet1=" + musteriSikayet1 + ", musteriSikayet2=" + musteriSikayet2
				+ ", birim=" + birim + "]";
	}
	
	
	
	
}
