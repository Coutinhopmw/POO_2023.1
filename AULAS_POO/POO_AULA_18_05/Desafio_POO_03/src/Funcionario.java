public class Funcionario {
    
    protected String nome; // Atributo nome.
    protected String Rg; // Atributo RG.
    protected float totalVendas; // Atributo totalVendas

    //Instaciando os dados
    public Funcionario(String nome, String rg, float totalVendas) {
        this.nome = nome;
        Rg = rg;
        this.totalVendas = totalVendas;
    }

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
}
