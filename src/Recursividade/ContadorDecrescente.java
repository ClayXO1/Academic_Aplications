package Recursividade;

import java.util.Scanner;

//O programa realiza a contagem decrescente do número inserido pelo usuário até 1.

public class ContadorDecrescente {
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
        imprimir(num);
        contador(num - 1);
    }

    public static void imprimir(String msg){
        System.out.println(msg);
    }
    public static void imprimir(int msg){
        System.out.println(msg);
    }
}

