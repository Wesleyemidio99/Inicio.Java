package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        int number;

        System.out.println("Digite um numero para saber se e negativo ou nao");
        number =valor.nextInt();

        if(number<0){

            System.out.println("O numero Negativo");
        }
        else{
            System.out.println("Numero positivo");

        }
        valor.close();
    }
}