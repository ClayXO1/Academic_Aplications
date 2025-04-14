package Recursividade;

public class Maior {

    /* O Programa retorna o maior número armazenado em um vetor de inteiros*/

    public  static void main(String[] args) {
        Maior m = new Maior();
        int[] inteiros = new int[7];
        inteiros[0]= 14;
        inteiros[1]=25;
        inteiros[2]=174;
        inteiros[3]=1;
        inteiros[4]=4;
        inteiros[5]=6;
        inteiros[6]=7;
        int maior=0;
        int atual = 0;

        Object[] dec = new Object[3];
        dec[0]= inteiros;
        dec[1]=inteiros.length-1;
        dec[2]= atual;

        maior = m.maior((int[]) dec[0],(Integer) dec[1],(Integer) dec[2]);
        System.out.println(maior);
    }

    public int maior(int[] i,int p,int a){
        int maior= 0;
        int atual = a;
        if(i[p]>atual){
            maior=i[p];
        } else if (i[p]==maior) {
            maior=i[p];
        }
        else {
            maior=a;
        }
        if(p==0){
            return maior;
        }
        return maior(i,p-1,maior);
    }


}
