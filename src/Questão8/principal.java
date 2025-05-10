package Questão8;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Matriz p = new Matriz(2,2);

        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                p.setMatriz(i,j,entrada.nextInt());
            }
        }
        Matriz p2 = new Matriz(p);
        p.imprimirMatriz();
        Matriz p3 = new Matriz(p2.AdiçaoMatriz(p));
        p3.imprimirMatriz();
        p2.imprimirMatriz();


    }
}
