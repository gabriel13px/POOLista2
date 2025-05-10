package Questao_4;

public class Circulo {
	private double raio;
    private Ponto centro;

    public Circulo(double raio, Ponto centro) {
        this.raio = raio;
        this.centro = centro;
    }

    public Circulo(double raio) {
        this.raio = raio;
        this.centro = new Ponto(0, 0);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void inflar(double valor) {
        if (valor > 0) {
            this.raio += valor;
        }
    }

    public void desinflar(double valor) {
        if (valor > 0 && this.raio - valor > 0) {
            this.raio -= valor;
        }
    }

    public double area() {
        return Math.PI * raio * raio;
    }

   @Override
    public String toString() {
        return "Círculo [raio=" + raio + ", centro=(" + centro.getX() + ", " + centro.getY() + ")]";
    }
}

