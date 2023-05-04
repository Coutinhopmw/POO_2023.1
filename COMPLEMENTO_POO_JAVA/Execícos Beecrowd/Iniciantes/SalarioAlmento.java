/*
    Faça um programa que leia o nome de um vendedor, 
    o seu salário fixo e o total de vendas efetuadas 
    por ele no mês (em dinheiro). Sabendo que este vendedor
    ganha 15% de comissão sobre suas vendas efetuadas, informar 
     total a receber no final do mês, com duas casas decimais.
 */
import java.util.Scanner;
public class SalarioAlmento {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor: ");
        String nome = sc.next();

        System.out.println("Informe o valor od seu salário: ");
        Double salario = sc.nextDouble();

        System.out.println("Infome o valor toral em vendas no mês: ");
        Double comissao = sc.nextDouble();

        comissao = comissao * 0.15;

        salario = comissao + salario;

        System.out.println("O valor a receber: " + salario);

    }
}
