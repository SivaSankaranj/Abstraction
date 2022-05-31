package com.project.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Wallet {
	@Value("Black")
	private String colour;
	@Value("2000")
	private double price;
	@Autowired
	private Material material;
	@Autowired
	private Money money;
	@Autowired
	private AtmCard atmcard;
	@Autowired
	private Photo photo;

	public Wallet() {
		System.out.println("object is created:"+this.getClass().getSimpleName());
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public AtmCard getAtmcard() {
		return atmcard;
	}

	public void setAtmcard(AtmCard atmcard) {
		this.atmcard = atmcard;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Wallet [colour=" + colour + ", price=" + price + ", material=" + material + ", money=" + money
				+ ", atmcard=" + atmcard + ", photo=" + photo + "]";
	}

}
