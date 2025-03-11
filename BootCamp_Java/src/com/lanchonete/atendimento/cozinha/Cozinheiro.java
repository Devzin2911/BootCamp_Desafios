package com.lanchonete.atendimento.cozinha;

import com.lanchonete.atendimento.Atendente;

public class Cozinheiro {
	
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando lanche Natural Hamburguer no Balcao");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando suco no balcao");
	}
	
	public void adicionarComboNoBanco() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	private void prepararLacnhe() {
		System.out.println("Preparando lanche tipo hamburguer");
	}
	
	private void prepararVitamina() {
		
	}
	
	private void fritarIngedientesLanche() {
		System.out.println("Fritando a Carne e o ovo para o Hamburguer");
	}
	
	private void pedirPraTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirPraTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	
	
	private void lavarIngrediente() {
		System.out.println("Lavando ingredientes");
	}
	
	
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina no liquidificador");
	}

}
