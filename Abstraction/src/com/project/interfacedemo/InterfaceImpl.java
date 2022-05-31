package com.project.interfacedemo;

public class InterfaceImpl implements Car, Jeep {

	@Override
	public void Price() {
		System.out.println("called price method from Jeep intetrface");

	}

	@Override
	public void Speed() {
		System.out.println("called price method from Jeep interface"); 
		int Speed=60;
		if(Speed>60) {
			System.out.println("Driver is not safe");
		}
		else {
			System.out.println("Driver is safe");
		}

	}

	@Override
	public void carTypes() {
		System.out.println("called carTypes method from Car interface");

	}

	@Override
	public void carPrice() {
		System.out.println("called carPrice method from Car interface ");

	}

}
