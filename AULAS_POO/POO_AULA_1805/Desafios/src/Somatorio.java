public class Somatorio {
    
    public static void main(String[] args) {
       int total = somando(0);
       System.out.println("Somatório:"+ total);
    }

    public static int somando(int somatorio) {
        for (int i = 100; i <= 500; i++) {
            if(i%2 == 0){
                somatorio = somatorio + i;
            }
        }
        return somatorio;
    }
}
