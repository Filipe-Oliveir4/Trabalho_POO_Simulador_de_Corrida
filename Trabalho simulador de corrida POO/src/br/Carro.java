package br;

import java.util.Random;

public class Carro {
	private int velocidade=0;
	private int distancia = 0;
	private String posicaoCarro="#"; 
	
	public Carro() {}
	
	public int getDistancia() {
		return this.distancia;
	}
	
	public int rodada() {
		Random random = new Random();
		int velocidade=random.nextInt(1,4);
		String espaco=" ";
		this.velocidade=velocidade ;
		this.distancia+=this.velocidade;
		for (int i = 0; i < velocidade; i++) {
			espaco+=espaco;
		}
		posicaoCarro=espaco+posicaoCarro;
		return this.velocidade;
	}
	
	public String getposicao() {
		return posicaoCarro;
	}
	
}
