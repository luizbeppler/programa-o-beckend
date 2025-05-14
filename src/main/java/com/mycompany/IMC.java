package com.mycompany;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Peso do aluno (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Altura do aluno (m): ");
        double altura = scanner.nextDouble();
       
        double imc = peso / (altura * altura);
 
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Classificação: Obesidade grau 1");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Classificação: Obesidade grau 2");
        } else {
            System.out.println("Classificação: Obesidade grau 3");
        }
        

        scanner.close();
    }
}