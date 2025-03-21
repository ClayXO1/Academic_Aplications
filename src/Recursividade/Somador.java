package Recursividade;

import java.util.Scanner;

public class Somador {

//O programa soma todos os digitos de um número inserido pelo usuário

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        imprimir("Digite um numero: ");
        num =scan.nextInt();
        imprimir(somador(num));
    }

    public static int somador(int num){
        if(num<10){
            return num;
        }return (num%10)+somador(num/10);
    }

    public static void imprimir(String msg){
        System.out.println(msg);
    }
    public static void imprimir(int msg){
        System.out.println(msg);
    }
}
