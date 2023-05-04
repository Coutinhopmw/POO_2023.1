/*
    Escreva um programa que leia o número de um funcionário, 
    seu número de horas trabalhadas, o valor que recebe por hora 
    e calcula o salário desse funcionário. A seguir, mostre o número 
    e o salário do funcionário, com duas casas decimais.
 */
import java.util.Scanner;
public class Salario {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        double salario;

        System.out.println("Informe o ID do funcionário: ");
        int id = sc.nextInt();

        System.out.println("Informe a qtd de horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.println("Informe o valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();
            
           salario = horas * valorHora;

           System.out.println("ID: \n"+id);
           System.out.println("Valor a receber: "+ salario);

    }
}
