/*
 * Neste problema, deve-se ler o código de uma peça 1,
 * o número de peças 1, o valor unitário de cada peça 1, 
 * o código de uma peça 2, o número de peças 2 e o valor unitário 
 * de cada peça 2. Após, calcule e mostre o valor a ser pago.
 */
import java.util.Scanner;
public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código da peça 1ª peça: ");
        int id1 = sc.nextInt();

        System.out.println("Informe  o numero da 1ª peça: ");
        int num1 = sc.nextInt();

        System.out.println("Informe o valor da 1ª peça: ");
        Double valor1 = sc.nextDouble();

        System.out.println("Informe o código da 2ª peça: ");
        int id2 = sc.nextInt();

        System.out.println("Informe o número da 2ª peça: ");
        int num2 = sc.nextInt();

        System.out.println("Informe o valor da 2ª peça: ");
        Double valor2 = sc.nextDouble();

        valor1 =  valor1 + valor2;

        System.out.println("Total: " + valor1);

    }
}
