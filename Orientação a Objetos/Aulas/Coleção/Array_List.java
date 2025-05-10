/*ArrayList: é Uma lista ordenada que permite elementos duplicados.

Chave característica: Os elementos têm posição (índice).

Exemplo de uso: Lista de nomes em ordem de chamada.

Permite duplicatas? Sim

Mantém ordem de inserção? Sim 

Como acessar elementos? Pelo índice (ex: lista.get(0))
*/	

package Coleção;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {	
    	
        ArrayList<String> livros = new ArrayList<>();
        
        livros.add("O Senhor dos Anéis");
        livros.add("1984");
        livros.add("Dom Casmurro");
        livros.add("A Revolução dos Bichos");

        System.out.println("Lista de livros:");
        for (String livro : livros) {
            System.out.println("- " + livro);
        }

        String livroEscolhido = livros.get(2); 
        System.out.println("\nLivro no índice 2: " + livroEscolhido);

        livros.remove("1984");
        System.out.println("\nLista de livros após remoção de '1984':");
        for (String livro : livros) {
            System.out.println("- " + livro);
        }

        System.out.println("\nTotal de livros: " + livros.size());
    }
}
