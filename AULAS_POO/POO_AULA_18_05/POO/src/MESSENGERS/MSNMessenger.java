package MESSENGERS;

public abstract class MSNMessenger {
    
    public abstract void enviarMensagem();
    public abstract void receberMenagem();


    protected void validarConectadoInternet(){
        System.out.println("Validando conexão");
    }
    protected void salvarHistroricoMensagem(){
        System.out.println("Salvando histórico");        
    }
}
