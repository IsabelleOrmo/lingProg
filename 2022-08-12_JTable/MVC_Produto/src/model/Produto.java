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
public class Produto {
    private String codigo;
    private String descricao;
    private double preco;


    public Produto(String codigo, String descricao, double preco) {
        setCodigo(codigo);
        setDescricao(descricao);
        setPreco(preco);
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }


    
	private void setCodigo(String codigo) {
            this.codigo = codigo;
	}

	private void setDescricao(String descricao) {
		this.descricao = descricao;
    }

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
