package EX_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrupoPesquisa {

    private String nome;
    private boolean encerrado;
    private List<Pesquisador> pesquisadores;

    public GrupoPesquisa(String nome) {
        this.nome = nome;
        this.encerrado = false;
        this.pesquisadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Pesquisador> getPesquisadores() {
        return Collections.unmodifiableList(pesquisadores);
    }

    public int getQuantidadePesquisadores() {
        return pesquisadores.size();
    }

    public boolean isEncerrado() {
        return encerrado;
    }

    public void adicionarPesquisador(Pesquisador pesquisador) {
        if (pesquisador == null) {
            throw new IllegalArgumentException("O pesquisador é obrigatório.");
        }
        if (encerrado) {
            throw new IllegalStateException("O grupo está encerrado.");
        }
        if (pesquisadores.contains(pesquisador)) {
            throw new IllegalArgumentException("O pesquisador já participa deste grupo.");
        }
        pesquisadores.add(pesquisador);
        pesquisador.registrarGrupo(this);
    }

    // Encerrar o grupo desfaz os vínculos, mas NÃO elimina os pesquisadores
    public void encerrar() {
        for (Pesquisador p : pesquisadores) {
            p.removerGrupo(this);
        }
        pesquisadores.clear();
        encerrado = true;
    }
}
