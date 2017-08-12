package oop;

public abstract class Digital implements Phone {
	
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

}
