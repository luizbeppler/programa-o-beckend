package com.mycompany.poo.aula12;

public class Pessoa {
    /***
     * Castrutores
     * 
     * toda classe pode conter mais de um construtor,
     * porem cada construtor deve possuir quantidade
     * e tipo parametros diferentes
     * 
     */

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {
        System.out.println("chamando o contrutor padrao");
    }

        
    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Chamando construtor 2");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
