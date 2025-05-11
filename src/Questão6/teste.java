package Questão6;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        try {
            System.out.print("Nome da primeira pessoa: ");
            String nome1 = Teclado.nextLine();

            System.out.print("Nome da mãe da primeira pessoa: ");
            String nomeMae1 = Teclado.nextLine();
            Pessoa mae1 = new Pessoa(nomeMae1);
            Pessoa pessoa1 = new Pessoa(nome1, null, mae1);

            System.out.print("Nome da segunda pessoa: ");
            String nome2 = Teclado.nextLine();

            System.out.print("Nome da mãe da segunda pessoa: ");
            String nomeMae2 = Teclado.nextLine();
            Pessoa mae2 = new Pessoa(nomeMae2);
            Pessoa pessoa2 = new Pessoa(nome2, null, mae2);

            if (pessoa1.Equals(pessoa2)) {
                System.out.println("Verdadeiro");
            } else {
                System.out.println("Falso");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
