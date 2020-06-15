package com.mbkalite.onlinemusterisikayet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="musteri_sikayet_tbl")
public class MusteriSikayet {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "acma_tarih")
	private Date acmaTarih;
	
	@Column(name = "lot_nmr")
	private String lotNumarasi;
	
	@Column(name = "satilan_miktar")
	private int satilanMiktar;
	
	@Column(name = "sikayet_edilen_miktar")
	private int sikayetEdilenMiktar;
	
	@Column(name="sikayet_aciklamasi")
	private String sikayetAciklamasi;
	
	@Column(name="musteri_talebi")
	private String musteriTalebi;

	@Column(name="ilgili_birim_yaniti")
	private String ilgiliBirimYaniti;
	
	@Column(name="ilgili_birim_yanit_tarihi")
	private Date ilgiliBirimYanitTarihi;
	
	@Column(name="df_gerekliligi")
	private boolean dfGerekliligi;
	
	@Column(name="satis_birim_yaniti")
	private String satisBirimYaniti;
	
	@Column(name="satis_birim_karar_tarihi")
	private Date satisBirimKararTarihi;
	
	@Column(name="ilgili_birim_karar")
	private boolean ilgiliBirimKarar;
	
	@Column(name="satis_birimi_karar")
	private boolean satisBirimiKarar;
	
	@Column(name="musteriye_verilen_yanit")
	private String musteriyeVerilenYanit;
	
	@Column(name="musteri_karar")
	private boolean musteriKarar;
	
	@Column(name="musteriye_verilen_yanit_tarihi")
	private Date musteriyeVerilenYanitTarihi;
	
	@Column(name = "miktar_birim")
	private String miktarBirim;
	
	@ManyToOne
	@JoinColumn(name="kullanicilar_tbl_id",nullable = false)
	private Kullanici sikayetAcan;
	
	@ManyToOne
	@JoinColumn(name="kullanicilar_tbl_id1",nullable = false)
	private Kullanici birimSorumlusu;
	
	@ManyToOne
	@JoinColumn(name="kullanicilar_tbl_id2",nullable = false)
	private Kullanici satisMuduru;
	
	@ManyToOne
	@JoinColumn(name="musteri_tbl_id",nullable = false)
	private Musteri musteri;
	
	@ManyToOne
	@JoinColumn(name="sikayet_tur_tbl_id",nullable = false)
	private SikayetTur sikayetTur;
	
	@ManyToOne
	@JoinColumn(name="urun_tbl_id",nullable = false)
	private Urun urun;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAcmaTarih() {
		return acmaTarih;
	}

	public void setAcmaTarih(Date acmaTarih) {
		this.acmaTarih = acmaTarih;
	}

	public String getLotNumarasi() {
		return lotNumarasi;
	}

	public void setLotNumarasi(String lotNumarasi) {
		this.lotNumarasi = lotNumarasi;
	}

	public int getSatilanMiktar() {
		return satilanMiktar;
	}

	public void setSatilanMiktar(int satilanMiktar) {
		this.satilanMiktar = satilanMiktar;
	}

	public int getSikayetEdilenMiktar() {
		return sikayetEdilenMiktar;
	}

	public void setSikayetEdilenMiktar(int sikayetEdilenMiktar) {
		this.sikayetEdilenMiktar = sikayetEdilenMiktar;
	}

	public String getSikayetAciklamasi() {
		return sikayetAciklamasi;
	}

	public void setSikayetAciklamasi(String sikayetAciklamasi) {
		this.sikayetAciklamasi = sikayetAciklamasi;
	}

	public String getMusteriTalebi() {
		return musteriTalebi;
	}

	public void setMusteriTalebi(String musteriTalebi) {
		this.musteriTalebi = musteriTalebi;
	}

	public String getIlgiliBirimYaniti() {
		return ilgiliBirimYaniti;
	}

	public void setIlgiliBirimYaniti(String ilgiliBirimYaniti) {
		this.ilgiliBirimYaniti = ilgiliBirimYaniti;
	}

	public Date getIlgiliBirimYanitTarihi() {
		return ilgiliBirimYanitTarihi;
	}

	public void setIlgiliBirimYanitTarihi(Date ilgiliBirimYanitTarihi) {
		this.ilgiliBirimYanitTarihi = ilgiliBirimYanitTarihi;
	}

	public boolean isDfGerekliligi() {
		return dfGerekliligi;
	}

	public void setDfGerekliligi(boolean dfGerekliligi) {
		this.dfGerekliligi = dfGerekliligi;
	}

	public String getSatisBirimYaniti() {
		return satisBirimYaniti;
	}

	public void setSatisBirimYaniti(String satisBirimYaniti) {
		this.satisBirimYaniti = satisBirimYaniti;
	}

	public Date getSatisBirimKararTarihi() {
		return satisBirimKararTarihi;
	}

	public void setSatisBirimKararTarihi(Date satisBirimKararTarihi) {
		this.satisBirimKararTarihi = satisBirimKararTarihi;
	}

	public boolean isIlgiliBirimKarar() {
		return ilgiliBirimKarar;
	}

	public void setIlgiliBirimKarar(boolean ilgiliBirimKarar) {
		this.ilgiliBirimKarar = ilgiliBirimKarar;
	}

	public boolean isSatisBirimiKarar() {
		return satisBirimiKarar;
	}

	public void setSatisBirimiKarar(boolean satisBirimiKarar) {
		this.satisBirimiKarar = satisBirimiKarar;
	}

	public String getMusteriyeVerilenYanit() {
		return musteriyeVerilenYanit;
	}

	public void setMusteriyeVerilenYanit(String musteriyeVerilen_yanit) {
		this.musteriyeVerilenYanit = musteriyeVerilen_yanit;
	}

	public boolean isMusteriKarar() {
		return musteriKarar;
	}

	public void setMusteriKarar(boolean musteriKarar) {
		this.musteriKarar = musteriKarar;
	}

	public Date getMusteriyeVerilenYanitTarihi() {
		return musteriyeVerilenYanitTarihi;
	}

	public void setMusteriyeVerilenYanitTarihi(Date musteriyeVerilenYanitTarihi) {
		this.musteriyeVerilenYanitTarihi = musteriyeVerilenYanitTarihi;
	}

	public Kullanici getSikayetAcan() {
		return sikayetAcan;
	}

	public void setSikayetAcan(Kullanici sikayetAcan) {
		this.sikayetAcan = sikayetAcan;
	}

	public Kullanici getBirimSorumlusu() {
		return birimSorumlusu;
	}

	public void setBirimSorumlusu(Kullanici birimSorumlusu) {
		this.birimSorumlusu = birimSorumlusu;
	}

	public Kullanici getSatisMuduru() {
		return satisMuduru;
	}

	public void setSatisMuduru(Kullanici satisMuduru) {
		this.satisMuduru = satisMuduru;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public SikayetTur getSikayetTur() {
		return sikayetTur;
	}

	public void setSikayetTur(SikayetTur sikayetTur) {
		this.sikayetTur = sikayetTur;
	}

	public Urun getUrun() {
		return urun;
	}

	public void setUrun(Urun urun) {
		this.urun = urun;
	}

	public String getMiktarBirim() {
		return miktarBirim;
	}

	public void setMiktarBirim(String miktarBirim) {
		this.miktarBirim = miktarBirim;
	}

	@Override
	public String toString() {
		return "MusteriSikayet [id=" + id + ", acmaTarih=" + acmaTarih + ", lotNumarasi=" + lotNumarasi
				+ ", satilanMiktar=" + satilanMiktar + ", sikayetEdilenMiktar=" + sikayetEdilenMiktar
				+ ", sikayetAciklamasi=" + sikayetAciklamasi + ", musteriTalebi=" + musteriTalebi
				+ ", ilgiliBirimYaniti=" + ilgiliBirimYaniti + ", ilgiliBirimYanitTarihi=" + ilgiliBirimYanitTarihi
				+ ", dfGerekliligi=" + dfGerekliligi + ", satisBirimYaniti=" + satisBirimYaniti
				+ ", satisBirimKararTarihi=" + satisBirimKararTarihi + ", ilgiliBirimKarar=" + ilgiliBirimKarar
				+ ", satisBirimiKarar=" + satisBirimiKarar + ", musteriyeVerilen_yanit=" + musteriyeVerilenYanit
				+ ", musteriKarar=" + musteriKarar + ", musteriyeVerilenYanitTarihi=" + musteriyeVerilenYanitTarihi
				+ ", miktarBirim=" + miktarBirim + ", sikayetAcan=" + sikayetAcan + ", birimSorumlusu=" + birimSorumlusu
				+ ", satisMuduru=" + satisMuduru + ", musteri=" + musteri + ", sikayetTur=" + sikayetTur + ", urun="
				+ urun + "]";
	}


	
	

	
}
