public class Assalariado extends Empregado {
    // Atributos da classe
    private double salario;


    // Construtores da classe
    public Assalariado() {
        super();
        salario = 0;
    }

    public Assalariado(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    
    // Métodos da classe
    @Override
    public double vencimento() {
        // Eu não tenho ideia de como eu calcularia isso.
        return 0;
    }


    // Getters e Setters
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
