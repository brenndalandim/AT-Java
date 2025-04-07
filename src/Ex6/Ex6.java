package Ex6;

public class Ex6 {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("ABC123", "uno", 2015, 20000);
        veiculo1.exibirDetalhes();
        veiculo1.registrarViagem(100);

        Veiculo veiculo2 = new Veiculo("DEF456", "argo", 2020, 10000);
        veiculo2.exibirDetalhes();
        veiculo2.registrarViagem(100);

    }
}
