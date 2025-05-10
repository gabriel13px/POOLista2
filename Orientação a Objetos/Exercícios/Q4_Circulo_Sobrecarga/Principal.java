package Questao_4;

public class Principal {

	public static void main(String[] args) {
      
		Ponto PontoCentro = new Ponto(1, 2);
        
        Circulo Circulo_1 = new Circulo(5, PontoCentro);

        System.out.println(Circulo_1);
        System.out.println("Área: " + Circulo_1.area());

        Circulo_1.inflar(2);
        System.out.println("Após inflar: " + Circulo_1 + " Área: " + Circulo_1.area());
        System.out.println();

        Circulo_1.desinflar(3);
        System.out.println("Após Desinflar: " + Circulo_1 + " Área: " + Circulo_1.area());
		
		
	}

}
