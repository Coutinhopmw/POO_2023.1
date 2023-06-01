public abstract class Veiculo {
    
    private String chassi;

    /**
     * @return String return the chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();

}
