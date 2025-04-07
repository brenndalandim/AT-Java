package Ex2;

import com.util.Formatar;
import com.util.Validar;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("----- Cadastro de Usuário -----");

        String userName = Validar.stringPreenchida(user, "Digite o nome de usuário: ", "Digite um nome de usuário válido!\n");

        String userPassword;
        do {
            System.out.print("Digite sua senha: ");
            userPassword = user.nextLine();
            if (userPassword.length() < 8) System.out.println("A senha precisa ter no mínimo 8 caracteres!\n");
            else if (!userPassword.matches(".*[A-Z].*")) System.out.println("A senha precisa ter pelo menos uma letra maiúscula!\n");
            else if (!userPassword.matches(".*[0-9].*")) System.out.println("A senha precisa ter pelo menos um número!\n");
            else if (!userPassword.matches(".*[^a-zA-Z0-9].*")) System.out.println("A senha precisa ter pelo menos um caractere especial!\n");
            else break;
        } while (true);

        Formatar.verde("Cadastro completo!", 0);
        System.out.println("Nome de usuário cadastrado: " + userName);
        System.out.println("Senha cadastrada: " + userPassword);
    }
}
