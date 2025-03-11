package com.lanchonete;

import com.lanchonete.areaCliente.Cliente;
import com.lanchonete.atendimento.Atendente;
import com.lanchonete.atendimento.cozinha.Almoxarife;
import com.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	
	public static void main(String[] args) {
		
		// Seção de Implementação dos métodos da classe Cozinheiro
		Cozinheiro cozinheiro = new Cozinheiro();
		
		
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBanco();
		
		
		// Seção de Implementação dos métodos da classe Almoxarife
		
		Almoxarife almoxarife = new Almoxarife();
		
		almoxarife.entregarIngredientes();
		
		
		
		// Seção de Implementação dos métodos da classe Atendente
		
		
		Atendente atendente = new Atendente();
		
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		
		
		// Seção de Implementação dos métodos da classe Cliente
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
	
	}
}
