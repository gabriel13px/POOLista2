package Questão2_3_4;

public class PrincipalCirculo {
    public static void main(String[] args) {
        CirculoCartesiano circulo1 = new CirculoCartesiano(10);
        CirculoCartesiano circulo2 = new CirculoCartesiano(10,2,3);
        Pcartesiano p1 = new Pcartesiano(2,4);
        CirculoCartesiano circulo3 = new CirculoCartesiano(10,p1);
        System.out.println(circulo3.GetOrdenada());
        System.out.println(circulo2.GetAbscissa());
        System.out.println(circulo1.GetRaio());
        System.out.println(circulo2.AreaCirculo());

    }
}
