package Questão8;
public class Matriz {
    private int Linhas;
    private int Colunas;
    double [][] matriz;

    public Matriz(int numeroDeLinhas, int numeroDeColunas) {
        this.Linhas = numeroDeLinhas;
        this.Colunas = numeroDeColunas;
        matriz = new double[numeroDeLinhas][numeroDeColunas];
    }

    public Matriz(Matriz matriz) {
        this.Linhas = matriz.Linhas;
        this.Colunas = matriz.Colunas;
        this.matriz = new double[Linhas][Colunas];
        for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
            for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                this.setMatriz(linhaAtual, colunaAtual, matriz.getValorMatriz(linhaAtual, colunaAtual));
            }
        }
    }

    public void setMatriz(int linhaAtual, int colunaAtual, double valor) {
        matriz[linhaAtual][colunaAtual] = valor;
    }

    public double getValorMatriz(int linhaAtual, int colunaAtual) {
        return matriz[linhaAtual][colunaAtual];
    }

    public Matriz AdicaoMatriz(Matriz outraMatriz) {
        if (outraMatriz.Linhas == this.Linhas && outraMatriz.Colunas == this.Colunas) {
            Matriz resultado = new Matriz(Linhas, Colunas);
            for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
                for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                    double soma = this.getValorMatriz(linhaAtual, colunaAtual) + outraMatriz.getValorMatriz(linhaAtual, colunaAtual);
                    resultado.setMatriz(linhaAtual, colunaAtual, soma);
                }
            }
            return resultado;
        }
        return null;
    }

    public Matriz SubtrairMatriz(Matriz outraMatriz) {
        if (outraMatriz.Linhas == this.Linhas && outraMatriz.Colunas == this.Colunas) {
            Matriz resultado = new Matriz(Linhas, Colunas);
            for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
                for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                    resultado.setMatriz(linhaAtual, colunaAtual, this.getValorMatriz(linhaAtual, colunaAtual) - outraMatriz.getValorMatriz(linhaAtual, colunaAtual));
                }
            }
            return resultado;
        }
        return null;
    }

    public Matriz MultiplicarMatriz(Matriz outraMatriz) {
        if (this.Colunas == outraMatriz.Linhas) {
            Matriz resultado = new Matriz(this.Linhas, outraMatriz.Colunas);
            for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
                for (int colunaAtual = 0; colunaAtual < outraMatriz.Colunas; colunaAtual++) {
                    double soma = 0;
                    for (int k = 0; k < this.Colunas; k++) {
                        soma += this.matriz[linhaAtual][k] * outraMatriz.matriz[k][colunaAtual];
                    }
                    resultado.setMatriz(linhaAtual, colunaAtual, soma);
                }
            }
            return resultado;
        }
        return null;
    }

    public boolean CompararSemantica(Matriz outraMatriz) {
        if (this.Linhas != outraMatriz.Linhas || this.Colunas != outraMatriz.Colunas) return false;
        for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
            for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                if (this.matriz[linhaAtual][colunaAtual] != outraMatriz.matriz[linhaAtual][colunaAtual]) return false;
            }
        }
        return true;
    }

    public Matriz Transposta() {
        Matriz transposta = new Matriz(Colunas, Linhas);
        for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
            for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                transposta.setMatriz(colunaAtual, linhaAtual, matriz[linhaAtual][colunaAtual]);
            }
        }
        return transposta;
    }

    public Matriz Oposta() {
        Matriz oposta = new Matriz(Linhas, Colunas);
        for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
            for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                oposta.setMatriz(linhaAtual, colunaAtual, -matriz[linhaAtual][colunaAtual]);
            }
        }
        return oposta;
    }

    public static Matriz Nula(int numeroDeLinhas, int numeroDeColunas) {
        return new Matriz(numeroDeLinhas, numeroDeColunas); // inicializa com zeros
    }

    public boolean EIdentidade() {
        if (Linhas != Colunas) return false;
        for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
            for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                if (linhaAtual == colunaAtual && matriz[linhaAtual][colunaAtual] != 1) return false;
                if (linhaAtual != colunaAtual && matriz[linhaAtual][colunaAtual] != 0) return false;
            }
        }
        return true;
    }

    public boolean EDiagonal() {
        if (Linhas != Colunas) return false;
        for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
            for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                if (linhaAtual != colunaAtual && matriz[linhaAtual][colunaAtual] != 0) return false;
            }
        }
        return true;
    }

    public boolean ESingular() {
        if (!EDiagonal()) return false;
        double valor = matriz[0][0];
        for (int linhaAtual = 1; linhaAtual < this.Linhas; linhaAtual++) {
            if (matriz[linhaAtual][linhaAtual] != valor) return false;
        }
        return true;
    }

    public boolean ESimetrica() {
        if (Linhas != Colunas) return false;
        for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
            for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                if (matriz[linhaAtual][colunaAtual] != matriz[colunaAtual][linhaAtual]) return false;
            }
        }
        return true;
    }

    public boolean EAntiSimetrica() {
        if (Linhas != Colunas) return false;
        for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
            for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                if (matriz[linhaAtual][colunaAtual] != -matriz[colunaAtual][linhaAtual]) return false;
            }
        }
        return true;
    }

    public void imprimirMatriz() {
        for (int linhaAtual = 0; linhaAtual < this.Linhas; linhaAtual++) {
            for (int colunaAtual = 0; colunaAtual < this.Colunas; colunaAtual++) {
                System.out.printf("%f ", matriz[linhaAtual][colunaAtual]);
            }
            System.out.println();
        }
    }
}