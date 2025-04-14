package LDE;

public class LDE {
    private Nodo primeiro=null;
    private Nodo ultimo=null;
    private int n = 0;

    public void inserirListaDireita(Aluno valor) {
        Nodo aux = new Nodo();
        aux.dado = valor;
        if(n==0) {
            primeiro=aux;
            ultimo=aux;
            aux.proximo=null;
        }else {
            aux.anterior=ultimo;
            aux.proximo=null;
            ultimo.proximo=aux;
            ultimo=aux;
            n++;
        }
    }

    public void inserirListaEsquerda(Aluno valor) {
        Nodo aux = new Nodo();
        aux.dado = valor;
        if(n==0) {
            primeiro=aux;
            ultimo=aux;
            aux.anterior=null;
        }else {
            aux.proximo=primeiro;
            aux.anterior=null;
            primeiro=aux;
            n++;
        }

    }

    public void removerListaDireita() {
        Nodo antes,aux =ultimo;
        n--;
        if(n==0) {
            primeiro=null;
            ultimo=null;
        }else{
            antes = aux.anterior;
            ultimo=antes;
            aux.proximo=null;
        }
    }

    public void removerListaEsquerda() {
        Nodo aux = primeiro;
        n--;
        if(n==0) {
            primeiro=null;
            ultimo=null;
        }else {
            primeiro=aux.proximo;
            aux.anterior=null;
        }
    }


    public void ListarListaImprimir() {
        System.out.println(n);
        Nodo aux = primeiro;
        System.out.println("Lista de Alunos:");
        if(aux!=null) {
            while(aux!=null) {
                System.out.println(aux.dado.getNome()+"\n");
                aux=aux.proximo;
            }
        }else {
            System.out.println("A lista está vazia");
        }




    }

    public void imprimir(String msg) {
        System.out.printf(msg);
    }
}
