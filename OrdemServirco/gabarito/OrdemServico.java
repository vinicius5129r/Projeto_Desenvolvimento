
package gabarito;
public class OrdemServico {

    private Cliente cliente;
    private String descricao;
    private double valorHora;
    private int horas;
    private String status;

    public OrdemServico(Cliente cliente, String descricao, double valorHora, int horas) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.horas = horas;
        this.status = "Aberta";
    }

    public double calcularTotal() {
        return valorHora * horas;
    }

    public void alterarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void atualizarHoras(int novasHoras) {
        this.horas = novasHoras;
    }

    public void atualizarValorHora(double novoValor) {
        this.valorHora = novoValor;
    }

    public void exibirResumo() {
        System.out.println("===== ORDEM DE SERVIÇO =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor Hora: " + valorHora);
        System.out.println("Horas: " + horas);
        System.out.println("Status: " + status);
        System.out.println("Total: " + calcularTotal());
        System.out.println("============================");
    }
}