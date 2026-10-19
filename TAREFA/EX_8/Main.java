package EX_8;

public class Main {
    public static void main(String[] args) {
        Aluno ana = new Aluno("RA001", "Ana Souza");
        Aluno bruno = new Aluno("RA002", "Bruno Lima");
        Disciplina poo = new Disciplina("ES201", "Programação Orientada a Objetos");
        Disciplina bd = new Disciplina("ES202", "Banco de Dados");

        Matricula m1 = ana.matricular(poo, 1, 2025);
        Matricula m2 = ana.matricular(bd, 1, 2025);
        Matricula m3 = bruno.matricular(poo, 1, 2025);

        m1.lancarNota(8.5);
        m3.lancarNota(4.0);

        System.out.println(m1.exibirResumo());
        System.out.println(m2.exibirResumo());
        System.out.println(m3.exibirResumo());

        System.out.println(ana.getNome() + " cursa " + ana.getMatriculas().size() + " disciplina(s)");
        System.out.println(poo.getNome() + " tem " + poo.getQuantidadeMatriculas() + " aluno(s)");

        try {
            m2.lancarNota(11);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
