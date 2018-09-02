import java.util.Scanner;

public class SextaQuestao {
    public static void main(String[] args) {
        Scanner digite = new Scanner (System.in);
        System.out.println("Digite o valor total da compra: ");
        System.out.print("R$ ");
        double ValorCompra = digite.nextDouble();
        double ValorParcelado = (ValorCompra / 5);
        
        System.out.println("O valor de cada parcela será de: R$ " 
                + ValorParcelado);
    }
}
