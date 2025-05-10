package Questão8;

public class Matriz {
    private int linha;
    private int coluna;
//    private ArrayList<ArrayList<double>> Matriz = new ArrayList<>;
    double [][] matriz;
    public Matriz(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        matriz = new double[linha][coluna];
    }
    public Matriz(Matriz matriz) {
        this.linha = matriz.linha;
        this.coluna = matriz.coluna;
        this.matriz = new double[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
               this.setMatriz(i,j,matriz.getValorMatriz(i,j));
            }
        }

    }
    public void setMatriz(int linha, int coluna, double valor) {
        matriz[linha][coluna] = valor;

    }
    public double getValorMatriz(int linha, int coluna) {
        return matriz[linha][coluna];
    }
    public Matriz AdiçaoMatriz(Matriz outro) {
        if (outro.linha == this.linha && outro.coluna == this.coluna) {
            Matriz resultado = new Matriz(linha, coluna);
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    double soma = this.getValorMatriz(i, j) + outro.getValorMatriz(i, j);
                    resultado.setMatriz(i, j, soma);
                }
            }
            return resultado;
        }
        return null; // Caso as dimensões não batam
    }
    public Matriz SubtrairMatriz(Matriz outro) {
        if (outro.linha == this.linha && outro.coluna == this.coluna) {
            Matriz resultado = new Matriz(linha, coluna);
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    resultado.setMatriz(i, j, this.getValorMatriz(i, j) - outro.getValorMatriz(i, j));
                }
            }
            return resultado;
        }
        return null;
    }

    public Matriz MultiplicarMatriz(Matriz outro) {
        if (this.coluna == outro.linha) {
            Matriz resultado = new Matriz(this.linha, outro.coluna);
            for (int i = 0; i < this.linha; i++) {
                for (int j = 0; j < outro.coluna; j++) {
                    double soma = 0;
                    for (int k = 0; k < this.coluna; k++) {
                        soma += this.matriz[i][k] * outro.matriz[k][j];
                    }
                    resultado.setMatriz(i, j, soma);
                }
            }
            return resultado;
        }
        return null;
    }

    public boolean CompararSemantica(Matriz outro) {
        if (this.linha != outro.linha || this.coluna != outro.coluna) return false;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (this.matriz[i][j] != outro.matriz[i][j]) return false;
            }
        }
        return true;
    }

    public Matriz Transposta() {
        Matriz transposta = new Matriz(coluna, linha);
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                transposta.setMatriz(j, i, matriz[i][j]);
            }
        }
        return transposta;
    }

    public Matriz Oposta() {
        Matriz oposta = new Matriz(linha, coluna);
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                oposta.setMatriz(i, j, -matriz[i][j]);
            }
        }
        return oposta;
    }

    public static Matriz Nula(int linha, int coluna) {
        return new Matriz(linha, coluna); // inicializa com zeros
    }

    public boolean isIdentidade() {
        if (linha != coluna) return false;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i == j && matriz[i][j] != 1) return false;
                if (i != j && matriz[i][j] != 0) return false;
            }
        }
        return true;
    }

    public boolean isDiagonal() {
        if (linha != coluna) return false;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i != j && matriz[i][j] != 0) return false;
            }
        }
        return true;
    }

    public boolean isSingular() {
        if (!isDiagonal()) return false;
        double valor = matriz[0][0];
        for (int i = 1; i < linha; i++) {
            if (matriz[i][i] != valor) return false;
        }
        return true;
    }

    public boolean isSimetrica() {
        if (linha != coluna) return false;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] != matriz[j][i]) return false;
            }
        }
        return true;
    }

    public boolean isAntiSimetrica() {
        if (linha != coluna) return false;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] != -matriz[j][i]) return false;
            }
        }
        return true;
    }

    public void imprimirMatriz() {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%f", matriz[i][j]);
            }
            System.out.println();
        }
    }


}
