package comportamentais.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe de demonstração. Tudo se junta aqui.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Insira o nome de usuário: ");
        String userName = reader.readLine();
        System.out.print("Insira a senha: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Mensagem de entrada: ");
        String message = reader.readLine();

        System.out.println("\nEscolha a rede social para postar a mensagem.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Crie o objeto de rede adequado e envie a mensagem.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
