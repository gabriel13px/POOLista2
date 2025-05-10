package TratamentoExcecao;

import java.util.Scanner;
	
	public class TratamentoExcecao {
	    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o numerador: ");
        String inputNumerador = scanner.nextLine();
        System.out.print("Digite o denominador: ");
        String inputDenominador = scanner.nextLine();

    	int[] numeros = {1, 2, 3};

        try {
        	
            //System.out.println("O quarto número é: " + numeros[3]);
      	
        	/*
        	 String texto = null;
	         System.out.println(texto.length()); 
        	*/
        	
            double numerador = Double.parseDouble(inputNumerador);
            double denominador = Double.parseDouble(inputDenominador);
            double resultado = dividir(numerador, denominador);

            System.out.println("O resultado é: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números.");
        	System.out.println("teste: " + e.getMessage());
        	
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
            
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            System.out.println("Erro: Tentativa de acessar um índice inválido do array.");

        } catch (Exception e) {
        	
            System.out.println("Erro inesperado: " + e.getMessage());
            
        }finally {
            scanner.close();
        }
        
    }

    public static double dividir(double a, double b) {
        return a / b; 
    }
		 
}