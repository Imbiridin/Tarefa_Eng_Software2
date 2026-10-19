package EX_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Categoria {

    private String codigo;
    private String nome;
    private Categoria categoriaPai;          
    private List<Categoria> subcategorias;   
    private List<Produto> produtos;         

    
    public Categoria(String codigo, String nome) {
        this(codigo, nome, null);
    }

    
    Categoria(String codigo, String nome, Categoria categoriaPai) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoriaPai = categoriaPai;
        this.subcategorias = new ArrayList<>();
        this.produtos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoriaPai() {
        return categoriaPai;
    }

    public List<Categoria> getSubcategorias() {
        return Collections.unmodifiableList(subcategorias);
    }

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }

    public Categoria criarSubcategoria(String codigo, String nome) {
        Categoria sub = new Categoria(codigo, nome, this);
        subcategorias.add(sub);
        return sub;
    }

    public boolean ehRaiz() {
        return categoriaPai == null;
    }

 
    public String getCaminho() {
        if (ehRaiz()) {
            return nome;
        }
        return categoriaPai.getCaminho() + " > " + nome;
    }


    void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
}
