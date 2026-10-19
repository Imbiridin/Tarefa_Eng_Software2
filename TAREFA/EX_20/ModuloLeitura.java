package EX_20;

public class ModuloLeitura extends Modulo {
    private int paginas;
    private int palavrasPorMinuto;

    public ModuloLeitura(String titulo, int ordem, int cargaHoraria,
                         int paginas, int palavrasPorMinuto) {
        super(titulo, ordem, cargaHoraria);
        this.paginas = paginas;
        this.palavrasPorMinuto = palavrasPorMinuto;
    }

    @Override
    public double tempoEstimado() {
        int palavrasPorPagina = 300; // premissa
        return (paginas * palavrasPorPagina) / (double) palavrasPorMinuto;
    }
}
