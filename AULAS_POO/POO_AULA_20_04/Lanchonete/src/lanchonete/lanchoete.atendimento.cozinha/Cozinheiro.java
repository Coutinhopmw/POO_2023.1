public class Cozinheiro {
     // Pode ser default
    public void adicionarlancheNoBalcao(){
        System.out.println("Adicionando lanche natural hamburger no balcão");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcão");
    }
    // Pode ser default
     void adicionarComboNoBalcao(){
        adicionarComboNoBalcao();
        adicionarSucoNoBalcao();
    }
     void prepararLanche(){
        System.out.println("Preparando lanche tipo amburguer");
    }
     void prepararVitamina(){
        System.out.println("Prepando vitamina");
    }
     void prepararCombo(){
       prepararCombo();
       prepararLanche();
    }
     void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }
    public void selecionarIngredientesVitamina(){
        System.out.println("Selecionando fruta, leite");
    }
    public void lavarIngredientes(){
        System.out.println("lavando ingredientes");
    }
    public void baterVitaminasLiquidificador(){
        System.out.println("Batendo vitamina no liquidificador");
    }
    public void fritarIngreditensLanche(){
        System.out.println("Fritando a carne e ovo para o hanburguer");
    }
    
    public void pedirParaTrocarGas(Almoxarife meu_Amigo){
        meu_Amigo.trocarGas();
    }
    public void pedirIgredientes(Almoxarife almoxarife){
       almoxarife.entregarIngredientes();
    }

}
