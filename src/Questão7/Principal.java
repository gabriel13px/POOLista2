package Questão7;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        try {
            ConjuntoString conjunto1 = new ConjuntoString();
            ConjuntoString conjunto2 = new ConjuntoString();
            System.out.print("Quantos elementos deseja adicionar ao primeiro conjunto? ");
            int NumeroConjunto1 = Teclado.nextInt();
            Teclado.nextLine();
            for (int valorAtual = 0; valorAtual < NumeroConjunto1; valorAtual++) {
                System.out.print("Digite o elemento " + (valorAtual +1) + " para o primeiro conjunto: ");
                String elemento = Teclado.nextLine();
                conjunto1.AdicionarElemento(elemento);
            }

            System.out.print("Quantos elementos deseja adicionar ao segundo conjunto? ");
            int NumeroConjunto2 = Teclado.nextInt();
            Teclado.nextLine();
            for (int valorAtual = 0; valorAtual < NumeroConjunto2; valorAtual++) {
                System.out.print("Digite o elemento " + (valorAtual +1) + " para o segundo conjunto: ");
                String elemento = Teclado.nextLine();
                conjunto2.AdicionarElemento(elemento);
            }
            System.out.println("\nPrimeiro conjunto: " + conjunto1.getLista());
            System.out.println("Segundo conjunto: " + conjunto2.getLista());
            System.out.println("\nUnião dos conjuntos: " + conjunto1.ConjuntoUniao(conjunto2).getLista());
            System.out.println("Interseção dos conjuntos: " + conjunto1.ConjuntoIntersseçao(conjunto2).getLista());
            System.out.println("Subtração do segundo conjunto do primeiro: " + conjunto1.ConjuntoSubtraçao(conjunto2).getLista());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
