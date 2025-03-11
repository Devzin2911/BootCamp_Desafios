package AulaEnum;

public class sistemaIBGE {
	
	public static void main(String[] args) {
		for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " -- " + e.getNome());
		}
	}
}
