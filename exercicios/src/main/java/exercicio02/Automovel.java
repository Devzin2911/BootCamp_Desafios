package exercicio02;

public class Automovel {

    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Automovel() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }


    public void ligar() {
        if(!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro ja está ligado");
        }
    }

    public void desligar() {
        if(ligado && marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado");
        } else {
            System.out.println("Não é possivel desligar o carro. Verifique" +
                    "se está em ponto morto e com a velocidade zero");
        }
    }


    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + "km/h");
    }




    public void acelerar() {
        if (ligado) {
            if (marcha == 0) {
                velocidade++;
                System.out.println("Não é possível acelerar em ponto morto");
            } else if (velocidade < 120) {
                System.out.println("Velocidade atual: " + velocidade + " km/h");
            } else {
                System.out.println("Velocidade máxima atingida");
            }
        } else {
            System.out.println("O carro está desligado");
        }
    }


    public void diminuirVelocidade() {
        if(ligado) {
            if(velocidade > 0) {
                velocidade--;
                System.out.println("Velocidade Atual: " + velocidade + " km/h");
            } else {
                System.out.println("O Carro já está parando");
            }
        } else {
            System.out.println("O carro está desligado");
        }
    }


    public void virar(String direcao) {
        if(ligado) {
            if(velocidade >= 1 && velocidade <= 40) {
                System.out.println("Virando para a " + direcao + "");
            } else {
                System.out.println("A velocidade deve estar entre 1 km/h e 40 km/h para virar");
            }
        } else {
            System.out.println("O carro está desligado");
        }
    }


    public void trocarMarcha(int novaMarcha) {
        if(ligado) {
            if(novaMarcha == marcha + 1 || novaMarcha == marcha - 1) {
                if (validarMarcha(novaMarcha)) {
                    marcha = novaMarcha;
                    System.out.println("Marcha atual: " + marcha);
                } else {
                    System.out.println("Velocidade nao compativel com a marcha");
                }
            } else {
                System.out.println("Não é permitido pular marchas.");
            }
        } else {
            System.out.println("O carro está desligado");
        }
    }



    private boolean validarMarcha(int marcha) {
        switch (marcha) {
            case 0:
                return velocidade == 0;

            case 1:
                return velocidade >= 0 && velocidade <= 20;

            case 2:
                return velocidade >= 21 && velocidade <= 40;

            case 3:
                return velocidade >= 41 && velocidade <= 60;

            case 4:
                return velocidade >= 61 && velocidade <= 80;

            case 5:
                return velocidade >= 81 && velocidade <= 100;

            case 6:
                return velocidade >= 100 && velocidade <= 120;

            default:
                return false;
        }
    }


}
