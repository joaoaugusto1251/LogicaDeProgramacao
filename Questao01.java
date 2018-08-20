
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int a = entrada.nextInt();
        System.out.print("Digite outro valor: ");
        int b = entrada.nextInt();

        if (a > b) {
            System.out.println(a + " é maior");
        } else if (a < b) {
            System.out.println(b + " é maior");
        } else {
            System.out.println("Os valores são iguais");
        }
    }
}
