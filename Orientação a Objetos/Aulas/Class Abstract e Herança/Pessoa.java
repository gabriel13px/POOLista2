package Heranca;

public class Pessoa {
	
	private String Nome;
	private int Idade;
	
	public Pessoa(String Nome, int Idade) {
		this.setNome(Nome);
		this.setIdade(Idade);
		this.Imprimir();
	}
		
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int Idade) {
		this.Idade = Idade;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
    public void Imprimir(){
        System.out.println("Nome: " + this.Nome + "\nIdade: " + this.Idade);
      
    }
}
	