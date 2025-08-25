package Interface_Notificacoes;

public class SMS implements Notificacao {
    @Override
    public String enviarMensagem(String mensagem) {
        return "Você recebeu um SMS!";
    }
}
