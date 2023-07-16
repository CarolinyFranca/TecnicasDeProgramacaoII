import java.util.Scanner;

public class Main{
    public static void main(String[] args) {     

        System.out.println("\n *** Pizzaria *** \n");
        System.out.println("Pizzas disponíveis:");
        System.out.println("1. Pizza de Calabresa");
        System.out.println("2. Pizza Portuguesa");
        System.out.println("3. Pizza Quatro Queijos");
        System.out.println("4. Pizza Cangaceira");
        System.out.println("5. Pizza da Casa \n");

        // Solicitando ao usuário que escolha uma pizza
        System.out.print("Digite o número da pizza desejada, por gentileza. \n");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

        scanner.close();

        FactoryMethody factory = new FactoryMethody();
        Pizzaria pizzaria = new Pizzaria(factory);

        pizzaria.assar(Opcoes.values()[escolha - 1]);
        pizzaria.entregar();
    }
}
