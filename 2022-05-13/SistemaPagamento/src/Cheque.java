public class Cheque extends Pagamento implements TipoPagamento {
    private static int diasFaturamento = 3;
    private static double taxa = 3;

    public Cheque(double valor) {
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
        Cheque.taxa = taxa;
    }

}
