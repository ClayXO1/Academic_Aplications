package Recursividade;

public class Inversor {

    /*O programa realiza a inversão de uma String*/

    public static void main(String[] args){
        Inversor i = new Inversor();
        String palavra = "Hoje";
        System.out.printf("palavra: %s\ninverso: ",palavra);
        i.inverter(palavra,palavra.length());
    }
    public void inverter(String p,int i){
        char x;
        if(i==0){
        }else{
            x = p.charAt(i-1);
            System.out.printf("%c",x);
            inverter(p,i-1);
        }
    }
}
