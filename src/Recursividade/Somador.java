package Recursividade;

import java.util.Scanner;

public class Somador {

//O programa soma todos os digitos de um número inserido pelo usuário

    public static void main(String[] args) {
        Somador s = new Somador();
        Scanner scan = new Scanner(System.in);
        int num;
        s.imprimir("Digite um numero: ");
        num = scan.nextInt();
        s.imprimir(s.somador(num));
    }

    public int somador(int num) {
        if (num < 10) {
            return num;
        }
        return (num % 10) + somador(num / 10);
    }

    public void imprimir(String msg) {
        System.out.println(msg);
    }

    public void imprimir(int msg) {
        System.out.println(msg);
    }
}
