package com.digital.banco.contas;

import com.digital.banco.clientes.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        imprimirInformacoesConta();
    }
}
