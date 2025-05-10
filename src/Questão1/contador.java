package Questão1;

    class contador {
        private int Valor;
        public contador(int Valor){
            this.Valor = Valor;
        }
        public contador(){
            Valor = 0;
        }
        public void zerar(){
            Valor = 0;
        }
        public void Incrementar(int Incremento){
            Valor = Valor + Incremento;
        }
        public void Incrementar(){
            Valor++;
        }
        public int getValor(){
            return Valor;
        }
    }

