package Questão6;

public class Pessoa {
    private Pessoa Pai, Mae;
    private String Nome;

    public Pessoa(String Nome, Pessoa Pai, Pessoa Mae) {
        this.Pai = Pai;
        this.Mae = Mae;
        this.Nome = Nome;
    }

    public Pessoa(String Nome) {
        this.Nome = Nome;
        Pai = null;
        Mae = null;
    }

    public boolean Equals(Object Object) {
        if (this == Object) {
            return true;
        }
        if (Object == null || this.getClass() != Object.getClass()) {
            return false;
        }
        Pessoa pessoa = (Pessoa) Object;
        if (this.Mae == null && pessoa.Mae == null) {
            return true;
        }
        if (this.Mae != null && pessoa.Mae != null) {
            return this.Mae.Nome.equals(pessoa.Mae.Nome);
        }
        return false;
    }
}
