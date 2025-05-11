package Questão3;

import Questão2.Pcartesiano;

class RetaCartesiana {
    // y = ax+b
      private double CoeLinear, CoeAngular;
     public RetaCartesiana(Pcartesiano P1, Pcartesiano P2){
         CoeAngular = (P1.GetOrdenada() - P2.GetOrdenada())/(P1.GetAbscissa()-P2.GetAbscissa());
         CoeLinear = P1.GetOrdenada() - P1.GetAbscissa()*CoeAngular;
     }
    public RetaCartesiana(double Abscissa1,double Ordenada1, double Abscissa2,double Ordenada2){
        CoeAngular = (Ordenada1 - Ordenada2)/(Abscissa1-Abscissa2);
        CoeLinear = Ordenada1 - Abscissa1*CoeAngular;
    }
     public RetaCartesiana(double CoeAngular, double CoeLinear){
         this.CoeAngular = CoeAngular;
         this.CoeLinear = CoeLinear;
     }
     public double GetCoeAngular(){
         return CoeAngular;
     }
     public double GetCoeLinear(){
         return CoeLinear;
     }
     public boolean VericarPonto(Pcartesiano Ponto){
         if(Ponto.GetOrdenada()==CoeAngular*Ponto.GetAbscissa()+CoeLinear){
             return true;
         }else{
             return false;
         }
     }
    public boolean VericarPonto(double Abscissa, double Ordenada){
        if(Ordenada==CoeAngular*Abscissa+CoeLinear){
            return true;
        }else{
            return false;
        }
    }
    public Object VerificarReta(RetaCartesiana Reta){
         if(this.CoeAngular == Reta.GetCoeAngular()){
             return null;
         }else{
             double Abscissa = (Reta.GetCoeLinear()-this.CoeLinear)/(this.CoeAngular-Reta.GetCoeAngular());
             double Ordenada = Abscissa*this.CoeAngular+ this.CoeLinear;
             Pcartesiano P1 = new Pcartesiano(Abscissa,Ordenada);
             return P1;
         }
    }
}

