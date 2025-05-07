package com.mycompany;

public class Aula03Operadores {
    public static void main(String[] args) {
        String var1; // toda varevel sem valor, altomaticamente é null
        String var2 = null;
        String var3 = "";

        int num1 = 10;
        int num2 = 2;

        int soma = num1 + num2;
        System.out.println("A som entre" + num1 + " e " + num2 + "é: " + soma );

        int subtracao = num1 + num2;
        System.out.println(" A subtraçao de " + num1 + " por " + num2 + "é: " + subtracao );

        int multiplicao = num1 * num2;
        System.out.println("A multiplicação de " + num1 + "por" + num2 + "é:" + multiplicao);

        int divisao = num1 / num2;
        System.out.println(" A divisao de " + num1 + " por " + num2 + " é:" + divisao);
    }
}