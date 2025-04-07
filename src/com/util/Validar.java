package com.util;

import java.util.Scanner;

public class Validar {

    public static String stringPreenchida(Scanner userInput, String pergunta, String msgNegativo){
        String resultado;
        do {
            System.out.print(pergunta);
            resultado = userInput.nextLine();

            if (resultado.isEmpty()) System.out.println(msgNegativo);
            else break;

        } while (true);

        return resultado;
    }

    public static int IntPositivo(Scanner userInput, String pergunta, String msgNegativo) {
        int resultado;
        do {
            System.out.print(pergunta);

            resultado = userInput.hasNextInt() ? userInput.nextInt() : -1;

            if (resultado < 0 ) {
                System.out.println(msgNegativo);
                userInput.nextLine();
            }
            else break;

        } while (true);

        userInput.nextLine();
        return resultado;
    }

    public static double DoublePositivo(Scanner userInput, String pergunta, String msgNegativo) {
        double resultado;
        do {
            System.out.print(pergunta);

            resultado = userInput.hasNextDouble() ? userInput.nextDouble() : -1;

            if (resultado < 0) {
                System.out.println(msgNegativo);
                userInput.nextLine();
            }
            else break;

        } while (true);

        userInput.nextLine();
        return resultado;
    }

}
