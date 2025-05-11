package Questão1;
import java.util.Scanner;
import java.util.InputMismatchException;
public class principal {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        try {
            System.out.print("digite o valor inicial do contador 1 ");
            int valorInicial = Teclado.nextInt();

            contador Contador1 = new contador(valorInicial);
            System.out.println("contador 1 igual a " + Contador1.getValor());

            contador Contador2 = new contador();
            System.out.println("contador 2 igual a " + Contador2.getValor());

            Contador1.zerar();
            System.out.println("contador 1 zerado igual a " + Contador1.getValor());

            Contador1.Incrementar();
            System.out.println("contador 1 depois de incrementar 1 igual a " + Contador1.getValor());

            System.out.print("digite um valor para incrementar o contador 1 ");
            int incremento = Teclado.nextInt();
            Contador1.Incrementar(incremento);
            System.out.println("contador 1 depois de incrementar " + incremento + " igual a " + Contador1.getValor());

        } catch (InputMismatchException e) {
            System.out.println("erro voce deve digitar um numero inteiro");
        } catch (Exception e) {
            System.out.println("ocorreu um erro inesperado " + e.getMessage());
        }
    }
}
