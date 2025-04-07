package Ex9;

import com.util.Formatar;

public class ContaBancaria {
    public String titular;
    private double saldo = 0; //inicia zerado pq é uma conta nova

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("R$ %,.2f depositado com sucesso!\n\n", valor);
        } else System.out.println("Valor inválido para depósito!\n");
    }

    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.printf("R$ %,.2f sacado com sucesso!\n\n", valor);
        } else System.out.println("Saldo inválido para saque!\n");
    }

    public void exibirSaldo() {
        Formatar.verde("Dados do Conta");
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %,.2f\n\n", saldo);
    }
}
