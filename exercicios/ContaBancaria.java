package exercicios;

class ContaBancaria {
    private int numeroDaConta;
    private int agencia;
    private String nomeDoTitular;
    protected double saldo;

    public ContaBancaria(int numeroDaConta, int agencia, String nomeDoTitular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

}
