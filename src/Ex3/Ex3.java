package Ex3;

import java.util.Scanner;
import com.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("----- Calculadora de Impostos -----");

        String userName = Validar.stringPreenchida(user, "Digite seu nome: ", "Digite um nome válido!\n");

        double userSalario = Validar.DoublePositivo(user, "Digite seu salário: ", "Salário inválido!\n");

        double userImposto;

        if (userSalario < 22847.77) {
            userImposto = 0;
        } else if (userSalario < 33919.81) {
            userImposto = 7.5;
        } else if (userSalario < 45012.61) {
            userImposto = 15;
        } else {
            userImposto = 27.5;
        }

        Formatar.verde("Cálculo de Imposto Completo!", 0);
        System.out.println("Dados de: " + userName);
        System.out.printf("Salário Mensal: R$ %,.2f \n", userSalario);
        System.out.printf("Imposto de %.1f%%: R$ %,.2f \n", userImposto, userSalario * (userImposto / 100));
        System.out.printf("Salário Líquido: R$ %,.2f \n", userSalario - userSalario * (userImposto / 100));
    }
}
