package Questão7;

public class Principal {
    public static void main(String[] args) {
        ConjuntoString homens = new ConjuntoString();
        ConjuntoString mulheres = new ConjuntoString();
        homens.AdicionarElemento("jose");
        homens.AdicionarElemento("carlos");
        homens.AdicionarElemento("felipe");
        mulheres.AdicionarElemento("clara");
        mulheres.AdicionarElemento("carlos");
        mulheres.AdicionarElemento("Maia");
        System.out.println("união:");
        ConjuntoString União = homens.ConjuntoUniao(mulheres);
        for(String Elemento : União.getLista()) {
            System.out.println(Elemento);
        }
        System.out.println("intersseção:");
        ConjuntoString Inter = homens.ConjuntoIntersseçao(mulheres);
        for(String Elemento2 : Inter.getLista()) {
            System.out.println(Elemento2);
        }
        System.out.println("Subtração:");
        ConjuntoString Sub = homens.ConjuntoSubtraçao(mulheres);
        for(String Elemento : Sub.getLista()) {
            System.out.println(Elemento);
        }

    }
}
