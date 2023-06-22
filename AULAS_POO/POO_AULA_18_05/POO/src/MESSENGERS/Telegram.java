package MESSENGERS;

public class Telegram extends MSNMessenger {
    

    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem telegram enviada");
    }

    @Override
    public void receberMenagem() {
        System.out.println("Mensagem telegram recebida");
    }
}
