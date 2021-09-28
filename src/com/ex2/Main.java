package com.ex2;

public class Main {

	public static void main(String[] args) {
		
		Ferrari f40 = new Ferrari();
		System.out.println("F40: ");
		f40.recebePassageiro(1);
		f40.abastecer();
		f40.acelerar();
		f40.passarMarcha();
		f40.passarMarcha();
		f40.frear();
		
		System.out.println("");
		System.out.println("Boeing");
		
		Aviao boeing = new Aviao();
		boeing.recebePassageiro(10);
		boeing.levantaVoo();
		boeing.pousar();
		
		System.out.println("");
		System.out.println("Navio Petroleiro");
		
		Navio petroleiro = new Navio();
		petroleiro.recebePassageiro(15);
		petroleiro.ancorar();
		petroleiro.afundar();
	}
	
}
