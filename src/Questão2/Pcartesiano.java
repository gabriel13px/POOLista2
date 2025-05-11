package Questão2;


public class Pcartesiano {
    private double Abscissa, Ordenada;
    public Pcartesiano() {
        Abscissa = 0;
        Ordenada = 0;
    }
    public Pcartesiano(double Abscissa, double Ordenada) {
        this.Abscissa = Abscissa;
        this.Ordenada = Ordenada;
    }
    public Pcartesiano(Pcartesiano ponto) {
        Abscissa = ponto.Abscissa;
        Ordenada = ponto.Ordenada;
    }
    public double GetAbscissa() {
        return Abscissa;
    }
    public double GetOrdenada() {
        return Ordenada;
    }
    public void SetAbscissa(double Abscissa) {
        this.Abscissa = Abscissa;
    }
    public void SetOrdenada(double Ordenada) {
        this.Ordenada = Ordenada;
    }
    public double DistanciaPontos(Pcartesiano Ponto2) {
        return Math.sqrt(Math.pow(this.Abscissa - Ponto2.Abscissa, 2) + Math.pow(this.Ordenada - Ponto2.Ordenada, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pcartesiano outro = (Pcartesiano) obj;
        return this.Abscissa == outro.Abscissa && this.Ordenada == outro.Ordenada;
    }
}