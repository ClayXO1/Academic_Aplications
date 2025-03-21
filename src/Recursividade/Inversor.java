package Recursividade;

public class Inversor {

    /*O programa realiza a inversão de uma String*/

    public static void main(String[] args){
        String palavra = "Hoje";
        System.out.printf("palavra: %s\ninverso: ",palavra);
        inverter(palavra,palavra.length());
    }
    public static void inverter(String p,int i){
        char x;
        if(i==0){
        }else{
            x = p.charAt(i-1);
            System.out.printf("%c",x);
            inverter(p,i-1);
        }
    }
}
