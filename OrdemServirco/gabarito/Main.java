package gabarito;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do cliente
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email:");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, telefone, email);

        // Entrada da ordem
        System.out.println("Digite a descrição do problema:");
        String descricao = scanner.nextLine();

        System.out.println("Digite o valor da hora:");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas:");
        int horas = scanner.nextInt();

        OrdemServico ordem = new OrdemServico(cliente, descricao, valorHora, horas);

        // Exibir resumo inicial
        ordem.exibirResumo();

        // Simulação de alteração de estado
        ordem.alterarStatus("Finalizada");

        System.out.println("\nApós atualização:");
        ordem.exibirResumo();

        scanner.close();
    }
}