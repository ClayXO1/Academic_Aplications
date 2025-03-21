package Recursividade;

public class MMC extends MDC{

    /* O programa realiza o cálculo do MMC de dois números inteiros
    importando um método da classe MDC*/

    public static void main(String[] args) {
        int n1=5,n2=8;
        System.out.printf("O MMC de %d e %d = %d",n1,n2,MMC(n1,n2));
    }

    public static int MMC(int n1, int n2) {
        return (n1 * n2) / CalcularMDC(n1, n2);
    }
}


