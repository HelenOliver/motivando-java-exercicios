package a_basico.a_exercicios;

import java.util.Scanner;

/*
    Faça um programa que leia um numero inteiro e mostre o seu antecessor e seu sucessor.
    Ex: Digite um numero:9 O antecessor de 9 é 8 O sucessor de 9 é 10
 */

public class exercicio_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = in.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor + "\n" + "O sucessor de " + numero + " é " + sucessor);

    }

}






















/*
 * Operador ternário
 * (expressão booleana) ? código 1 : código 2;
 *
 * */