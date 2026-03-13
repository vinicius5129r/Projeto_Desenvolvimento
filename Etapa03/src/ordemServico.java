
public class ordemServico {
    private Cliente cliente;
    private String descricao;
    private double valorHora = 12.50;
    private int horas;

    public ordemServico(Cliente cliente, String descricao, int horas) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.horas = horas;
    }

    private double calcularTotal() {
        return valorHora * horas;
    }

    public void exibirResumo() {
        System.out.println("\n==============================");
        System.out.println("      RESUMO DA ORDEM");
        System.out.println("==============================");

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Problema: " + descricao);
        System.out.printf("Valor da hora: R$%.2f%n", valorHora);
        System.out.println("Horas trabalhadas: " + horas + "h");
        System.out.printf("Total a pagar: R$%.2f%n", calcularTotal());

        System.out.println("==============================");
    }

}
