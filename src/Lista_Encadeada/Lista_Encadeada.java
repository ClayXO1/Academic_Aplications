package Lista_Encadeada;

public class Lista_Encadeada {
	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;
	
	public void adicionar(Viagem valor) {
		Celula celula = new Celula();
		celula.setValor(valor);
		if(primeiro==null&&ultimo==null) {
			primeiro=celula;
			ultimo=celula;
		}else {
			ultimo.setProximo(celula);
			ultimo=celula;
			ultimo.setProximo(null);
		}
		imprimir("O item foi adicionado!\n");
	}
	
	public void remover() {
		if(primeiro.getProximo()!=null) {
			Celula celula=this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);
		}else {
			primeiro=ultimo=null;
		}
		imprimir("O item foi Removido!\n");
	}
	
	private Celula recuperarPenultimo(Celula celula) {
		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}return recuperarPenultimo(celula.getProximo());
		}
	
	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}
	
	private boolean temProximo() {
		if(primeiro==null) {
			return false;
		}else if(posicaoAtual==null) {
			posicaoAtual=primeiro;
			return true;
		}else {
			boolean temProximo = posicaoAtual.getProximo()!=null?true:false;
			posicaoAtual=posicaoAtual.getProximo();
			return temProximo;
		}
			}
	
	public void listar(Lista_Encadeada lista) {
		imprimir("Os item listados são:");
		while(temProximo()) {
			System.out.println(posicaoAtual.getValor().getNome());
		}
		imprimir("");
	}
	
	public void imprimir(String msg) {
		System.out.printf(msg+"\n");
	}

}
