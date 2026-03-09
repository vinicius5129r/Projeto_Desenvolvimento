import java.util.Scanner;
import classes.calcular;
import classes.exibir;

public class organizar {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String[] dados = exibir.ler(teclado);
        String nomeCliente = dados[0];
        String descricaoProblema = dados[1];
        double valorHora = Double.parseDouble(dados[2]);
        int horasTrabalhadas = Integer.parseInt(dados[3]);

        double valorTotal = calcular.calcularTotal(valorHora, horasTrabalhadas);

        exibir.exibirResumo(nomeCliente, descricaoProblema, valorTotal);

        teclado.close();
    }
}
