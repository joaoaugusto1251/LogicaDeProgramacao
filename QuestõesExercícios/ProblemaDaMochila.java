
public class ProblemaDaMochila {

    public static void main(String[] args) {
        ProblemaDaMochila obj = new ProblemaDaMochila();
        int peso[] = {3, 4, 7, 9, 12, 13};
        int valor[] = {20, 30, 32, 35, 75, 80};
        int mochila_peso = 20;
        int fim = obj.valorMaximo(peso, valor, mochila_peso);
        System.out.println("\nO valor máximo é " + fim);
    }

    public int valorMaximo(int peso[], int valor[], int mochila_peso) {

        //matriz
        int matriz[][] = new int[peso.length + 1][mochila_peso + 1];

        for (int i = 1; i <= peso.length; i++) {
            for (int j = 1; j <= mochila_peso; j++) {
                if (peso[i - 1] <= j) {
                    matriz[i][j] = valor[i - 1] + matriz[i - 1][j - peso[i - 1]];
                    if (matriz[i - 1][j] > matriz[i][j]) {
                        matriz[i][j] = matriz[i - 1][j];
                    }
                } else {
                    matriz[i][j] = matriz[i - 1][j];
                }
            }
        }
        for (int i = peso.length; i >= 0; i += 0) {
            for (int j = mochila_peso; j >= 0; j += 0) {
                if (matriz[i][j] != matriz[i - 1][j]) {
                    System.out.println("O ladrão vai levar o item " + i + " de " + peso[i - 1] + " kg e R$ " + valor[i - 1]);
                    j -= peso[i - 1];
                    i--;
                } else {
                    i--;
                }
                if (i == 0) {
                    i--;
                    break;
                }
            }
        }
        return matriz[peso.length][mochila_peso];
    }
}
