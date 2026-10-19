public class Equipamento {

    private String patrimonio;
    private String descricao;
    private String fabricante;
    private double valorAquisicao;

    public Equipamento(String patrimonio, String descricao, String fabricante, double valorAquisicao) {
        this.patrimonio = patrimonio;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.valorAquisicao = valorAquisicao;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getValorAquisicao() {
        return valorAquisicao;
    }

    public void atualizarValor(double novoValor) {
        this.valorAquisicao = novoValor;
    }

    public String exibirResumo() {
        return "Patrimônio: " + patrimonio
             + " | Descrição: " + descricao
             + " | Fabricante: " + fabricante
             + " | Valor: R$ " + String.format("%.2f", valorAquisicao);
    }

    public boolean valorUltrapassaLimite(double limite) {
        return valorAquisicao > limite;
    }
}