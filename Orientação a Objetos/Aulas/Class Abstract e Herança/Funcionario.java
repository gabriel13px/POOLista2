package Heranca;

public class Funcionario extends Pessoa {

    private double Salario;

    public Funcionario(String Nome, int Idade, double Salario) {
        super(Nome, Idade); // Construtor da Super Classe (Classe PAI)
        this.setSalario(Salario);
        Imprimir();
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    public void Imprimir(){
        //super.Imprimir();
        System.out.println("Salario: " + this.Salario);
    }
}
