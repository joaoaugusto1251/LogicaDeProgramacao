import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner digite = new Scanner (System.in);
        System.out.println("Digite um valor:");
        int a = digite.nextInt();
        System.out.println("Digite outro valor:");
        int b = digite.nextInt();
        
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        
        System.out.println("Digite o ano em que estamos:");
        int c = digite.nextInt();
        System.out.println("Digite seu ano de nascimento:");
        int d = digite.nextInt();
        System.out.println("Sua idade é de " + (c - d) + " anos");
    }
}
