package com.mycompany.avaliacao;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private List<String> extrato;
    private boolean contaAtiva;

    // Construtor
    public ContaBancaria(int numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.extrato = new ArrayList<>();
        this.contaAtiva = true;
        this.extrato.add("Conta criada com saldo inicial de: R$" + saldoInicial);
    }

    // Métodos (Operações Bancárias)

    public void depositar(double valor) {
        if (!contaAtiva) {
            System.out.println("Erro: A conta está fechada.");
            return;
        }
        if (valor > 0) {
            this.saldo += valor;
            this.extrato.add("Depósito de: R$" + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    public boolean sacar(double valor) {
        if (!contaAtiva) {
            System.out.println("Erro: A conta está fechada.");
            return false;
        }
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.extrato.add("Saque de: R$" + valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido para saque.");
            return false;
        }
    }

    public boolean transferir(double valor, ContaBancaria contaDestino) {
        if (!contaAtiva) {
            System.out.println("Erro: A conta de origem está fechada.");
            return false;
        }
        if (contaDestino == null) {
            System.out.println("Erro: A conta de destino não existe.");
            return false;
        }
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            this.extrato.add("Transferência de R$" + valor + " para a conta " + contaDestino.getNumero());
            System.out.println("Transferência de R$" + valor + " para a conta " + contaDestino.getTitular() + " realizada com sucesso.");
            return true;
        }
        return false;
    }

    public void mostrarSaldo() {
        if (!contaAtiva) {
            System.out.println("Erro: A conta está fechada.");
            return;
        }
        System.out.println("Saldo atual de " + this.titular + ": R$" + this.saldo);
    }

    public void mostrarExtrato() {
        if (!contaAtiva) {
            System.out.println("Erro: A conta está fechada.");
            return;
        }
        System.out.println("--- Extrato da Conta " + this.numero + " ---");
        for (String operacao : extrato) {
            System.out.println(operacao);
        }
        System.out.println("--- Fim do Extrato ---");
    }

    public boolean fecharConta() {
        if (this.saldo == 0) {
            this.contaAtiva = false;
            this.extrato.add("Conta fechada.");
            System.out.println("A conta de " + this.titular + " foi fechada com sucesso.");
            return true;
        } else {
            System.out.println("Erro: O saldo da conta deve estar zerado para fechá-la. Saldo atual: R$" + this.saldo);
            return false;
        }
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}