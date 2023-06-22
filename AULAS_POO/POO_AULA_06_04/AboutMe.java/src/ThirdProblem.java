import java.util.Scanner;

public class ThirdProblem {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do desafiante:");
        String nome = leitor.nextLine();

        System.out.println("Infome a quatidade de testes:");
        int c = leitor.nextInt();

        System.out.println("Informe a quantidade de força");
        int N = leitor.nextInt();

        for (int i = 0; i < c; i++) {
            nome = leitor.next();
            N = leitor.nextInt();
            if (nome.equals("Thor")) {
                System.out.println("Parabéns Thor");
            }
            else {
                System.out.println("Você não é capaz de levantar o martelo ;)");
            }
        }
    }

}
