
public class ordemServico {
    private Cliente cliente;
    private String descricao;
    private double valorHora = 12.50;
    private int horas;
    private String status;
    private int num;

    public ordemServico(Cliente cliente, String descricao, int horas, String status, int num) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.horas = horas;
        this.status = status;
        this.num = num;
    }

    private void alteraStatus() {
        switch (status = num) {
            case 1 :
                System.out.println("Esta em agendamento");
                break;
        
            default:
                break;
        }
    }

    private double calcularTotal() {
        return valorHora * horas;
    }

    public void exibirResumo() {
        System.out.println("\n==============================");
        System.out.println("      RESUMO DA ORDEM");
        System.out.println("==============================");

        System.out.println("Status: " + status);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Problema: " + descricao);
        System.out.printf("Valor da hora: R$%.2f%n", valorHora);
        System.out.println("Horas trabalhadas: " + horas + "h");
        System.out.printf("Total a pagar: R$%.2f%n", calcularTotal());

        System.out.println("==============================");
    }

}
