package oop;

public class mainApps {

	public static void main(String[] args) {
		
		SmartPhone sPhone = new SmartPhone();
		
		FuturePhone fPhone = new FuturePhone();
		
		sPhone.dial();
		sPhone.digit();
		
		fPhone.touchscreen();
		fPhone.voiceCommand();
	}

}
