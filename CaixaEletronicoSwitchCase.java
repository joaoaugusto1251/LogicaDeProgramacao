
import java.util.Scanner;

public class CaixaEletronicoSwitchCase {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        double saque = 0;
        double deposito = 0;
        double saldo = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("CAIXA ELETRÔNICO");
            System.out.println("1 - SAQUE");
            System.out.println("2 - DEPÓISITO");
            System.out.println("3 - SALDO");
            System.out.println("4 - SAIR");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do saque: ");
                    System.out.print("R$ ");
                    saque = entrada.nextDouble();
                    saldo = saldo - saque;
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    System.out.print("R$ ");
                    deposito = entrada.nextDouble();
                    saldo = saldo + deposito;
                    break;
                case 3:
                    System.out.println("Seu saldo é de R$ " + saldo);
                    break;
                case 4:
                    i = 100;
                    break;
            }
        }
    }
}