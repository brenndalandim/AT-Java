package Ex12;

import com.util.Formatar;
import com.util.Validar;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        String user1 = Validar.stringPreenchida(user, "Digite o nome do primeiro usuário: ", "Nome inválido");
        String user2 = Validar.stringPreenchida(user, "Digite o nome do segundo usuário: ", "Nome inválido");

        String[] mensagens = new String[10];

        int selecionarUsuario = 0;
        for (int i = 0; i < 10; i++) {
            mensagens[i] = Validar.stringPreenchida(user, (selecionarUsuario == 0 ? user1 : user2) + ", digite sua mensagem: ", "Mensagem inválida");
            selecionarUsuario = selecionarUsuario == 0 ? 1 : 0;
        }

        selecionarUsuario = 0;
        Formatar.verde("Histórico de Mensagens", 0);
        for (String mensagem : mensagens){
            System.out.printf(selecionarUsuario == 0 ? String.format("%s: %s ✔", user1, mensagem) : String.format("%20s: %s ✔", user2, mensagem));
            selecionarUsuario = selecionarUsuario == 0 ? 1 : 0;
            Formatar.timeOut(1000);
            System.out.printf("✔\n");
        }

        Formatar.verde("Obrigado por utilizarem o sistema! Boa sorte para vocês! 🚀", 0);
    }
}
