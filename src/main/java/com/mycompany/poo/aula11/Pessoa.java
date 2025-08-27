package com.mycompany.poo.aula11;

public class Pessoa {
    /**
	 * Encapsulamento (Métodos Acessores/Modificadores)
	 *
	 * Em projetos em grande escala, para manter a segurança de nossas classes,
	 * utilizamos o modificador de acesso privado, com uma maior frequência.
	 *
	 * Em muitas situações precisamos buscar e alterar uma ou mais informações,
	 * e é nesse cenário que utilizamos os métodos:
	 * - Getter: Acessar/Buscar
	 * - Setter: Modificar/Alterar
	 */
	private String nome;
	private int idade;
	private double salario;
	private double altura;


	// Declaramos sempre após a declaração dos atributos
public String getNome() {
    return nome;
}

// Método modificador, sempre comeca com set
public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void getIdade(int idade) {
    this.idade = idade;
}

public double getSalario() {
    return salario;
}

public void getSalario (double salario) {
    this.salario = salario;
}

public double getAltura() {
    return altura;
}

public void getAltura (int altura) {
    this.altura = altura;
}

}
    

