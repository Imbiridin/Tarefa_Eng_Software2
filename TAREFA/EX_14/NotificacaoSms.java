package EX_14;

public class NotificacaoSms extends Notificacao {

    private String telefone;

    public NotificacaoSms(String destinatario, String mensagem, String telefone) {
        super(destinatario, mensagem);
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("O telefone é obrigatório.");
        }
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public void enviar() {
        System.out.println("[SMS] Para: " + telefone
                + " (" + getDestinatario() + ") | " + getMensagem());
    }
}