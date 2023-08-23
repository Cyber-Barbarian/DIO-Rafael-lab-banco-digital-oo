package com.projeto.banco.java.application;

import com.projeto.banco.java.models.Cliente;
import com.projeto.banco.java.models.Conta;
import com.projeto.banco.java.models.ContaCorrente;
import com.projeto.banco.java.models.ContaPoupanca;

public class OperacaoBancariaMain {
    public static void main(String[] args) {

        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        Conta cc = new ContaCorrente(pedro);
        Conta poupanca = new ContaPoupanca(pedro);

        cc.depositar(100);
        cc.transferir(50,poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
