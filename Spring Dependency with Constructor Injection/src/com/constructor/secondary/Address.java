package com.constructor.secondary;

public class Address {
	
	private String areaName;
	private String cityName;
	
	
	public Address(String areaName, String cityName)
	{

		this.areaName = areaName;
		this.cityName = cityName;
	}


	@Override
	public String toString() {
		return "Address :areaName=" + areaName + ", cityName=" + cityName;
	}
	
	
	
	
	

}
