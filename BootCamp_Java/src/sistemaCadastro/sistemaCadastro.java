package sistemaCadastro;

public class sistemaCadastro {
	
	public static void main(String[] args) {
		Pessoa gabriel = new Pessoa("212.643.123-45", "Gabriel");
		
		
		gabriel.setEndereco("ESTRADA SANTA EUGENIA");
		
		
		System.out.println(
				"Nome: " + gabriel.getNome() + " -- "
				+ "CPF: " + gabriel.getCpf());
	}

}
