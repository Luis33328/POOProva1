package com.ex2;

public class Transporte {

	private int passageiros = 0;
	//private String modelo;
	
	public void acelerar() {
		System.out.println("Acelerando...");
	}
	
	public void frear() {
		System.out.println("Freando.");
	}
	
	public void recebePassageiro(int numPassageiros) {
		passageiros +=numPassageiros;
		System.out.println("Número de passageiros: " + passageiros);
	}
}
