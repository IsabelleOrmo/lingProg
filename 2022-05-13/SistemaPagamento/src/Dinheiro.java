public class Dinheiro extends Pagamento implements TipoPagamento {
    private static int diasFaturamento = 0;
    private static double taxa = 0;

    public Dinheiro(double valor) {
        super(valor);
    }

    // Métodos da classe
    @Override
    public int getDiasFaturamento() {
        return diasFaturamento;
    }

    @Override
    public double getPorcentagemFinanceiraPaga() {
        return getValor() * getTaxa();
    }


    // Getters e setters
    public static double getTaxa() {
        return taxa * 0.01f;
    }

    public static void setTaxa(double taxa) {
        Dinheiro.taxa = taxa;
    }

}
