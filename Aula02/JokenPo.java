import java.util.Random;
import java.util.Scanner;

public class JokenPo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] jogadas = {"pedra", "papel", "tesoura", "lagarto", "spock"};

        while (true) {
            System.out.print("Escolha sua jogada (pedra, papel, tesoura, lagarto ou spock): ");
            String jogadaJogador = scanner.nextLine().toLowerCase();

            if (!isValidJogada(jogadaJogador)) {
                System.out.println("Jogada inválida. Tente novamente.");
                continue;
            }

            int jogadaComputador = random.nextInt(5);
            String jogadaComputadorStr = jogadas[jogadaComputador];

            System.out.println("Jogador escolheu: " + jogadaJogador);
            System.out.println("Computador escolheu: " + jogadaComputadorStr);

            int resultado = verificarResultado(jogadaJogador, jogadaComputadorStr);

            if (resultado == 0) {
                System.out.println("Empate!");
                System.out.println("As jogadas foram iguais!");
            } else if (resultado == 1) {
                System.out.println("Jogador venceu!");
                System.out.println(jogadaJogador + " derrota " + jogadaComputador);
            } else {
                System.out.println("Computador venceu!");
                System.out.println(jogadaComputador + " derrota " + jogadaJogador);
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            String resposta = scanner.nextLine().toLowerCase();

            if (!resposta.equals("s")) {
                break;
            }
        }

        System.out.println("Fim!");
    }

    private static boolean isValidJogada(String jogada) {
        return jogada.equals("pedra") ||
                jogada.equals("papel") ||
                jogada.equals("tesoura") ||
                jogada.equals("lagarto") ||
                jogada.equals("spock");
    }

    private static int verificarResultado(String jogadaJogador, String jogadaComputador) {
        if (jogadaJogador.equals(jogadaComputador)) {
            return 0; // Empate
        }

        if (jogadaJogador.equals("pedra")) {
            return (jogadaComputador.equals("tesoura") || jogadaComputador.equals("lagarto")) ? 1 : -1;
        } else if (jogadaJogador.equals("papel")) {
            return (jogadaComputador.equals("pedra") || jogadaComputador.equals("spock")) ? 1 : -1;
        } else if (jogadaJogador.equals("tesoura")) {
            return (jogadaComputador.equals("papel") || jogadaComputador.equals("lagarto")) ? 1 : -1;
        } else if (jogadaJogador.equals("lagarto")) {
            return (jogadaComputador.equals("papel") || jogadaComputador.equals("spock")) ? 1 : -1;
        } else if (jogadaJogador.equals("spock")) {
            return (jogadaComputador.equals("pedra") || jogadaComputador.equals("tesoura")) ? 1 : -1;
        }

        return 0;
    }
}
