package EX_19;

public class Vaga {
    private String codigo;
    private String setor;
    private TipoVaga tipo;
    private boolean ocupada;
    private Permanencia permanenciaAtiva;

    public Vaga(String codigo, String setor, TipoVaga tipo) {
        this.codigo = codigo;
        this.setor = setor;
        this.tipo = tipo;
        this.ocupada = false;
    }

    
    public void ocupar(Permanencia p) {
        if (ocupada) {
            throw new IllegalStateException(
                "Vaga " + codigo + " já está ocupada.");
        }
        this.permanenciaAtiva = p;
        this.ocupada = true;
    }

    public void liberar() {
        this.permanenciaAtiva = null;
        this.ocupada = false;
    }

    /** Regra de negócio: compatibilidade entre tipo de vaga e veículo. */
    public boolean aceita(Veiculo v) {
        if (tipo == TipoVaga.MISTA) return true;
        return tipo == v.getTipoVagaCompativel();
    }

    public String getCodigo() { return codigo; }
    public String getSetor() { return setor; }
    public TipoVaga getTipo() { return tipo; }
    public boolean isOcupada() { return ocupada; }
    public Permanencia getPermanenciaAtiva() { return permanenciaAtiva; }

    @Override
    public String toString() {
        return String.format("Vaga[%s/%s, tipo=%s, ocupada=%b]",
                setor, codigo, tipo, ocupada);
    }
}
