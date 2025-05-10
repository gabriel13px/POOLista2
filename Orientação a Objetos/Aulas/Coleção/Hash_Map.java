
/*HashMap é Um mapa de chave-valor.

Chave característica: Armazena pares (chave → valor).

Exemplo de uso: Dicionário, onde chave é uma palavra e valor é o significado.

Permite chaves duplicadas? Não 

Mantém ordem de inserção? Não

Como acessar elementos? Pela chave (ex: map.get("chave")) 
 * */

package Coleção;

import java.util.HashMap;

public class Hash_Map {

 	    public static void main(String[] args) {
	        HashMap<String, Integer> Lista = new HashMap<>();

	        Lista.put("Alice", 30);
	        Lista.put("Bob", 25);
	        Lista.put("Carlos", 35);
	        Lista.put("Diana", 28);

	        System.out.println("Idades:");
	        for (String nome : Lista.keySet()) {
	            System.out.println(nome + ": " + Lista.get(nome));
	        }

	        if (Lista.containsKey("Alice")) {
	            System.out.println("Alice está no mapa.");
	        }

	        //int idadeDeBob = idades.get("Bob");
	        System.out.println("Idade de Bob: " + Lista.get("Bob"));

	        Lista.remove("Carlos");
	        System.out.println("Após remover Carlos, idades:");
	        for (String nome : Lista.keySet()) {
	            System.out.println(nome + ": " + Lista.get(nome));
	        }
	  }
}