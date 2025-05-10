package Questão_5;

public class Principal {

	public class Main {
	    public static void main(String[] args) {
	        Pais Brasil = new Pais("BRA", "Brasil", 8515767.049);
	        Brasil.setPopulacao(193946886);

	        Pais Argentina = new Pais("ARG", "Argentina", 2780400);
	        Brasil.AdicionarFronteira(Argentina);

	        System.out.println(Brasil);
	        System.out.println("Densidade populacional: " + Brasil.DensidadePopulacional() + " hab/km²");
	    }
	}

}
