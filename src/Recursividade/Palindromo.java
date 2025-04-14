package Recursividade;

//O Programa realiza a checagem se a String palavra é ou não um palíndromo
//Tentei e muito nesse aqui🤣🤣

public class Palindromo {
    public static void main(String[] args){
        Palindromo p = new Palindromo();
        String palavra= "Arara";
        int t = palavra.length()-1;
        int cont=0;
        int palindromo= p.palindromo(palavra,t,cont);

        if(t==palindromo){
            System.out.printf("%s é um palindromo", palavra);
        }
        else{
            System.out.printf("%s não é um palindromo", palavra);
        }
    }
    public int palindromo(String p,int i,int c){
        String a = p.toLowerCase();
        int contador = c;
        int k = i;
        char x;
        if(k==0){
            return contador;
        }

        x = a.charAt(k);

        if(x!=' ' && x==a.charAt(c)){
            contador++;
            palindromo(a, k-1, contador);
        }


        return palindromo(a, k-1, contador);
    }

}

