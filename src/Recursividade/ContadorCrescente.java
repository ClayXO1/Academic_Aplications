package Recursividade;

import java.util.Scanner;

//O programa realiza a contagem crescente de um até o número inserido pelo usuário

public class ContadorCrescente {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        imprimir("Digite um numero: ");
        num =scan.nextInt();
        contador(num);

    }

    public static void contador(int num){

        if(num < 1){
            return;
        }
        contador(num - 1);
        imprimir(num);
    }

    public static void imprimir(String msg){
        System.out.println(msg);
    }
    public static void imprimir(int msg){
        System.out.println(msg);
    }
}
