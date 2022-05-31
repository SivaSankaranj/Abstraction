package com.project.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Material {
	@Value("iron")
	private String typesofMaterial;
	@Value("TATA Steel")
	private String brandname;
	@Value("40000")
	private int price;

	public Material() {
		System.out.println("object is created:"+this.getClass().getSimpleName());
	
	}

	public String getTypesofMaterial() {
		return typesofMaterial;
	}

	public void setTypesofMaterial(String typesofMaterial) {
		this.typesofMaterial = typesofMaterial;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Material [typesofMaterial=" + typesofMaterial + ", brandname=" + brandname + ", price=" + price + "]";
	}

}
