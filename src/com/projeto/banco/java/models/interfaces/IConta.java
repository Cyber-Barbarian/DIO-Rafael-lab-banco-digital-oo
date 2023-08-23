package com.projeto.banco.java.models.interfaces;

import com.projeto.banco.java.models.Conta;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}
