package Questão4;

import Questão2.Pcartesiano;
import java.util.Scanner;
import java.util.InputMismatchException;
public class PrincipalCirculo {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        try {
            System.out.print("digite o raio do circulo ");
            double raio = Teclado.nextDouble();

            System.out.print("digite o x do centro do circulo ");
            double x = Teclado.nextDouble();

            System.out.print("digite o y do centro do circulo ");
            double y = Teclado.nextDouble();

            Pcartesiano centro = new Pcartesiano(x, y);
            CirculoCartesiano circulo = new CirculoCartesiano(raio, centro);

            System.out.println("area do circulo igual a " + circulo.AreaCirculo());

            System.out.print("digite um valor para inflar o circulo ");
            double inflar = Teclado.nextDouble();
            circulo.inflar(inflar);
            System.out.println("raio apos inflar igual a " + circulo.GetRaio());
        } catch (InputMismatchException e) {
            System.out.println("erro voce deve digitar numeros reais");
        } catch (Exception e) {
            System.out.println("erro " + e.getMessage());
        }
    }
}
