package Questão7;
import java.util.HashSet;

public class ConjuntoString {
    private HashSet<String> Lista;
    public ConjuntoString() {
        this.Lista = new HashSet<>();
    }
    public ConjuntoString(HashSet<String> Lista) {
        this.Lista = Lista;
    }

    public void AdicionarElemento(String Elemento){
        this.Lista.add(Elemento);
    }
    public boolean VerificarElemento(String Elemento){
        return this.Lista.contains(Elemento);
    }

    public ConjuntoString ConjuntoUniao(ConjuntoString Lista){
        HashSet<String> ListaUniao = new HashSet<>(this.Lista);
        ListaUniao.addAll(Lista.getLista());
        return new ConjuntoString(ListaUniao);
    }
    public ConjuntoString ConjuntoIntersseçao(ConjuntoString outro){
        HashSet<String> ListaInter = new HashSet<>();
        for(String Elemento : this.Lista){
            for(String ElementoExterno : outro.getLista()){
                if(Elemento.equals(ElementoExterno)){
                    ListaInter.add(ElementoExterno);
                }
            }
        }
        return new ConjuntoString(ListaInter);
    }
    public ConjuntoString ConjuntoSubtraçao(ConjuntoString Lista){
        ConjuntoString ConjuntoUniao = this.ConjuntoUniao(Lista);
        ConjuntoString ConjuntoInterssao = this.ConjuntoIntersseçao(Lista);
        ConjuntoUniao.Lista.removeAll(ConjuntoInterssao.getLista());
        return new ConjuntoString(ConjuntoUniao.getLista());
    }

    public HashSet<String> getLista(){
        return this.Lista;
    }

}
