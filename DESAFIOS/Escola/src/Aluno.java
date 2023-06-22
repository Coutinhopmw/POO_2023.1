public class Aluno {
    private String nome;
    private int idade;
    private String sexo;
    private String endereco;
    private String CPF;


    public Aluno(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getSexo(){
        return sexo;
    }
}