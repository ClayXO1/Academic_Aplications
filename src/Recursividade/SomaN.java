package Recursividade;

public class SomaN {

    /*O Programa faz a contagem de 1 até o número inserido em somaN
    e depois imprime o resultado de todos os números somados*/

    public static void main(String[] args){
        SomaN s = new SomaN();
        s.imprimir(s.somaN(27));
    }

    public int somaN(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return n + somaN(n - 1);
    }

    public void imprimir(int msg){
        System.out.println(msg);
    }
}
