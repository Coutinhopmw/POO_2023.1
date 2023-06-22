public class App {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 100) {
            contador++;
            double random = ((Math.random() * 50) + 1);

            System.out.println("Valor entre 0 x " + contador + ": " + random);
        }
    }
}