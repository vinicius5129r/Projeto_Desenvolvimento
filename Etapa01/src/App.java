import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String nomeCliente;
        String descricaoProblema;
        double valorHora = 25.45;
        int horasTrabalhadas;
        double valorTotal;

        System.out.print("Digite o nome do cliente:");
        nomeCliente = teclado.nextLine();

        System.out.print("Digite a descrição do problema:");
        descricaoProblema = teclado.nextLine();

        System.out.print("Digite o número de horas trabalhadas:");
        horasTrabalhadas = teclado.nextInt();

        valorTotal = valorHora * horasTrabalhadas;

        System.out.format("\nCliente: %s%nDescrição do problema: %s%nValor total a ser cobrado: R$ %.2f%n", nomeCliente,
                descricaoProblema, valorTotal);

        teclado.close();
    }
}
