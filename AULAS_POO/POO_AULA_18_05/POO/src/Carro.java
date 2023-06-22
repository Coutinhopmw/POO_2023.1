public class Carro extends Veiculo {

    public void ligar(){
        conferindoCanbio();
        confereCombustivel();
        System.out.println("Carro LIGADO");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustível");
    }

    private void conferindoCanbio(){
        System.out.println("Cambio no P tá ok");
    }

}
