package Questão5;
import java.util.ArrayList;
import java.util.List;
public class Pais {
    private String CodigoIso, NomePais;
    private int População;
    private double Dimensão;
    private List<Pais> Fronteiras;

    public Pais(String CodigoIso, String NomePais, double Dimensão){
        this.CodigoIso = CodigoIso;
        this.NomePais = NomePais;
        this.Dimensão =Dimensão;
        this.Fronteiras = new ArrayList<>();
        this.População = 0;
    }

    public String getCodigoIso() {
        return CodigoIso;
    }
    public void setCodigoIso(String CodigoIso) {this.CodigoIso = CodigoIso;}

    public String getNomePais() { return NomePais; }
    public void setNomePais(String NomePais) { this.NomePais = NomePais;}

    public int getPopulação(){
        return População;
    }
    public void setPopulação(int População){
        this.População = População;
    }
    public double getDimensao(){
        return Dimensão;
    }
    public void setDimensao(double Dimensao){
        this.Dimensão = Dimensao;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null||this.getClass() != obj.getClass()){
            return false;
        }
        Pais pais = (Pais) obj;
        return CodigoIso.equals(pais.CodigoIso);
    }
    public double DensidadePopulacional(){
        if (Dimensão == 0){
            return 0;
        }
        return População/Dimensão;
    }
    public void AdicionarFronteira(Pais pais) {
        if (!Fronteiras.contains(pais)) {
            Fronteiras.add(pais);
        }
    }
    public List<Pais> getFronteiras() {return Fronteiras;}
}
