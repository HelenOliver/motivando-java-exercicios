package a_basico.a_exercicios;

import java.util.Scanner;

/*
    Em um bar, uma cerveja em lata custa R$6,00.Crie um programa que imprima quantas cervejas o cliente
    pode comprar com notas de R$10,00, R$20,00, R$50,00 e R$100,00.

    Agora faça um programa que imprima o troco para cada nota apresentada na questão anterior.
    Obs: Não é permitido utilizar a operação de subtração.
 */

public class exercicio_5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma das notas de R$10,00, R$20,00, R$50,00 e R$100,00 : ");
        double nota = in.nextDouble();
        double lata = 6.00;

        double qtdCervejas = nota / lata;
        double troco = nota % lata;

        System.out.println("O cliente pode comprar " + qtdCervejas + " cervejas");
        System.out.println("O cliente recebe " + troco + " de troco");


    }

}






















/*
 * Operador ternário
 * (expressão booleana) ? código 1 : código 2;
 *
 * */