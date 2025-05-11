package Questão3;

import Questão2.Pcartesiano;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PrincipalReta {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        try {
            System.out.print("digite o x do ponto 1 da reta 1 ");
            double x1 = Teclado.nextDouble();
            System.out.print("digite o y do ponto 1 da reta 1 ");
            double y1 = Teclado.nextDouble();
            System.out.print("digite o x do ponto 2 da reta 1 ");
            double x2 = Teclado.nextDouble();
            System.out.print("digite o y do ponto 2 da reta 1 ");
            double y2 = Teclado.nextDouble();
            Pcartesiano ponto1 = new Pcartesiano(x1, y1);
            Pcartesiano ponto2 = new Pcartesiano(x2, y2);
            RetaCartesiana reta1 = new RetaCartesiana(ponto1, ponto2);
            System.out.println("reta 1 coeficiente angular: " + reta1.GetCoeAngular() + " e coeficiente linear: " + reta1.GetCoeLinear());
            System.out.print("digite o x de um ponto para verificação ");
            double xponto = Teclado.nextDouble();
            System.out.print("digite o y do ponto ");
            double yponto = Teclado.nextDouble();

            Pcartesiano pontoTeste = new Pcartesiano(xponto, yponto);

            if (reta1.VericarPonto(pontoTeste)) {
                System.out.println("o ponto pertence a reta 1");
            } else {
                System.out.println("o ponto nao pertence a reta 1");
            }
            System.out.print("digite o coeficiente angular da reta 2 ");
            double CoeAngular = Teclado.nextDouble();
            System.out.print("digite o coeficiente linear da reta 2 ");
            double CoeLinear = Teclado.nextDouble();
            RetaCartesiana reta2 = new RetaCartesiana(CoeAngular, CoeLinear);
            Object intersecao = reta1.VerificarReta(reta2);

            if (intersecao == null) {
                System.out.println("as retas sao paralelas");
            } else {
                Pcartesiano pontoInter = (Pcartesiano) intersecao;
                System.out.println("as retas se interceptam ponto x: " + pontoInter.GetAbscissa() + " e y: " + pontoInter.GetOrdenada());
            }

        } catch (InputMismatchException e) {
            System.out.println("erro voce deve digitar numeros reais");
        } catch (Exception e) {
            System.out.println("erro : " + e.getMessage());
        }
    }
}
