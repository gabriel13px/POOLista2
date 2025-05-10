package HerancaMultipla;

class ClienteFisico extends Cliente {
    private String cpf;

    public ClienteFisico(String nome, String endereco, String cpf) {
        super(nome, endereco); 
        this.cpf = cpf;
    }

    
    @Override
    public void exibirDadosEspecificos() {
        System.out.println("CPF: " + cpf);
    }
        
}
