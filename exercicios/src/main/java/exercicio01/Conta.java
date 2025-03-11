package exercicio01;

public class Conta {

    protected  double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double consultarSaldo() {
        System.out.println("Consultando meu saldo...");
        return this.saldo;
    }

    public void depositarDinheiro(double valor) {
        System.out.println("depositando meu dinheiro...");
        this.saldo += valor;
    }

    public boolean sacarDinheiro(double valor) {
        System.out.println("Sacando meu dinheiro...");
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return  true;
        } else {
            return false;
        }
    }

    public boolean pagarBoleto(double valor) {
        System.out.println("Pagando um boleto...");
        return  sacarDinheiro(valor);
    }
}
