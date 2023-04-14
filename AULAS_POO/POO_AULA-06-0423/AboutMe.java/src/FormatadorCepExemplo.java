/* 
public class FormatadorCepExemplo {
     
    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatarCep("77021050");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExeption e) {
            e.printStackTrace();
        }
    }

    static String formatarCep (String cep) throws CepInvalidoExeption {
        if(cep.length() != 8){
            throw new CepInvalidoExeption();
        }
        return "77.021-050";
    }

}
 */ 
