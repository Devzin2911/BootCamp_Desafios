package org.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 *
 */
public class processoSeletivo {
    public static void main( String[] args ) {

        System.out.println("============================================");
        System.out.println("------------ Processo Seletivo -------------");
        System.out.println("============================================");

        String[] candidatos = {"Gabriel", "Ana", "Zoe", "Filipe", "Maria"};
        for(String candidato: candidatos) {
            solicitandoContato(candidato);
        }
    }

    static  void solicitandoContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else  {
                System.out.println("Contato realizado com sucesso!");
            }
        } while(continuarTentando && tentativasRealizadas<3);

        if (atendeu) {
            System.out.println("Conseguimos contato com "+ candidato + " na " + tentativasRealizadas + "ª Tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", Numero de tentativas realizadas: " + tentativasRealizadas);
        }
    }


    static boolean atender() {
        return new Random().nextInt(3)==1;
    }



    static void imprimirSelecionados() {
        String[] candidatos = {"Gabriel", "Ana", "Zoe", "Filipe", "Maria"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidaato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }
    }


    static void selecaoCandidatos() {
        String[] candidatos = {"Filipe", "Maria", "Gabriel", "Ana", "Zoe", "Pedro", "Wesley", "Lucas", "Evellyn"};

        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosSelecionados];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                    candidatosSelecionados++;
                }

            candidatosAtuais++;
        }

    }


    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }



    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com conta proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

}
