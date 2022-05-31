package com.project.arraylistdemo1;

public class BrandsDTO {
	
	private int BrandId;
	private String BrandName;
	private int Established;
	private String IndustryType;
	private String Headquater;
	
	
	public BrandsDTO() {
		super();
		
	}


	public BrandsDTO(int brandId, String brandName, int established, String industryType, String headquater) {
		super();
		BrandId = brandId;
		BrandName = brandName;
		Established = established;
		IndustryType = industryType;
		Headquater = headquater;
	}


	@Override
	public String toString() {
		return "BrandsDTO [BrandId=" + BrandId + ", BrandName=" + BrandName + ", Established=" + Established
				+ ", IndustryType=" + IndustryType + ", Headquater=" + Headquater + "]";
	}
	
	
	

}
