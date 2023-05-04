/*
 Leia 3 valores, no caso, variáveis A, B e C, 
 que são as três notas de um aluno. A seguir, calcule a média do aluno, 
 sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
 Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 */
import java.util.Scanner;
public class SegundaMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a 1ª nota: ");
        Double nota1 = sc.nextDouble();

        System.out.println("Informe o 2º valor: ");
        Double nota2 = sc.nextDouble();

        System.out.println("Informe a 3ª nota: ");
        Double nota3 = sc.nextDouble();

        nota1 =  nota1 * 2;
        nota2 =  nota2 * 3;
        nota3 =  nota3 * 5;

        nota1 = (nota1 + nota2 + nota3)/10.0;

        System.out.println("O valor final: " + nota1);
    }
}
