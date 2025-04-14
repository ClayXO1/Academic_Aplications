package Recursividade;

public class ContadorChar {

    /* O Programa faz a contagem de quantas vezes um determinado caractere aparece m uma String*/
    public static void main(String[] args) {
        ContadorChar cc = new ContadorChar();
        String palavra = "Hoje a noite teremos um jantar.";
        char letra = 'h';
        int contador =0;

        Object[] dec = new Object[4];
        dec[0]=palavra.toLowerCase();
        dec[1]=Character.toLowerCase(letra);
        dec[2]=palavra.length()-1;
        dec[3]=contador;
        int contagem=cc.contador((String) dec[0], (Character) dec[1], (Integer) dec[2], (Integer) dec[3]);

        System.out.printf("\n%c apareceu %d vezes em '%s'", dec[1], contagem, palavra);
    }
    public int contador(String p,char l,int i,int c){

        int contador = 0;
        int k =i;
        char x;
        x = p.charAt(k);

        if(x!=' ' && x==l){
            contador++;
        }

        if(k==0){
            return contador;
        }
            return contador+contador(p, l, i-1, contador);
        }

    }




