import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner digite = new Scanner (System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double TempGrausCelsius = digite.nextDouble();
        double TempGrausFahren = ((9 * TempGrausCelsius) + 160) / 5;
        
        System.out.println("A temperatura em graus Fahrenheit é de: " 
                + TempGrausFahren + " °F");
    }
}
