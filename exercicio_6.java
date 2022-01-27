package a_basico.a_exercicios;

import java.util.Scanner;

/*
    Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade
    de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma area de 2  metros quadrados.
 */

public class exercicio_6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Informe a largura da parede: ");
        double largura = in.nextDouble();
        System.out.println("Informe a altura da parede: ");
        double altura = in.nextDouble();

        double totalArea = altura * largura;
        double litroTinta = totalArea / 2;

        System.out.println("O total da área a ser pintada é de " + totalArea + "m²");
        System.out.println("A quantidade de tinta necessária para o serviço é de " + litroTinta + "l");


    }

}






















/*
 * Operador ternário
 * (expressão booleana) ? código 1 : código 2;
 *
 * */