package Recursividade;

import java.util.Scanner;

//O programa realiza a contagem crescente de um até o número inserido pelo usuário

public class ContadorCrescente {
    public static void main(String[] args){
        ContadorCrescente cc = new ContadorCrescente();
        Scanner scan = new Scanner(System.in);
        int num;
        cc.imprimir("Digite um numero: ");
        num =scan.nextInt();
        cc.contador(num);

    }

    public void contador(int num){

        if(num < 1){
            return;
        }
        contador(num - 1);
        imprimir(num);
    }

    public void imprimir(String msg){
        System.out.println(msg);
    }
    public void imprimir(int msg){
        System.out.println(msg);
    }
}
