public class Comissionado extends Empregado {
    // Atributos da classe
    private double totalVenda;
    private double taxaComissao;


    // Construtores
    public Comissionado() {
        super();
        totalVenda = 0;
        taxaComissao = 0;
    }

    public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }


    // Métodos da classe
    @Override
    public double vencimento() {
        // ????
        return 0;
    }


    // Getters e Setters
    public double getTotalVenda() {
        return this.totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return this.taxaComissao / 100;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
}
