/*
    Leia os quatro valores correspondentes aos eixos x e y de 
    dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e 
    calcule a distância entre eles, mostrando 4 casas decimais 
    após a vírgula, segundo a fórmula:
 */
import java.lang.FdLibm.Pow;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
public abstract class DistanciaEntrePontos {
    public static void main(String[] args) {
        
        int dist;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informo valor X1: ");
        int x1 = sc.nextInt();

        System.out.println("Informe o valor de Y1: ");
        int y1 = sc.nextInt();

        System.out.println("INforme o valor de X2: ");
        int x2 = sc.nextInt();

        System.out.println("Informe o valor de Y2: ");
        int y2 =  sc.nextInt();

        dist = Math.sqrt( (Math.pow(x2, 2)) - (Math.pow(x1,2)) + (Math.pow(y2, 2)) - (Pow.Math(y1,2)));

        System.out.println(dist);
    }
}
