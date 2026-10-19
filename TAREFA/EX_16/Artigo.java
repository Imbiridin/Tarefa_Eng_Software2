package EX_16;

public class Artigo extends Conteudo {

    private static final int PALAVRAS_POR_MINUTO = 200;

    private int quantidadePalavras;

    public Artigo(String codigo, String titulo, String autor, int quantidadePalavras) {
        super(codigo, titulo, autor);
        if (quantidadePalavras <= 0) {
            throw new IllegalArgumentException("A quantidade de palavras deve ser maior que zero.");
        }
        this.quantidadePalavras = quantidadePalavras;
    }

    public int getQuantidadePalavras() {
        return quantidadePalavras;
    }

    @Override
    public int estimarTempoMinutos() {
        return (int) Math.ceil((double) quantidadePalavras / PALAVRAS_POR_MINUTO);
    }
}
