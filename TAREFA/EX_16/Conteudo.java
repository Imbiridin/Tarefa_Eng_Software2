package EX_16;

public abstract class Conteudo {

    private String codigo;
    private String titulo;
    private String autor;

    protected Conteudo(String codigo, String titulo, String autor) {
        if (codigo == null || codigo.trim().isEmpty()
                || titulo == null || titulo.trim().isEmpty()
                || autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("Código, título e autor são obrigatórios.");
        }
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    
    public abstract int estimarTempoMinutos();

    public String exibirResumo() {
        return "[" + getClass().getSimpleName() + "] " + codigo + " - " + titulo
             + " (" + autor + ") - Tempo estimado: " + estimarTempoMinutos() + " min";
    }
}