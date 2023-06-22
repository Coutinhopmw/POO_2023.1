package MESSENGERS;

public  class Messenger extends MSNMessenger {
    
    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem messenger enviada");
    }

    @Override
    public void receberMenagem() {
        System.out.println("Mensagem messenger recebida");
    }
}