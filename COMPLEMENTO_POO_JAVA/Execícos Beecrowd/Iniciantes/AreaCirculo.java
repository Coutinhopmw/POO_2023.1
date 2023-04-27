import java.util.Scanner;
public class AreaCirculo {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    double pi = 3.14159; 
    System.out.println("Informe o raio do circulo:");
    Double raio = scanner.nextDouble();
    Double area;
    raio = Math.pow(raio,2);
    area = pi * raio;
    System.out.printf("A=%.4f%n",area);
  }
}