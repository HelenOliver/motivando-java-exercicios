package a_basico.a_exercicios;

import java.util.Scanner;

/*
    Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e
    mostre quantos dolares ela pode comprar. Considere US$1,00 = R$5,53.
 */

public class exercicio_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Informe quanto dinheiro tem na sua carteira: ");
        double valorCarteira = in.nextDouble();
        double valorDolar = 5.53;

        double cotacao = valorCarteira / valorDolar;

        System.out.println("Você pode comprar " + cotacao);

    }

}






















/*
 * Operador ternário
 * (expressão booleana) ? código 1 : código 2;
 *
 * */