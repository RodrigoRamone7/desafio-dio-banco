import com.digital.banco.clientes.Cliente;
import com.digital.banco.contas.Conta;
import com.digital.banco.contas.ContaCorrente;
import com.digital.banco.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta contaCC = new ContaCorrente(new Cliente("Matheus"));

        Conta contaP = new ContaPoupanca(new Cliente("Jorge"));

        contaCC.imprimirExtrato();
        contaCC.depositar(100);
        contaCC.imprimirExtrato();
        contaCC.transferir(200, contaP);

        contaP.imprimirExtrato();

    }
}
