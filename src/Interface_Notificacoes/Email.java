package Interface_Notificacoes;

public class Email implements Notificacao {
    @Override
    public String enviarMensagem(String mensagem) {
        return "Você recebeu um Email!";
    }
}
