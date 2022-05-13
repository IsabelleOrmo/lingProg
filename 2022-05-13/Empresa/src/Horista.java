public class Horista extends Empregado {
    // Atributos da classe
    private double precoHora;
    private double horasTrabalhadas;


    // Construtores da classe
    public Horista() {
        super();
        precoHora = 0;
        horasTrabalhadas = 0;
    }

    public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas) {
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }


    // Métodos da classe
    @Override
    public double vencimento() {
        return 0; // aaaaaaaaaaaaaaaaaaaa
    }


    // Getters e setters
    public double getPrecoHora() {
        return this.precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
