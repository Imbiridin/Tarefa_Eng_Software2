package EX_14;

public class NotificacaoEmail extends Notificacao {

    private String assunto;

    public NotificacaoEmail(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        if (assunto == null || assunto.trim().isEmpty()) {
            throw new IllegalArgumentException("O assunto é obrigatório.");
        }
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    @Override
    public void enviar() {
        System.out.println("[E-MAIL] Para: " + getDestinatario()
                + " | Assunto: " + assunto + " | " + getMensagem());
    }
}