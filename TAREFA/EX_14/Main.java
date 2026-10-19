package EX_14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notificacao> fila = new ArrayList<>();
        fila.add(new NotificacaoEmail("ana@exemplo.com", "Seu pedido foi enviado.", "Pedido #1234"));
        fila.add(new NotificacaoSms("Ana Souza", "Seu código de acesso é 482910.", "(11) 91234-5678"));
        fila.add(new NotificacaoApp("Ana Souza", "Você tem uma nova mensagem.", "DEV-9F3A"));

        for (Notificacao n : fila) {
            n.enviar();
        }

        try {
            new NotificacaoSms("Ana Souza", "", "(11) 91234-5678");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
