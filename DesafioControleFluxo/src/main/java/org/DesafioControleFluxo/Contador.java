package org.DesafioControleFluxo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Contador {
    public static void main( String[] args ) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("DIgite o primeiro parametro: ");
        int param01 = terminal.nextInt();
        System.out.println("============================");
        System.out.print("Digite o segundo parametro: ");
        int param02 = terminal.nextInt();

        try {
            contar(param01, param02);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }


    static void contar(int p1, int p2) throws RuntimeException {
        for(int c = p1; c <= p2; c++) {
            System.out.println("Imprimindo o numero " + c);
        }

        if(p1 >= p2)  {
            throw  new RuntimeException("O segundo parametro deve ser maior que o primeiro");
        }
    }
}


