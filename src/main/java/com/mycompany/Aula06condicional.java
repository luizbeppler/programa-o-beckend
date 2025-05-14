package com.mycompany;

public class Aula06Condicional {

    public static void main(String[] args) {
        /**
         * Estrutura condicional simples (if, else)
         *
         * pode ser lida como: SE, SENÃO
         *
         * a condição verdadeira é executada dentro do if
         */
        int num = 3;

        // % é o resto da divisão
        // comparando com 0 significa que o número é par
        if (num % 2 == 0) {
            System.out.println(num + " é par !!");
        } else {
            System.out.println(num + " é impar !!");
        }

        /**
         * Estrutura condicional composta (if, else if, else)
         *
         * nesse tipo de estrutura podemos ter mais de uma
         * verificação caso o primeiro if não seja satisfeito
         *
         * um exemplo prático pode ser a verificação do IMC
         */
        double imc = 24.0;

        if (imc < 18.5) {
            System.out.println("Está abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.5) {
            System.out.println("Está com peso ideal");
        } else {
            System.out.println("Está com obesidade");
        }
    }
}