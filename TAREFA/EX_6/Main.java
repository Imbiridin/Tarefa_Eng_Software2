package EX_6;

public class Main {
    public static void main(String[] args) {
        Departamento ti = new Departamento("TI", "Tecnologia da Informação");
        Departamento rh = new Departamento("RH", "Recursos Humanos");

        Colaborador c1 = new Colaborador("1001", "Ana Souza", "Desenvolvedora", ti);
        Colaborador c2 = new Colaborador("1002", "Bruno Lima", "Analista de Suporte", ti);

        System.out.println(c1.exibirResumo());
        System.out.println(c2.exibirResumo());

        System.out.println(ti.getNome() + ": " + ti.getQuantidadeColaboradores() + " colaborador(es)");
        System.out.println(rh.getNome() + ": " + rh.getQuantidadeColaboradores() + " colaborador(es)");

        try {
            new Colaborador("1003", "Carla Dias", "Estagiária", null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
