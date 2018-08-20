
import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de posições do vetor: ");
        int i = entrada.nextInt();
        int vetor[] = new int[i];
        System.out.println("Deseja ordenar o vetor em ordem "
                + "crescente ou decrescente? (Crescente/Decrescente)");
        String escolha = entrada.next();

        System.out.println("Digite os valores do vetor: ");
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = entrada.nextInt();
        }

        int x;
        if ("Crescente".equals(escolha)) {
            for (int j = 0; j < vetor.length; j++) {
                for (int k = 0; k < vetor.length; k++) {
                    if (vetor[j] < vetor[k]) {
                        x = vetor[j];
                        vetor[j] = vetor[k];
                        vetor[k] = x;
                    }
                }
            }
            for (int j = 0; j < vetor.length; j++) {
                System.out.print(vetor[j] + " ");
            }
        }
        if ("Decrescente".equals(escolha)) {
            for (int j = 0; j < vetor.length; j++) {
                for (int k = 0; k < vetor.length; k++) {
                    if (vetor[j] > vetor[k]) {
                        x = vetor[j];
                        vetor[j] = vetor[k];
                        vetor[k] = x;
                    }
                }
            }
            for (int j = 0; j < vetor.length; j++) {
                System.out.print(vetor[j] + " ");
            }
        }
    }
}
