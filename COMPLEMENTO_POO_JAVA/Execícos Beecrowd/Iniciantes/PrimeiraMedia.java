
/*
Leia 2 valores de ponto flutuante de dupla precisão A e B,
que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, 
sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). 
Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 */
import java.util.Scanner;
public class PrimeiraMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a 1ª nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Informe a 2ª nota: ");
        double nota2 = sc.nextDouble();

        nota1 = nota1 * 3.5;
        System.out.println("valor n1 é: " + nota1);
        nota2 = nota2 * 7.5;
        System.out.println("valor n2 é: " + nota2);

        nota1 =  (nota1 + nota2) /11.0;

        System.out.println("valor final é: " + nota1);
    }
    
}
