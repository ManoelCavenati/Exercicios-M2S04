package exercicios;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(int numeroDaConta) {
        contas.removeIf(conta -> conta.getNumeroDaConta() == numeroDaConta);
    }

    public void mostrarContas() {
        for (ContaBancaria conta : contas) {
            if (conta instanceof Imprimivel) {
                ((Imprimivel) conta).mostrarDados();
            }
        }
    }
}
