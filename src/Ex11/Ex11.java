package Ex11;

import com.util.Formatar;
import com.util.Validar;

import java.util.*;

public class Ex11 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Random rand = new Random();

        List<Integer> sorteados = new ArrayList<>();
        List<Integer> numUser = new ArrayList<>();

        //gerador dos números
        int num;

        for (int i = 0; i < 6; i++) {
            do {
                num = rand.nextInt(60) + 1;
            } while (sorteados.contains(num));

            sorteados.add(num);
        }

        //input do usuário e contagem de acertos
        int acertos = 0;
        int userInput;

        for (int i = 0; i < 6; i++){
            do {
                userInput = Validar.IntPositivo(user, "Digite um número: ", "Número inválido");
                if (userInput < 1 || userInput > 60) System.out.println("Insira somente números entre 1 e 60!");
            } while (numUser.contains(userInput) || (userInput < 1 || userInput > 60));

            if (sorteados.contains(userInput)) acertos++;

            numUser.add(userInput);
        }

        //colocar em ordem crescente
        Collections.sort(sorteados);
        Collections.sort(numUser);

        Formatar.verde("Resultado Final", 0);
        System.out.println("Números Gerados: " + sorteados);
        System.out.println("Seus números: " + numUser);

        if (acertos == 0) System.out.println("Você não acertou nenhum número");
        else if (acertos == 1) System.out.println("Você acertou 1 número!");
        else System.out.println("Você acertou " + acertos + " números!");
    }
}
