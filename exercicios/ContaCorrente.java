package exercicios;

class ContaCorrente extends ContaBancaria implements Imprimivel {
    private double taxaDeOperacao;

    public ContaCorrente(int numeroDaConta, int agencia, String nomeDoTitular, double saldo, double taxaDeOperacao) {
        super(numeroDaConta, agencia, nomeDoTitular, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaDeOperacao;
        if (getSaldo() >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Tipo de Conta: Corrente");
        System.out.println("Número da Conta: " + getNumeroDaConta());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Nome do Titular: " + getNomeDoTitular());
        System.out.println("Saldo: " + getSaldo());
    }
}
