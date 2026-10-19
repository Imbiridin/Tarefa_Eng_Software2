package EX_13;

public class Administrador extends Usuario {

    private String matriculaFuncional;
    private int nivelAcesso;

    public Administrador(String nome, String cpf, String email, String senha,
                         String matriculaFuncional, int nivelAcesso) {
        super(nome, cpf, email, senha);
        this.matriculaFuncional = matriculaFuncional;
        this.nivelAcesso = nivelAcesso;
    }

    public String getMatriculaFuncional() {
        return matriculaFuncional;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    @Override
    public String exibirResumo() {
        return "[Administrador] " + super.exibirResumo()
             + " | Matrícula: " + matriculaFuncional + " | Nível: " + nivelAcesso;
    }
}

