package Ex6;

import java.util.Scanner;
import com.util.Formatar;

class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double km;

    Scanner user = new Scanner(System.in);

    public Veiculo(String placa, String modelo, int anoFabricacao, double km) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.km = km;
    }

    public void exibirDetalhes(){
        Formatar.verde("Dados do Veiculo");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano Fabricacao: " + anoFabricacao);
        System.out.printf("Quilometragem: %,.0f km\n\n", km);
    }

    public void registrarViagem(double km){
        System.out.printf("Registrando viagem de %,.0f km...\n", km);
        this.km += km;

        Formatar.timeOut(2000);

        System.out.println("Viagem registrado com sucesso!");

        System.out.println("Deseja ver os dados atualizados? (S/N)");

        String userOption = user.nextLine();
        if (userOption.equalsIgnoreCase("s")) this.exibirDetalhes();
    }
}
