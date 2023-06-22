public class Usuario {
    public static void main(String[] args) throws Exception {
        
        smartTv smartTv = new smartTv();

        System.out.println(smartTv.ligada);

        smartTv.ligar();

        System.out.println( "A TV está:" +smartTv.ligada);

        System.out.println( "O canal inicial é:" + smartTv.canal);

        System.out.println( "O volume inicial é:" + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("O volume atual é:" + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("O volume atual é:" + smartTv.volume);

        smartTv.aumentarCanal();

        System.out.println( "O novo canal é:" + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.out.println( "O novo canal é:" + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        
        System.out.println( "O novo canal é:" + smartTv.canal);

        smartTv.mudarCanal(20);

        System.out.println( "==============================");
        System.out.println( "O canal atual é:" + smartTv.canal);
    }
}



