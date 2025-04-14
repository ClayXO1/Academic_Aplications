package Recursividade;

public class SomadorVetores {

    /* O Programa executa a soma de todos os itens em um vetor*/
    public static void main(String[] args) {
        SomadorVetores s = new SomadorVetores();
        int[] inteiros = new int[10];
        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = i + 1;
        }
        s.imprimir(s.somadorvetores(inteiros, inteiros.length));
    }

    public int somadorvetores(int a[], int i) {
        int posicao = i - 1;
        if (posicao == 0) {
            return a[posicao];
        }
        return a[posicao] + somadorvetores(a, posicao);
    }

    ;

    public void imprimir(int msg) {
        System.out.println(msg);
    }
}
