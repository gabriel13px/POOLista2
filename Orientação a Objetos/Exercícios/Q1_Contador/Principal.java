package Q1_Contadora;

import java.util.Scanner;

public class Principal {

	private static Scanner Teclado;

	public static void main(String[] args) {

		Teclado = new Scanner(System.in);
		
		Contador X = new Contador();
		Contador Y = new Contador();

		
		X.Valor = 10;
		
		System.out.println(X.Valor);
		
		
		System.out.println("Valor: ");
		
		X.Valor = Teclado.nextInt();
		System.out.println(X.Valor);

		
		Y.setValor(10);
		Y.Incrementar();
		
		X.Zerar();
		System.out.println(X.Valor);

		System.out.println(Y.getValor());
		
	}

}
