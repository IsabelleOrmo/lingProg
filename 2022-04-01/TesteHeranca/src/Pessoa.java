public class Pessoa {
    protected String nome;
    private int idade;
    private boolean feliz;
    private long cpf;
    private estadoCivil eCivil;

    public Pessoa() {
        nome = "";
        idade = 0;
        feliz = false; 
        cpf = 0; 
        eCivil = estadoCivil.SOLTEIRO;
    }

    public Pessoa(String nome, int idade, Boolean feliz, long cpf, estadoCivil eCivil) {
        this.nome = nome;
        this.idade = idade; 
        this.feliz = feliz;
        this.cpf = cpf; 
        this.eCivil = eCivil;
    }

    public enum estadoCivil  {
        SOLTEIRO,
        CASADO,
        DIVORCIADO,
        VIUVO
    } 
    
    public estadoCivil getECivil() {
        return this.eCivil;
    }

    public void setECivil(estadoCivil eCivil) {
        this.eCivil = eCivil;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isFeliz() {
        return this.feliz;
    }

    public void setFeliz(boolean feliz) {
        this.feliz = feliz;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
