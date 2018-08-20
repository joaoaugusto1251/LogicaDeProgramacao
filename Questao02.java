
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int a = entrada.nextInt();
        System.out.print("Digite outro valor: ");
        int b = entrada.nextInt();

        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.print(i);
                System.out.print(", ");
            }
            System.out.println("são os valores de intervalo");
        }

        if (a > b) {
            for (int i = a - 1; i > b; i--) {
                System.out.print(i);
                System.out.print(", ");
            }
            System.out.println("são os valores de intervalo");
        }
    }
}
