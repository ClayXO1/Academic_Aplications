package Recursividade;

public class Fatoracao {

    //O programa realiza a fatoração de um número inteiro inserido pelo usuário

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int n){
         if (n ==1 || n==0){
             return 1;
         } return n * fatorial(n-1);
    }
}
