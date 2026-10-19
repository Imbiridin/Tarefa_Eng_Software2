package EX_19;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String placa, String modelo, int quantidadePortas) {
        super(placa, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() { return quantidadePortas; }

    @Override
    public TipoVaga getTipoVagaCompativel() { return TipoVaga.CARRO; }

    @Override
    public String toString() {
        return super.toString() + " portas=" + quantidadePortas;
    }
}
