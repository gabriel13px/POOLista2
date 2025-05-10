package QuestãoPratica;

import java.util.HashMap;
import java.util.Map;
public class Resistor {
    private static final HashMap<String, Double> Faixas = new HashMap<>();
    private static final HashMap<String, Double> Multiplicadores = new HashMap<>();
    private static final HashMap<String, Double> Tolerancias = new HashMap<>();

    static {
        Faixas.put("Preto", 0.0);
        Faixas.put("Marrom", 1.0);
        Faixas.put("Vermelho", 2.0);
        Faixas.put("Laranja", 3.0);
        Faixas.put("Amarelo", 4.0);
        Faixas.put("Verde", 5.0);
        Faixas.put("Azul", 6.0);
        Faixas.put("Violeta", 7.0);
        Faixas.put("Cinza", 8.0);
        Faixas.put("Branco", 9.0);
        Multiplicadores.put("Preto", 1.0);
        Multiplicadores.put("Marrom", 10.0);
        Multiplicadores.put("Vermelho", 100.0);
        Multiplicadores.put("Laranja", 1_000.0);
        Multiplicadores.put("Amarelo", 10_000.0);
        Multiplicadores.put("Verde", 100_000.0);
        Multiplicadores.put("Azul", 1_000_000.0);
        Multiplicadores.put("Violeta", 10_000_000.0);
        Multiplicadores.put("Dourado", 0.1);
        Multiplicadores.put("Prateado", 0.01);
        Tolerancias.put("Marrom", 1.0);
        Tolerancias.put("Vermelho", 2.0);
        Tolerancias.put("Verde", 0.5);
        Tolerancias.put("Azul", 0.25);
        Tolerancias.put("Violeta", 0.1);
        Tolerancias.put("Cinza", 0.05);
        Tolerancias.put("Dourado", 5.0);
        Tolerancias.put("Prateado", 10.0);
    }

    private double ValorResistor;
    private double Tolerancia,Multiplicador;
    private double Faixa1,Faixa2;
    private int TipoResistor;

    public Resistor(String faixa1, String faixa2, String multiplicador, String tolerancia) {
         this.Faixa1 = Faixas.get(faixa1);
         this.Faixa2 = Faixas.get(faixa2);
         this.TipoResistor = 4;
        this.Multiplicador = Multiplicadores.get(multiplicador);
         this.Tolerancia = Tolerancias.get(tolerancia);

        this.ValorResistor = ((Faixa1 * 10) + Faixa2) * this.Multiplicador;
    }
    public Resistor(String faixa1, String multiplicador, String tolerancia) {
        this.Faixa1 = Faixas.get(faixa1);
        this.TipoResistor = 3;
        this.Multiplicador = Multiplicadores.get(multiplicador);
        this.Tolerancia = Tolerancias.get(tolerancia);

        this.ValorResistor = (Faixa1 * 10) * this.Multiplicador;
    }
    public Resistor(double ValorResistor, double tolerancia) {
        this.ValorResistor = ValorResistor;
        this.Tolerancia = tolerancia;
        if (tolerancia <= 0.05) {
            this.Tolerancia = 0.05;
        } else if (tolerancia <= 0.1) {
            this.Tolerancia = 0.1;
        } else if (tolerancia <= 0.25) {
            this.Tolerancia = 0.25;
        } else if (tolerancia <= 0.5) {
            this.Tolerancia = 0.5;
        } else if (tolerancia <= 1.0) {
            this.Tolerancia = 1.0;
        } else if (tolerancia <= 2.0) {
            this.Tolerancia = 2.0;
        } else if (tolerancia <= 5.0) {
            this.Tolerancia = 5.0;
        } else {
            this.Tolerancia = 10.0;
        }
        descobrirFaixas(ValorResistor);
        this.TipoResistor = 4;
    }

    public double getTolerancia() {
        return Tolerancia;
    }
    public double getValorResistor() {
        return ValorResistor;
    }
    private void descobrirFaixas(double valor) {
        // Formatar o valor em notação científica
        String valorFormatado = String.format("%.10e", valor);

        // Substituir a vírgula por ponto, caso haja
        valorFormatado = valorFormatado.replace(',', '.');

        String[] partes = valorFormatado.split("e");
        double mantissa = Double.parseDouble(partes[0]);
        int expoente = Integer.parseInt(partes[1]);

        // Calcular as faixas a partir da mantissa
        int valorSignificativo = (int) (mantissa * 10);
        this.Faixa1 = (double) valorSignificativo / 10.0;
        this.Faixa2 = (double) valorSignificativo % 10;

        // Definir o multiplicador
        this.Multiplicador = Math.pow(10, expoente - 1);
    }
    private String obterChavePeloValor(HashMap<String, Double> mapa, double valor) {
        for (Map.Entry<String, Double> entry : mapa.entrySet()) {
            if (entry.getValue() == valor) {
                return entry.getKey();  // Retorna a chave associada ao valor
            }
        }
        return null;  // Se não encontrar o valor, retorna null
    }
    @Override
    public String toString() {
        return String.format("Valor: %.2f Ω ± %.2f%%", ValorResistor, Tolerancia);
    }
    public void imprimir() {
        if (TipoResistor == 4) {
        System.out.println("Tipo de Resistor: " + TipoResistor+" faixas\nfaixa1:"+obterChavePeloValor(Faixas,Faixa1)+"\nfaixa2:"+obterChavePeloValor(Faixas,Faixa2)+"\nfaixa multiplicador:"+obterChavePeloValor(Multiplicadores,Multiplicador)+"\nfaixa tolerancia:"+obterChavePeloValor(Tolerancias,Tolerancia));
        }
    }
}
