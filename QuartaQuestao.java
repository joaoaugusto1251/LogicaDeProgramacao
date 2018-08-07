import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner digite = new Scanner (System.in);
        System.out.println("Digite o nome do vendedor: ");
        String NomeVendedor = digite.nextLine();
        System.out.println("Digite o salário fixo: ");
        System.out.print("R$ ");
        double SalarioFixo = digite.nextDouble();
        System.out.println("Digite o total de vendas do mês: ");
        System.out.print("R$ ");
        double TotalVendas = digite.nextDouble();
        
        System.out.println("Nome do Vendedor: " + NomeVendedor);
        System.out.println("Salário Fixo: R$ " + SalarioFixo);
        System.out.println("Salário Final: R$ " + ((TotalVendas * 0.15) + SalarioFixo));
    }
}
