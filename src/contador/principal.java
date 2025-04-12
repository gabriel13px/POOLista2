package contador;
import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("valor inicial contador 1: ");
        contador Contador1 = new contador(Teclado.nextInt());
        System.out.println("contador 1 = "+ Contador1.getValor());
        contador Contador2 = new contador();
        System.out.println("contador 2 = "+ Contador2.getValor());
        Contador1.zerar();
        System.out.println("contador 1 = "+ Contador1.getValor());
        Contador1.Incrementar();
        System.out.println("contador 1 = "+ Contador1.getValor());
        Contador1.Incrementar(10);
        System.out.println("contador 1 = "+ Contador1.getValor());
    }
}
