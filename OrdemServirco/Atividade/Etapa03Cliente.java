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
