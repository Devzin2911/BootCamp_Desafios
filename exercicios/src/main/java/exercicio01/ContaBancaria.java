package exercicio01;

public class ContaBancaria extends Conta {

    private double chequeEspecial;
    private double limiteChequeEspecial;
    private boolean usandoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        super(depositoInicial);
        if(depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
        this.chequeEspecial = this.limiteChequeEspecial;
        this.usandoChequeEspecial = false;
    }


    public double consultarChequeEspecial() {
        return this.chequeEspecial;
    }

    @Override
    public void depositarDinheiro(double valor) {
        super.depositarDinheiro(valor);
        if(this.usandoChequeEspecial && this.saldo > 0) {
            double valorUsadoChequeEspecial = this.limiteChequeEspecial - this.chequeEspecial;
            double taxa = valorUsadoChequeEspecial * 0.2;
            this.saldo -= taxa;
            this.chequeEspecial = this.limiteChequeEspecial;
            this.usandoChequeEspecial = false;
        }
    }

    @Override
    public boolean sacarDinheiro(double valor) {
        if(valor <= this.saldo + this.chequeEspecial) {
           this.saldo -= valor;
           if(this.saldo < 0) {
               this.chequeEspecial += this.saldo;
               this.saldo = 0;
               this.usandoChequeEspecial = true;
           }
           return true;
        } else {
            return false;
        }
    }


    public boolean isUsandoChequeEspecial() {
        return this.usandoChequeEspecial;
    }
}
