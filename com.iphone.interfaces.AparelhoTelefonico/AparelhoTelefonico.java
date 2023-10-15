public interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void receberLigacao(String chamador);
    void encerrarLigacao();
    void enviarMensagem(String destinatario, String mensagem);
    void receberMensagem(String remetente, String mensagem);
}
    @Override
    public void fazerLigacao(String numero) {
        if (!isOnCall) {
            System.out.println("Ligando para " + numero);
            isOnCall = true;
            callNumber = numero;
        }
    }

    @Override
    public void receberLigacao(String chamador) {
        if (!isOnCall) {
            System.out.println("Recebendo chamada de " + chamador);
            isOnCall = true;
            receivedCallFrom = chamador;
        }
    }

    @Override
    public void encerrarLigacao() {
        if (isOnCall) {
            System.out.println("Encerrando chamada.");
            isOnCall = false;
            callNumber = "";
            receivedCallFrom = "";
        }
    }

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("Enviando mensagem para " + destinatario + ": " + mensagem);
        messageBuffer += "Você enviou uma mensagem para " + destinatario + ": " + mensagem + "\n";
    }

    @Override
    public void receberMensagem(String remetente, String mensagem) {
        System.out.println("Recebendo mensagem de " + remetente + ": " + mensagem);
        messageBuffer += "Você recebeu uma mensagem de " + remetente + ": " + mensagem + "\n";
    }