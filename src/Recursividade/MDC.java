package Recursividade;

public class MDC {

    //O programa realiza o cálculo do MDC de dois números inteiros inseridos pelo usuário

    public static void main(String[] args){
        System.out.println(CalcularMDC(25,5));
    }

    public static int CalcularMDC(int m, int n){
        int r= m%n;
        m= n;
        n=r;
       if(r == 0){
           return m;
       }
       return CalcularMDC(m,n);
       }
}