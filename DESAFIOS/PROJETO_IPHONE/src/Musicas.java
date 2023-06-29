public class Musicas implements Iphone {
    private int volume;
    private boolean ligado;
    private boolean tocando;


    public Musicas(int volume, boolean ligado, boolean tocando) {
        this.volume = volume;
        this.ligado = false;
        this.tocando = false;
    }

    /**
     * @return int return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return boolean return the ligado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /**
     * @return boolean return the tocando
     */
    public boolean isTocando() {
        return tocando;
    }

    /**
     * @param tocando the tocando to set
     */
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void ligar() {
        if (ligado == (false)) {
            System.out.println("APP MUSICAS LIGADO");
            setLigado(getLigado == true);
        }else{
            System.out.println("APP MUSICAS ESTÁ DESLIGADO");
        }
    }

    public void desligar() {
        if (ligado == true) {
            System.out.println("APP MUSICA ESTÁ DESLIGANDO");
            setLigado(false);
        }else {
            System.out.println("ERRO NÃO FOI POSSILVEL DESLIGAR O APP MUSICAS");
        }
    }

    public void play() {
       if (tocando == false) {
            System.out.println("PLAY");
            setTocando(false);
        }else {
            System.out.println("ERRO NÃO FOI POSSILVEL REPRODUZIR SUA MUSICA");
        }
    }

    public void pause() {
          if (tocando == true) {
            System.out.println("PAUSE");
            setLigado(false);
        }else {
            System.out.println("ERRO NÃO FOI POSSILVEL REPRODUZIR SUA MUSICA");
        }
    }

    public void nextMusic() {
         if (tocando == true) {
            System.out.println("PAUSE");
            setLigado(false);
        }else {
            System.out.println("ERRO NÃO FOI POSSILVEL REPRODUZIR SUA MUSICA");
        }
    }

    public void prevMusic() {
         if(ligado == true) {
            if(tocando == true){
                System.out.println("NEXT");
            }else{
                System.out.println("ERRO NÃO FOI POSSILVEL AVANCAR");
            }
        }else {
            System.out.println("ERRO APP MUSICA ESTA DESATIVADO");
        }
    }

    @Override
    public void musicas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'musicas'");
    }

    @Override
    public void telefone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'telefone'");
    }

    @Override
    public void navegador() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'navegador'");
    }

}
