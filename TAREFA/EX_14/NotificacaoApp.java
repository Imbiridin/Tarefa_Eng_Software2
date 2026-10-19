package EX_14;

public class NotificacaoApp extends Notificacao {

    private String idDispositivo;

    public NotificacaoApp(String destinatario, String mensagem, String idDispositivo) {
        super(destinatario, mensagem);
        if (idDispositivo == null || idDispositivo.trim().isEmpty()) {
            throw new IllegalArgumentException("O identificador do dispositivo é obrigatório.");
        }
        this.idDispositivo = idDispositivo;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    @Override
    public void enviar() {
        System.out.println("[APP] Dispositivo: " + idDispositivo
                + " (" + getDestinatario() + ") | " + getMensagem());
    }
}
