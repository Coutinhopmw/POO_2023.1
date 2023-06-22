package MESSENGERS;
import java.util.Scanner;
public class home {
    
    public static void main(String[] args) {
        
        MSNMessenger smi = null;

        String type  = "Whatsapp";

        if( type.equals("messenger")){
            smi = new Messenger();
        }else if(type.equals("Whatsapp")){
            smi = new Whatsapp();
        } else if(type.equals("Telegram")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMenagem();

    }
}

