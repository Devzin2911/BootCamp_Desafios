package exercicio01;

public class Banco {

    public ContaBancaria criarConta(double depositoInicial) {
        System.out.println("Criando sua conta...");
        System.out.println("Adicionando saldo de R$" + depositoInicial + " na sua conta");
        return  new ContaBancaria(depositoInicial);
    }


}
