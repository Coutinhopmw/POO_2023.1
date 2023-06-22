public class Contador2 {
    public static void main(String[] args) {
        int total = soma(0); 
        System.out.println("Valor da soma é:" + total);
    }

    public static int soma(int soma) {
        for (int i = 500; i <= 700; i++) {
            soma = soma + i;
        }
        return soma;
    }
}
