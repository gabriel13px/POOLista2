    package HerancaMultipla;

abstract class Cliente implements Pessoa {
    protected String nome;
    protected String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public Cliente(String nome) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public abstract void exibirDadosEspecificos();

    @Override
    public final void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        exibirDadosEspecificos();
    }
    
    
}
