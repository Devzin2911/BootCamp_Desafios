package org.AulasJava;

import java.util.Scanner;

public class calculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] alunos = {"Gabriel", "Ana", "Zoe", "Carlos"};

        int media = calculadoraDeMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %d", media);
    }

    private static int calculadoraDeMediaDaTurma(String[] alunos, Scanner scan) {

        int soma = 0;

        for(String aluno: alunos) {
            System.out.printf("Nota do aluno %s:", aluno);
            int nota = scan.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
