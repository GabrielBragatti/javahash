import java.util.Scanner;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {

        Hashtable<String, String> contatos = new Hashtable<String, String>();

        Scanner enter = new Scanner(System.in);

        int x = 3;
        int y = 3;

        System.out.println("\n\nBem-vindo a lista telefonica top do Gabriel! \n");

        while (x == y) {

            System.out.println("\nDigite 1 para adicionar um contato");

            System.out.println("Digite 2 para procurar um contato");

            System.out.println("Digite 0 para sair do programa");

            int choose = enter.nextInt();

            if (choose == 1) {

                System.out.println("\nPrimeiro digite o nome da pessoa: ");

                String name = enter.next();

                System.out.println("\nAgora digite o telefone da pessoa: ");

                String number = enter.next();

                contatos.put(name, number);

                System.out.println("\nContato adicionado!");

                x++;
                y++;

            } else if (choose == 2) {

                System.out.println("\nDigite o nome do contato para a pesquisa: ");

                String search = enter.next();

                if (contatos.get(search) == null) {

                    System.out.println("\nContato não encontrado!");

                } else {

                    System.out.println("\nA pesquisa encontrou: ");

                    System.out.println("\nNome | Telefone");

                    System.out.println("\n" + search + " | " + contatos.get(search) + "\n");

                }

                x++;
                y++;

            } else if (choose == 0) {

                System.out.println("\nSaindo...");
                x++;

            } else {
                System.out.println("Escolha uma opção válida!");

                x++;
                y++;
            }
        }

    }

}
