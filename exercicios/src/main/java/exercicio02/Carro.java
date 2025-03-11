package exercicio02;

public class Carro  {
    public static void main(String[] args) {
        Automovel carro = new Automovel();


        carro.ligar();
        carro.trocarMarcha(1);
        carro.acelerar();
        carro.verificarVelocidade();
        carro.virar("esquerda");
        carro.trocarMarcha(2);
        carro.acelerar();
        carro.verificarVelocidade();
        carro.desligar();

    }
}
