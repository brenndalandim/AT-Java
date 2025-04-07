package Ex10;

import com.util.Formatar;
import com.util.Validar;

import java.io.*;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String arquivo = "compras.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));

            for (int i = 0; i < 3; i++) {
                System.out.println("Registrando Compra #" + (i + 1));

                String produto = Validar.stringPreenchida(user, "Produto: ", "Nome inválido\n");
                int qtd = Validar.IntPositivo(user, "Quantidade: ", "Quantidade inválida\n");
                double preco = Validar.DoublePositivo(user, "Preço: ", "Preço inválido\n");

                System.out.println();

                writer.write("Produto: " + produto + "\t\t" + "Quantidade: " + qtd + "\t\t" + "Preço: R$ " + String.format("%,.2f", preco) + "\n");
            }

            writer.close();
            System.out.printf("Compras registradas com sucesso em %s!\n", arquivo);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));

            Formatar.verde("Compras Cadastradas", 0);

            for (int i = 0; i < 3; i++) {
                String linha = reader.readLine();
                System.out.println(linha);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
