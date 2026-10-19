package EX_3;


public class Ingresso {

    private String codigo;
    private String nomeEvento;
    private double preco;
    private boolean utilizado;

    public Ingresso(String codigo, String nomeEvento, double preco) {
        this.codigo = codigo;
        this.nomeEvento = nomeEvento;
        this.preco = preco;
        this.utilizado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isUtilizado() {
        return utilizado;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("O desconto deve estar entre 0 e 100%.");
        }
        preco = preco - (preco * percentual / 100);
    }

    public void utilizar() {
        if (utilizado) {
            throw new IllegalStateException("Este ingresso já foi utilizado.");
        }
        utilizado = true;
    }
}

