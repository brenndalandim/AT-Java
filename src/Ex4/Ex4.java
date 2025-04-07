package Ex4;

import com.util.*;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("----- Simulador de Empréstimos -----");

        String userName = Validar.stringPreenchida(user, "Digite seu nome: ", "Digite um nome válido!\n");

        double userEmprestimo = Validar.DoublePositivo(user , "Digite o valor do empréstimo: ", "Salário inválido!\n");

        //loop para validar as parcelas
        int userParcelas;
        do {
            System.out.print("Em quantas parcelas (de 6 a 48): ");

            userParcelas = user.hasNextInt() ? user.nextInt() : -1;

            if (userParcelas < 6 || userParcelas > 48) {
                System.out.println("Precisa ser no mínimo 6 e no máximo 48 parcelas!\n");
                user.nextLine();
            }
            else break;
        } while (true);

        double totalEmprestimo = userEmprestimo + (userParcelas * (userEmprestimo * 0.03));

        Formatar.verde("Cálculo de Empréstimo Completo!", 0);
        System.out.println("Cliente: " + userName);
        System.out.printf("Empréstimo Desejado: R$ %,.2f \n", userEmprestimo);
        System.out.printf("Valor Total: R$ %,.2f \n", totalEmprestimo);
        System.out.printf("%d Parcelas de: R$ %,.2f \n", userParcelas, totalEmprestimo/userParcelas);
    }
}
