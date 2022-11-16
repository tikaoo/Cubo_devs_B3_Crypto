package br.com.projetocrypto.crypto.api.entity;

public class CryptoFollow {
	
	private int id;
	private int crptoId;
	private Double higherTargetPrice;
	private Double lowerTargetPrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCrptoId() {
		return crptoId;
	}
	public void setCrptoId(int crptoId) {
		this.crptoId = crptoId;
	}
	public Double getHigherTargetPrice() {
		return higherTargetPrice;
	}
	public void setHigherTargetPrice(Double higherTargetPrice) {
		this.higherTargetPrice = higherTargetPrice;
	}
	public Double getLowerTargetPrice() {
		return lowerTargetPrice;
	}
	public void setLowerTargetPrice(Double lowerTargetPrice) {
		this.lowerTargetPrice = lowerTargetPrice;
	}
}
