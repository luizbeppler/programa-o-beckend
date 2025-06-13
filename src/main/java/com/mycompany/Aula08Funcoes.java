package com.mycompany;

public class Aula08Funcoes {

    public static void main (String[] args){
      int numero = 5;

      System.out.println("--- Tabuada do " + numero + "---");
      
      for(int i = 1; i <= 10; i++){
        System.out.println(numero + " x " + i + " = " + multiplicacao(numero, i));
      }
    }

    /*não podemos declarar funções dentro de outra função
     * 
     * toda funcao deve ter um retorno 
     * 
     * um a funcao nao pode ter parametro
     * 
     */
    public static int multiplicacao(int num, int num2) {

        return num * num2;


    }
}