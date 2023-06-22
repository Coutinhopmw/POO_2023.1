public class Elevador{
	private boolean portaAberta = false;
	private int andarCorrente = 1;
	private final int CAPACIDADE = 800;
	private final int ULTIMO_ANDAR = 10;
	private final int PRIMEIRO_ANDAR = 1;

	public void abrirPorta(){
		System.out.println("Abrindo porta.");
		portaAberta = true;
		System.out.println("Porta aberta.");
	}

	public void fecharPorta(){
		System.out.println("Fechando porta.");
		portaAberta = false;
		System.out.println("Porta fechada.");
	}

	public void subir(){
		System.out.println("Subindo 1 andar.");
		andarCorrente++;
		System.out.println("Andar: " + andarCorrente);
	}

	public void descer(){
		System.out.println("Descendo 1 andar.");
		andarCorrente--;
		System.out.println("Andar: " + andarCorrente);
	}

	public void setAndar(int andarDesejado){
		while (andarCorrente != andarDesejado){
			if(andarCorrente < andarDesejado){
				subir();
			}else{
				descer();
			}
		}
	}

	public int getAndar(){
		return andarCorrente;
	}

	public boolean isPortaAberta(){
		return portaAberta;
	}


    /**
     * @param portaAberta the portaAberta to set
     */
    public void setPortaAberta(boolean portaAberta) {
        this.portaAberta = portaAberta;
    }

    /**
     * @return int return the andarCorrente
     */
    public int getAndarCorrente() {
        return andarCorrente;
    }

    /**
     * @param andarCorrente the andarCorrente to set
     */
    public void setAndarCorrente(int andarCorrente) {
        this.andarCorrente = andarCorrente;
    }

}