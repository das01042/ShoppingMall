package com.shop.VO;

public class productVO {
	private String pId;
	private String pName;
	private String pDesc;
	private int originPrice;
	private int salePrice;
	private double star;
	private String image;
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	public int getOriginPrice() {
		return originPrice;
	}
	public void setOriginPrice(int originPrice) {
		this.originPrice = originPrice;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public double getStar() {
		return star;
	}
	public void setStar(double star) {
		this.star = star;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "productVO [pId=" + pId + ", pName=" + pName + ", pDesc=" + pDesc + ", originPrice=" + originPrice
				+ ", salePrice=" + salePrice + ", star=" + star + ", image=" + image + "]";
	}
	
	public productVO() {
	
	}
	
	
	
	
}
