package exercicios;

public class Principal {

    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(123456, 789, "João", 1000.0, 0.05);
        ContaCorrente contaCorrente = new ContaCorrente(654321, 987, "Maria", 2000.0, 10.0);

        contaPoupanca.depositar(500.0);
        contaPoupanca.adicionarJuros();
        contaPoupanca.sacar(200.0);

        contaCorrente.depositar(1000.0);
        contaCorrente.sacar(300.0);

        Banco banco = new Banco();
        banco.adicionarConta(contaPoupanca);
        banco.adicionarConta(contaCorrente);

        banco.mostrarContas();
    }
}
