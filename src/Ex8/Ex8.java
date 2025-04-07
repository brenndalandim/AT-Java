package Ex8;

public class Ex8 {
    public static void main(String[] args) {
        Funcionario funcionarioG = new Gerente("Brennda", 5000);
        funcionarioG.dadosFuncionario();

        Funcionario funcionarioE = new Estagiario("Brennda", 2000);
        funcionarioE.dadosFuncionario();
    }
}
