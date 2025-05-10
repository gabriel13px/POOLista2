package Heranca;

public class Cliente extends Pessoa{
	
	private float CarteiraDigital;

	Cliente(String Nome, int Idade, float CarteiraDigital){
		 (Nome, Idade);
		this.CarteiraDigital = CarteiraDigital;
		this.Imprimir();
	}
	
	public float getCarteiraDigital() {
		return CarteiraDigital;
	}

	public void setCarteiraDigital(float CarteiraDigital) {
		this.CarteiraDigital = CarteiraDigital;
	}
	
	public void Imprimir(){
        super.Imprimir();
        System.out.println("CarteiraDigital: " + this.CarteiraDigital);
    }
}
