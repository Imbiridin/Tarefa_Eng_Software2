package EX_10;

public class Main {
    public static void main(String[] args) {
        Pesquisador ana = new Pesquisador("P001", "Ana Souza");
        Pesquisador bruno = new Pesquisador("P002", "Bruno Lima");
        Pesquisador carla = new Pesquisador("P003", "Carla Dias"); // sem grupo

        GrupoPesquisa ia = new GrupoPesquisa("Inteligência Artificial");
        GrupoPesquisa redes = new GrupoPesquisa("Redes de Computadores");

        ia.adicionarPesquisador(ana);
        ia.adicionarPesquisador(bruno);
        redes.adicionarPesquisador(ana); // Ana participa de dois grupos

        System.out.println("Ana participa de " + ana.getQuantidadeGrupos() + " grupo(s)");
        System.out.println("Carla participa de " + carla.getQuantidadeGrupos() + " grupo(s)");
        System.out.println(ia.getNome() + " tem " + ia.getQuantidadePesquisadores() + " pesquisador(es)");

        ia.encerrar();
        System.out.println("Depois de encerrar '" + ia.getNome() + "':");
        System.out.println("- grupo encerrado? " + ia.isEncerrado());
        System.out.println("- Ana participa de " + ana.getQuantidadeGrupos() + " grupo(s)");
        System.out.println("- Bruno participa de " + bruno.getQuantidadeGrupos() + " grupo(s)");
        System.out.println("- Bruno ainda existe: " + bruno.getNome());

        try {
            ia.adicionarPesquisador(carla);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
