public class CartaoCredito extends Pagamento implements TipoPagamento {
    private static int tempoVencimento = 20;
    private static double taxa = 10;

    public CartaoCredito(double valor) {
        super(valor);
    }

    // Métodos da classe
    @Override
    public int getDiasFaturamento() {
        return getTempoVencimento();
    }

    @Override
    public double getPorcentagemFinanceiraPaga() {
        return getValor() * getTaxa();
    }


    // Getters e setters
    public static int getTempoVencimento() {
        return tempoVencimento;
    }

    public static void setTempoVencimento(int tempoVencimento) {
        CartaoCredito.tempoVencimento = tempoVencimento;
    }

    public static double getTaxa() {
        return taxa * 0.01f;
    }

    public static void setTaxa(double taxa) {
        CartaoCredito.taxa = taxa;
    }

}
