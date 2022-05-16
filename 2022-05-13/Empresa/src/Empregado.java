import java.util.ArrayList;

public abstract class Empregado {
    // Atributos da classe
    private String nome;
    private String sobrenome;
    private String cpf;
    private int codFunc;
    private static int qntFunc;


    // Construtores da classe
    public Empregado() {
        nome = "nome";
        sobrenome = "sobrenome";
        cpf = "00000000000";
    }

    public Empregado(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.codFunc = ++qntFunc;
    }


    // Métodos da classe
    public abstract double vencimento();

    public String getNomeCompleto() {
        return sobrenome + ", " + nome;
    }

    public static double totalVencimento(ArrayList<Empregado> listaEmpregados) {
        double sumVendas = 0;
        
        for (Empregado emp : listaEmpregados) {
            sumVendas += emp.vencimento();
        }

        return sumVendas;
    }


    // Getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static int getQntFunc() {
        return qntFunc;
    }

    public int getCodFunc() {
        return codFunc;
    }
}
