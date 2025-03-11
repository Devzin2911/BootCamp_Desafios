package com.lanchonete.areaCliente;

public class Cliente {
	
	public void escolherLanche() {
		System.out.println("Escolhendo o lanche");
	}
	
	public void fazerPedido() {
		System.out.println("Fazendo o pedido");
	}
	
	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("Pagando a Conta");
	}
	
	private void consultarSaldoAplicativo() {
		System.out.println("Consultando saldo no aplicativo");
	}
	
	public void pegarPedidoBalcao() {
		System.out.println("Pegando o pedido no balcao");
	}
}
