package interfaces.estabelecimento;
import interfaces.copiadora.Copiadora;
import interfaces.copiadora.Xerox;

public static void main (String [] args){
    //Impressora impressora
    
    EquipamentoMultifuncional eum = new EquipamentoMultifuncional;
    Impressora impressora3 = eum;
    Digitalizadora digitalizadora = eum;
    Copiadora copiadora = eum;
    System.out,println("---------------------");
    impressora3.imprimir();
    digitalizadora.digitalizadora();
    copiadora.copiar();
}



public class App {
    public static void main(String[] args) {
       
    }
}
