package classes;

import java.util.Scanner;

public class exibir {
    public static String[] ler(Scanner teclado) {
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = teclado.nextLine();

        System.out.print("Digite a descrição do problema: ");
        String descricaoProblema = teclado.nextLine();

        System.out.print("Digite o valor da hora de serviço: ");
        double valorHora = teclado.nextDouble();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = teclado.nextInt();

        return new String[] { nomeCliente, descricaoProblema, String.valueOf(valorHora),
                String.valueOf(horasTrabalhadas) };
    }

    public static void exibirResumo(String nomeCliente, String descricaoProblema, double valorTotal) {
        System.out.format("\nCliente: %s%nDescrição do problema: %s%nValor total a ser cobrado: R$ %.2f%n",
                nomeCliente, descricaoProblema, valorTotal);
    }
}
