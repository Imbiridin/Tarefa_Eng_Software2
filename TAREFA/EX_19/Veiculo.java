package EX_19;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected Cliente cliente;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public Cliente getCliente() { return cliente; }
    void setCliente(Cliente cliente) { this.cliente = cliente; }

    public abstract TipoVaga getTipoVagaCompativel();

    @Override
    public String toString() {
        return String.format("%s[placa=%s, modelo=%s]",
                getClass().getSimpleName(), placa, modelo);
    }
}
