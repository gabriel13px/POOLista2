package PontoRetaCartesiana;

public class PrincipalReta {
    public static void main(String[] args) {
        //deixei reta e ponto juntos pra testar colocar uma classe dentro da outra, só não sei fazer isso direito
        RetaCartesiana Reta1 = new RetaCartesiana(-1, 5);
        RetaCartesiana Reta2 = new RetaCartesiana(2, 3);
        Pcartesiano p1 = new Pcartesiano((Pcartesiano) Reta2.VerificarReta(Reta1));
        System.out.println(p1.GetAbscissa());
        System.out.println(p1.GetOrdenada());
    }
}
