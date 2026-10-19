package EX_5;

import java.time.LocalDate;

public class Artigo {

    private String codigo;
    private String titulo;
    private LocalDate dataPublicacao;
    private Autor autor;

    public Artigo(String codigo, String titulo, LocalDate dataPublicacao, Autor autor) {
        if (autor == null) {
            throw new IllegalArgumentException("Todo artigo precisa de um autor responsável.");
        }
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
        autor.adicionarArtigo(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public String exibirResumo() {
        return codigo + " - " + titulo + " (" + dataPublicacao + ") - Autor: " + autor.getNome();
    }
}
