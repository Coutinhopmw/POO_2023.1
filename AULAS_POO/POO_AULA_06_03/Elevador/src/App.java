public class App {
	
	public static void main(String[] args) {
				
		Elevador elevador = new Elevador();
		elevador.abrirPorta();
		elevador.fecharPorta();
		elevador.descer();
		elevador.subir();
		elevador.setAndar(elevador.PRIMEIRO_ANDAR);
		elevador.descer();
		elevador.subir();
		elevador.abrirPorta();
		elevador.fecharPorta();

		int andarCorrente = elevador.getAndar();
		System.out.println("Andar corrente: " + andarCorrente);

		elevador.setAndar(5);
	}

}
