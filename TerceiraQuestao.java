import java.util.Scanner;

public class TerceiraQuestao {
    public static void main(String[] args) {
        Scanner digite = new Scanner (System.in);
        System.out.println("Digite a distância total percorrida:");
        double dis = digite.nextDouble();
        System.out.println("Digite o combustível gasto na viagem:");
        double comb = digite.nextDouble();
        double total = (dis / comb);
        
        System.out.println("O consumo médio do automóvel é de " + total + " L/Km");
    }
}
