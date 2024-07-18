package com.digital.banco.contas;

import com.digital.banco.clientes.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        imprimirInformacoesConta();
    }
}
