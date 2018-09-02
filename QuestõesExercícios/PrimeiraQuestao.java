import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[] args) {
        Scanner digite = new Scanner (System.in);
        System.out.println("Digite um valor:");
        int a = digite.nextInt();
        System.out.println("Digite outro valor:");
        int b = digite.nextInt();
        
        System.out.println(a + b);
    }
}
