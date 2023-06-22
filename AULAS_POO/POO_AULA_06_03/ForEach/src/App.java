public class App {
    public static void main(String[] args) throws Exception {
        
        String[] titulosDeLivros = new String[5];
		titulosDeLivros[0] = "O guia dos javaneses malucos";
		titulosDeLivros[1] = "Java e o futuro tecnologico";
		titulosDeLivros[2] = "Java e o mundo corporativo";
		titulosDeLivros[3] = "O fim dos tempos";
		titulosDeLivros[4] = "O universo dos javaneses ninjas";
		System.out.println("imprimindo a lista de titulos de livros usando loop for otimizado.\n");

		/*
		A cada iteração a variavel titulo recebe o valor do item do array.
		Ex: na primeira iteração a variavel titulo recebe o item do indice 0, na segunda
		recebe o item do indice 1 e assim por diante.
		*/
		
		for(String titulo: titulosDeLivros){
			System.out.println("Titulo: " + titulo);
		}

	}
}

