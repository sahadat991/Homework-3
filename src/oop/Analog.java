package oop;

public abstract class Analog extends Digital {
	
	public void wire() {
		System.out.println("Analog phone connected by wire");
	}
	public void dial() {
		System.out.println("For calling we need to dial");
	}
	public void digit() {
		System.out.println("Invent digit dial phone");
	}
	public void wireless() {
		System.out.println("Scientists invent wireless phone");
	}
	public void touchscreen() {
		System.out.println("New trends is touchscreen phone");
	}
	public void voiceCommand() {
		System.out.println("In future scientits maybe invent voice commands phone");
	}
	public abstract void thinksPhone();

}
