package EX_4;

public class Main {
    public static void main(String[] args) {
        Curso c = new Curso("CUR-001", "Java para Iniciantes", 40, "Básico");

        System.out.println("Inscritos: " + c.getQuantidadeInscritos());

        c.inscreverAluno();
        c.inscreverAluno();
        c.inscreverAluno();
        System.out.println("Inscritos após 3 inscrições: " + c.getQuantidadeInscritos());

        System.out.println("Carga horária maior que 30h? " + c.cargaHorariaMaiorQue(30));
        System.out.println("Carga horária maior que 60h? " + c.cargaHorariaMaiorQue(60));
    }
}
