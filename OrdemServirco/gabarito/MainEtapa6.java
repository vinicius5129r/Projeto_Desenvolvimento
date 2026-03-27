package gabarito;
import java.util.ArrayList;
import java.util.Scanner;
public class MainEtapa6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<OrdemServico> ordens = new ArrayList<>();
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n============ MENU ============");
            System.out.println("1 - Cadastrar nova ordem");
            System.out.println("2 - Listar ordens");
            System.out.println("3 - Calcular faturamento total");
            System.out.println("4 - Alterar status de uma ordem");
            System.out.println("5 - Cadastrar novo cliente");
            System.out.println("0 - sair");
            System.out.println("===============================");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            System.out.println("");
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, telefone, email);
                    clientes.add(cliente);

                    System.out.print("Digite a descrição do problema: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Digite o valor da hora: ");
                    double valorHora = scanner.nextDouble();

                    System.out.print("Digite a quantidade de horas: ");
                    int horas = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    OrdemServico ordem = new OrdemServico(cliente, descricao, valorHora, horas);
                    ordens.add(ordem);
                    break;

                case 2:
                    if (ordens.isEmpty()) {
                        System.out.println("Nenhuma ordem cadastrada.\n");
                    } else {
                        for (int i = 0; i < ordens.size(); i++) {
                            System.out.println("\nOrdem #" + (i + 1));
                            ordens.get(i).exibirResumo();
                        }
                    }
                    break;

                case 3:
                    double faturamentoTotal = 0;
                    for (OrdemServico os : ordens) {
                        faturamentoTotal += os.calcularTotal();
                    }
                    System.out.println("Faturamento total: R$ " + faturamentoTotal);
                    break;

                case 4:
                    System.out.println("Digite o índice da ordem para alterar o status: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    if (indice >= 0 && indice < ordens.size()) {
                        System.out.println("Digite o novo status: ");
                        String novoStatus = scanner.nextLine();
                        ordens.get(indice).alterarStatus(novoStatus);
                        System.out.println("Status atualizado com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 5:
                    System.out.println("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();

                    System.out.println("Digite o telefone: ");
                    String telefoneCliente = scanner.nextLine();

                    System.out.println("Digite o email: ");
                    String emailCliente = scanner.nextLine();

                    Cliente novoCliente = new Cliente(nomeCliente, telefoneCliente, emailCliente);
                    clientes.add(novoCliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
        scanner.close();
    }
}
