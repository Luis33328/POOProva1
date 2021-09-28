package com.ex2;

public class Automovel extends Transporte{
	
	private int marcha = 1;
	
	public void abastecer() {
		System.out.println("Abastecendo...");
	}
	
	public void passarMarcha() {
		marcha++;
		System.out.println("Passando a marcha...");
		System.out.println("Marcha atual: " + marcha);
	}
}
