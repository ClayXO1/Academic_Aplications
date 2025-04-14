package Lista_Encadeada;

import java.util.Scanner;

public class TestarLista_Encadeada {
	public static void main(String[] args){
		Lista_Encadeada lista = new Lista_Encadeada();
		Scanner scan = new Scanner(System.in);
		int entrada;
		
		
		do {
			lista.imprimir("Escolha uma opção:\n"
					+ "1.Adicionar\n"
					+ "2.Remover\n"
					+ "3.Listar\n"
					+ "4.Sair");
			entrada= scan.nextInt();
			switch(entrada) {
			case 1:
				lista.imprimir("Insira o nome do lugar de viagem:");
				String nome = scan.next();
				Viagem v = new Viagem(nome);
				lista.adicionar(v);
				break;
			case 2:
				lista.remover();
				break;
			case 3:
				lista.listar(lista);
				break;
			case 4:
				break;
			default:
				lista.imprimir("Por favor inserir valor valido");
				break;
			}
		}while(entrada!=4);
		scan.close();
		System.exit(0);
	}

}
