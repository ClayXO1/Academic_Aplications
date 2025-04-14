package LDE;

public class Nodo {
    public Nodo proximo,anterior;
    public Aluno dado;

    public Nodo getProximo() {
        return proximo;
    }
    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    public Nodo getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    public Aluno getDado() {
        return dado;
    }
    public void setDado(Aluno dado) {
        this.dado = dado;
    }
}
