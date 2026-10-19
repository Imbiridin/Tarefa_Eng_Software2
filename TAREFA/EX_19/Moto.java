package EX_19;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String placa, String modelo, int cilindrada) {
        super(placa, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() { return cilindrada; }

    @Override
    public TipoVaga getTipoVagaCompativel() { return TipoVaga.MOTO; }

    @Override
    public String toString() {
        return super.toString() + " cilindrada=" + cilindrada;
    }
}
