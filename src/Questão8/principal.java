package Questão8;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número de linhas das matrizes: ");
            int numeroDeLinhas = scanner.nextInt();
            System.out.print("Digite o número de colunas das matrizes: ");
            int numeroDeColunas = scanner.nextInt();

            Matriz matriz1 = new Matriz(numeroDeLinhas, numeroDeColunas);
            Matriz matriz2 = new Matriz(numeroDeLinhas, numeroDeColunas);

            System.out.println("Preencha a primeira matriz:");
            for (int i = 0; i < numeroDeLinhas; i++) {
                for (int j = 0; j < numeroDeColunas; j++) {
                    matriz1.setMatriz(i, j, scanner.nextDouble());
                }
            }

            System.out.println("Preencha a segunda matriz:");
            for (int i = 0; i < numeroDeLinhas; i++) {
                for (int j = 0; j < numeroDeColunas; j++) {
                    matriz2.setMatriz(i, j, scanner.nextDouble());
                }
            }

            System.out.println("\nMatriz 1:");
            matriz1.imprimirMatriz();
            System.out.println("\nMatriz 2:");
            matriz2.imprimirMatriz();

            Matriz resultadoAdicao = matriz1.AdicaoMatriz(matriz2);
            if (resultadoAdicao != null) {
                System.out.println("\nResultado da Adição:");
                resultadoAdicao.imprimirMatriz();
            }

            Matriz resultadoSubtracao = matriz1.SubtrairMatriz(matriz2);
            if (resultadoSubtracao != null) {
                System.out.println("\nResultado da Subtração:");
                resultadoSubtracao.imprimirMatriz();
            }

            Matriz resultadoMultiplicacao = matriz1.MultiplicarMatriz(matriz2);
            if (resultadoMultiplicacao != null) {
                System.out.println("\nResultado da Multiplicação:");
                resultadoMultiplicacao.imprimirMatriz();
            }

            System.out.println("\nMatriz 1 é identidade? " + matriz1.EIdentidade());
            System.out.println("Matriz 1 é diagonal? " + matriz1.EDiagonal());
            System.out.println("Matriz 1 é simétrica? " + matriz1.ESimetrica());
            System.out.println("Matriz 1 é anti-simétrica? " + matriz1.EAntiSimetrica());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Tipo de dado inválido inserido");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites,");
        }  catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
