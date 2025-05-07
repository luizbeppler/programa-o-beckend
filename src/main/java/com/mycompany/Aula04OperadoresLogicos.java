package com.mycompany;

public class Aula04OperadoresLogicos {
    public static void main(String[] args) {
        /**
         * Operações lógicas
         */
        boolean val1 = true;
        boolean val2 = false;

        // Operador de Conjunção (&&)
        // Será verdadeiro se abas as condições forem verdadeiras
        boolean conjuncao = val1 && val2;
        System.out.println("A conjunção entre " + val1 + " e " + val2 + " é: " + conjuncao);

        // Operador de Disjunção (||)
        // Será verdadeiro se uma das condições for verdadeira
        boolean disjuncao = val1 || val2;
        System.out.println("A disjunção entre " + val1 + " e " + val2 + " é: " + disjuncao);
        
        // Operador de negação (!)
        // Ele inverte o valor da condição: Se era true, passa a ser false e vice-versa
        boolean negacao = val1 && !val2;
        System.out.println("A conjunção entre " + val1 + " e negação de " + val2 + " é: " + negacao);
    }
}