package EX_9;

public class Main {
    public static void main(String[] args) {
        Musica m1 = new Musica("Manhã de Sol", "Banda Exemplo", 215);
        Musica m2 = new Musica("Noite Azul", "Banda Exemplo", 188);
        Musica m3 = new Musica("Caminho de Casa", "Duo Teste", 242);

        Playlist treino = new Playlist("Treino");
        Playlist estudo = new Playlist("Estudo");

        treino.adicionarMusica(m1);
        treino.adicionarMusica(m3);
        estudo.adicionarMusica(m3); // a mesma música em outra playlist
        estudo.adicionarMusica(m2);

        for (EntradaPlaylist e : treino.getEntradas()) {
            System.out.println(e.exibirResumo());
        }
        System.out.println("Treino: " + treino.getQuantidadeEntradas() + " entrada(s)");
        System.out.println("Estudo: " + estudo.getQuantidadeEntradas() + " entrada(s)");

        treino.excluir();
        System.out.println("Depois de excluir 'Treino': " + treino.getQuantidadeEntradas() + " entrada(s)");
        System.out.println("A música continua existindo: " + m1.exibirResumo());
        System.out.println("Estudo continua com " + estudo.getQuantidadeEntradas() + " entrada(s)");
    }
}
