package controller;

import java.util.ArrayList;
import model.Aluno;

public class AlunoController {
    // Atributos da classe
    private ArrayList<Aluno> listAluno;


    // Construtores da classe
    public AlunoController() {
        listAluno = new ArrayList<Aluno>();
    }


    // Métodos da classe
    public void cadastrar(String nome, int idade) {
        listAluno.add(new Aluno(nome, idade));
    }


    // Getters e setters
    public ArrayList<Aluno> getListAluno() {
        return this.listAluno;
    }

    public void setListAluno(ArrayList<Aluno> listAluno) {
        this.listAluno = listAluno;
    }
}
