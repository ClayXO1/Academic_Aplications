package Recursividade;

public class Fibonacci {

    /* O Programa executa o cálculo de fibonacci para um número passado*/

    public static void main(String[] args){
        int n =15;
        for(int i=0 ; i<n;n--){
            imprimir(fibonacci(n));
        }
    }

    public static int fibonacci(int n){

        if (n==0){
           return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void imprimir(int msg){
        System.out.println(msg);
    }
}
