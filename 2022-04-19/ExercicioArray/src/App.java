import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Poupanca p1 = new Poupanca();
        Corrente c1 = new Corrente();
        Corrente c2 = new Corrente();
        ArrayList<Conta> list = new ArrayList<Conta>();

        list.add(p1);
        list.add(c1);
        list.add(c2);

        for (Conta conta : list) {
            conta.mostra();
            System.out.printf("Saldo da conta:  %.2f\n", conta.getSaldo());

            if (conta instanceof Poupanca) {
                Poupanca poup = (Poupanca) conta; 
                System.out.printf("Taxa da poupança:  %.2f\n", poup.getTaxa());
            }

            if (conta instanceof Corrente) {
                Corrente cc = (Corrente) conta; 
                System.out.printf("Limite da conta:  %.2f", cc.getLimite());
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Conta c = list.get(i);

            c.mostra();
            System.out.println(c.getSaldo());

            if (c instanceof Poupanca) {
                Poupanca poup = (Poupanca) c; 
                System.out.printf("Taxa da poupança:  %.2f\n", poup.getTaxa());
            }
        }
    }
}
