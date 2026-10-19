package EX_4;

public class Curso {

    private String codigo;
    private String titulo;
    private int cargaHoraria;
    private String nivelDificuldade;
    private int quantidadeInscritos;

    public Curso(String codigo, String titulo, int cargaHoraria, String nivelDificuldade) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
        this.nivelDificuldade = nivelDificuldade;
        this.quantidadeInscritos = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public int getQuantidadeInscritos() {
        return quantidadeInscritos;
    }

    public void inscreverAluno() {
        quantidadeInscritos++;
    }

    public boolean cargaHorariaMaiorQue(int valor) {
        return cargaHoraria > valor;
    }

}
