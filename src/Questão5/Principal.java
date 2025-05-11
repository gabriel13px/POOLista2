package Questão5;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Principal {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        try {
            // Primeiro pais
            System.out.print("digite o codigo iso do primeiro pais ");
            String iso1 = Teclado.next();
            System.out.print("digite o nome do primeiro pais ");
            String nome1 = Teclado.next();
            System.out.print("digite a dimensao do primeiro pais ");
            double dimensao1 = Teclado.nextDouble();

            Pais pais1 = new Pais(iso1, nome1, dimensao1);

            System.out.print("digite a populacao do primeiro pais ");
            int populacao1 = Teclado.nextInt();
            pais1.setPopulação(populacao1);

            // Segundo pais
            System.out.print("digite o codigo iso do segundo pais ");
            String iso2 = Teclado.next();
            System.out.print("digite o nome do segundo pais ");
            String nome2 = Teclado.next();
            System.out.print("digite a dimensao do segundo pais ");
            double dimensao2 = Teclado.nextDouble();

            Pais pais2 = new Pais(iso2, nome2, dimensao2);

            System.out.print("digite a populacao do segundo pais ");
            int populacao2 = Teclado.nextInt();
            pais2.setPopulação(populacao2);

            // Adicionando fronteiras
            pais1.AdicionarFronteira(pais2);
            pais2.AdicionarFronteira(pais1);

            System.out.println("densidade do primeiro pais igual a " + pais1.DensidadePopulacional());
            System.out.println("densidade do segundo pais igual a " + pais2.DensidadePopulacional());

            if (pais1.equals(pais2)) {
                System.out.println("os paises sao iguais");
            } else {
                System.out.println("os paises sao diferentes");
            }
        } catch (InputMismatchException e) {
            System.out.println("erro voce deve digitar os tipos corretos de dados");
        } catch (Exception e) {
            System.out.println("erro inesperado " + e.getMessage());
        }
    }
}
