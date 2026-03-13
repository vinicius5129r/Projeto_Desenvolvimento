import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
         // Scanner será utilizado para leitura de dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // ================================
        // ETAPA 1 — ENTRADA DE DADOS
        // ================================
        
        // Leitura do nome do cliente
        System.out.println("===============================");
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        Cliente cliente1 = new Cliente(nomeCliente);
        // Leitura da descrição do problema
        System.out.print("Descreva o problema: ");
        String descricao = sc.nextLine();
        
        
        // Leitura da quantidade de horas trabalhadas
        System.out.print("Quantidade de horas trabalhadas: ");
        int horas = sc.nextInt();
        
        ordemServico ordem = new ordemServico(cliente1, descricao, horas status);
        ordem.exibirResumo();
        sc.close();
        
    }
}
