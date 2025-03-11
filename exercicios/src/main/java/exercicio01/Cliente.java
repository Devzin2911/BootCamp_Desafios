package exercicio01;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("                 BANCO GB - FEITO PRA VOCE              ");
        System.out.println("========================================================");

        Banco banco = new Banco();
        ContaBancaria conta = banco.criarConta(800.0);
        System.out.println("========================================");
        System.out.println();

        System.out.println("========================================");
        System.out.println("Saldo Inicial: " + conta.consultarSaldo());
        System.out.println("Cheque Especial: " + conta.consultarChequeEspecial());
        System.out.println("========================================");
        System.out.println();

        conta.depositarDinheiro(200.0);
        System.out.println("Saldo após o depósito: " + conta.consultarSaldo());
        System.out.println("========================================");
        System.out.println();

        conta.sacarDinheiro(800);
        System.out.println("Saldo após saque: " + conta.consultarSaldo());
        System.out.println("Cheque especial após saque: " + conta.consultarChequeEspecial());
        System.out.println("Usando cheque especial: " + conta.isUsandoChequeEspecial());
        System.out.println("========================================");
        System.out.println();

        conta.depositarDinheiro(100);
        System.out.println("Saldo após depósito: " + conta.consultarSaldo());
        System.out.println("Cheque especial após depósito: " + conta.consultarChequeEspecial());
        System.out.println("Usando cheque especial: " + conta.isUsandoChequeEspecial());
        System.out.println("========================================");
        System.out.println();
    }
}
