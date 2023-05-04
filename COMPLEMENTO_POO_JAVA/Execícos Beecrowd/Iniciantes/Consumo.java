/*
 * Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
 *  e o total de combustível gasto (em litros).
 */
import java.util.Scanner;
public class Consumo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe as distancia percorrida em Kms: ");
        Double distance = sc.nextDouble();

        System.out.println("Informe a qtd de combustível: ");
        Double litros = sc.nextDouble();

        distance = distance/litros;

        System.out.println(distance);
    }
}
