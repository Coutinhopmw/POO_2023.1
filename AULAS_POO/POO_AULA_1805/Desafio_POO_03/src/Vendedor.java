public class Vendedor extends Funcionario {

    public Vendedor(String nome, String rg, float totalVendas) {
        super(nome, rg, totalVendas);
        //TODO Auto-generated constructor stub
    }

    private float vendas; //atributo de vendas

   // Os gets e seters só são necessários caso queira alterar os dados depois e buscas os dados
    public String getNome() {
        return nome;
    }
    public String getRg() {
        return Rg;
    }
    public float getTotalVendas() {
        return totalVendas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRg(String rg) {
        Rg = rg;
    }
    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

}