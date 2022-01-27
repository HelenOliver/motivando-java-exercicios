package a_basico.a_exercicios;

import java.util.Scanner;

/*
    Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela:
    Ex: Qual é o seu nome? João da Silva Olá João da Silva, é um prazer te conhecer!
 */

public class exercicio_0 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = in.nextLine();

        System.out.println("Seja muito bem-vindo(a) " + nome + ", é um prazer te conhecer!");

    }

}






















/*
 * Operador ternário
 * (expressão booleana) ? código 1 : código 2;
 *
 * */