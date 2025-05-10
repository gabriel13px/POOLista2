package Questão2_3_4;

public class CirculoCartesiano {
    private double CentroAbscissa,CentroOrdenada,Raio;
    public CirculoCartesiano(double raio, Pcartesiano Centro) {
        this.Raio = raio;
        CentroAbscissa = Centro.GetAbscissa();
        CentroOrdenada = Centro.GetOrdenada();
    }
    public CirculoCartesiano(double raio,double CentroAbscissa,double CentroOrdenada ) {
        this.Raio = raio;
        this.CentroAbscissa = CentroAbscissa;
        this.CentroOrdenada = CentroOrdenada;
    }
    public CirculoCartesiano(double raio) {
        this.Raio = raio;
        CentroAbscissa = 0;
        CentroOrdenada = 0;
    }
    public double GetAbscissa() {
        return CentroAbscissa;
    }
    public double GetOrdenada() {
        return CentroOrdenada;
    }
    public double GetRaio() {
        return Raio;
    }
    public void inflar(double mudanca){
        if(mudanca > 0){
            Raio+=mudanca;
        }
    }
    public void desinflar(double mudanca){
        if(mudanca < 0){
            Raio-=mudanca;
        }
    }
    public double AreaCirculo(){
        return Math.PI*Math.pow(Raio,2);
    }
}
