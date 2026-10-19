package EX_18;

public class Instrutor extends Pessoa {
    private String registroProfissional;
    private String especialidade;

    public Instrutor(String nome, String cpf, String telefone, String email,
                     String registroProfissional, String especialidade) {
        super(nome, cpf, telefone, email);
        this.registroProfissional = registroProfissional;
        this.especialidade = especialidade;
    }

    public String getRegistroProfissional() { return registroProfissional; }
    public String getEspecialidade() { return especialidade; }

    @Override
    public String toString() {
        return "Instrutor[" + super.toString() +
               ", registro=" + registroProfissional +
               ", especialidade=" + especialidade + "]";
    }
}