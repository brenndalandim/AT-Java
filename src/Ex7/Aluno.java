package Ex7;

import com.util.Formatar;

class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    private double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7) System.out.println("Aluno(a) aprovado!");
        else System.out.println("Aluno(a) reprovado!");
    }

    public void dadosAluno() {
        Formatar.verde("Dados do Aluno");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.printf("Notas: %.1f | %.1f | %.1f\n", this.nota1, this.nota2, this.nota3);
        this.verificarAprovacao();
    }

}
