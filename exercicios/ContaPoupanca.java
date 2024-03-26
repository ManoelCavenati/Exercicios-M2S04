package exercicios;

class ContaPoupanca extends ContaBancaria implements Imprimivel {
    private double taxaDeJuros;

    public ContaPoupanca(int numeroDaConta, int agencia, String nomeDoTitular, double saldo, double taxaDeJuros) {
        super(numeroDaConta, agencia, nomeDoTitular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void adicionarJuros() {
        double juros = getSaldo() * taxaDeJuros;
        depositar(juros);
        System.out.println("Juros adicionados: " + juros);
    }

    @Override
    public void mostrarDados() {
        System.out.println("Tipo de Conta: Poupança");
        System.out.println("Número da Conta: " + getNumeroDaConta());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Nome do Titular: " + getNomeDoTitular());
        System.out.println("Saldo: " + getSaldo());
    }
}
