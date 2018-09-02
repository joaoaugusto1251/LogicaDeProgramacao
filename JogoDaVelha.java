/*
DISCENTE: João Augusto Araújo Ferreira
 */
import java.util.Scanner;

public class JogoDaVelha {

    static String jogo[][] = new String[3][3];
    static String sair;
    static int linha1, coluna1, linha2, coluna2;
    static String jogador1, jogador2;
    static int valor = 10;
    static boolean terminar = false;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        JogoDaVelha obj = new JogoDaVelha();

        System.out.print("Digite o nome do Jogador 1(X): ");
        jogador1 = entrada.nextLine();
        System.out.print("Digite o nome do Jogador 2(O): ");
        jogador2 = entrada.nextLine();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogo[i][j] = "[ ]";
            }
        }

        obj.Jogo();

        if (terminar == false) {
            System.out.println("O jogo deu velha!");
        }
    }

    public void Jogo() {
        Scanner entrada = new Scanner(System.in);
        while (valor > 1) {
            if (valor % 2 == 0) {
                System.out.print(jogador1 + ", digite a linha em que deseja jogar: ");
                linha1 = entrada.nextInt();
                System.out.print(jogador1 + ", digite a coluna em que deseja jogar: ");
                coluna1 = entrada.nextInt();
                jogo[linha1][coluna1] = "[X]";
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(jogo[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
            if (valor % 2 != 0) {
                System.out.print(jogador2 + ", digite a linha em que deseja jogar: ");
                linha2 = entrada.nextInt();
                System.out.print(jogador2 + ", digite a coluna em que deseja jogar: ");
                coluna2 = entrada.nextInt();
                jogo[linha2][coluna2] = "[O]";
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(jogo[i][j] + " ");
                    }
                    System.out.println("");
                }
            }

            // Problema na hora de verificar o jogador 2
            int i = 0;
            if (jogo[0][i].equals("[X]") && jogo[0][i + 1].equals("[X]") && jogo[0][i + 2].equals("[X]")
                    || jogo[1][i].equals("[X]") && jogo[1][i + 1].equals("[X]") && jogo[1][i + 2].equals("[X]")
                    || jogo[2][i].equals("[X]") && jogo[2][i + 1].equals("[X]") && jogo[2][i + 2].equals("[X]")
                    || jogo[i][0].equals("[X]") && jogo[i + 1][0].equals("[X]") && jogo[i + 2][0].equals("[X]")
                    || jogo[i][1].equals("[X]") && jogo[i + 1][1].equals("[X]") && jogo[i + 2][1].equals("[X]")
                    || jogo[i][2].equals("[X]") && jogo[i + 1][2].equals("[X]") && jogo[i + 2][2].equals("[X]")) {
                System.out.println("O vencedor é: " + jogador1);
                terminar = true;
            } else if (jogo[0][i].equals("[O]") && jogo[0][i + 1].equals("[0]") && jogo[0][i + 2].equals("[0]")
                    || jogo[1][i].equals("[0]") && jogo[1][i + 1].equals("[0]") && jogo[1][i + 2].equals("[0]")
                    || jogo[2][i].equals("[0]") && jogo[2][i + 1].equals("[0]") && jogo[2][i + 2].equals("[0]")
                    || jogo[i][0].equals("[0]") && jogo[i + 1][0].equals("[0]") && jogo[i + 2][0].equals("[0]")
                    || jogo[i][1].equals("[0]") && jogo[i + 1][1].equals("[0]") && jogo[i + 2][1].equals("[0]")
                    || jogo[i][2].equals("[0]") && jogo[i + 1][2].equals("[0]") && jogo[i + 2][2].equals("[0]")) {
                System.out.println("O vencedor é: " + jogador2);
                terminar = true;
            } else if (jogo[0][i].equals("[X]") && jogo[1][i + 1].equals("[X]") && jogo[2][i + 2].equals("[X]")
                    || jogo[2][i].equals("[X]") && jogo[1][i + 1].equals("[X]") && jogo[0][i + 2].equals("[X]")) {
                System.out.println("O vencedor é: " + jogador1);
                terminar = true;
            } else if (jogo[0][i].equals("[0]") && jogo[1][i + 1].equals("[0]") && jogo[2][i + 2].equals("[0]")
                    || jogo[2][i].equals("[0]") && jogo[1][i + 1].equals("[0]") && jogo[0][i + 2].equals("[0]")) {
                System.out.println("O vencedor é: " + jogador2);
                terminar = true;
            }
            if (terminar == true) {
                System.out.println("Deseja jogar novamente? (S/N)");
                sair = entrada.next();
                switch (sair) {
                    case "S":
                        valor = 10;
                        break;
                    case "N":
                        valor = -1;
                        break;
                    default:
                        System.err.println("Valor inválido!");
                }
            }
            valor--;
        }
    }
}
