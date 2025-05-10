package HerancaMultipla;

public class SistemaClientes {
    public static void main(String[] args) {
        ClienteFisico clienteFisico = new ClienteFisico("João Silva", "Rua A, 123", "123.456.789-00");
        ClienteFisico clienteFisico2 = new ClienteFisico("teste", "teste, 123", "000.456.789-00");

        ClienteJuridico clienteJuridico = new ClienteJuridico("Empresa X", "Avenida B, 456", "12.345.678/0001-99", "Empresa X LTDA");
        
        System.out.println("Dados do Cliente Fisico:");
        clienteFisico.exibirDados();
        
        
        clienteFisico2.exibirDados();
        
        //System.out.println("\nDados do Cliente Juridico:");
        //clienteJuridico.exibirDados();
    }
}