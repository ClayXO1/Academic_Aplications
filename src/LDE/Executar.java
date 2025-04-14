package LDE;

import java.util.Scanner;

public class Executar {
    public static void main(String[] args) {
        LDE list = new LDE();
        int entrada;
        String n;
        Scanner scan = new Scanner(System.in);

        do{
            list.imprimir("Escolha uma opção:\n"
                    + "1.Adicionar a Direita\n"
                    + "2.Adicionar a Esquerda\n"
                    + "3.Remover a Direita\n"
                    + "4.Remover a Esquerda\n"
                    + "5.Listar de Alunos\n"
                    + "6.Sair");
            entrada = scan.nextInt();
            switch(entrada) {
                case 1:
                    System.out.println("Insira um Aluno a direita: ");
                    n = scan.next();
                    Aluno p = new Aluno(n);
                    list.inserirListaDireita(p);
                    break;
                case 2:
                    System.out.println("Insira um Aluno a esquerda: ");
                    n= scan.next();
                    Aluno p2 = new Aluno(n);
                    list.inserirListaEsquerda(p2);
                    break;
                case 3:
                    list.removerListaDireita();
                    break;
                case 4:
                    list.removerListaEsquerda();
                    break;
                case 5:
                    list.ListarListaImprimir();
                    break;
                case 6: System.out.println("😜");
                    break;
                default: System.out.println("opcao invalida.");
            }
        }while(entrada!=6);
        scan.close();
        System.exit(0);
    }
}
