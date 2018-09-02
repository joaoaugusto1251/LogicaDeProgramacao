import java.util.Scanner;

public class DesafioInsertionSort {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[8];

        //Usuário digita os números com os quais deseja preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextInt();
        }

        //Analisa o vetor e cria uma variável para acompanhar simultaneamente
        for (int i = 1; i < vetor.length; i++) {
            int z = vetor[i];
            int j = i;

            //Troca de valores posterior à análise dos valores
            while ((j > 0) && (vetor[j - 1] > z)) {
                vetor[j] = vetor[j - 1];
                j -= 1;
            }
            vetor[j] = z;

        }
        
        //Inserção dos valores na tela do usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}