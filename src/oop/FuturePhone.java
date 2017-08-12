package oop;

public class FuturePhone extends Analog {

	private static String Jupiter;
	
	private static final String Brand = Jupiter;
	
	private static int price = 500;
	
	public void thinksPhone() {
	
	}

	public static String getJupiter() {
		return Jupiter;
	}

	public static void setJupiter(String jupiter) {
		Jupiter = jupiter;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		FuturePhone.price = price;
	}

	public static String getBrand() {
		return Brand;
	}
	
}
	
	