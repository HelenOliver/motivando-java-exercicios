package a_basico.a_exercicios;

import java.util.Scanner;

/*
    Determine o numero de digitos de um numero informado.
    Obs: Não é permitido utilizar metodos de manipulacao de texto.
 */

public class exercicio_7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int num = in.nextInt();

        int cont = 0;

        while(num != 0){

            num = num / 10;
            cont++;

        }

        System.out.println(cont);

    }

}






















/*
 * Operador ternário
 * (expressão booleana) ? código 1 : código 2;
 *
 * */