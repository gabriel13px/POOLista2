/* HashSet é Um conjunto que não permite elementos duplicados.

Chave característica: Não garante ordem e elimina repetições.

Exemplo de uso: Conjunto de CPF únicos.

Permite duplicatas? Não

Mantém ordem de inserção? Não (a ordem é imprevisível)

Como acessar elementos? Precisa iterar (não tem índice) 

*/
package Coleção;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {

		HashSet<String> nomes = new HashSet<>();
	
	    nomes.add("Maria");
	    nomes.add("João");
	    nomes.add("Ana");
	    nomes.add("Maria"); 
	
	    System.out.println("Nomes no conjunto:");
	    for (String nome : nomes) {
	        System.out.println(nome);
	    }
	}
}
