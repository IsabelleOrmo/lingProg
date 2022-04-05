public class Funcionario {
    private String nome;
    protected float salario;

    public Funcionario() {
        nome = "";
        salario = 0;
    }

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = verifySalario(salario);
    }

    public float calculaBonificacao() {
        return salario * 0.1F; 
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = verifySalario(salario);
    }

    private float verifySalario(float salario) {
        if (salario < 0) {
            return 0; 
        } else {
            return salario;
        }
    }

    public void mostraDados(){
        System.out.println("\n\n\n");
        System.out.println("Nome:  " + nome);
        System.out.println("Salário:  " + salario);
    }
}
