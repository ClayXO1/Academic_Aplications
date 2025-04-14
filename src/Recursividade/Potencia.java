package Recursividade;

public class Potencia {

    /*O programa realiza a parâmetro entre base(primeiro parâmetro) e
    expoente(segundo parâmetro)*/

    public void main(String[] args){
        Potencia p = new Potencia();
        p.imprimir(p.potencia(5,2));
    }

    public int potencia(int b,int e){
        if (e==0){
            return 1;
        }
        if(e==1){
            return b;
        }
        return b*potencia(b,e-1);
    }

    public void imprimir(int msg){
        System.out.println(msg);
    }
}
