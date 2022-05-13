public class App {
    public static void main(String[] args) throws Exception {
        CartaoCredito cartao = new CartaoCredito();
        CartaoCredito.setDiasPagamento(10);

        System.out.println("Taxa atual do Pagamento:  " + Pagamento.getDiasPagamento());
        System.out.println("Taxa de pagamento do cartão de crédito:  " + CartaoCredito.getDiasPagamento());
        System.out.println("Taxa do Pagamento:  " + Pagamento.getDiasPagamento()); 
    }
}
