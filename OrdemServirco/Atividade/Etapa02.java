import java.util.Scanner;

public class Etapa02 {

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
        double horas = sc.nextDouble();


        // ================================
        // ETAPA 2 — CHAMADA DOS MÉTODOS
        // ================================

        // Agora o cálculo não acontece diretamente no main.
        // O main apenas chama o método responsável pelo cálculo.
        double total = calcularTotal(valorHora, horas);

        // O resumo também será exibido por um método separado.
        exibirResumo(nomeCliente, descricao, valorHora, horas, total);


        // Encerrando o Scanner
        sc.close();
    }


    // ======================================
    // MÉTODO RESPONSÁVEL PELO CÁLCULO
    // ======================================

    /*
     * Este método recebe:
     * valorHora → valor cobrado por hora de serviço
     * horas → quantidade de horas trabalhadas
     *
     * Ele retorna o valor total da ordem de serviço.
     */

    public static double calcularTotal(double valorHora, double horas) {

        // Aplicação direta da fórmula fornecida no enunciado
        double total = valorHora * horas;

        // Retornando o resultado para quem chamou o método
        return total;
    }


    // ======================================
    // MÉTODO RESPONSÁVEL PELA SAÍDA
    // ======================================

    /*
     * Este método organiza a impressão dos dados da ordem de serviço.
     * Ele não realiza cálculos, apenas exibe informações.
     */

    public static void exibirResumo(String nomeCliente,
                                    String descricao,
                                    double valorHora,
                                    double horas,
                                    double total) {

        System.out.println("\n==============================");
        System.out.println("      RESUMO DA ORDEM");
        System.out.println("==============================");

        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Problema: " + descricao);
        System.out.println("Valor da hora: " + valorHora);
        System.out.println("Horas trabalhadas: " + horas);
        System.out.println("Total a pagar: " + total);

        System.out.println("==============================");
    }
}