public class App {
    public static void main(String[] args) throws Exception {
        Poupanca poupanca1 = new Poupanca(2000);
        Poupanca poupanca2 = new Poupanca();

        poupanca2.setSaldo(3000);
        
        poupanca1.calcularJurosMensais();
        poupanca2.calcularJurosMensais();

        System.out.printf("saldo 1:  %.2f\n", poupanca1.getSaldo());
        System.out.printf("saldo 2:  %.2f\n", poupanca2.getSaldo());

        Poupanca.setTaxaJuros(4);

        poupanca1.calcularJurosMensais();
        poupanca2.calcularJurosMensais();

        System.out.printf("saldo 1:  %.2f\n", poupanca1.getSaldo());
        System.out.printf("saldo 2:  %.2f\n", poupanca2.getSaldo());
    }
}
