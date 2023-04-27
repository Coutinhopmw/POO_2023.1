package lanchonete;
import lanchonete.atendimento.cozinha.*;
import lanchonete.area.cliente.*;
import lanchonete.atendimento.*;

public class Estabelecimento {
    public class Estabelecimento {
        public static void main(String[] args) {
            Cozinheiro cozinheiro = new Cozinheiro();
            //ações que não precisam estarem disponíveis para toda a aplicação
            //ações que estabelecimento precisa ter ciência

            
            Almoxarife almoxarife = new Almoxarife();
            //ações que não precisam estarem disponíveis para toda a aplicação
            
            //ação que somente o seu pacote cozinha precisa conhecer (default)
            
            
            Atendente atendente = new Atendente();
            //ação que somente o seu pacote cozinha precisa conhecer (default)
            
            Cliente cliente = new Cliente();

            
            //não deveria, mas o estabelecimento
            //ainda não definiu normas de atendimento
            cliente.pegarPedidoBalcao();
            
            //esta ação é muito sigilosa, qua tal ser privada ?
            cliente.consultarSaldoAplicativo();
            
            //já pensou os clientes ouvindo que o gás acabou ?
            cozinheiro.pedirParaTrocarGas(atendente);
            cozinheiro.pedirParaTrocarGas(almoxarife);
            
        }
    }
}
