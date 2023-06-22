public class App {
    public static void main(String[] args)  {
        
        Calculadora calculadora = new Calculadora();

        int total1 = calculadora.somar(3,4);
        System.out.println(total1);

        double total2 = calculadora.somar(1.2,2.8);
        System.out.println(total2);

        long total3 = calculadora.somar(2l,5l);
        System.out.println(total3);

        float total4 = calculadora.somar(3,3.2f);
        System.out.println(total4);

        float total5 = calculadora.somar(2.0f,3.2f);
        System.out.println(total4);
        
        
    }
}
