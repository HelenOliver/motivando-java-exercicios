package a_basico.a_exercicios;

import java.util.Scanner;

/*
    Faça um programa que leia as duas notas de um aluno em uma materia e mostre na tela a sua media na disciplina.
    Ex: Nota 1: 4.5 Nota 2: 8.5 A media entre 4.5 e 8.5 é igual a 6.5
 */

public class exercicio_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Informe nota 1:");
        float nota1 = in.nextFloat();
        System.out.println("Informe nota 2:");
        float nota2 = in.nextFloat();

        float media = (nota1 + nota2)/2;

        System.out.println("A media entre " + nota1 + " e " + nota2 + " é igual a " + media);

    }

}






















/*
 * Operador ternário
 * (expressão booleana) ? código 1 : código 2;
 *
 * */