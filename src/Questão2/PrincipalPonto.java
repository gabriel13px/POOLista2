package Questão2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class PrincipalPonto {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        try {
            System.out.print("digite o valor de x do ponto 1 ");
            double x1 = Teclado.nextDouble();
            System.out.print("digite o valor de y do ponto 1 ");
            double y1 = Teclado.nextDouble();
            Pcartesiano ponto1 = new Pcartesiano(x1, y1);
            System.out.print("digite o valor de x do ponto 2 ");
            double x2 = Teclado.nextDouble();
            System.out.print("digite o valor de y do ponto 2 ");
            double y2 = Teclado.nextDouble();
            Pcartesiano ponto2 = new Pcartesiano(x2, y2);
            System.out.println("distancia entre os pontos igual a " + ponto1.DistanciaPontos(ponto2));
            if (ponto1.equals(ponto2)) {
                System.out.println("os pontos sao iguais");
            } else {
                System.out.println("os pontos sao diferentes");
            }

        } catch (InputMismatchException e) {
            System.out.println("erro voce deve digitar numeros reais");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
