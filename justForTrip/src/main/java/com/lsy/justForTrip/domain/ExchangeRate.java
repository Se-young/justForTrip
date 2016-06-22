package com.lsy.justForTrip.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExchangeRate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Double usd;
	private Double jpy;
	private Double eur;
	private Double gbp;
	private Double cad;
	private Double aud;
	private Double thb;
	private Double cny;
	private Date inDate = new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getUsd() {
		return usd;
	}
	public void setUsd(Double usd) {
		this.usd = usd;
	}
	public Double getJpy() {
		return jpy;
	}
	public void setJpy(Double jpy) {
		this.jpy = jpy;
	}
	public Double getEur() {
		return eur;
	}
	public void setEur(Double eur) {
		this.eur = eur;
	}
	public Double getGbp() {
		return gbp;
	}
	public void setGbp(Double gbp) {
		this.gbp = gbp;
	}
	public Double getCad() {
		return cad;
	}
	public void setCad(Double cad) {
		this.cad = cad;
	}
	public Double getAud() {
		return aud;
	}
	public void setAud(Double aud) {
		this.aud = aud;
	}
	public Double getThb() {
		return thb;
	}
	public void setThb(Double thb) {
		this.thb = thb;
	}
	public Double getCny() {
		return cny;
	}
	public void setCny(Double cny) {
		this.cny = cny;
	}
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	
	@Override
	public String toString() {
		return "ExchangeRate [id=" + id + ", usd=" + usd + ", jpy=" + jpy + ", eur=" + eur + ", gbp=" + gbp + ", cad="
				+ cad + ", aud=" + aud + ", thb=" + thb + ", cny=" + cny + ", inDate=" + inDate + "]";
	}
}
