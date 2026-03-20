import java.util.Scanner;

public class Etapa03 {
    public static void main(String[] args) {
        // Scanner será utilizado para leitura de dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // ================================
        // ETAPA 1 — ENTRADA DE DADOS
        // ================================

        // Leitura do nome do cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        // Leitura da descrição do problema
        System.out.print("Descreva o problema: ");
        String descricao = sc.nextLine();

        // Leitura do valor da hora de serviço
        System.out.print("Valor da hora de serviço: ");
        double valorHora = sc.nextDouble();

        // Leitura da quantidade de horas trabalhadas
        System.out.print("Quantidade de horas trabalhadas: ");
        int horas = sc.nextInt();


        // ================================
        // ETAPA 2 — CHAMADA DOS MÉTODOS
        // ================================

        // Agora o cálculo não acontece diretamente no main.
        // O main apenas chama o método responsável pelo cálculo.
        double total = Etapa03Cliente.calcularTotal(valorHora, horas);

        // O resumo também será exibido por um método separado.
        Etapa03Cliente.exibirResumo(nomeCliente, descricao, valorHora, horas, total);


        // Encerrando o Scanner
        sc.close();
    }    
}
