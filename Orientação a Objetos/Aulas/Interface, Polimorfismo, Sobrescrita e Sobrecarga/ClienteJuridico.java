package HerancaMultipla;

class ClienteJuridico extends Cliente {
    private String cnpj;
    private String razaoSocial;

    public ClienteJuridico(String nome, String endereco, String cnpj, String razaoSocial) {
        super(nome, endereco); 
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirDadosEspecificos() {
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
    }
}