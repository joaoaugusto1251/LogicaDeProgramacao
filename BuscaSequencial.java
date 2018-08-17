
import java.util.Scanner;
import java.util.Random;

public class BuscaSequencial {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de posições do vetor");
        int z = entrada.nextInt();
        int vetor[] = new int[z];

        //Recebendo os valores
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(99);
        }

        System.out.println("Digite o número que deseja bsucar no vetor");

        //Comparando o valor digitado com os valores do vetor
        int y = entrada.nextInt();
        boolean encontrar = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == y) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrar = true;
                break;
            }
        }

        //Se não encontrar
        if (encontrar == false) {
            System.out.println("Valor não encontrado");
        }
    }
}
