public class Autodromo {
    
    public static void main(String[] args) {
        
        Carro jeep = new Carro();

        jeep.ligar();
        jeep.setChassi("hahahahha");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
        
        Moto z900 = new Moto();
       
        z900.ligar();
        z900.setChassi("000000000");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");

        Trator CBT = new Trator();

        CBT.ligar();
        CBT.setChassi("111111111111");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");


        //Veiculo coringa = jeep;
        //Veiculo coringa = z900;
        Veiculo coringa = CBT;

        coringa.ligar();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
