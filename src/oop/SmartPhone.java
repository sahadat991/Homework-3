package oop;

public class SmartPhone extends Analog {
	
	private String Brand = ("Samsung" + "Apple");
	private final static String price = "600";
	
	public void thinksPhone() {
				
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public static String getPrice() {
		return price;
	}
}
