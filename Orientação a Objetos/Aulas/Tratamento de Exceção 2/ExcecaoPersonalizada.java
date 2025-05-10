package TratamentoExcecao2;

public class ExcecaoPersonalizada {

	public static int calcularDobro(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("Não é permitido número negativo!");
        }
        return numero * 2;
    }

    public static void main(String[] args) {
        try {
            int resultado = calcularDobro(5);
            System.out.println("Resultado: " + resultado);
        } catch (NumeroNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
