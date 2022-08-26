/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Aluno {
    private int ra;
    private String nome;
    
    public Aluno(String ra, String nome) {
        setRa(ra);
        setNome(nome);
    }

    public int getRa() {
        return ra;
    }

    public static int checkRA(String ra) throws IllegalArgumentException {
        if (!ra.matches("\\d+"))
            throw new IllegalArgumentException("O RA deve possuir somente números.");

        if (ra.length() != 6)
            throw new IllegalArgumentException("O RA deve possuir exatamente 6 dígitos.");

        return Integer.parseInt(ra);
    }

    public void setRa(String ra) throws IllegalArgumentException {
        this.ra = checkRA(ra);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isEmpty())
            throw new IllegalArgumentException("O nome não pode estar vazio.");

        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome:  " + this.getNome() + " | " + "RA:  " + this.getRa() + "\n";
    }
}
