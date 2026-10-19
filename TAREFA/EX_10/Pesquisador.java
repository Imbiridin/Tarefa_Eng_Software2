package EX_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pesquisador {

    private String registro;
    private String nome;
    private List<GrupoPesquisa> grupos;

    public Pesquisador(String registro, String nome) {
        this.registro = registro;
        this.nome = nome;
        this.grupos = new ArrayList<>(); // pode existir sem nenhum grupo: 0..*
    }

    public String getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public List<GrupoPesquisa> getGrupos() {
        return Collections.unmodifiableList(grupos);
    }

    public int getQuantidadeGrupos() {
        return grupos.size();
    }

    // Sem "public": só GrupoPesquisa (mesmo pacote) mantém este vínculo
    void registrarGrupo(GrupoPesquisa grupo) {
        grupos.add(grupo);
    }

    void removerGrupo(GrupoPesquisa grupo) {
        grupos.remove(grupo);
    }
}
