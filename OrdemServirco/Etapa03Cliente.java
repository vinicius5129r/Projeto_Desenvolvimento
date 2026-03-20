public class Etapa03Cliente {
    private String nomeCliente;
    private String descricao;
    private double valorHora;
    private int horas;
    
    public Etapa03Cliente(String nomeCliente, String descricao, double valorHora, int horas) {
        this.nomeCliente = nomeCliente;
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public static double calcularTotal(double valorHora, int horas) {

        // Aplicação direta da fórmula fornecida no enunciado
        double total = valorHora * horas;

        // Retornando o resultado para quem chamou o método
        return total;
    }

    public static void exibirResumo(String nomeCliente,
                                    String descricao,
                                    double valorHora,
                                    int horas,
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


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    
}
