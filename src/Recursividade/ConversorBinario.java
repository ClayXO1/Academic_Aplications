package Recursividade;

public class ConversorBinario {

    //O programa faz a conversão de um número inteiro na base 10(n^10) para binário

    public static void main(String[] args) {
        ConversorBinario cb = new ConversorBinario();
        cb.Binario(57);
    }

    public void Binario(int n) {
        if (n == 0 || n == 1) {
            System.out.printf("%d", n);
        } else {
            Binario(n / 2);
            System.out.printf("%d", n % 2);

        }
    }


}


