package com.mycompany;

public class Aula09Objetos {

    public static void main(String[] args) {
        /*
         * Em java, toda classe ou titulo abstrato é um objeto, pois possuem caracteristicas 
         * e funcionalidades. 
         * 
         * Eles herdam funções da classe mãe java.lang.Object, é correto afirmar que java.main.Object é uma super classe
         * de qualquer outra classe ou tipo abstrato.
         */
        Integer numero = 10; // Tipo abstrato
        int numero2 = 10; // Tipo primitivo

        // Retorna se a variável/classe é uma instância de outra classe
        System.out.println(numero instanceof Object);

        // Método compareTo pertence ao tipo abstrato integer
        numero.compareTo(numero2);

        //Instânciando uma classe
        carro carro = new Carro(modelo:"celta".marca:"chevrolet");
        carro.andar(km:60);
        carro parar();

        carro carro2 = new carro("celta", "chevrolet");

        System.out.pryntln(carro == carro2);

        System.out.println(carro instanceof Carro);
        System.out.println(carro instanceof Object);



    }

    /*
     * Criando uma classe dentro de outra classe
     * 
     * é nescessario utilizar a instrução static
     * entre public e class
     */
    public static class carro {
        // Atributos da classe
        String modelo;
        String marca;
        int ano;
        int quilometragem = 0;

        /**
         * Método construtor
         * 
         * ele é chamado quando criamos uma nova instância
         * da classe.
         */

        public Carro(String modelo, String marca) {
            this.modelo = modelo;
            this.marca = marca;
        }

        // Ações da classe
        void andar(int km) {
            this.quilometragem += km;
            System.out.println("o carro está percorrendo " + km + "km");
        }

        Void parar() {
            System.out.println("O veiculo parou !! e percorreu umm total de " + this. quilometragem + "km")
        }
    }
}