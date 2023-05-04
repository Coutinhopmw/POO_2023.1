/*
 * Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 
 * A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
   Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++),
    assumem que o resultado da divisão entre dois inteiros é outro inteiro.
 */
import java.util.Scanner;
public class Esfera {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio da esfera: ");
        Double raio = sc.nextDouble();

        Double pi = 3.14159;

        raio = (4.0/3.0) * pi * raio;

        System.out.println("O valor é: " + raio);
    }
}
