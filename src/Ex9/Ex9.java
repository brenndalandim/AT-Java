package Ex9;

public class Ex9 {
    public static void main(String[] args) {
        ContaBancaria testeConta = new ContaBancaria("Brennda");
        testeConta.exibirSaldo();
        testeConta.depositar(-2000);
        testeConta.exibirSaldo();
        testeConta.depositar(2000);
        testeConta.exibirSaldo();
        testeConta.sacar(10000);
        testeConta.exibirSaldo();
        testeConta.sacar(150);
        testeConta.exibirSaldo();
    }
}
