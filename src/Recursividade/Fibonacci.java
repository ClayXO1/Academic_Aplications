package Recursividade;

public class Fibonacci {

    /* O Programa executa o cálculo de fibonacci para um número passado*/

    public static void main(String[] args){
        Fibonacci fb = new Fibonacci();
        int n =15;
        for(int i=0 ; i<n;n--){
            fb.imprimir(fb.fibonacci(n));
        }
    }

    public int fibonacci(int n){

        if (n==0){
           return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public void imprimir(int msg){
        System.out.println(msg);
    }
}
