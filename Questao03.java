
import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        int a = entrada.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = entrada.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = entrada.nextInt();

        int delta = (b * b) - 4 * (a) * (c);
        System.out.println("O valor de delta é: " + delta);

        double x1 = (-b - (Math.sqrt(delta))) / (2 * a);
        double x2 = (-b + (Math.sqrt(delta))) / (2 * a);

        System.out.println("O valor de X1 é: " + x1);
        System.out.println("O valor de X2 é: " + x2);

        if (a > 0) {
            System.out.println("A concavidade da parábola é voltada para cima");
        } else if (a < 0) {
            System.out.println("A concavidade da parábola é voltada para baixo");
        }
    }
}
