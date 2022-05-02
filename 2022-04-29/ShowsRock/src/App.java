import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Ingresso> listaIngressos = new ArrayList<Ingresso>();
        
        Comum ingresso1 = new Comum(100);
        Comum ingresso2 = new Comum(150);
        VIP ingresso3 = new VIP(200);

        listaIngressos.add(ingresso1);
        listaIngressos.add(ingresso2);
        listaIngressos.add(ingresso3);

        System.out.println("Valor total dos ingressos:  " + Ingresso.calculaValor(listaIngressos)); 
        Ingresso.imprimeValores(listaIngressos);
    }
}