package model;

public class Aluno {
    // Atributos da classe
    private String nome;
    private int idade;


    // Métodos da classe
    public Aluno(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }


    // Getters e setters
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
}
