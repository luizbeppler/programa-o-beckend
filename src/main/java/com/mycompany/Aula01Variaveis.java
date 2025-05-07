package com.mycompany;

public class Aula01Variaveis {

    public static void main(String[] args) {
        // variavel lógica

        // tipo primitivo
        boolean valorLogicoPrimitivo = true;

        //Exibe o valor
        System.out.println(valorLogicoPrimitivo);

        // Topo abstrato
        Boolean valorLogicoAbstrato = false;

        //
        System.out.println("o valor da variável valorLogicoAbstrato é: " + valorLogicoAbstrato);

        //Tipo primitivo
        int valorinteiro = 10; // 32bits
        long valorinteirolongo =10l; // 64 bits

        //Tipo abistrato
        Integer valorinteiroAbs = 20;
        Long valorlongoAbs = 20L;

        System.out.println("O valor de valorinteiro é : " + valorinteiro + ", e o valorinteirolongo é: " + valorinteirolongo);
    }
}