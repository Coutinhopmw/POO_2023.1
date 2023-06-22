package interfaces.multifuncional;
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora,Impressora {

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL'");
    }

    @Override
    public void digitalizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void copiar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
 
}
