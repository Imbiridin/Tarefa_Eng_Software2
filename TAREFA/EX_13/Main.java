package EX_13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana Souza", "111.111.111-11", "ana@exemplo.com", "ana123");
        Administrador carlos = new Administrador("Carlos Mendes", "222.222.222-22",
                "carlos@exemplo.com", "adm456", "ADM-001", 3);

        ana.adicionarPontos(150);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(ana);
        usuarios.add(carlos);

        for (Usuario u : usuarios) {
            System.out.println(u.exibirResumo());
        }

        System.out.println("Senha correta? " + ana.autenticar("ana123"));
        System.out.println("Senha errada? " + ana.autenticar("0000"));

        
    }
}
