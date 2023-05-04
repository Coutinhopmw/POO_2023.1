import java.util.Scanner;
public class ProdutoSimples {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Informe o valor 1: ");
       int num1 = scanner.nextInt();
       System.out.println("Informe o valor 2: ");
       int num2 = scanner.nextInt();

       num1 = num1 * num2;

       System.out.println("O valor final é: " + num1);
    }
}
