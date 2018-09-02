
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de posições do seu vetor");
        int a = entrada.nextInt();
        int vet[] = new int[a];

        System.out.println("Digite os valores do vetor");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = entrada.nextInt();
        }

        int x;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (vet[i] < vet[j]) {
                    x = vet[i];
                    vet[i] = vet[j];
                    vet[j] = x;
                }
            }
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " ");
        }
    }
}
