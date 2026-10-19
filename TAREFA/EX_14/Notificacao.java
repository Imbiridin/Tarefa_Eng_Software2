package EX_14;

public abstract class Notificacao {

    private String destinatario;
    private String mensagem;

    protected Notificacao(String destinatario, String mensagem) {
        if (destinatario == null || destinatario.trim().isEmpty()) {
            throw new IllegalArgumentException("O destinatário é obrigatório.");
        }
        if (mensagem == null || mensagem.trim().isEmpty()) {
            throw new IllegalArgumentException("A mensagem é obrigatória.");
        }
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    
    public abstract void enviar();
}