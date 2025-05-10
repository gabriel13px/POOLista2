package Questão5;

public class Principal {
    public static void main(String[] args) {
        Pais Brasil = new Pais("3166-1","Brasil", 32);
        Pais Brasil2 = new Pais("3166-1","Brasi", 32);
        Brasil.AdicionarFronteira(Brasil2);
        System.out.println(Brasil.equals(Brasil2));
    }
}
