public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo",1),
    RIO_JANEIRO("RJ","Rio de Janeiro",2),
    PIAUI("PI","Piauí",3),
    MARANHAO("MA","Maranhão",4),
    TOCANTINS("TO","Tocantins",5);

    private String nome;
    private String sigla;
    private int CodIbge;

 

    private EstadoBrasileiro(String nome, String sigla, int codIbge) {
        this.nome = nome;
        this.sigla = sigla;
        this.CodIbge = codIbge;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getCodIbge(){
        return codIbge;
    }

    public String getSiglaMaiusculo(){
        return sigla.toUpperCase();
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
