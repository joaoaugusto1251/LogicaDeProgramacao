
import java.util.Scanner;

public class BuscaBinária {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de posições do vetor");
        int a = entrada.nextInt();
        int vetor[] = new int[a];

        int b = 1;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = b++;
        }

        int min = vetor[0];
        int max = vetor.length - 1;
        int meio = min + max / (2);

        System.out.println("Digite o valor que deseja encontrar");
        int c = entrada.nextInt();

        if (c < meio) {
            for (int i = 0; i < meio; i++) {
                if (c == vetor[i]) {
                    System.out.println("O valor está na posição: " + i);
                }
            }
        } else if (c > meio) {
            for (int i = meio; i < max; i++) {
                if (c == vetor[i]) {
                    System.out.println("O valor está na posição: " + i);
                }
            }
        } else if (c == meio) {
            System.out.println("O valor está na posição: " + (meio - 1));
        }
    }
}
